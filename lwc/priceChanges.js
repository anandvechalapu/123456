import { LightningElement, track, wire } from 'lwc';
import { getPriceChanges, getPriceChangesByProduct } from '@salesforce/apex/PriceChangesController.getPriceChanges';
import { getHistoricalPrices } from '@salesforce/apex/PriceChangesRepository.getHistoricalPrices';
import { getCurrentPrice } from '@salesforce/apex/ProductService.getCurrentPrice';

export default class PriceChanges extends LightningElement {
    @track priceChanges;
    @track productPriceChanges;
    @track historicalPrices;
    @track currentPrice;
    @track date;
    @track barcode;
    @track alertMessage;

    @wire(getPriceChanges)
    wiredPriceChanges({ data, error }) {
        if (data) {
            this.priceChanges = data;
            this.error = undefined;
        } else if (error) {
            this.error = error;
            this.priceChanges = undefined;
        }
    }

    @wire(getPriceChangesByProduct, { barcode: '$barcode' })
    wiredProductPriceChanges({ data, error }) {
        if (data) {
            this.productPriceChanges = data;
            this.error = undefined;
        } else if (error) {
            this.error = error;
            this.productPriceChanges = undefined;
        }
    }

    @wire(getHistoricalPrices, { barcode: '$barcode' })
    wiredHistoricalPrices({ data, error }) {
        if (data) {
            this.historicalPrices = data;
            this.error = undefined;
        } else if (error) {
            this.error = error;
            this.historicalPrices = undefined;
        }
    }

    @wire(getCurrentPrice, { barcode: '$barcode' })
    wiredCurrentPrice({ data, error }) {
        if (data) {
            this.currentPrice = data;
            this.error = undefined;
        } else if (error) {
            this.error = error;
            this.currentPrice = undefined;
        }
    }

    handleBarcodeChange(event) {
        this.barcode = event.target.value;
    }

    handleDateChange(event) {
        this.date = event.target.value;
    }

    searchPriceChanges() {
        if (this.date === '') {
            alert('Please enter a valid date.');
        } else {
            getPriceChanges({ date: this.date })
            .then(result => {
                this.priceChanges = result;
                this.alertMessage = undefined;
            })
            .catch(error => {
                this.alertMessage = error.body.message;
            });
        }
    }

    searchProductPriceChanges() {
        if (this.barcode === '') {
            alert('Please enter a valid barcode.');
        } else {
            getPriceChangesByProduct({ barcode: this.barcode })
            .then(result => {
                this.productPriceChanges = result;
                this.alertMessage = undefined;
            })
            .catch(error => {
                this.alertMessage = error.body.message;
            });
        }
    }

    getHistoricalPrice() {
        if (this.barcode === '') {
            alert('Please enter a valid barcode.');
        } else {
            getHistoricalPrices({ barcode: this.barcode })
            .then(result => {
                this.historicalPrices = result;
                this.alertMessage = undefined;
            })
            .catch(error => {
                this.alertMessage = error.body.message;
            });
        }
    }

    getCurrentPrice() {
        if (this.barcode === '') {
            alert('Please enter a valid barcode.');
        } else {
            getCurrentPrice({ barcode: this.barcode })
            .then(result => {
                this.currentPrice = result;
                this.alertMessage = undefined;
            })
            .catch(error => {
                this.alertMessage = error.body.message;
            });
        }
    }
}
trigger CSA_Setup_Buyer_Menu on Object__c (after insert, after update) {
    List<Object__c> buyers = Trigger.new;
    Set<Id> buyerIds = new Set<Id>();
    
    // Get all Buyers
    for(Object__c buyer : buyers) {
        buyerIds.add(buyer.Id);
    }
    
    // Get all existing Buyers
    List<Object__c> existingBuyers = [SELECT Id, Title__c, First_Name__c, Last_Name__c, Login_ID__c, Email_Address__c, Password__c, Confirm_Password__c, Phone_Number__c, Mobile_Number__c, Newspaper_Account_Number__c, Retailer_Name__c, Address_1__c, Address_2__c, Address_3__c, Account_Number__c, Load_All_Buyer__c, Search__c FROM Object__c WHERE Id IN :buyerIds];
    
    // Check if any new Buyers have been added
    List<Object__c> newBuyers = new List<Object__c>();
    for(Object__c buyer : buyers) {
        Boolean isNewBuyer = true;
        for(Object__c existingBuyer : existingBuyers) {
            if(buyer.Id == existingBuyer.Id) {
                isNewBuyer = false;
                break;
            }
        }
        if(isNewBuyer) {
            newBuyers.add(buyer);
        }
    }
    
    // Validate new Buyers
    if(!newBuyers.isEmpty()) {
        for(Object__c buyer : newBuyers) {
            // Validate Title
            if(String.isBlank(buyer.Title__c)) {
                buyer.addError('Title cannot be blank.');
            }
            
            // Validate First Name
            if(String.isBlank(buyer.First_Name__c)) {
                buyer.addError('First Name cannot be blank.');
            }
            
            // Validate Last Name
            if(String.isBlank(buyer.Last_Name__c)) {
                buyer.addError('Last Name cannot be blank.');
            }
            
            // Validate Login ID
            if(String.isBlank(buyer.Login_ID__c)) {
                buyer.addError('Login ID cannot be blank.');
            }
            
            // Validate Email Address
            if(String.isBlank(buyer.Email_Address__c)) {
                buyer.addError('Email Address cannot be blank.');
            }
            
            // Validate Password
            if(String.isBlank(buyer.Password__c)) {
                buyer.addError('Password cannot be blank.');
            }
            
            // Validate Confirm Password
            if(String.isBlank(buyer.Confirm_Password__c)) {
                buyer.addError('Confirm Password cannot be blank.');
            }
            
            // Validate Phone Number
            if(String.isBlank(buyer.Phone_Number__c)) {
                buyer.addError('Phone Number cannot be blank.');
            }
            
            // Validate Mobile Number
            if(String.isBlank(buyer.Mobile_Number__c)) {
                buyer.addError('Mobile Number cannot be blank.');
            }
            
            // Validate Newspaper Account Number
            if(String.isBlank(buyer.Newspaper_Account_Number__c)) {
                buyer.addError('Newspaper Account Number cannot be blank.');
            }
            
            // Validate Retailer Name
            if(String.isBlank(buyer.Retailer_Name__c)) {
                buyer.addError('Retailer Name cannot be blank.');
            }
            
            // Validate Address 1
            if(String.isBlank(buyer.Address_1__c)) {
                buyer.addError('Address 1 cannot be blank.');
            }
            
            // Validate Address 2
            if(String.isBlank(buyer.Address_2__c)) {
                buyer.addError('Address 2 cannot be blank.');
            }
            
            // Validate Address 3
            if(String.isBl
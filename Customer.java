/*
    Kevin Roosey CIS-276 Homework 2
    Grade Recieved: 20/20
*/

public class Customer {

    /* Private instance vars */
    private String customerID;
    private String customerName;
    private String emailAddress;
    private boolean isPreferred;

    /* Default constructor */
    public Customer() {}

    /* 4 parameter constructor */
    public Customer(String id, String name, String email, boolean preferred) {
        customerID = id;
        customerName = name;
        emailAddress = email;
        isPreferred = preferred;
    }

    /* ------------ GETTER AND SETTER METHODS --------- */

    /**
     * @return the customerID
     */
    public String getCustomerId() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
    */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
    */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
    */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the isPreferred
     */
    public boolean isIsPreferred() {
        return isPreferred;
    }

    /**
     * @param isPreffered the isPreferred to set
    */
    public void setIsPreferred(boolean isPreferred) {
        this.isPreferred = isPreferred;
    }

    /* ------ Override toString() method ------ */
    @Override
    public String toString() {
       
        if (isPreferred) {
            return String.format("%1$-8s", customerID)
            + String.format("%1$-25s", customerName)
            + String.format("%1$-35s", emailAddress)
            + String.format("%1$-10s", "yes");
        }
        else
            return String.format("%1$-8s", customerID)
            + String.format("%1$-25s", customerName)
            + String.format("%1$-35s", emailAddress)
            + String.format("%1$-10s", "no");
        
        
    }
}
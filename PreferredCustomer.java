/*
    Kevin Roosey CIS-276 Homework 2
    Grade Recieved: 20/20
*/

public class PreferredCustomer extends Customer {
    
    /* Private instance vars */
    private double discountRate;
    private int rewardsPoints;

    /* Default constructor */
    public PreferredCustomer(){}

    /* 6 parameter constructor */
    public PreferredCustomer(String customerID, String customerName, String emailAddress, boolean isPreferred, double discount, int rewards) {
        super(customerID, customerName, emailAddress, isPreferred);
        discountRate = discount;
        rewardsPoints = rewards;
    }

    /* ------------ GETTER AND SETTER METHODS --------- */

    /**
     * @return the discountRate
     */
    public double getDiscountRate() {
        return discountRate;
    }

    /**
     * @param discountRate the discountRate to set
    */
    public void setCustomerID(double discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * @return the rewardsPoints
     */
    public int getRewardsPoints() {
        return rewardsPoints;
    }

    /**
     * @param discountRate the discountRate to set
    */
    public void setCustomerID(int rewardsPoints) {
        this.rewardsPoints = rewardsPoints;
    }

    /* ------ Override toString() method ------ */
    @Override
    public String toString() {
       return super.toString() + "\n    PREFERRED DISCOUNT RATE: " + String.format("%1$-1s", discountRate).concat("%") + "   REWARDS POINTS: " + String.format ("%1$-35s", rewardsPoints);
    }
    
}

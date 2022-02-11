/*
    Kevin Roosey CIS-276 Homework 2
    Grade Recieved: 20/20
*/

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<Customer> allCustomers = new ArrayList <> ();
        allCustomers.add(new Customer("1234", "Kevin Roosey", "kevinroosey@gmail.com", false));
        allCustomers.add(new Customer("4253", "Morty Smith", "morty@rickandmorty.com", false));
        allCustomers.add(new Customer("4828", "Rick Sanchez", "rick@rickandmorty.com", false));
        allCustomers.add(new PreferredCustomer("2211", "Billie Eilish", "billie@billieelish.com", true, 25, 1000));
        allCustomers.add(new PreferredCustomer("1122", "Joe Biden", "potus@unitedstates.com", true, 50, 1000));
        System.out.printf("%1$-8s", "ID");
        System.out.printf("%1$-25s", "CUSTOMER NAME");
        System.out.printf("%1$-35s", "EMAIL ADDRESS");
        System.out.printf("%1$-10s\n", "PREFERRED?");
        System.out.println("--------------------------------------------------------------------------------");
        for(int i = 0; i < allCustomers.size(); i++){
            System.out.println(allCustomers.get(i));
        }

    }
}

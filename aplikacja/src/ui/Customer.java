package ui;

import java.util.Date;
import java.time.LocalDate;

public class Customer  implements  Comparable <Customer> {
    public String firstname;
    public String lastname;
    public CustomerCondition state;
    public int VAT;
    public double ilość_pkt;

    public String address;

    public LocalDate dateCreate;


    public  Customer(String firstname,  String lastname, CustomerCondition state, int VAT, double ilość_pkt, String address, Date date)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.state = state;
        this.VAT = VAT;
        this.ilość_pkt = ilość_pkt;
        this.address = address;
        this.dateCreate = LocalDate.now();
    }

    public double getIlość_pkt() {
        return ilość_pkt;
    }

    public String getLastname() {
        return lastname;
    }

    public void Wypisz(){
        System.out.println("imie: "+firstname+" nazwisko: "+lastname+" state: "+state+" VAT: "+VAT+"ilość_punktow: "+ilość_pkt);
    }

    public int compareTo(Customer s) {
        int result = CharSequence.compare(lastname, s.lastname);
        if (result==0){
            System.out.println("surnames are equal!");
        }
        else {
            System.out.println("surnames are NOT equal!");
        }
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstname='" + firstname + '\'' +
                ", nazwisko='" + lastname + '\'' +
                ", state=" + state +
                ", VAT=" + VAT +
                ", ilość_pkt=" + ilość_pkt +
                ", address=" + address +
                ", date of creation=" + dateCreate +
                '}'+"\n";
    }

}

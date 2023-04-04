package ui;

import java.util.ArrayList;
import java.util.List;
public class GroupCustomers{
    public int max, max_gr1, max_gr2, max_gr3;
    public List<Customer> lista_Customerów;
    public List<Customer> grupa_1;
    public List<Customer> grupa_2;
    public List<Customer> grupa_3;


    public GroupCustomers(){
        this.max = 100; // cala lista Customerow
        this.max_gr1 = 10;
        this.max_gr2 = 5;
        this.max_gr3 = 12;
        lista_Customerów= new ArrayList<Customer>();
        grupa_2 = new ArrayList<Customer>();
        grupa_3 = new ArrayList<Customer>();
        grupa_1 = new ArrayList<Customer>();



    }

    public int getMax_gr1() {
        return max_gr1;
    }

    public int getMax_gr2() {
        return max_gr2;
    }

    public int getMax_gr3() {
        return max_gr3;
    }

    public  void addCustomer(Customer newCustomer){
        if(lista_Customerów.size()==max){
            System.out.println("List limit reached - you cannot add new customer \n ");
        }
        else {
            lista_Customerów.add(newCustomer);
        }
    }
    public  void addCustomer_grupa1(Customer newCustomer) {
        if(grupa_1.size()==max_gr1){
            System.out.println("Group limit reached - you cannot add new customer \n ");
        }
        else {
            grupa_1.add(newCustomer);

        }
    }
    public  void addCustomer_grupa2(Customer newCustomer) {
        if(grupa_2.size()==max_gr2){
            System.out.println("Group limit reached - you cannot add new customer \n ");
        }
        else {
            grupa_2.add(newCustomer);

        }
    }
    public void addPoints(Customer s,  double punkty) {
        s.ilość_pkt += punkty;
    }


    public void  getCustomer(Customer s) {

        lista_Customerów.remove(s);
        if (s.ilość_pkt == 0.0) {
            s = null;

        }
    }


    public void ChangeCondition(Customer s, CustomerCondition nowy_stan){
        s.state = nowy_stan;
    }
    public void removePoints(Customer s, double punkty) {
        s.ilość_pkt -= punkty;
    }

    public Customer search(String nazwisko){
        Customer searchCustomer  = null;
        for (int i=0;i<lista_Customerów.size();i++){
            if (lista_Customerów.get(i).lastname.equalsIgnoreCase(nazwisko))
            {
                searchCustomer = lista_Customerów.get(i);
            }
        }
        return searchCustomer;
    }
    public Customer removeCustomer(String lastname){
        Customer searchCustomer  =null;
        for (int i=0;i<lista_Customerów.size();i++){
            if (lista_Customerów.get(i).lastname.equalsIgnoreCase(lastname))
            {
                searchCustomer = lista_Customerów.get(i);
            }
        }

        lista_Customerów.remove(searchCustomer);

        return searchCustomer;



    }
    public void SortByNazwisko(){
        lista_Customerów.sort(new CompNazwiskoAlf ());
    }
    public void SortByPoints(){
        lista_Customerów.sort(new Comp_Punkty());

    }


    @Override

    public String toString() {
        return "Class{" +
                "max=" + max +
                ", max_gr1=" + max_gr1 +
                ", max_gr2=" + max_gr2 +
                ", max_gr3=" + max_gr3 +
                ", lista_Customerów=" + lista_Customerów +
                ", grupa_1=" + grupa_1 +
                ", grupa_2=" + grupa_2 +
                ", grupa_3=" + grupa_3 +
                '}';
    }
}
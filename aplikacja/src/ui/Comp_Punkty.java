package ui;

import java.util.Comparator;
public class Comp_Punkty  implements Comparator<Customer> {

    public int compare(Customer s1, Customer s2){
        int porownanie = Double.compare((double) s1.ilość_pkt, (double) s2.ilość_pkt);
        return porownanie * -1;
    }
}

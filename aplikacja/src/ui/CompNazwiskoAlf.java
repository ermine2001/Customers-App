package ui;

import java.util.Comparator;

public class CompNazwiskoAlf implements Comparator <Customer> {
    @Override
    public int compare(Customer s1, Customer s2) {
        int porownanie = CharSequence.compare((String) s1.lastname, (String) s2.lastname);
        return porownanie ;

    }
}

package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
public class MainUI  extends JPanel implements ActionListener {
    private JPanel rootPanel;

    private JButton dodajCustomeraButton;
    private JButton WyświetlListeButton;
    private JTextArea textArea1;
    private JButton removeCustomer;
    private JButton sortujPoPktButton;
    private JButton wyszukajPoNazwiskuButton;
    private JButton wyświetlGrupyCustomerówButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private final static String newline = "\n";

public MainUI() {

    dodajCustomeraButton.addActionListener(this);
    removeCustomer.addActionListener(this);
    sortujPoPktButton.addActionListener(this);
    WyświetlListeButton.addActionListener(this);
    wyszukajPoNazwiskuButton.addActionListener(this);
    wyświetlGrupyCustomerówButton.addActionListener(this);



}
    public JPanel getRootPanel(){
       return  rootPanel;
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
private void createTable() {
    Customer s1 = new Customer("Ola", "Kowalska", CustomerCondition.Active, 2001, 0.0, "Szpitalna 10", new Date());
    Customer s2 = new Customer("Agnieszka", "Lis", CustomerCondition.Banned, 2008, 4.0, "Mokotowska 20", new Date());
    Customer s3 = new Customer("Kasia", "Kowalska", CustomerCondition.Inactive, 2000, 10.0, "Mokotowska 20", new Date());
    Customer s4 = new Customer("Anna", "Nowak", CustomerCondition.Inactive, 2005, 199.0, "Mokotowska 20", new Date());
    Customer s5 = new Customer("Janusz", "Lis", CustomerCondition.Inactive, 1939, 10000.0, "Mokotowska 20", new Date());
    Customer s6 = new Customer("Leokadia", "Kot", CustomerCondition.Banned, 1888, 234.0, "Mokotowska 20", new Date());
    Customer s7 = new Customer("Ewa", "Lis", CustomerCondition.Active, 2003, 200.0, "Mokotowska 20", new Date());
    Customer s8 = new Customer("Jan", "Nowak", CustomerCondition.Active, 1967, 45.0, "Mokotowska 20", new Date());
    Customer s9 = new Customer("Grzegorz", "Bąk", CustomerCondition.Banned, 1950, 50.0, "Mokotowska 20", new Date());
    Customer s10 = new Customer("Jowita", "Kot", CustomerCondition.Inactive, 2000, 60.0, "Mokotowska 20", new Date());
    Customer s11 = new Customer("Maria", "Kot", CustomerCondition.Banned, 1989, 15.0, "Mokotowska 20", new Date());
    Customer s12 = new Customer("Józef", "Bak", CustomerCondition.Active, 2000, 10.0, "Mokotowska 20", new Date());
    Customer s13 = new Customer("Kamila", "Bąk", CustomerCondition.Inactive, 2001, 50.0, "Mokotowska 20", new Date());
    Customer s14 = new Customer("Jan", "Biel", CustomerCondition.Active, 1963, 60.0, "Mokotowska 20", new Date());
    Customer s15 = new Customer("Anna", "Biel", CustomerCondition.Inactive, 1970, 100.0, "Mokotowska 20", new Date());
    Class klasa = new Class();
    //dodawanie do grupy 1 - max 10 osob
    //zapelnienie 7/10
    klasa.addCustomer_grupa1(s1);
    klasa.addCustomer_grupa1(s2);
    klasa.addCustomer_grupa1(s3);
    klasa.addCustomer_grupa1(s4);
    klasa.addCustomer_grupa1(s5);
    klasa.addCustomer_grupa1(s6);
    klasa.addCustomer_grupa1(s7);
                /*klasa.addCustomer_grupa1(s8);
                klasa.addCustomer_grupa1(s9);
                klasa.addCustomer_grupa1(s10);*/

    ///dodawanie do grupy 2
    klasa.addCustomer_grupa2(s8);
    klasa.addCustomer_grupa2(s9);
    klasa.addCustomer_grupa2(s10);
    klasa.addCustomer_grupa2(s11);
    klasa.addCustomer_grupa2(s12);

    Object[][] data = {{"grupa_1", klasa.getMax_gr1(), (double)(klasa.grupa_1.size())/(klasa.getMax_gr1())*100+"%"},{"grupa_2", klasa.getMax_gr2(), (klasa.grupa_2.size())/(klasa.getMax_gr2())*100+"%"},{"grupa_3", klasa.getMax_gr3(),(double) (klasa.grupa_3.size())/(klasa.getMax_gr3())*100+"%"}};

}



    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        Customer s1 = new Customer("Ola", "Kowalska", CustomerCondition.Active, 2001, 0.0, "Szpitalna 10", new Date());
        Customer s2 = new Customer("Agnieszka", "Lis", CustomerCondition.Banned, 2008, 4.0, "Mokotowska 20", new Date());
        Customer s3 = new Customer("Kasia", "Kowalska", CustomerCondition.Inactive, 2000, 10.0, "Mokotowska 20", new Date());
        Customer s4 = new Customer("Anna", "Nowak", CustomerCondition.Inactive, 2005, 199.0, "Mokotowska 20", new Date());
        Customer s5 = new Customer("Janusz", "Lis", CustomerCondition.Inactive, 1939, 10000.0, "Mokotowska 20", new Date());
        Customer s6 = new Customer("Leokadia", "Kot", CustomerCondition.Banned, 1888, 234.0, "Mokotowska 20", new Date());
        Customer s7 = new Customer("Ewa", "Lis", CustomerCondition.Active, 2003, 200.0, "Mokotowska 20", new Date());
        Customer s8 = new Customer("Jan", "Nowak", CustomerCondition.Active, 1967, 45.0, "Mokotowska 20", new Date());
        Customer s9 = new Customer("Grzegorz", "Bąk", CustomerCondition.Banned, 1950, 50.0, "Mokotowska 20", new Date());
        Customer s10 = new Customer("Jowita", "Kot", CustomerCondition.Inactive, 2000, 60.0, "Mokotowska 20", new Date());
        Customer s11 = new Customer("Maria", "Kot", CustomerCondition.Banned, 1989, 15.0, "Mokotowska 20", new Date());
        Customer s12 = new Customer("Józef", "Bak", CustomerCondition.Active, 2000, 10.0, "Mokotowska 20", new Date());
        Customer s13 = new Customer("Kamila", "Bąk", CustomerCondition.Inactive, 2001, 50.0, "Mokotowska 20", new Date());
        Customer s14 = new Customer("Jan", "Biel", CustomerCondition.Active, 1963, 60.0, "Mokotowska 20", new Date());
        Customer s15 = new Customer("Anna", "Biel", CustomerCondition.Inactive, 1970, 100.0, "Mokotowska 20", new Date());
        s1.compareTo(s3);
        s1.compareTo(s2);
        Class klasa = new Class();
        s1.Wypisz();
        // dodawanie do listy roku
        klasa.addCustomer(s1);
        klasa.addCustomer(s2);
        klasa.addCustomer(s3);
        klasa.addCustomer(s4);
        klasa.addCustomer(s5);
        klasa.addCustomer(s6);
        klasa.addCustomer(s7);
        klasa.addCustomer(s8);
        klasa.addCustomer(s9);
        klasa.addCustomer(s10);
        klasa.addCustomer(s11);
        klasa.addCustomer(s12);
        klasa.addCustomer(s13);
        klasa.addCustomer(s14);
        klasa.addCustomer(s15);


        klasa.addPoints(s2, 1000.0);
        //dodawanie do grupy 1 - max 10 osob
        //zapelnienie 7/10
        klasa.addCustomer_grupa1(s1);
        klasa.addCustomer_grupa1(s2);
        klasa.addCustomer_grupa1(s3);
        klasa.addCustomer_grupa1(s4);
        klasa.addCustomer_grupa1(s5);
        klasa.addCustomer_grupa1(s6);
        klasa.addCustomer_grupa1(s7);


        ///dodawanie do grupy 2
        klasa.addCustomer_grupa2(s8);
        klasa.addCustomer_grupa2(s9);
        klasa.addCustomer_grupa2(s10);
        klasa.addCustomer_grupa2(s11);
        klasa.addCustomer_grupa2(s12);


        System.out.println("GRUPA 1 : \n" + klasa.grupa_1.toString() + "\n");


        System.out.println("our full list : \n" + klasa.lista_Customerów.toString() + "\n");
        klasa.removePoints(s1, 9.0);
        System.out.println("\n after removing 9 points from customer 1:");
        System.out.println("displaying list: \n" + klasa.lista_Customerów.toString() + "\n");
        klasa.addPoints(s1, 9.0);
        klasa.getCustomer(s1);
        System.out.println("checking if customer 1  exists: " + s1.firstname);
        // CompPunkty porownanie1 = new CompPunkty();

        System.out.println("sorted customer by points");
        System.out.println("Group 1 : \n" + klasa.grupa_1.toString() + "\n");

        klasa.ChangeCondition(s1, CustomerCondition.Inactive);
        s1.Wypisz();

        Collections.max(klasa.lista_Customerów, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return 0;
            }
        });

        //klasa.SortByPoints();
        // System.out.println("our list: \n" +klasa.lista_Customerów.toString()+"\n");

        // klasa.SortByNazwisko();
        // System.out.println("our list: \n" +klasa.lista_Customerów.toString()+"\n");

        if (source == WyświetlListeButton) {


            String tekst = klasa.lista_Customerów.toString();
            textArea1.append(tekst + newline);

        }
        if (source == dodajCustomeraButton) {
            String firstname = textField1.getText();
            String lastname = textField2.getText();

            Customer s = new Customer("Ola", "Kowalska", CustomerCondition.Active, 2001, 0.0, "Szpitalna 10", new Date());
            s.lastname = lastname;
            s.firstname = firstname;

            klasa.lista_Customerów.add(s);
            String lista2 = klasa.lista_Customerów.toString();
            textArea1.append("added new customer: " + s.toString());
            textArea1.append(lista2 + newline);

            textField1.selectAll();
            textField2.selectAll();


        }

        if (source == removeCustomer) {
            String t1 = textField3.getText();
            textArea1.append(t1 + newline);
            String todelete = String.valueOf(klasa.removeCustomer(t1));
            String text1 = klasa.lista_Customerów.toString();
            setBackground(Color.BLUE);

            text1 = klasa.lista_Customerów.toString();

            textArea1.append(text1 + newline);
            textArea1.append("deleted customer: " + todelete);

            textField1.selectAll();
        }

        if (source == sortujPoPktButton) {
            String text1 = klasa.lista_Customerów.toString();
            setBackground(Color.BLUE);
            klasa.SortByPoints();
            text1 = klasa.lista_Customerów.toString();
            textArea1.append("Sorted by points list of customers: \n");
            textArea1.append(text1 + newline);

            textField1.selectAll();
        }

        if (source == wyświetlGrupyCustomerówButton){
            String t1 = klasa.grupa_1.toString();
            String t2 = klasa.grupa_2.toString();
            String t3 = klasa.grupa_3.toString();
            String p1 = "GRUPA 1: ";
            String p2 = "GRUPA 2: ";
            String p3 = "GRUPA 3: ";
            textArea1.append(p1 + newline + t1 + newline + p2 + newline + t2 + newline + p3 + newline + t3 + newline);
            textField1.selectAll();




        }

        if (source == wyszukajPoNazwiskuButton){
            String t1 = textField3.getText();
            textArea1.append(t1 + newline);
            Customer wyszukany = klasa.search(t1);
            String pom = wyszukany.toString();
            textArea1.append("found customer: "+pom);
            textField1.selectAll();




        }
    }}
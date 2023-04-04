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
    GroupCustomers data = new GroupCustomers();
    //dodawanie do grupy 1 - max 10 osob
    //zapelnienie 7/10
    data.addCustomer_grupa1(s1);
    data.addCustomer_grupa1(s2);
    data.addCustomer_grupa1(s3);
    data.addCustomer_grupa1(s4);
    data.addCustomer_grupa1(s5);
    data.addCustomer_grupa1(s6);
    data.addCustomer_grupa1(s7);
                /*data.addCustomer_grupa1(s8);
                data.addCustomer_grupa1(s9);
                data.addCustomer_grupa1(s10);*/

    ///dodawanie do grupy 2
    data.addCustomer_grupa2(s8);
    data.addCustomer_grupa2(s9);
    data.addCustomer_grupa2(s10);
    data.addCustomer_grupa2(s11);
    data.addCustomer_grupa2(s12);

    //Object[][] data = {{"grupa_1", data.getMax_gr1(), (double)(data.grupa_1.size())/(data.getMax_gr1())*100+"%"},{"grupa_2", data.getMax_gr2(), (data.grupa_2.size())/(data.getMax_gr2())*100+"%"},{"grupa_3", data.getMax_gr3(),(double) (data.grupa_3.size())/(data.getMax_gr3())*100+"%"}};

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
        GroupCustomers data = new GroupCustomers();
        s1.Wypisz();
        // dodawanie do listy roku
        data.addCustomer(s1);
        data.addCustomer(s2);
        data.addCustomer(s3);
        data.addCustomer(s4);
        data.addCustomer(s5);
        data.addCustomer(s6);
        data.addCustomer(s7);
        data.addCustomer(s8);
        data.addCustomer(s9);
        data.addCustomer(s10);
        data.addCustomer(s11);
        data.addCustomer(s12);
        data.addCustomer(s13);
        data.addCustomer(s14);
        data.addCustomer(s15);


        data.addPoints(s2, 1000.0);
        //dodawanie do grupy 1 - max 10 osob
        //zapelnienie 7/10
        data.addCustomer_grupa1(s1);
        data.addCustomer_grupa1(s2);
        data.addCustomer_grupa1(s3);
        data.addCustomer_grupa1(s4);
        data.addCustomer_grupa1(s5);
        data.addCustomer_grupa1(s6);
        data.addCustomer_grupa1(s7);


        ///dodawanie do grupy 2
        data.addCustomer_grupa2(s8);
        data.addCustomer_grupa2(s9);
        data.addCustomer_grupa2(s10);
        data.addCustomer_grupa2(s11);
        data.addCustomer_grupa2(s12);


        System.out.println("GRUPA 1 : \n" + data.grupa_1.toString() + "\n");


        System.out.println("our full list : \n" + data.lista_Customerów.toString() + "\n");
        data.removePoints(s1, 9.0);
        System.out.println("\n after removing 9 points from customer 1:");
        System.out.println("displaying list: \n" + data.lista_Customerów.toString() + "\n");
        data.addPoints(s1, 9.0);
        data.getCustomer(s1);
        System.out.println("checking if customer 1  exists: " + s1.firstname);
        // CompPunkty porownanie1 = new CompPunkty();

        System.out.println("sorted customer by points");
        System.out.println("Group 1 : \n" + data.grupa_1.toString() + "\n");

        data.ChangeCondition(s1, CustomerCondition.Inactive);
        s1.Wypisz();

        Collections.max(data.lista_Customerów, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return 0;
            }
        });

        //data.SortByPoints();
        // System.out.println("our list: \n" +data.lista_Customerów.toString()+"\n");

        // data.SortByNazwisko();
        // System.out.println("our list: \n" +data.lista_Customerów.toString()+"\n");

        if (source == WyświetlListeButton) {


            String tekst = data.lista_Customerów.toString();
            textArea1.append(tekst + newline);

        }
        if (source == dodajCustomeraButton) {
            String firstname = textField1.getText();
            String lastname = textField2.getText();

            Customer s = new Customer("Ola", "Kowalska", CustomerCondition.Active, 2001, 0.0, "Szpitalna 10", new Date());
            s.lastname = lastname;
            s.firstname = firstname;

            data.lista_Customerów.add(s);
            String lista2 = data.lista_Customerów.toString();
            textArea1.append("added new customer: " + s.toString());
            textArea1.append(lista2 + newline);

            textField1.selectAll();
            textField2.selectAll();


        }

        if (source == removeCustomer) {
            String t1 = textField3.getText();
            textArea1.append(t1 + newline);
            String todelete = String.valueOf(data.removeCustomer(t1));
            String text1 = data.lista_Customerów.toString();
            setBackground(Color.BLUE);

            text1 = data.lista_Customerów.toString();

            textArea1.append(text1 + newline);
            textArea1.append("deleted customer: " + todelete);

            textField1.selectAll();
        }

        if (source == sortujPoPktButton) {
            String text1 = data.lista_Customerów.toString();
            setBackground(Color.BLUE);
            data.SortByPoints();
            text1 = data.lista_Customerów.toString();
            textArea1.append("Sorted by points list of customers: \n");
            textArea1.append(text1 + newline);

            textField1.selectAll();
        }

        if (source == wyświetlGrupyCustomerówButton){
            String t1 = data.grupa_1.toString();
            String t2 = data.grupa_2.toString();
            String t3 = data.grupa_3.toString();
            String p1 = "GRUPA 1: ";
            String p2 = "GRUPA 2: ";
            String p3 = "GRUPA 3: ";
            textArea1.append(p1 + newline + t1 + newline + p2 + newline + t2 + newline + p3 + newline + t3 + newline);
            textField1.selectAll();




        }

        if (source == wyszukajPoNazwiskuButton){
            String t1 = textField3.getText();
            textArea1.append(t1 + newline);
            Customer wyszukany = data.search(t1);
            String pom = wyszukany.toString();
            textArea1.append("found customer: "+pom);
            textField1.selectAll();




        }
    }}
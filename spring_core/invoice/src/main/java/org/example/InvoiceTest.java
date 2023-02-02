package org.example;

import org.example.entity.Invoice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Invoice invoice = (Invoice) context.getBean("invoice");

        System.out.println("Total amount is = " + invoice.getInvoiceAmount());
        System.out.println("Invoice details =" + invoice);

        Invoice invoice2 = (Invoice) context.getBean("invoice2");

        System.out.println("Total amount is = " + invoice2.getInvoiceAmount());
        System.out.println("Invoice details =" + invoice2);

      /*  Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Select an option :");
            System.out.println(" 1. Enter invoice");
            System.out.println("2. Print invoice");
            System.out.println("3. Exit invoice");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter Partnumber");
                    invoice.setPartNumber(sc.next());
                    System.out.println("Enter Part desc");
                    invoice.setPartDescription(sc.next());
                    System.out.println("Enter Price");
                    invoice.setPrice(sc.nextDouble());
                    System.out.println("Enter Quantity");
                    invoice.setQuantity(sc.nextInt());
                    invoice.getInvoiceAmount();
                    break;
                case 2:
                    System.out.println("Total amount is = " + invoice.getInvoiceAmount());
                    System.out.println("Invoice details =" + invoice);
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
*/

    }
}

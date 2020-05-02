//Testing the capabilities of the Invoice class

import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Invoice invoice1 = new Invoice("", "part1", 7, 12.3);
        Invoice invoice2 = new Invoice("342f4", null, 3,4.23);
        Invoice invoice3 = new Invoice("21345fd3", "part3", -4,88.1);
        Invoice invoice4 = new Invoice("2j345g", "part4", 11, -7.77);

        //display the initial information in the 4 invoices
        System.out.printf("Invoice1 has the following contents:\n\n%s\n\n", invoice1.toString());

        System.out.printf("Invoice2 has the following contents:\n\n%s\n\n", invoice2.toString());

        System.out.printf("Invoice3 has the following contents:\n\n%s\n\n", invoice3.toString());

        System.out.printf("Invoice4 has the following contents:\n\n%s\n\n", invoice4.toString());

        //changing the info for each invoice
        //and displaying how it changed
        //demonstrating the capabilities of the Invoice class

        //invoice1
        System.out.println("Please give the new info for invoice1.\n");
        System.out.print("The new part number: ");
        String partNumber1 = reader.nextLine();
        System.out.print("The new part description: ");
        String partDesc1 = reader.nextLine();
        System.out.print("The new quantity: ");
        String quantity1 = reader.nextLine();
        int quantityPurchased1 = Integer.parseInt(quantity1);
        System.out.print("The new price per unit: ");
        String price1 = reader.nextLine();
        double pricePerUnit1 = Double.parseDouble(price1);
        double cost1 = invoice1.getInvoiceAmount();

        //displaying the results after the set methods were called
        System.out.printf("\nThe following info has changed for invoice one:\n\n");
        System.out.printf("Part number : %s ---> ", invoice1.getPartNumber());
        invoice1.setPartNumber(partNumber1);
        System.out.printf("%s\n", invoice1.getPartNumber());
        System.out.printf("Part description : %s ---> ", invoice1.getPartDesc());
        invoice1.setPartDesc(partDesc1);
        System.out.printf("%s\n", invoice1.getPartDesc());
        System.out.printf("Quantity purchased : %d ---> ", invoice1.getQuantityPurchased());
        invoice1.setQuantityPurchased(quantityPurchased1);
        System.out.printf("%d\n", invoice1.getQuantityPurchased());
        System.out.printf("Price per unit : %.2f ---> ", invoice1.getPricePerUnit());
        invoice1.setPricePerUnit(pricePerUnit1);
        System.out.printf("%.2f\n", invoice1.getPricePerUnit());
        System.out.printf("The total cost : %.2f ---> %.2f\n\n", cost1, invoice1.getInvoiceAmount());

        //invoice2
        System.out.println("Please give the new info for invoice2.\n");
        System.out.print("The new part number: ");
        String partNumber2 = reader.nextLine();
        System.out.print("The new part description: ");
        String partDesc2 = reader.nextLine();
        System.out.print("The new quantity: ");
        String quantity2 = reader.nextLine();
        int quantityPurchased2 = Integer.parseInt(quantity2);
        System.out.print("The new price per unit: ");
        String price2 = reader.nextLine();
        double pricePerUnit2 = Double.parseDouble(price2);
        double cost2 = invoice2.getInvoiceAmount();

        //displaying the results after the set methods were called
        System.out.printf("\nThe following info has changed for invoice two:\n\n");
        System.out.printf("Part number : %s ---> ", invoice2.getPartNumber());
        invoice2.setPartNumber(partNumber2);
        System.out.printf("%s\n", invoice2.getPartNumber());
        System.out.printf("Part description : %s ---> ", invoice2.getPartDesc());
        invoice2.setPartDesc(partDesc2);
        System.out.printf("%s\n", invoice2.getPartDesc());
        System.out.printf("Quantity purchased : %d ---> ", invoice2.getQuantityPurchased());
        invoice2.setQuantityPurchased(quantityPurchased2);
        System.out.printf("%d\n", invoice2.getQuantityPurchased());
        System.out.printf("Price per unit : %.2f ---> ", invoice2.getPricePerUnit());
        invoice2.setPricePerUnit(pricePerUnit2);
        System.out.printf("%.2f\n", invoice2.getPricePerUnit());
        System.out.printf("The total cost : %.2f ---> %.2f\n\n", cost2, invoice2.getInvoiceAmount());

        //invoice3
        System.out.println("Please give the new info for invoice3.");
        System.out.print("\nThe new part number: ");
        String partNumber3 = reader.nextLine();
        System.out.print("The new part description: ");
        String partDesc3 = reader.nextLine();
        System.out.print("The new quantity: ");
        String quantity3 = reader.nextLine();
        int quantityPurchased3 = Integer.parseInt(quantity3);
        System.out.print("The new price per unit: ");
        String price3 = reader.nextLine();
        double pricePerUnit3 = Double.parseDouble(price3);
        double cost3 = invoice3.getInvoiceAmount();

        //displaying the results after the set methods were called
        System.out.printf("\nThe following info has changed for invoice three:\n\n");
        System.out.printf("Part number : %s ---> ", invoice3.getPartNumber());
        invoice3.setPartNumber(partNumber3);
        System.out.printf("%s\n", invoice3.getPartNumber());
        System.out.printf("Part description : %s ---> ", invoice3.getPartDesc());
        invoice3.setPartDesc(partDesc3);
        System.out.printf("%s\n", invoice3.getPartDesc());
        System.out.printf("Quantity purchased : %d ---> ", invoice3.getQuantityPurchased());
        invoice3.setQuantityPurchased(quantityPurchased3);
        System.out.printf("%d\n", invoice3.getQuantityPurchased());
        System.out.printf("Price per unit : %.2f ---> ", invoice3.getPricePerUnit());
        invoice3.setPricePerUnit(pricePerUnit3);
        System.out.printf("%.2f\n", invoice3.getPricePerUnit());
        System.out.printf("The total cost : %.2f ---> %.2f\n\n", cost3, invoice3.getInvoiceAmount());

        //invoice4
        System.out.println("Please give the new info for invoice4.");
        System.out.print("\nThe new part number: ");
        String partNumber4 = reader.nextLine();
        System.out.print("The new part description: ");
        String partDesc4 = reader.nextLine();
        System.out.print("The new quantity: ");
        String quantity4 = reader.nextLine();
        int quantityPurchased4 = Integer.parseInt(quantity4);
        System.out.print("The new price per unit: ");
        String price4 = reader.nextLine();
        double pricePerUnit4 = Double.parseDouble(price4);
        double cost4 = invoice4.getInvoiceAmount();

        //displaying the results after the set methods were called
        System.out.printf("\nThe following info has changed for invoice four:\n\n");
        System.out.printf("Part number : %s ---> ", invoice4.getPartNumber());
        invoice4.setPartNumber(partNumber4);
        System.out.printf("%s\n", invoice4.getPartNumber());
        System.out.printf("Part description : %s ---> ", invoice4.getPartDesc());
        invoice4.setPartDesc(partDesc4);
        System.out.printf("%s\n", invoice4.getPartDesc());
        System.out.printf("Quantity purchased : %d ---> ", invoice4.getQuantityPurchased());
        invoice4.setQuantityPurchased(quantityPurchased4);
        System.out.printf("%d\n", invoice4.getQuantityPurchased());
        System.out.printf("Price per unit : %.2f ---> ", invoice4.getPricePerUnit());
        invoice4.setPricePerUnit(pricePerUnit4);
        System.out.printf("%.2f\n", invoice4.getPricePerUnit());
        System.out.printf("The total cost : %.2f ---> %.2f\n\n", cost4, invoice4.getInvoiceAmount());
        reader.close();
    }
}
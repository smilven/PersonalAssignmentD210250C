/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonalAssignmentD210250C;

/**
 *
 * @author Mii si heng
 */
public class BookStore {
    public static void main(String[] args) {
        // Testing the EBook class
        EBook ebook = new EBook("The Great Gatsby", "F. Scott Fitzgerald", 9.99, 1, ".pdf");
        ebook.openBook();
        ebook.downloadBook();
        System.out.println("Is the file format valid? " + ebook.validateFormat());

        // Testing the PhysicalBook class
        PhysicalBook physicalBook = new PhysicalBook("To Kill a Mockingbird", "Harper Lee", 14.99, 1, 1001.0);
        double shippingCost = physicalBook.calculateShippingCost();
        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Weight in pounds: " + physicalBook.getWeightInPounds());
    }
}

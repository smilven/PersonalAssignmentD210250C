/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonalAssignmentD210250C;

/**
 *
 * @author Mii si heng
 */
class EBook extends Book {
    private String fileFormat;

    public EBook(String title, String author, double price, int quantity, String fileFormat) {
        super(title, author, price, quantity);
        this.fileFormat = fileFormat;
    }

    // Getter and Setter method for the fileFormat attribute
    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    // Task methods specific to EBook class
    public void openBook() {
        System.out.println("The book is opened. You may start reading.");
    }

    public void downloadBook() {
        System.out.println("The book has begun downloading.");
    }

    public boolean validateFormat() {
        return (fileFormat.equals(".pdf") || fileFormat.equals(".epub"));
    }
}


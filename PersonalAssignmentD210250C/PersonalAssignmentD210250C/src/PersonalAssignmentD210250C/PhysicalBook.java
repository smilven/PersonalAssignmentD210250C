/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonalAssignmentD210250C;

/**
 *
 * @author Mii si heng
 */
class PhysicalBook extends Book {
    private double weight;

    public PhysicalBook(String title, String author, double price, int quantity, double weight) {
        super(title, author, price, quantity);
        this.weight = weight;
    }

    // Getter and Setter method for the weight attribute
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Task methods specific to PhysicalBook class
  public double calculateShippingCost() {
    double initialWeight = 500.0;
    double initialCost = 4.50;
    double extraCostPer250g = 1.0;
    
    if (weight <= initialWeight) {
        return initialCost;
    } else {
        double extraWeight = weight - initialWeight;
        int additionalUnits = (int) Math.ceil(extraWeight / 250.0);
        double extraCost = additionalUnits * extraCostPer250g;
        return initialCost + extraCost;
    }
}

    public double getWeightInPounds() {
        return weight / 453.59237;
    }
}

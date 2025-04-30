/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattren;

/**
 *
 * @author sp23-bse-116
 */
public class Circle implements Shape {

   private double cost;

   public Circle() {
      cost = 10.0; // Example cost for a Circle
   }

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }

   @Override
   public double getCost() {
      return cost; // Return the cost of the Circle
   }
}

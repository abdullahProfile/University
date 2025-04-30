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

public class Rectangle implements Shape {

   private double cost;

   // Constructor where we set the base cost for the Rectangle
   public Rectangle() {
      cost = 15.0; // Example cost for a Rectangle
   }

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }

   @Override
   public double getCost() {
      return cost; // Return the cost of the Rectangle
   }
}


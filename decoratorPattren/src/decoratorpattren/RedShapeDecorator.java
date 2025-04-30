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

public class RedShapeDecorator extends ShapeDecorator {

   private double decorationCost;

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);
      decorationCost = 5.0; // Cost of red border decoration
   }

   @Override
   public void draw() {
      decoratedShape.draw();        
      setRedBorder(decoratedShape);
      System.out.println("Total cost: " + getCost());  // Show the total cost after drawing
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }

   @Override
   public double getCost() {
      return decoratedShape.getCost() + decorationCost; // Add the decoration cost to the original shape cost
   }
}

package org.howard.edu.lsp.oopfinal.question3;
//ShapeFactory.java
public class ShapeFactory {
 public static Shape createShape(String type) {
     if (type.equalsIgnoreCase("Circle")) {
         return new Circle();
     } else if (type.equalsIgnoreCase("Rectangle")) {
         return new Rectangle();
     } else {
         return null;
     }
 }
}

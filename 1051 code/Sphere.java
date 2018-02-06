import java.lang.Math.*;
public class Sphere {
   private double diameter;
         
   public Sphere() {
      diameter = 0;
   } 
   public Sphere(double d) {
      diameter = d;
   }
   
   public double getDiameter() {
      return diameter;
   }
   public void setDiameter(double d) {
      diameter = d;
   }
   public double getSurfaceArea() {
      return diameter * 4 * Math.PI * Math.pow(diameter/2, 2);
   }
   public double getVolume() {
      return diameter * 4/3 * Math.PI * Math.pow(diameter/2, 3);
   }
   public String toString() {
      return "diameter is: " + diameter;
   }
}
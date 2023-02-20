<<<<<<< HEAD

class LaptopTypes {
   String LaptopName = "Dell";
    public void displayDetails() {
       System.out.println(LaptopName+ " is a laptop.");
    }
 }
 
 class GamingLaptop extends LaptopTypes {
    public void displayDetails() {
       System.out.println(LaptopName+ " is a gaming laptop.");
    }
 }
 
  class Overriding {
    public static void main(String args[]) {
       LaptopTypes laptop = new LaptopTypes();
       GamingLaptop gamingLaptop = new GamingLaptop();
       laptop.displayDetails();
       gamingLaptop.displayDetails();
    }
 }
 
=======

class LaptopTypes {
   String LaptopName = "Dell";
    public void displayDetails() {
       System.out.println(LaptopName+ " is a laptop.");
    }
 }
 
 class GamingLaptop extends LaptopTypes {
    public void displayDetails() {
       System.out.println(LaptopName+ " is a gaming laptop.");
    }
 }
 
  class Overriding {
    public static void main(String args[]) {
       LaptopTypes laptop = new LaptopTypes();
       GamingLaptop gamingLaptop = new GamingLaptop();
       laptop.displayDetails();
       gamingLaptop.displayDetails();
    }
 }
 
>>>>>>> 94518af8f1b5c6260d88fd936d2c8c1d0b2bb998

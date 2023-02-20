<<<<<<< HEAD

public interface InterfaceEx {
    public void turnOn();
    public void turnOff();
    public void openApp(String BrowserName);
}

 class Laptops implements InterfaceEx {
    @Override
    public void turnOn() {
        System.out.println("My Laptop is turning on");
    }
    
    @Override
    public void turnOff() {
        System.out.println("My Laptop is turning off...");
    }
    
    @Override
    public void openApp(String appName) {
        System.out.println("Opening " + appName + " on laptop");
    }
}

class Main {
    public static void main(String[] args) {
        InterfaceEx myLaptop = new Laptops();
        
        myLaptop.turnOn();
        myLaptop.openApp("VisualStudioCode");
        myLaptop.turnOff();
    }
}

=======

public interface InterfaceEx {
    public void turnOn();
    public void turnOff();
    public void openApp(String BrowserName);
}

 class Laptops implements InterfaceEx {
    @Override
    public void turnOn() {
        System.out.println("My Laptop is turning on");
    }
    
    @Override
    public void turnOff() {
        System.out.println("My Laptop is turning off...");
    }
    
    @Override
    public void openApp(String appName) {
        System.out.println("Opening " + appName + " on laptop");
    }
}

class Main {
    public static void main(String[] args) {
        InterfaceEx myLaptop = new Laptops();
        
        myLaptop.turnOn();
        myLaptop.openApp("VisualStudioCode");
        myLaptop.turnOff();
    }
}

>>>>>>> 94518af8f1b5c6260d88fd936d2c8c1d0b2bb998

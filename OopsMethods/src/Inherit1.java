 class Laptop {
        String name;
        public void perform() {

            System.out.println("I can perform any number of task");
        }
    }
    // inherit from Laptop
    class Brand extends Laptop {
        public void display() {
            System.out.println("I am  " + name);
        }
    }
class Inherit1 {
    public static void main(String[] args) {
        Brand one = new Brand();
        one.name = "Lenovo";
        one.display();
        one.perform();

    }
}

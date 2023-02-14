class colour
{
    public void reColour()
    {

        System.out.println("Hey..My brand is Lenovo and my laptop colour is black");
    }
    //overloading method
    public void reColour(String name)
    {
        System.out.println("Hey..My brand is Lenovo and my laptop colour is "+name);
    }
}
class overload
{
    public static void main(String args[])
    {
        colour obj = new colour();
        obj.reColour();
        obj.reColour("Midnight Blue");
    }
}

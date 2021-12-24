public class Datadisplay {
    public void OrderDetails() {
        PizzaBuildFactory pizzaBuildFactory = new PizzaBuildFactory();
        Pizza pizza = pizzaBuildFactory.getPizza();
        System.out.println("Your " + pizza.size() + " " + pizza.type() + "is getting ready ");
        System.out.println("please make " + pizza.price() + " ready ");
    }

}

public abstract class Veg extends Pizza {
    @Override
    public String itemName() {
        return size() + " Veg Pizza";
    }

    @Override
    public String size() {
        return null;

    }

    @Override
    public int price() {
        return 0;
    }
}

public class Verisk implements Office {

    private String name;
    private int id;

    @Override
    public int getid() {
        return id;
    }

    Verisk() {
        this.name = "Verisk Nepal Pvt. Limited";
        this.id = 3;
    }

    @Override
    public String getOfficeName() {
        return name;
    }
}

public class Deerwalk implements Office {

    private String name;
    private int id;

    @Override
    public int getid() {
        return id;
    }

    Deerwalk() {
        this.name = "Deerwalk Science and Technology";
        this.id = 2;
    }

    @Override
    public String getOfficeName() {
        return name;
    }
}

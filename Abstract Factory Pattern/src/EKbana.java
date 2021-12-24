public class EKbana implements Office {

    private String officeName;
    private int id;

    @Override
    public int getid() {
        return id;
    }

    EKbana() {
        this.officeName = "Ek Bana Solutions";
        this.id = 1;
    }

    @Override
    public String getOfficeName() {
        return officeName;

    }
}

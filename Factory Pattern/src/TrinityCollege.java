public class TrinityCollege implements college {

    String name;

    TrinityCollege() {
        this.name = "Trinity International College";
    }

    @Override
    public String getCollegename() {
        return name;
    }
}

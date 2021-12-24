public class Hospital {

    private String name;
    private int beds;

    private static Hospital hospital;

    private Hospital() {
    }

    public static Hospital getInstance() {
        if (hospital == null) {
            hospital = new Hospital();
        }
        return hospital;

    }

    public void setName() {
        this.name = "KMC";
    }

    public String getName() {
        return name;
    }


    public void setBeds() {
        this.beds = 100;
    }

    public int getBeds() {
        return beds;

    }


}

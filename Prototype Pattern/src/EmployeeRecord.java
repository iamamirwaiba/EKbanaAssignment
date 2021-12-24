public class EmployeeRecord implements Prototype {

    private String name, designation, address;
    private int id;
    private long phonenumber;

    EmployeeRecord() {
        System.out.println("ID \t" + "Name \t" + "Address \t" + "PhoneNumber \t" + "Designation");
    }

    EmployeeRecord(int id, String name, String designation, String address, Long phonenumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.designation = designation;
        this.phonenumber = phonenumber;
    }

    public void showRecord() {
        System.out.println(id + "\t" + name + "\t" + address + "\t" + phonenumber + "\t    " + designation);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, designation, address, phonenumber);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getAddress() {
        return address;
    }

    public Long getPhoneNumber() {
        return phonenumber;
    }


}

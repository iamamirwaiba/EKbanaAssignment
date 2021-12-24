public class language {
    private String name;
    private int people;

    language() {
    }

    public void setData() {
        this.name = "English";
        this.people = 100;
    }

    public String getData() {
        return this.name + " is spoken by " + this.people + " people";
    }


}

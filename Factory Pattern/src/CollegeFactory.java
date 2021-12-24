public class CollegeFactory {
    public college getObject(String name) {
        if (name == null) {
            return null;
        } else if (name.equalsIgnoreCase("trinity")) {
            return new TrinityCollege();
        } else if (name.equalsIgnoreCase("times")) {
            return new Times();
        } else if (name.equalsIgnoreCase("kmc")) {
            return new KMC();
        }
        return null;


    }
}

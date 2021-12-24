public class ObjectFactory {
    public Office getObject(String name) {
        if (name == null) {
            return null;
        } else if (name.equalsIgnoreCase("verisk")) {
            return new Verisk();
        } else if (name.equalsIgnoreCase("deerwalk")) {
            return new Deerwalk();

        } else if (name.equalsIgnoreCase("Ekbana")) {
            return new EKbana();
        }
        return null;
    }

}

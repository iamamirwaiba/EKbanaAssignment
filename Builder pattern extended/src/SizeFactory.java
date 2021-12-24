public class SizeFactory {
    public size getSize(String size) {
        if (size == null) {
            return null;
        } else if (size.equalsIgnoreCase("small")) {
            return new Small();
        } else if (size.equalsIgnoreCase("medium")) {
            return new Medium();
        } else if (size.equalsIgnoreCase("large")) {
            return new Large();
        }
        return null;

    }
}

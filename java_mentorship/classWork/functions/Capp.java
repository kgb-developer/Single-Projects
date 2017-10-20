class App {
    public static void main(String[] arg) {
        house ranch = new house("ranch",4, 2, true);

        System.out.println("In main method. ranch house has " + ranch.doors + " doors.");

    }
}

class house {
    int windows;
    int doors;
    boolean garage;

    public house(String houseType, int defaultWindows, int defaultDoors, boolean hasGarage) {
        windows = defaultWindows;
        doors = defaultDoors;
        garage = hasGarage;

        System.out.println("I created a new " + houseType + "with " + windows + " window(s)");
    }
}
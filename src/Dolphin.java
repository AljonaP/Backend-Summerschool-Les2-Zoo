public class Dolphin extends Animal implements Swimming{
    public Dolphin(String name, String feature, String dateOfBirth, String species, String nutrition, int weight, boolean givesBirth, Gender gender) {
        super(name, feature, dateOfBirth, "Dolphin", nutrition, weight, givesBirth, gender);
    }

    @Override
    public void swims() {
        System.out.println("swimming");
    }
}

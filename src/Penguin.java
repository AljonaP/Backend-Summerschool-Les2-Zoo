public class Penguin extends Animal implements Swimming, Walking{
    public Penguin(String name, String feature, String dateOfBirth, String species, String nutrition, int weight, boolean givesBirth, Gender gender) {
        super(name, feature, dateOfBirth, "Penguin", nutrition, weight, givesBirth, gender);
    }
    @Override
    public void walks() {
        System.out.println("walking");
    }

    @Override
    public void swims() {
        System.out.println("swimming");
    }
}

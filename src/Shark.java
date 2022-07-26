public class Shark extends Animal implements Swimming{
    public Shark(String name, String feature, String dateOfBirth, String species, String nutrition, int weight, boolean givesBirth, Gender gender) {
        super(name, feature, dateOfBirth, "Shark", nutrition, weight, givesBirth, gender);
    }
    @Override
    public void swims() {
        System.out.println("swimming");
    }
}

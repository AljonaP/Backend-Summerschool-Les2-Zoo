public class Crocodile extends Animal implements Swimming, Walking{
    public Crocodile(String name, String feature, String dateOfBirth, String species, String nutrition, int weight, boolean givesBirth, Gender gender) {
        super(name, feature, dateOfBirth, "Crocodile", nutrition, weight, givesBirth, gender);
    }

    @Override
    public void swims() {
        System.out.println("Swimming");
    }

    @Override
    public void walks(){
        System.out.println("Walking");
    }
}

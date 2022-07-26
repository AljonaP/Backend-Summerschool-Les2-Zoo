public class Flamingo extends Animal implements Flying, Walking{

    public Flamingo(String name, String feature, String dateOfBirth, String species, String nutrition, int weight, boolean givesBirth, Gender gender) {
        super(name, feature, dateOfBirth, "Flamingo", nutrition, weight, givesBirth, gender);
    }

    @Override
    public void flies() {
        System.out.println("flying");
    }

    @Override
    public void walks() {
        System.out.println("walking");
    }






}

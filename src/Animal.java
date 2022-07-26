public abstract class Animal implements MainFeatures{
    private String name;
    private String feature;
    private String dateOfBirth;
    private String species;
    private String nutrition;
    private int weight;
    private boolean givesBirth;
    private Gender gender;

    public Animal(){

    }
    public Animal(String name, String feature, String dateOfBirth, String species, String nutrition, int weight, boolean givesBirth, Gender gender) {
        this.name = name;
        this.feature = feature;
        this.dateOfBirth = dateOfBirth;
        this.species = species;
        this.nutrition = nutrition;
        this.weight = weight;
        this.givesBirth = givesBirth;
        this.gender = gender;
    }
    @Override
    public void sleeps(){
        System.out.println("zzz zzz zzz");
    }

    @Override
    public void reproduction() {
        if (givesBirth) {
            System.out.println("Gives birth for reproduction");
        } else {
            System.out.println("lays eggs for reproduction");
        }
    }

    //getters setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isGivesBirth() {
        return givesBirth;
    }

    public void setGivesBirth(boolean givesBirth) {
        this.givesBirth = givesBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}

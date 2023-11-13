public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Charlie", "German Shepherd");

        // Modificare proprietăți
        dog1.setName("Max");
        dog2.setBreed("Golden Retriever");

        // Afișare modificări
        System.out.println("Dog 1: " + dog1.getName() + ", " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + ", " + dog2.getBreed());
    }
}

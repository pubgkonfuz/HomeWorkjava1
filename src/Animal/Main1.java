package Animal;

public class Main1 {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("кок жар", "149 улица кок-джар,Бишкек");
        Dog dog = new Dog("Bars", "Pitbull", "Take");
        Dog dog1 = new Dog("Baby", "Haski", Color.BLACK, shelter);
        Dog dog2 = new Dog("Daemon", "Shepherd",Color.BROWN, shelter, "bring it");

//        System.out.println(dog.getInfo());
        System.out.println(dog1.getInfo());
        System.out.println(dog2.getInfo());
        dog.makeVoice("gav", 2);
        dog1.makeVoice("Au",3);
        dog2.makeVoice("гав гав",4);
    }

}

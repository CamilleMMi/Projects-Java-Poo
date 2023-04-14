package projectjavajpoo.exercice11;

import projectjavajpoo.exercice11.entity.Human;

public class Main {
    public static void main(String[] args) {
        Human human1 = Human.getInstance();
        human1.setFirstName("Camille").setLastName("MICHAUD-MELI").setAge(21);
        Human human2 = Human.getInstance();
        System.out.println("human1 : " + human1.hashCode());
        System.out.println("human2 : " + human2.hashCode());
    }
}

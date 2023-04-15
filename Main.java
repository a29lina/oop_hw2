import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat(12, 15));
        catList.add(new Cat(11, 4));
        catList.add(new Cat(7, 12));

        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human(10, 5));
        humanList.add(new Human(12, 7));
        humanList.add(new Human(15, 6));

        List<Robot> robotList = new ArrayList<>();
        robotList.add(new Robot(7, 10));
        robotList.add(new Robot(16, 9));
        robotList.add(new Robot(21, 32));

        List<Wall> wallList = new ArrayList<>();
        wallList.add(new Wall(10));
        wallList.add(new Wall(9));
        wallList.add(new Wall(5));

        List<Treadmill> treadmillList = new ArrayList<>();
        treadmillList.add(new Treadmill(12));
        treadmillList.add(new Treadmill(7));
        treadmillList.add(new Treadmill(20));

        for (int i = 0; i < catList.size(); i++) {
            System.out.println("Cat " + i + " is jumping");
            if (catList.get(i).getHeight() >= wallList.get(i).getHeight()) {
                System.out.println("Successful");
            } else {
                System.out.println("Can't make it");
            }
        }

        for (int i = 0; i < catList.size(); i++) {
            if (catList.get(i).getHeight() < wallList.get(i).getHeight()) {
                catList.remove(i);
            }
        }

        System.out.println("_______________");

        for (int i = 0; i < humanList.size(); i++) {
            System.out.println("Human " + i + " is jumping");
            if (humanList.get(i).getHeight() >= wallList.get(i).getHeight()) {
                System.out.println("Successful");
            } else {
                System.out.println("Can't make it");
                humanList.remove(i);
            }
        }

        for (int i = 0; i < humanList.size(); i++) {
            if (humanList.get(i).getHeight() < wallList.get(i).getHeight()) {
                catList.remove(i);
            }
        }


        System.out.println("_______________");

        for (int i = 0; i < robotList.size(); i++) {
            System.out.println("Robot " + i + " is jumping");
            if (robotList.get(i).getHeight() >= wallList.get(i).getHeight()) {
                System.out.println("Successful");
            } else {
                System.out.println("Can't make it");
                robotList.remove(i);
            }
        }

        for (int i = 0; i < robotList.size(); i++) {
            if (robotList.get(i).getHeight() < wallList.get(i).getHeight()) {
                catList.remove(i);
            }
        }

        System.out.println("_______________");

        for (int i = 0; i < catList.size(); i++) {
            System.out.println("Cat " + i + " is running");
            if (catList.get(i).getLength() >= treadmillList.get(i).getLength()) {
                System.out.println("Successful");
            } else {
                System.out.println("Can't make it");
            }
        }

        System.out.println("_______________");

        for (int i = 0; i < humanList.size(); i++) {
            System.out.println("Human " + i + " is running");
            if (humanList.get(i).getLength() >= treadmillList.get(i).getLength()) {
                System.out.println("Successful");
            } else {
                System.out.println("Can't make it");
            }
        }

        System.out.println("_______________");

        for (int i = 0; i < robotList.size(); i++) {
            System.out.println("Robot " + i + " is running");
            if (robotList.get(i).getLength() >= treadmillList.get(i).getLength()) {
                System.out.println("Successful");
            } else {
                System.out.println("Can't make it");
            }
        }

    }
}
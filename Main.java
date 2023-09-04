public class Main {
    public static void main(String[] args){
        Dog snoopy = new Dog("Snoopy", 5, "Brown", CharacteristicsEnum.Size.ExtraSmall, CharacteristicsEnum.TailSize.LARGE);
        Dog spot = new Dog("Spot", 8, "White");
        Dog wolf = new Dog("Wolf", 2);
        snoopy.bark();
        snoopy.sit();
        snoopy.jump();

        spot.bark();
        spot.sit();
        spot.jump();

        wolf.bark();
        wolf.sit();
        wolf.jump();

        System.out.println("Name: " + snoopy.getName());
        System.out.println("Age: " + snoopy.getAge());
        System.out.println("Color: " + snoopy.getColor());

        System.out.println("Name: " + spot.getName());
        System.out.println("Age: " + spot.getAge());
        System.out.println("Color: " + spot.getColor());

        System.out.println("Name: " + wolf.getName());
        System.out.println("Age: " + wolf.getAge());
        System.out.println("Color: " + wolf.getColor());

        //Setter
        snoopy.setName("Noodles");
        System.out.println("Snoopy's new name is: " + snoopy.getName());

        spot.setAge(3);
        System.out.println("Spot's new age is: " + spot.getAge());
    }
}

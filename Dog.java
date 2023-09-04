public class Dog {
    //properties
    private String name;
    private int age;
    private String color;
    private CharacteristicsEnum.Size size;
    private CharacteristicsEnum.TailSize tailSize;

    //constructor methods
    public Dog(String name, int age, String color, CharacteristicsEnum.Size size, CharacteristicsEnum.TailSize tailSize){
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
        this.tailSize = tailSize;
    }
    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    //method
    public void bark(){
        System.out.println(name + " says: Ruff!");
    }
    public void sit(){
        System.out.println(name + " is sitting.");
    }
    public void jump(){
        System.out.println(name + " is jumping.");
    }

    //Getters & Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }




}

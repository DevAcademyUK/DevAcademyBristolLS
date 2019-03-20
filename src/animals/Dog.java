package animals;

public class Dog {

    private String name;
    private String size;
    private int age;
    private String breed;

    public Dog(String name, String size, int age, String breed){
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }

    public String bark(String size){
        String bark = "";
        if(size.equalsIgnoreCase( "small")){
            bark = "yap yap yap";

        }

        else if(size.equalsIgnoreCase( "medium")) {
            bark = "woof woof";
        }
        else{
            bark = "WOOF! WOOF!";
        }

        return bark;

    }

}

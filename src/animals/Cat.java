package animals;

public class Cat {
    private String name;
    private String size;
    private int age;

    public Cat(String name, String size, int age){

        this.name = name;
        this.size = size;
        this.age = age;
    }

    public String catchMouse (){
        String catchMouse = "";

        if(size.equalsIgnoreCase( "small")) {
            catchMouse = "Hooray! Let's do it!";

        }

        else if (size.equalsIgnoreCase( "big")) {
            catchMouse = "No, I'd better sleep";

        }

        else {
            catchMouse = "Ok";
        }
        return catchMouse;

    }

    }

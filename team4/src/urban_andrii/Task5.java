package urban_andrii;

import java.util.Scanner;

public class Task5 {
    public String greet(String name){
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }
        else {
            return String.format("Hello, %s!", name);
        }
     }
}



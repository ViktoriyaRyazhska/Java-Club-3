package andrii_yaremko;

import java.util.Scanner;

public class Task12 {
    public int id;
    public String second_name;
    public Object anObject;


    public Task12(int name, String second_name) {
        this.id = name;
        this.second_name = second_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public Object getAnObject() {
        return anObject;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

    @Override
    public String toString() {
        return "Task12: " +
                "id = " + id +
                "  second_name = " + second_name;
    }
}

package andrii_yaremko;

import java.util.Scanner;

public class Task12 {
    public int id;
    public String second_name;
    public Object anObject;

    public void addPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter person id");
        int person_id = scanner.nextInt();
        System.out.println("Enter name");
        String name = scanner.next();
        Task12 task12 = new Task12(person_id,name);
        System.out.println(task12);
    }

    public Task12() {
    }

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

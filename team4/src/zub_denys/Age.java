package zub_denys;

public class Age {
    public static String CalculateAge(int birth, int yearTo) {
        // TODO: your code here
        int age = yearTo - birth;
        if (age > 1) {
            return "You are " + age + " years old.";
        } else if (age == 1) {
            return "You are " + age + " year old.";
        } else if (age < -1) {
            return "You will be born in " + Math.abs(age) + " years.";
        } else if (age == -1) {
            return "You will be born in " + Math.abs(age) + " year.";
        } else {
            return "You were born this very year!";
        }
    }

    public static void main(String[] args) {
        System.out.println(CalculateAge(1999, 2000));
    }
}

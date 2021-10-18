public abstract class Kata {
    String title;
    abstract String getTitle();
    abstract String getDetails();
    abstract boolean isValueCorrect(String input);
    abstract String main(String input);

}
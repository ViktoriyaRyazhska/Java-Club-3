public abstract class GroupOfKatas {
    String title;
    abstract String getTitle();
    abstract  String getKatas();
    abstract Kata getKata(int numberOfKata);
    abstract boolean isNumberOfKataCorrect(int num);
}

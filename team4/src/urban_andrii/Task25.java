package urban_andrii;
public class Task25 {
    public void isLove() {
        double flower1=Math.random();
        double flower2=Math.random();
        if(((flower1%2!=0) && (flower2%2!=0)) || ((flower1%2==0) && (flower2%2==0)))
        {
            System.out.println("False");
            }
        else{
            System.out.println("True");
            }

        }

}

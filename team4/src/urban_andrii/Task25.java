package urban_andrii;
public class Task25 {
    public boolean isLove(double flower1,double flower2) {

        if(((flower1%2!=0) && (flower2%2!=0)) || ((flower1%2==0) && (flower2%2==0)))
        {
            return false;
            }
        else{
            return true;
            }

        }

}

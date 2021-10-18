package urban_andrii;

public class Task60 {
    public String fakeBin(String numberString) {
//        String numberString="5345245456326";
    char [] ls = numberString.toCharArray();
    int a = 0;
    for (int i=0; i<numberString.length() ; i++){
        a = Integer.parseInt(String.valueOf(ls[i]));
        if (a < 5 ){
            ls[i]= '0' ;
        }
        else {
            ls[i]= '1' ;
        }
    }
    String s=String.valueOf(ls);
        return s;
}
}


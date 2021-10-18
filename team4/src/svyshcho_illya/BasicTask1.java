package svyshcho_illya;
import java.util.Scanner;
import java.util.Arrays;

public class BasicTask1 {
    public int doubleInteger(double a) {

        double res = a*2;
        System.out.print((int)res);
        return(int)res;

    }
    public  int Past(int h, int m, int s)
    {
        int hins = 0;
        if(h>0){
            hins+=h*60*60*1000;

        }
        if(m>0){
            hins+=m*60*1000;
        }
        if(s>0){
            hins+=s*1000;

        }
        System.out.println(hins);
        return hins;
    }
    public boolean isDivisible(int wnumb, int pnumb) {


        boolean res = false;
        if(wnumb % pnumb == 0){
            res = true;
        }
        System.out.println(res);
        return res;
    }
    public String datingRange(int age) {
        //return min-max
        double min = 0.0;
        double max = 0.0;
        if(age>14) {
            min +=age/2 + 7;
            max +=(age-7)*2;
        }
        else {
            min +=age-age*0.1;
            max +=age+age*0.1;
        }
        int imin = (int) min;
        int imax = (int) max;
        System.out.println(imin +"-"+imax);
        return imin +"-"+imax;

    }
    public class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
        public void GetInfo () { Scanner info = new Scanner(System.in);
            System.out.println("Enter name : ");
            name  = info.nextLine();
            System.out.println("Enter health: ");
            health = info.nextInt();
            System.out.println("Enter damagePerAttack: ");
            damagePerAttack = info.nextInt();

        }
    }

    public  void declareWinner() {

        System.out.println("Enter first fighter (1/2):");
        Scanner myObj = new Scanner(System.in);
        int res = myObj.nextInt();
        Fighter fighter1 = new Fighter("20",5,2);
        fighter1.GetInfo();
        Fighter fighter2 = new Fighter("23",578, 67);
        fighter2.GetInfo();
        String firstAttacker = fighter1.name;
        if(res==2){firstAttacker = fighter2.name;}
        boolean check = firstAttacker.equals(fighter1.name);
        while (true) {
            if (check) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0)
                {System.out.println(fighter1.name);
                    break;}
                    //return fighter1.name;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0)
                {System.out.println(fighter2.name);
                    break;}
                    //return fighter2.name;
            }
            check = !check;
        }
    }
    public boolean isDivisiblex(int n, int x, int y) {
        boolean res = false;
        if(n%x == 0 && n%y == 0){ res = true;}
        System.out.println(res);
        return res;

        //return n%x==0 && n%y==0;
    }
    public  void Past()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number h:");
        int h = myObj.nextInt();
        System.out.println("Enter number m:");
        int m = myObj.nextInt();
        System.out.println("Enter number s:");
        int s = myObj.nextInt();
        int hins = 0;
        if(h>0){
            hins+=h*60*60*1000;

        }
        if(m>0){
            hins+=m*60*1000;
        }
        if(s>0){
            hins+=s*1000;

        }
        System.out.println(hins);
    }
    public int CalculateAge(int birth,int yearTo) {
        int res = 0;
        if(yearTo-birth==1){
            res = yearTo-birth;
            System.out.println("You are " + res+" year old.");
        }
        if(birth-yearTo==1){
            res = birth-yearTo;
           System.out.println("You will be born in " + res + " year.");
        }
        if(birth<yearTo){
            res = yearTo-birth;
            System.out.println("You are " + res+" years old.");
        }
        else if(birth>yearTo){
            res = birth-yearTo;
            System.out.println("You will be born in " + res + " years.");
        }
        else{
            System.out.println("You were born this very year!");
            return 0;

        }
        return res;

    }
    public void datingRange() {
        //return min-max
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = myObj.nextInt();
        double min = 0.0;
        double max = 0.0;
        if(age>14) {
            min +=age/2 + 7;
            max +=(age-7)*2;
        }
        else {
            min +=age-age*0.1;
            max +=age+age*0.1;
        }
        int imin = (int) min;
        int imax = (int) max;
        System.out.println(imin +"-"+imax);
    }
    public void Dinglemouse() {
        System.out.println("Check the result in that link: ");
        System.out.println("https://www.codewars.com/kata/596c55fc7bd5476bf60000d5/train/java");

    }


    public boolean isLove(int flower1,int flower2) {

            boolean result = false;
            if(flower1 %2 == 0 && flower2 %2 != 0){
                result = true;
            }
            else if(flower2 %2 == 0 && flower1 %2 != 0){
                result = true;
            }
            System.out.println(result);
            return result;

        }
    public int rentalCarCost(int d) {

        int sum = 0;
        if(d>=7){
            sum = 40*d-50;
        }
        else if(d>=3){
            sum = d*40 - 20;
        }
        else{
            sum = d*40;
        }
        System.out.println(sum);
        return sum;
    }
    public String map(int size, int arr[]) {



        for(int i = 0;i<size;i++){
            arr[i] = arr[i]*2;
        }
        for(int i = 0;i<size;i++){
            System.out.println(arr[i]);

        }
        return Arrays.toString(arr);


    }
    public int sequence(int n) {
        Scanner myObj = new Scanner(System.in);

        int a1=0; int a2=1; int a_next;
        if (n==1){a_next=0;}else{a_next=1;}
        for(int k=1;k<=n-2;k++){a_next=(a1+a2)%3; a1=a2; a2=a_next;}
        System.out.println(a_next);
        return a_next;

    }
    public int grow(int size, int x[]){



        int result = 1;
        for(int i = 0;i<x.length;i++){
            result*=x[i];
        }

        System.out.println(result);
        return result;

    }
    public int nearestSq(int n){
        Scanner myObj = new Scanner(System.in);

        int n1=n;
        int n2=n;
        int nres=n;
        while(true){
            if((int)Math.sqrt(n1)*(int)Math.sqrt(n1)==n1){nres=n1;break;}
            if((int)Math.sqrt(n2)*(int)Math.sqrt(n2)==n2){nres=n2;break;}
            n1=n1-1; n2=n2+1;
        }
        System.out.println(nres);
        return nres;
    }
    public void God(){
        System.out.print("Check code in that link");
        System.out.print("https://www.codewars.com/kata/547274e24481cfc469000416/train/java");
    }
    public String numberToString(int num) {
        // Return a string of the number here!


        String s=String.valueOf(num);
        System.out.println(s);
        return s;
    }
    public String replaceDots(String str){


        char[] ch = str.toCharArray();
        int size = ch.length;
        for(int i = 0;i<size;i++){
            if(ch[i]=='.'){
                ch[i]='-';
            }
        }
        String s = new String(ch);


        System.out.println(s);
        return s;
    }
    public int position(char alphabet) {
        int a = "abcdefghijklmnopqrstuvwxyz".indexOf(alphabet) + 1;
        System.out.println("Position of alphabet: " + a);
        return a;
    }
    public String abbrevName(String name) {
        int N=name.indexOf(" ");
        String name1=name.substring(0,1)+"."+name.substring(N+1,N+2);
        System.out.println(name1);
        return name1;
    }
    public String toAlternativeString(String string) {


        char[] ch = string.toCharArray();
        int size = ch.length;
        for(int i = 0;i<size;i++){
            if(ch[i]==Character.toUpperCase(ch[i])){
                ch[i]=Character.toLowerCase(ch[i]);
            }
            else{ch[i]=Character.toUpperCase(ch[i]);}
        }
        String s = new String(ch);
        System.out.println(s);
        return s;
    }
    public  void filterOddNumber()
    {
        System.out.println("result: ");
        System.out.println("https://www.codewars.com/kata/566dc566f6ea9a14b500007b/train/java");
    }




}

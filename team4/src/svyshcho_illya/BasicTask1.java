package svyshcho_illya;
import java.util.Scanner;

public class BasicTask1 {
    public int doubleInteger() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number:");

        double numb = myObj.nextDouble();
        double res = numb*2;
        System.out.print((int)res);
        return(int)res;

    }
    public boolean isDivisible() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number w:");

        int wnumb = myObj.nextInt();
        System.out.println("Enter number p:");
        int pnumb = myObj.nextInt();
        boolean res = false;
        if(wnumb % pnumb == 0){
            res = true;
        }
        return res;
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
    public boolean isDivisiblex() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = myObj.nextInt();
        System.out.println("Enter number x:");
        int x = myObj.nextInt();
        System.out.println("Enter number y:");
        int y = myObj.nextInt();
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
    public void CalculateAge() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number birth:");
        int birth = myObj.nextInt();
        System.out.println("Enter number yearTo:");
        int yearTo = myObj.nextInt();
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

        }

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


    public void isLove() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter flower one:");
        int flower1 = myObj.nextInt();
        System.out.println("Enter flower two:");
        int flower2 = myObj.nextInt();
            boolean result = false;
            if(flower1 %2 == 0 && flower2 %2 != 0){
                result = true;
            }
            else if(flower2 %2 == 0 && flower1 %2 != 0){
                result = true;
            }
            System.out.println(result);

        }
    public void rentalCarCost() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter days:");
        int d = myObj.nextInt();
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
    }
    public void map() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = myObj.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            System.out.println("Enter "+ i + " element: ");
            arr[i] = myObj.nextInt();
        }

        for(int i = 0;i<size;i++){
            arr[i] = arr[i]*2;
        }
        for(int i = 0;i<size;i++){
            System.out.println(arr[i]);
        }


    }
    public void sequence() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = myObj.nextInt();
        int a1=0; int a2=1; int a_next;
        if (n==1){a_next=0;}else{a_next=1;}
        for(int k=1;k<=n-2;k++){a_next=(a1+a2)%3; a1=a2; a2=a_next;}
        System.out.println(a_next);

    }
    public void grow(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = myObj.nextInt();
        int[] x = new int[size];
        for(int i = 0;i<size;i++){
            System.out.println("Enter "+ i + " element: ");
            x[i] = myObj.nextInt();
        }

        int result = 1;
        for(int i = 0;i<x.length;i++){
            result*=x[i];
        }

        System.out.println(result);

    }
    public void nearestSq(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = myObj.nextInt();
        int n1=n;
        int n2=n;
        int nres=n;
        while(true){
            if((int)Math.sqrt(n1)*(int)Math.sqrt(n1)==n1){nres=n1;break;}
            if((int)Math.sqrt(n2)*(int)Math.sqrt(n2)==n2){nres=n2;break;}
            n1=n1-1; n2=n2+1;
        }
        System.out.println(nres);
    }
    public void God(){
        System.out.print("Check code in that link");
        System.out.print("https://www.codewars.com/kata/547274e24481cfc469000416/train/java");
    }
    public void numberToString() {
        // Return a string of the number here!
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = myObj.nextInt();
        String s=String.valueOf(num);
        System.out.println(s);
    }
    public void replaceDots(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter str:");
        String str = myObj.nextLine();
        char[] ch = str.toCharArray();
        int size = ch.length;
        for(int i = 0;i<size;i++){
            if(ch[i]=='.'){
                ch[i]='-';
            }
        }
        String s = new String(ch);


        System.out.println(s);
        // return str.replaceAll(".", "-");
    }
    public void position()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter str:");
        char alphabet = myObj.next().charAt(0);
        System.out.print("Position of alphabet: "+((int)alphabet-96));
    }
    public void abbrevName() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter str:");
        String name = myObj.nextLine();
        int N=name.indexOf(" ");
        String name1=name.substring(0,1)+"."+name.substring(N+1,N+2);
        System.out.println(name1);
    }
    public void toAlternativeString() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter str:");
        String string = myObj.nextLine();
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
    }
    public  void filterOddNumber()
    {
        System.out.println("result: ");
        System.out.println("https://www.codewars.com/kata/566dc566f6ea9a14b500007b/train/java");
    }




}

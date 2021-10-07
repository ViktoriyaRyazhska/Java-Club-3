package com.club3.java;

import java.util.Scanner;

public class Conditions {

    public Scanner scanner = new Scanner(System.in);

    public void getVolumeOfCuboid3() {
        System.out.println("Enter length,width,height ");
        Scanner leng = new Scanner(System.in);
        Scanner wid = new Scanner(System.in);
        Scanner heig = new Scanner(System.in);
        double lengs = leng.nextDouble();
        double width = wid.nextDouble();
        double height = heig.nextDouble();
        System.out.println(lengs*width*height + " m^3");

    }
    public void Past7()
    {
        System.out.println("Enter h,m,s ");
        Scanner H = new Scanner(System.in);
        Scanner M = new Scanner(System.in);
        Scanner S = new Scanner(System.in);
        int hours = H.nextInt();
        int min = M.nextInt();
        int sec = S.nextInt();
        int res = 0;
        if(hours<=23 && hours >=0)
        {
            if(min<=59 && min>=0)
            {
                if(sec>=0)
                {
                    res = ((hours*3600)+(min*60)+(sec))*1000;
                }
            }

        }
        System.out.println(res + " ms");


    }

    public String weatherInfo11() {
        System.out.println("Enter farenheit");
        Scanner F = new Scanner(System.in);
        int far = F.nextInt();

        double cels = 0;

        cels = ((far - 32)*(5.0/9.0) );

        if (cels>0)
        {

            return cels +" is above freezing temperature";
        }
        else
        {

            return cels +" is freezing temperature";
        }

    }

    public String divinity19()
    {
        int na=0;
        Scanner justn = new Scanner(System.in);
        Scanner justx = new Scanner(System.in);
        Scanner justy = new Scanner(System.in);
        int n = justn.nextInt();
        int x = justx.nextInt();
        int y = justy.nextInt();


        if (n%x == 0 && n%y == 0)
        {

        }
        return na+"";


    }


}

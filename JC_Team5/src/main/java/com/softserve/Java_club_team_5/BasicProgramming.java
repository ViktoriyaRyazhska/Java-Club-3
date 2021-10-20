package com.softserve.Java_club_team_5;

public class BasicProgramming {
    //kata1
    public static int doubleInteger(int i) {
        return i * 2;
    }
    //kata2
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    //kata3
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
    //kata4
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;
    }
    //kata5
    public static String greet(String name) {
        if(name.equals("Johnny")){
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);


    }
    //kata6
    public static int toBinary(int n) {
        int binary[] = new int[40];
        int idx = 0, result = 0;
        while(n > 0){
            binary[idx++] = n%2;
            n = n/2;
        }
        for(int i = idx-1;i >= 0;i--){
            result *= 10;
            result +=binary[i];
        }
        return result;
    }
    //kata7
    public static int Past(int h, int m, int s)
    {
        return (h * 3600000) + (m * 60000) + (s * 1000);
    }
    //kata8
    public static int century(int number) {
        return (int)Math.ceil((double)number / 100);
    }
    //kata9
    public static int makeNegative(final int x) {
        return -x;
    }
    //kata10
    public static String datingRange(int age) {
        if(age > 14)
            return ((age/2)+7) + "-" + ((age-7)*2);
        else
            return (int)(age - (0.10 * age)) + "-" + (int)(age + (0.10 * age));
    }
    //kata11
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        double celsius = (temperature - 32) * (5/9.0);
        return celsius;
    }

}

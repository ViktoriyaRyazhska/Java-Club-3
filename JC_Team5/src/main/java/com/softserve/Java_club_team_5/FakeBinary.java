package com.softserve.Java_club_team_5;

public class FakeBinary {

    private static String numbers = "2348942398042398";

    public static void main(String[] args) {
        FakeBinary fakeBinary = new FakeBinary();
        System.out.println(fakeBinary.convert(numbers));
    }

    public StringBuilder convert(String numbers){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length(); i++) {
            if(numbers.charAt(i) < '5'){
                result.append("0");
            }else {
                result.append("1");
            }
        }
        return result;
    }
}

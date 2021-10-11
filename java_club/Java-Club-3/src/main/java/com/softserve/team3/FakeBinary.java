package com.softserve.team3;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        char [] arr = numberString.toCharArray();
        for(int i = 0; i <arr.length;i++){
            if(Integer.parseInt(String.valueOf(arr[i]))>=5){
                arr[i]='1';
            }else arr[i]='0';
        }
        return String.valueOf(arr);
    }
}

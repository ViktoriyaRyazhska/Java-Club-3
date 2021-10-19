package com.softserve.Java_club_team_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    ArrayList<String> dict=new ArrayList<>();
    Scanner scan=new Scanner(System.in);
    private void newentry(String name){
        String description;
        description=scan.nextLine();
        String e="Entry: "+name+"-/ Description: "+ description+" ;";
        dict.add(e);
        System.out.println(e);
        System.out.println("Entry added!");
    }
    private void look(String name){
        int i=0;
        for(String s:dict)
            if(s.contains(name)){
                System.out.println(s);
            }
        else
        {
            System.out.println("Entry does not exist");
            break;
        }

    }
    public void operate(){
        int i;
        System.out.println("chose operation: \r\n 1)Add entry\n" +
                " 2)Look for an entry\n" +
                " 0)Exit");
        do{
            i=scan.nextInt();
            switch (i){
                case 1:
                    newentry(scan.next());
                break;

                case 2:
                    look(scan.next());
                break;
            }
        }while (i!=0);
    }

}

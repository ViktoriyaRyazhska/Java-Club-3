package com.softserve.Java_club_team_5;

public class UnfinishedLoopBugFixingNumOne {
    static int num = 0;

    public static void loop() {

        while (true) {
            num++;
            try {
                stopLoop(num);
            } catch (Exception e) {
                break;
            }
        }
    }

    private static void stopLoop(int num) throws Exception {
        if(num > 10){
            throw new Exception("Unfinished Loop.");
        }
    }

}

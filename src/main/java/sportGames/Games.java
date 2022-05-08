package sportGames;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Games {

//    Create Class "Game" with static method and enum
//    The enum "GameType" will list three types of games: soccer, hockey, and rugby.
//    will check the type and create a new file with the name of the game as the name of the file
//    In the file, it will print 11 in the case of Soccer, 6 if it is Hockey, and 15 for Rugby.
//    Please use a switch case.



    enum GameType {
        SOCCER,
        HOKEY,
        RUGBY

    }

    public static void writeNumOfPlayers(GameType game) {
        String soccerFile = "Soccer.txt";
        String hokeyFile = "Hokey.txt";
        String rugbyFile = "Rugby.txt";
        String soccerTxt = "The Oak Ridges soccer team consists of 11 players.";
        String hokeyTxt = "The Richmond Hill Stars hockey team has replenished with 6 new players, and now it consists of 25 players.";
        String rugbyTxt = "The Yeomen Lions rugby team consists of 16 players.";

        try {
            switch (game) {
                case SOCCER:
                    File file = new File(soccerFile);
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        System.out.println("Error: Unable to create a file");
                        e.printStackTrace();
                    }
                    try {
                        FileWriter fileWriter = new FileWriter(soccerFile);
                        fileWriter.write(soccerTxt);
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case HOKEY:
                    File file1 = new File(hokeyFile);
                    try {
                        file1.createNewFile();
                    } catch (IOException e) {
                        System.out.println("Error: Unable to create a file");
                        e.printStackTrace();
                    }
                    try {
                        FileWriter fileWriter = new FileWriter(hokeyFile);
                        fileWriter.write(hokeyTxt);
                        fileWriter.close();
                    } catch (IOException e) {
                        System.out.println("Cannot write to the 'Hokey' file");
                        e.printStackTrace();
                    }
                    break;
                case RUGBY:
                    File file2 = new File(rugbyFile);
                    try {
                        file2.createNewFile();
                    } catch (IOException e) {
                        System.out.println("Error: Unable to create a file");
                        e.printStackTrace();
                    }
                    try {
                        FileWriter fileWriter2 = new FileWriter(rugbyFile);
                        fileWriter2.write(rugbyTxt);
                        fileWriter2.close();
                    } catch (Exception e) {
                        System.out.println("Cannot write to the 'Rugby' file ");
                        e.printStackTrace();
                    }
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



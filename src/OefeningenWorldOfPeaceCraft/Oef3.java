package OefeningenWorldOfPeaceCraft;

import java.util.Random;

public class Oef3 {
    public static void main(String[] args) {

        Random monsterRandomizer = new Random();
        int experiencePointsNeeded = 15;

        int randomMonsterLevel = monsterRandomizer.nextInt(3) + 1;

        for (int maxMonstersYouWantToEncouter = 10; maxMonstersYouWantToEncouter>0; maxMonstersYouWantToEncouter--){

        switch (randomMonsterLevel) {
            case 1:
                break;
            case 2:
                experiencePointsNeeded -=2;
            case 3:
                experiencePointsNeeded -=3;
                break;


        }

        System.out.println("experience points you still have to make:" +experiencePointsNeeded);


    }}}

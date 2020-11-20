package ru.geekbrains.lesion1;

public class Course {

    private int obstacle[] = {100, 100, 100, 100};

    public  void  doIt(Team squadList){
        float result = 0;
        for (int i = 0; i < obstacle.length; i++) {
            for (int e = 0; e < squadList.getSquadList().length; e ++) {
                result = obstacle[i]/squadList.getSquadList()[i].getStamina();
            }
            System.out.println(squadList.getSquadList()[i].getName() + "'s result is " + result + " sec.");
         }
        }


    }


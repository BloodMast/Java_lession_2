package ru.geekbrains.lesion1;

public class main {
    public static void main(String[] args) {

        Teammates[] squad = new Teammates[4];
        squad[0] = new Teammates("John", 6);
        squad[1] = new Teammates("Mike", 14);
        squad[2] = new Teammates("Gregor", 21);
        squad[3] = new Teammates("Stefan", 36);

        Team teamTitle = new Team(squad, "Winners");

        Course compitition = new Course();
        compitition.doIt(teamTitle);
    }
}

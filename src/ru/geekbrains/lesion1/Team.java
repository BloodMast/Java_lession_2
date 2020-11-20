package ru.geekbrains.lesion1;

public class Team {
    private String TeamName;
    Teammates[] squadList;

    public Team (Teammates[] squadList, String TeamName) {
        this.TeamName = TeamName;
        this.squadList = squadList;
    }

    public  String getTeamName (){
        return TeamName;
    }

    public Teammates[] getSquadList(){
        return squadList;
    }


}

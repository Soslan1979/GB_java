package Homework_1.Team;

public class Team {

    private final  String nameTeam;
    private TeamMember[] members;

    public Team(String nameTeam, TeamMember... members) {
        this.nameTeam = nameTeam;
        this.members = members;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public TeamMember[] getMembers() {
        return members;
    }

    public void showResult(){
        System.out.println();
        System.out.println("Соревновалась команда: " + getNameTeam());
        for (TeamMember member: members){
            if (member.isStatus() == false) {
                System.out.println(member.getName() + " не прошёл полосу препятствий.");
            } else {
                System.out.println(member.getName() + " прошёл полосу препятствий." + " Так держать " + member.getName() + "!");
            }
        }
    }
}

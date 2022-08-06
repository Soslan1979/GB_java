package Homework_1.obstacleCourse;

import Homework_1.Team.Team;
import Homework_1.Team.TeamMember;

public class Course {

    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (TeamMember member: team.getMembers()) {
            for(Obstacle obstacle: obstacles){
                obstacle.goChallenge(member);
                if (member.isStatus() == false){
                    break;
                }
            }
        }
    }
}

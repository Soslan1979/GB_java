package Homework_1.obstacleCourse;

import Homework_1.Team.TeamMember;

public class Cross extends Obstacle {

    public Cross(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member){
        member.cross(super.getDifficulty());
    }
}

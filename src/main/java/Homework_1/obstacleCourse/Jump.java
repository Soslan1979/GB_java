package Homework_1.obstacleCourse;

import Homework_1.Team.TeamMember;

public class Jump extends Obstacle {

    public Jump(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member){
        member.jump(super.getDifficulty());
    }
}

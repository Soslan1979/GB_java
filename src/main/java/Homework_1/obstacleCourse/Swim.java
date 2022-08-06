package Homework_1.obstacleCourse;

import Homework_1.Team.TeamMember;

public class Swim extends Obstacle {

    public Swim(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member){
        member.swim(super.getDifficulty());
    }
}

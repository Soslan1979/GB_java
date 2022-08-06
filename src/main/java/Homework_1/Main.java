/**
 * Калабеков С.К.
 * ДЗ номер 1
 * 6.07.22
 * */

package Homework_1;

import Homework_1.Team.Team;
import Homework_1.Team.TeamMember;
import Homework_1.obstacleCourse.Course;
import Homework_1.obstacleCourse.Cross;
import Homework_1.obstacleCourse.Jump;
import Homework_1.obstacleCourse.Swim;

public class Main {

    public static void main(String[] args) {

        Team winners = new Team("\'Победители\'",
                new TeamMember("Том", 2),
                new TeamMember("Билл", 3),
                new TeamMember("Макс", 4),
                new TeamMember("Джон" ,5));

        Course course = new Course(new Cross(3), new Jump(4), new Swim(5));

        System.out.println("На старт! Внимание! Марш!");
        course.doIt(winners);
        winners.showResult();
    }
}

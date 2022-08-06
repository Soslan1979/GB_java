package Homework_1.Team;

public class TeamMember {

    private final String name;
    private final int power;
    private boolean status;

    public TeamMember(String name, int power) {
        this.name = name;
        this.power = power;
        this.status = false;
    }

    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }

    public void cross(int difficulty){
        if(difficulty <= power){
            System.out.println(getName() + " пробежал кросс.");
            status = true;
        }else {
            System.out.println(getName() + " не пробежал кросс.");
            status = false;
        }
    }

    public void jump(int difficulty){
        if(difficulty <= power){
            System.out.println(getName() + " преодолел барьер.");
            status = true;
        }else {
            System.out.println(getName() + " не преодолел барьер.");
            status = false;
        }
    }

    public void swim(int difficulty){
        if(difficulty <= power){
            System.out.println(getName() + " проплыл дистанцию.");
            status = true;
        }else {
            System.out.println(getName() + " не проплыл дистанцию.");
            status = false;
        }
    }
}

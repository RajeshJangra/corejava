package Xebia.entity;


import org.springframework.stereotype.Component;


@Component("user")
public class User {

    private String name ="Prince";
    private String skill = "Developer";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
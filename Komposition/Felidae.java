package Komposition;

/**
 * Created by User on 02.11.2016.
 */
public class Felidae{
    private String name;
    private Skill[] skills;

    public boolean hasSkill(String skillName)  {
        for(Skill skill : this.skills) {
            if(skillName.equals(skill.getName())) {
                return skill.isHasSkill();
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }

        public Skill[] getSkills() {
        return skills;
    }




}

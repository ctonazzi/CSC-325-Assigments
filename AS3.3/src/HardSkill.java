public class HardSkill extends Skill{
    String name;
    String type;
    int skillLevel;

    public HardSkill(String name, String type, int skillLevel) { // Constructor
        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }

    // Getters
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public int getSkillLevel() {
        return skillLevel;
    }
    
    // Methods
    @Override
    public void identifySkill() { // Outputs the type, name, and skill level of this skill object.
        System.out.println(type + " of " + name + " has a level of " + skillLevel);
    }

    @Override // VSCode would not stop yelling at me until I added this.
    void Skill(String name, String type, int skillLevel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

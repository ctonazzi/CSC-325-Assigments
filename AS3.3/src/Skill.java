abstract class Skill {
    String name;
    String type;
    int skillLevel;

    abstract void Skill(String name, String type, int skillLevel); // Constructor

    // Getters
    abstract String getName();
    
    abstract String getType();

    abstract int getSkillLevel();

    // Methods
    abstract void identifySkill();
}
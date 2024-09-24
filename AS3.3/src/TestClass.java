public class TestClass {
    public static void main(String[] args) {
        // Creating skill objects
        HardSkill skill1 = new HardSkill("Programming", "Hard skill", 7);
        SoftSkill skill2 = new SoftSkill("Commuication", "Soft kill", 5);
        GiftSkill skill3 = new GiftSkill("Mercy", "Gift skill", 9);
        TalentSkill skill4 = new TalentSkill("Organization", "Talent skill" , 2);

        // Calling idenfitySkill() method on each individual object.
        skill1.identifySkill();
        skill2.identifySkill();
        skill3.identifySkill();
        skill4.identifySkill();
    }
}

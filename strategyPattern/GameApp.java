public class GameApp {
    public static void main(String[] args) {

        Character knight = new Character("Knight");
        knight.setAttackStrategy(new SwingSword());
        knight.setDefenseStrategy(new Shield());

        Character wizard = new Character("Wizard");
        wizard.setAttackStrategy(new CastSpell());
        wizard.setDefenseStrategy(new CreateMagic());

        Character archer = new Character("Archer");
        archer.setAttackStrategy(new ShootArrow());
        archer.setDefenseStrategy(new Dodge());

        knight.attack();
        knight.defend();

        knight.setDefenseStrategy(new Dodge());

        knight.defend();
        
        knight.setDefenseStrategy(new CreateMagic());
        knight.defend();

        System.out.println();

        wizard.attack();
        wizard.defend();

        System.out.println();

        archer.attack();
        archer.defend();
    }
}

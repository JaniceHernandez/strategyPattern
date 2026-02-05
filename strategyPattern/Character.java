public class Character {

    private String name;
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Character(String name) {
        this.name = name;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

    public void attack() {
        System.out.print(name + " ");
        attackStrategy.attack();
    }

    public void defend() {
        System.out.print(name + " ");
        defenseStrategy.defend();
    }
}

public class Poison_Smoke{
    private int hp;
    private int dmg;
    private int attack;
    private int move;
    private String ability;

    public Poison_Smoke(){
        this.hp = 10;
        this.dmg = 0;
        this.attack = 0;
        this.move = 0;
        this.ability = "EndTurn_Posion_Smoke";
    }

    public int getHealth(){
        return this.hp;
    }
        
    public int getDamage(){
        return this.dmg;
    }
    public int getAttack(){
        return this.attack;
    }
    public int getMove(){
        return this.move;
    }
    public String getAbility(){
        return this.ability;
    }
}
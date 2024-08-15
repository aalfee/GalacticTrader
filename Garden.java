public class Garden{
    private int hp;
    private int dmg;
    private int attack;
    private int move;
    private String ability;

    public Garden(){
        this.hp = 5;
        this.dmg = 1;
        this.attack = 1;
        this.move = 0;
        this.ability = "EndTurn_Garden";
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
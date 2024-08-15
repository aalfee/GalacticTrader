public class Parched{
    private int hp;
    private int dmg;
    private int attack;
    private int move;
    private String ability;

    public Parched(){
        this.hp = 1;
        this.dmg = 5;
        this.attack = 1;
        this.move = 8;
        this.ability = "Grow_Parched";
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
public class Eggs{
    private int hp;
    private int dmg;
    private int attack;
    private int move;
    private String ability;

    public Eggs(){
        this.hp = 1;
        this.dmg = 1;
        this.attack = 1;
        this.move = 1;
        this.ability = "Spawn_Eggs";
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
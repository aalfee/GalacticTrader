public class Plasma{
    private int hp;
    private int dmg;
    private int attack;
    private int move;
    private String ability;

    public Plasma(){
        this.hp = 2;
        this.dmg = 3;
        this.attack = 10;
        this.move = 8;
        this.ability = null;
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
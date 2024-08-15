public class Rangers{
    private int hp;
    private int dmg;
    private int attack;
    private int move;
    private String ability;

    public Rangers(){
        this.hp = 4;
        this.dmg = 1;
        this.attack = 10;
        this.move = 0;
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
public class Genral_Lem{
    private int hp;
    private int dmg;
    private String ability;
    private String effect;
    private int attack;
    private int move;

public General_Lem(){
    this.hp = 20;
    this.hp = 3; 
    this.ability = "Call";
    this.effect = "Ectomorph";
    this.attack = 1;
    this.move = 1;
}
    public int getHealth(){
        return this.hp;
    }
    public int getDamage(){
        return this.dmg;
    }
    public String getAbility(){
        return this.ability;
    }
    public String getEffect(){
        return this.effect;
    }
    public int getAttack(){
        return this.attack;
    }
    public int getMove(){
        return this.move;
    }
}
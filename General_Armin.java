public class General_Armin {
    private int hp;
    private int dmg;
    private String ability;
    private String effect;
    private int attack;
    private int move;

public General_Armin(){
    this.hp = 20;
    this.dmg = 3;
    this.ability = "Chain";
    this.effect = "Knights";
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

    public void setHealth(int hp){
        this.hp = hp;
    }

    public void setDamage(int dmg){
        this.dmg = dmg;
    }
}

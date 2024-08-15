public class Host{
    private int hp;
    private int dmg;
    private int attack;
    private int move;
    private String ability;

    public Host(){
        this.hp = 5;
        this.dmg = 6;
        this.attack = 1;
        this.move = 8;
        this.ability = "Spawn_Host";
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
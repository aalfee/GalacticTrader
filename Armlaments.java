public class Armlaments{
    private int hp;
    private int dmg;
    private int attack;
    private int move;
    private String ability;

    public Armlaments(){
        this.hp = 3;
        this.dmg = 2;
        this.attack = 1;
        this.move = 8;
        this.ability = "Spawn_Armlaments";
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
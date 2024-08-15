class main {

    public static void main (String[] args){

        General_Lem k1 = new General_Lem(); //All classes must be in same directory, thats why General_Lem doesnt compile

        System.out.println(k1.getHealth());
        System.out.println(k1.getDamage());
        System.out.println(k1.getAbility());
        System.out.println(k1.getAttack());
        System.out.println(k1.getMove());
       
    }
}
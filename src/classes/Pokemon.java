package classes;

public class Pokemon {
    public String name;
    public int level;

    public Pokemon(){
        level = 1;
    }
    public Pokemon(String name, int level){
        this.name = name;
        this.level = level;
    }

    public void attack(){
        System.out.println(name + " attack!");
    }
}

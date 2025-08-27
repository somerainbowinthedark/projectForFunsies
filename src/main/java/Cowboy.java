
import java.util.Random;

public class Cowboy {
    public String cowboys;
    public int level;

    public int constitutiton;
    public int strength;
    public int charisma; 
    public int dexterity;
    public int wisdom;
    public int intelligence; 
    
    
    public Cowboy(String cowboytd){
        this.cowboys = cowboytd;

        this.level = 1;
        int[] stats = new int[]{15, 14, 13, 12, 10, 8};

        this.strength = stats[0];
        this.charisma = stats[1];
        this.dexterity = stats[2];
        this.constitutiton = stats[3];
        this.intelligence = stats[4];
        this.wisdom = stats[5];
    }

    public void printCharacterSheetTD(){
        System.out.println("Name: " + this.cowboys);
        System.out.println("Level: " + this.level);
        System.out.println("Strength: " + this.strength);
        System.out.println("Dexterity: " + this.dexterity);
        System.out.println("Constitution: " + this.constitutiton);
        System.out.println("Charisma: " + this.charisma);
        System.out.println("Intelligence: " + this.intelligence);
        System.out.println("Wisdom: " + this.wisdom);



    }
     public Cowboy(String cowboys){
        this.cowboys = cowboys;

        this.level = 1;
        int[] stats = new int[]{15, 14, 13, 12, 10, 8};

        this.strength = stats[0];
        this.charisma = stats[1];
        this.dexterity = stats[2];
        this.constitutiton = stats[3];
        this.intelligence = stats[4];
        this.wisdom = stats[5];
    }

    public void printCharacterSheetA(){
        System.out.println("Name: " + this.cowboys);
        System.out.println("Level: " + this.level);
        System.out.println("Strength: " + this.strength);
        System.out.println("Dexterity: " + this.dexterity);
        System.out.println("Constitution: " + this.constitutiton);
        System.out.println("Charisma: " + this.charisma);
        System.out.println("Intelligence: " + this.intelligence);
        System.out.println("Wisdom: " + this.wisdom);



    }
}

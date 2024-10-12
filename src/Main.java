// Class Player
class Player{
    String name;
    Integer level;
    Double health;

    
    Armor armor;
    Weapon weapon;

    Player(String Name, Double Health){
        this.name = Name;

        this.health = Health;

    }
    
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void Display(){
        System.out.println("Nama = " + this.name);
        System.out.println("Health = " + this.health);
        this.armor.Display();
        this.weapon.Display();
    }

}

// Class Armor
class Armor{
    Integer defensePower;
    String name;

    Armor (String armorName, Integer defense){
        this.defensePower = defense;
        this.name = armorName;

    }  

    void Display(){
        System.out.println("Armor yang digunakan: " + this.name + ", dengan power armor: " + this.defensePower);
    }
}

class Weapon{
    Integer attackPower;
    String name;

    Weapon(String weaponName, Integer Weapon){
        this.attackPower = Weapon;
        this.name = weaponName;
    }

    void Display(){
        System.out.println("Senjata yang digunakan: " + this.name + ", dengan power senjata: " + this.attackPower);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("=============== STATISTIK PLAYER =================");

        Player player1 = new Player("Ragnar", 100.0);
        
        Weapon sword = new Weapon("Sword",15);

        Armor ironArmor = new Armor("Iron Armor",10);

        player1.equipWeapon(sword);
        player1.equipArmor(ironArmor);
        player1.Display();

        System.out.println("================================================");
        Player player2 = new Player("Bjorn",80.0);

        Weapon bow = new Weapon("Bow", 20);

        Armor leatherArmor = new Armor("Leather Armor", 6);

        player2.equipWeapon(bow);
        player2.equipArmor(leatherArmor);
        player2.Display();
    }

}

// Player, Damage,

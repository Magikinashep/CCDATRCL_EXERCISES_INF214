public class App {
    public static void main(String[] args) throws Exception {
        

        weapons Sniper = new weapons();

        Sniper.name = "Monocle"; 
        Sniper.damage = 127;
        Sniper.weight = 3.4;
        Sniper.rarity = "Legendary";
        Sniper.description = "A legendary sniper rifle used by very skilled Jakobs snipers";
        Sniper.weaponDescription();

        weapons Rifle = new weapons();

        Rifle.name = "Cost_Effective_Q_System";
        Rifle.damage = 50;
        Rifle.weight = 2.5;
        Rifle.rarity = "Common";
        Rifle.description = "This rifle is used by every Atlas soldier";
        Rifle.weaponDescription();

        weapons Pistol = new weapons();

        Pistol.name = "Ornery Law";
        Pistol.damage = 70;
        Pistol.weight = 1.5;
        Pistol.rarity = "Uncommon";
        Pistol.description = "It has a combat knife under its barrel for melee combat purposes";
        Pistol.weaponDescription();
    }
}

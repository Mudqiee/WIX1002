package com.maplestory;

public class MagicShieldTest {
    
    public static void main(String[] args) {

        // 1. Create object
        MagicShield shield1 = new MagicShield();
        MagicShield shield2 = new MagicShield(2.0, 4.0, "Fire");
        MagicShield shield3 = new MagicShield(3.0, 6.0, "Dark");

        // 2. Test setter
        shield1.setRadius(2.5);
        shield1.setThickness(7);
        shield2.setRadius(-1);
        shield2.setRadius(2.5);
        shield2.setThickness(8);
        shield3.setRadius(2);
        shield3.setThickness(-1);
        shield3.setThickness(9);

        // 3. Calculate the defence and mana cost
        System.out.println("Shield 1 Defense Power: " + shield1.calculateDefensePower());
        System.out.println("Shield 1 Mana Cost: " + shield1.calculateManaCost());
        System.out.println("Shield 2 Defense Power: " + shield2.calculateDefensePower());
        System.out.println("Shield 2 Mana Cost: " + shield2.calculateManaCost());
        System.out.println("Shield 3 Defense Power: " + shield3.calculateDefensePower());
        System.out.println("Shield 3 Mana Cost: " + shield3.calculateManaCost());

        // 4. Calculate shields properties 
        System.out.println("Is size 5 valid? " + MagicShield.isValidSize(5));

        // 5. Output the total number of shields created (verify the static counter 
        System.out.println("Total Shields Created: " + MagicShield.getShieldCount());

        // 6. Test edge cases: null, 0, negative values 
        MagicShield shield4 = new MagicShield(0, 0, null);
        System.out.println("Shield 4 Defense Power: " + shield4.calculateDefensePower());
        System.out.println("Shield 4 Mana Cost: " + shield4.calculateManaCost());   
    }
}

#include "Weapon.h"
#include <unistd.h>

void Weapon::setDamage(int weaponDamage) {
    damage = weaponDamage;
}

void Weapon::setWeapon(string charWeapon) {
    weaponName = charWeapon;
}

void Weapon::weapons(string charClass) {
    if (charClass == "Warrior" || charClass == "warrior") {
        setWeapon("Broken Straight Sword");
        setDamage(80);
    } else if (charClass == "Knight" || charClass == "knight") {
        setWeapon("Broadsword");
        setDamage(120);
    } else if (charClass == "Swordsman" || charClass == "swordsman") {
        setWeapon("Scimitar");
        setDamage(110);
    } else if (charClass == "Bandit" || charClass == "bandit") {
        setWeapon("Hand Axe");
        setDamage(135);
    } else if (charClass == "Cleric" || charClass == "cleric") {
        setWeapon("Cleric's Sacred Chime");
        setDamage(90);
    } else if (charClass == "Sorcerer" || charClass == "sorcerer") {
        setWeapon("Sorcerer's Staff");
        setDamage(112);
    } else if (charClass == "Explorer" || charClass == "explorer") {
        setWeapon("Dagger");
        setDamage(57);
    }
}

void Weapon::upgrade() {

}

void Weapon::print() {
    cout << "Your starting weapon is the " << weaponName << endl;
    sleep(1);
    cout << "The " << weaponName << "'s base damage is " << damage << endl;
}


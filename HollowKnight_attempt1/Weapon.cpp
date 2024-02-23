#include "Weapon.h"

Weapon::Weapon() {
    name = "Old Nail";
    upgradeGeo = 250;
    upgradePaleOre = 0;
    damage = 5;
}

void Weapon::setName(string nailType) {
    nailType = name;
}

void Weapon::setUpgradeCost(int geoNeeded, int paleOreNeeded) {
    geoNeeded = upgradeGeo;
    paleOreNeeded = upgradePaleOre;

}

void Weapon::setDamage(int nailDamage) {
    nailDamage = damage;
}

int Weapon::getGeo(Geo geo) {

}

void Weapon::upgrade() {
    char response;
    if (name == "Old Nail") {
        cout << "Would you like to spend 250 geo to upgrade your Old nail to Sharpened? (Y or N): ";
        cin >> response;
        if (response == 'Y' || response == 'y') {
            cout << endl << "You now have a Sharpened Nail" << endl;
            setName("Sharpened Nail");
            setUpgradeCost(800, 1);
            setDamage(9);
        } 
    }
}
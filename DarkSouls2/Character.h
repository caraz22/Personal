#include <iostream>
#include "Stats.h"
#include "Weapon.h"

using namespace std;

class Character {
    private:
    string charName;
    string charClass;
    Stats charStats;
    Weapon charWeapon;

    public:

    Character(string, string);

    void setStats(Stats);
    void setWeapon(Weapon);

    string getClass();
    Stats getStats();
    Weapon getWeapon();
    string getName();

    void print();
};
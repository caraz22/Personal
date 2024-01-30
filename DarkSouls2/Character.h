#include <iostream>
#include "Stats.h"
#include "Weapon.h"

using namespace std;

class Character {
    private:
    string charClass;
    Stats charStats;
    Weapon charWeapon;

    public:

    Character(string);

    void setStats(Stats);
    void setWeapon(Weapon);

    string getClass();
    Stats getStats();
    Weapon getWeapon();

    void print();
};
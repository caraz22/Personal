#include "Character.h"

Character::Character(string newCharName, string newCharClass) {
    charName = newCharName;
    charClass = newCharClass;
}

void Character::setStats(Stats newCharStats) {
    charStats = newCharStats;
}

void Character::setWeapon(Weapon newCharWeapon) {
    charWeapon = newCharWeapon;
}

string Character::getClass() {
    return charClass;
}

Stats Character::getStats() {
    return charStats;
}

Weapon Character::getWeapon() {
    return charWeapon;
}

string Character::getName() {
    return charName;
}

void Character::print() {
    cout << getName() << " chose: " << charClass << endl;
    cout << "Here are the " << charClass << "'s base stats:" << endl;
    usleep(500000);
    charStats.print();
}
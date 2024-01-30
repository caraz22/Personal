#include "Character.h"

Character::Character(string newCharClass) {
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

void Character::print() {
    cout << "You chose: " << charClass << endl;
    cout << "Here are the " << charClass << "'s base stats:" << endl;
    charStats.print();
}
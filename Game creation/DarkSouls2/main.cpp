#include <iostream>
#include "Character.h"

using namespace std;

int main() {
    string pickedClass;    
    cout << "Pick a character class. Your options are:" << endl;
    cout << "Warrior, Knight, Swordsman, Bandit, Cleric, Sorcerer, Explorer" << endl;
    cin >> pickedClass;

    string name;
    cout << "What is your name, " << pickedClass << "?" << endl;
    cin >> name;
    cout << endl;

    Character character(name, pickedClass);

    Stats stats;
    stats.classStats(character.getClass());
    character.setStats(stats);

    character.print();

    Weapon weapon;
    weapon.weapons(character.getClass());
    character.setWeapon(weapon);
    weapon.print();
}
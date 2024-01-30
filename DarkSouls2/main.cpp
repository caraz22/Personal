#include <iostream>
#include "Character.h"

using namespace std;

int main() {
    string pickedClass;    
    cout << "Pick a character class. Your options are:" << endl;
    cout << "Warrior, Knight, Swordsman, Bandit, Cleric, Sorcerer, Explorer" << endl;
    cin >> pickedClass;

    Character character(pickedClass);

    Stats stats;
    stats.classStats(character.getClass());
    character.setStats(stats);

    character.print();
}
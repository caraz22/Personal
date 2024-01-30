#include "Stats.h"

void Stats::setStats(int charLevel, int charVigor, int charEndurance, int charVitality, int charAttune, int charStrength, int charDexterity, int charAdaptability, int charIntelligence,  int charFaith) {
    level = charLevel;
    vigor = charVigor;
    endurance = charEndurance;
    vitality = charVitality;
    attune = charAttune;
    strength = charStrength;
    dexterity = charDexterity;
    adaptability = charAdaptability;
    intelligence = charIntelligence;
    faith = charFaith;
}

void Stats::classStats(string chosenClass) {
    if (chosenClass == "Warrior" || chosenClass == "warrior") {
        setStats(12, 7, 6, 6, 5, 15, 11, 5, 5, 5);
    } else if (chosenClass == "Knight" || chosenClass == "knight") {
        setStats(13, 12, 6, 7, 4, 11, 8, 9, 3, 6);
    } else if (chosenClass == "Swordsman" || chosenClass == "swordsman") {
        setStats(12, 4, 8, 4, 6, 9, 16, 6, 7, 5);
    } else if (chosenClass == "Bandit" || chosenClass == "bandit") {
        setStats(11, 9, 7, 11, 2, 9, 14, 3, 1, 8);
    } else if (chosenClass == "Cleric" || chosenClass == "cleric") {
        setStats(14, 10, 3, 8, 10, 11, 5, 4, 4, 12);
    } else if (chosenClass == "Sorcerer" || chosenClass == "sorcerer") {
        setStats(11, 5, 6, 5, 12, 3, 7, 8, 14, 4);
    } else if (chosenClass == "Explorer" || chosenClass == "explorer") {
        setStats(10, 7, 6, 9, 7, 6, 6, 12, 5, 5);
    }
}

void Stats::print() {
    cout << "Level: " << level << endl;
    cout << "Vigor: " << vigor << endl;
    cout << "Endurance: " << endurance << endl;
    cout << "Vitality: " << vitality << endl;
    cout << "Attune: " << attune << endl;
    cout << "Strength: " << strength << endl;
    cout << "Dexterity: " << dexterity << endl;
    cout << "Adaptability: " << adaptability << endl;
    cout << "Intelligence: " << intelligence << endl;
    cout << "Faith: " << faith << endl;
}
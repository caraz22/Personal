#include <iostream>

using namespace std;

class Stats {
    private:
    int level;
    int vigor;
    int endurance;
    int vitality;
    int attune;
    int strength;
    int dexterity;
    int adaptability;
    int intelligence;
    int faith;

    public:
    void setStats(int, int, int, int, int, int, int, int, int, int);

    void classStats(string);

    void print();
};
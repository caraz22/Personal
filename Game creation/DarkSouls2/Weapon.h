#include <iostream>

using namespace std;

class Weapon {
    private:
    string weaponName;
    int damage;

    public:
    void setDamage(int);
    void setWeapon(string);
    
    void weapons(string);

    void upgrade();

    void print();
};
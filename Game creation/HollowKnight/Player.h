#include <iostream>
#include "EnergySource.h"
#include "Inventory.h"
#include "Weapon.h"
#include "Health.h"
#include "Ability.h"
#include "Spell.h"
#include "Charm.h"
#include "Item.h"

using namespace std;

class Player {
    private:
    Weapon nail;
    Health masks;
    EnergySource soul;
    Geo geo; 

    public:
    Player(Weapon, Health, EnergySource);

    void setGeo(Geo);
    
    Geo getGeo();

	void printGeo(ostream& os) const;
    friend ostream& operator<<(ostream& os, const Player& s);
    
   
 };
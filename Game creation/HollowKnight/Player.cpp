#include "Player.h"

Player::Player(Weapon playerNail, Health playerMasks, EnergySource playerSoul) {
    playerNail = nail;
    playerMasks = masks;
    playerSoul = soul;
}

Geo Player::getGeo() {
    return geo;
}

void Player::setGeo(Geo playerGeo) {
    playerGeo = geo;
}

void Player::printGeo(ostream& os) const {
    
}

ostream& operator<<(ostream& os, const Player& s)
{
    s.printGeo(os);
    return os;
}
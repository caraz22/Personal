#include "Player.h"
#include "unistd.h"
#include <stdlib.h>

using namespace std;

void slow_print(string, unsigned int);

int main() {
    string game = "HOLLOW KNIGHT";
    slow_print(game, 200000);
    char begin;
    while (true) {
        cout << "Begin? (Y or N): ";
        cin >> begin;
        if (begin == 'Y' || begin == 'y') {
            break;
        } else if (begin == 'N' || begin == 'n') {
            slow_print("Goodbye.", 150000);
            exit(0);
        } else {
            cout << "Not a valid response" << endl;
        }
    }

    Weapon nail;
    Health masks;
    EnergySource soul;

    Player knight(nail, masks, soul);

    Geo geo;
    geo.setGeo(0);
    knight.getGeo();
    

}

void slow_print(string str, unsigned int usleepTime) {
    for (size_t i = 0; i < str.size(); i++) {
        cout << str[i];
        usleep(usleepTime);
    }
    cout << endl;
}
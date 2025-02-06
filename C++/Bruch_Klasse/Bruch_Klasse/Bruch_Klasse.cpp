#include <iostream>
#include "Bruch.h"

int main(){
    Bruch bruch = Bruch::Bruch(123, 456);
    bruch.printWert();
    
    bruch.setWert(2, 2);
    std::cout << bruch.getWert() << std::endl;
}

#include <iostream>
#include "MyClasses.h"

int main(){
    Punkt punkt(1, 1);
    punkt.verschieben(1, 1);
    std::cout << punkt.getR();
}
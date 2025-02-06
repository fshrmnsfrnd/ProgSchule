#include "Zahlwerk.h"
#include <iostream>

void Zahlwerk::inkrementieren() {
	if (eins == false){
		eins = true;
	}else if(zwei == false){
		eins = false;
		zwei = true;
	}else if(vier == false){
		eins = false;
		zwei = false;
		vier = true;
	}
	else {
		eins = false;
		zwei = false;
		vier = false;
	}
}

void Zahlwerk::printWert() {
	std::cout << vier << ' ' << zwei << ' ' << eins << std::endl;
}

void Zahlwerk::dekrementieren() {

}

int Zahlwerk::getWertDezimal() {
	return 0;
}
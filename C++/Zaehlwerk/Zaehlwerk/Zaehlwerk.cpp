#include <iostream>
#include "Zahlwerk.h"

int main() {
	Zahlwerk zahler;
	zahler.printWert();
	for (int i = 0; i <= 9; i++) {
		zahler.inkrementieren();
		zahler.printWert();
	}
}
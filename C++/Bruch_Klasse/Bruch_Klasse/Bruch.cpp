#include "Bruch.h"
#include <iostream>


	void Bruch::kuerzen(){
		int temp;
		unsigned int a = Bruch::zaehler;
		unsigned int b = Bruch::nenner;
		while (b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		Bruch::zaehler /= a;
		Bruch::nenner /= a;
	}

	Bruch::Bruch(unsigned int z, unsigned int n) {
		setWert(z, n);
	}

	bool Bruch::setWert(unsigned int z, unsigned int n) {
		if (nenner != 0) {
			Bruch::zaehler = z;
			Bruch::nenner = n;
			kuerzen();
			return true;
		}
		return false;
	}

	double Bruch::getWert() {
		return double(zaehler) / nenner;
	}

	void Bruch::printWert() {
		std::cout << Bruch::getWert() << std::endl;
	}
#include "MyClasses.h"

void Punkt::verschieben(int dx, int dy){
	Punkt::x += dx;
	Punkt::y += dy;
}

double Punkt::getR(){
	return std::sqrt(pow(Punkt::x, 2) + pow(Punkt::y, 2));
}

Punkt::Punkt(int constructorx, int constructory){
	Punkt::x = constructorx;
	Punkt::y = constructory;
}
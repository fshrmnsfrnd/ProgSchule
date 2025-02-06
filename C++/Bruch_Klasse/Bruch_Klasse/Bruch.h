#pragma once

class Bruch{
private:
	unsigned int zaehler = 0;
	unsigned int nenner = 1;
	void kuerzen();
public:
	Bruch(unsigned int z, unsigned int n);
	bool setWert(unsigned int z, unsigned int n);
	double getWert();
	void printWert();
};


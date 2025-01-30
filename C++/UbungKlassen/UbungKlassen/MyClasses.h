#pragma once
#include <cmath>

class Punkt{
	private:
		int x;
		int y;

	public:
		void verschieben(int dx, int dy);
		double getR();
		Punkt(int constructorx, int constructory);
};

class Auto{
	private:
		double tankvolumen = 40;
		double tankinhalt = 0;
		double verbauchPro100km = 0;
	
	public:
		Auto();
};
#pragma once
class Zahlwerk{
private:
	bool eins = false;
	bool zwei = false;
	bool vier = false;
public:
	void inkrementieren();
	void printWert();
	void dekrementieren();
	int getWertDezimal();
};


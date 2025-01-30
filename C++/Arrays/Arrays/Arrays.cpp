#include <string>
#include <iostream>
#include <stack>

using namespace std;

int main(){
	char richtung;
	cout << "Welche Richtung? (B zu M = 1/M zu B = 0): ";
	richtung = '0';

	string inputb = "ab c";
	string inputm = "._ _._.";
	char buchstaben[] = {'a', 'b', 'c'};
	string morsecodes[] = {"._", "_...", "_._."};
	string output = "";
	int i;

	if(richtung == '1'){
		for(char letter : inputb){
			for(i = 0; i < size(buchstaben); i++){
				if(letter == buchstaben[i]){
					output += morsecodes[i];
					output += " ";
					break;
				}
			}
			if(letter == ' '){
				output += ' ';
			}
		}

	} else if(richtung == '0'){
		stack<string> morse;
		string morseletter = "";

		for(char letter : inputm){
			if(letter == ' '){
				for(i = 0; i < size(morsecodes); i++){
					if(morseletter == morsecodes[i]){
						output += buchstaben[i];
						output += " ";
						morseletter = "";
						break;
					}
				}
			}else{
				morseletter += letter;
			}
		}
	}

	cout << output;
}
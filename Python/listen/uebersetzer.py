import os
if not os.path.isfile("./woerterbuch.txt"):
    print ("Das Wörterbuch gibt es nicht")
datei = open("./woerterbuch.txt","r")
deutsch = []
englisch = []
franzoesisch = []
italienisch = []
spanisch = []
for zeile in datei:
    spalten = zeile.split(";")
    deutsch.append(spalten[0])
    englisch.append(spalten[1])
    franzoesisch.append(spalten[2])
    italienisch.append(spalten[3])
    spanisch.append(spalten[4])
datei.close()

weiter = True

while weiter:
    germanWord = input("Deutsch:")

    if germanWord == "ende" or germanWord == "Ende":
        weiter = False
    else:
        indexOfWord = deutsch.index(germanWord)

        print("Englisch:",englisch[indexOfWord])
        print("Französisch:",franzoesisch[indexOfWord])
        print("Italienisch:",italienisch[indexOfWord])
        print("Spanisch:",spanisch[indexOfWord])
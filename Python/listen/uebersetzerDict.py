import os

dict = {}

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
    dict.update({spalten[0]: {"deutsch": spalten[0],"englisch": spalten[1], "franzoesisch": spalten[2], "italienisch": spalten[3], "spanisch": spalten[4]}})
datei.close()

weiter = True

while weiter:
    germanWord = input("Deutsch:")

    if germanWord == "ende" or germanWord == "Ende":
        weiter = False
    else:
        uebersetzungen = dict.get(germanWord)

        print(uebersetzungen)
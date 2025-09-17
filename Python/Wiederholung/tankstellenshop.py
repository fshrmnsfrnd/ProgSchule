import os
import matplotlib.pyplot as plt
import numpy as np

if ("__file__" in vars()):
	path, filename = os.path.split(os.path.abspath(__file__))
	dateiname = os.path.join(path,"ppDaten.csv")
else:
	dateiname = ("ppDaten.csv")

datei = open(dateiname, "r")

niedrigsterUmsatz:int = 0
niedrigsterUmsatzID:int = 0
niedrigsterUmsatzName = "Name"

hoechsterUmsatz:int = 0
hoechsterUmsatzID:int = 0
hoechsterUmsatzName:str = "Name"

miniShopUmsatz:int = 0
midiShopUmsatz:int = 0
maxiShopUmsatz:int = 0

shopTypUmsaetze = {1: 0, 2: 0, 3: 0}

gesamtUmsatz:int = 0

#Fuer Graph
paechterIDs = []
umsatze = []

for row in datei:
	col = row.strip().split(";")
	id:int = int(col[0])
	shopTyp:int = int(col[1])
	name:str = str(col[2])
	umsatz:int = int(col[3])
	
    #Fur Graph
	paechterIDs.append(id)
	umsatze.append(umsatz)

    #Niedrigster / Höchster Umsatz
	if id == 1: #Erster Datensatz
		niedrigsterUmsatz = umsatz
		niedrigsterUmsatzID = id
		niedrigsterUmsatzName = name
		hoechsterUmsatz = umsatz
		hoechsterUmsatzID = id
		hoechsterUmsatzName = name
	else:
		if umsatz >= hoechsterUmsatz:
			hoechsterUmsatz = umsatz
			hoechsterUmsatzID = id
			hoechsterUmsatzName = name
		if umsatz <= niedrigsterUmsatz:
			niedrigsterUmsatz = umsatz
			niedrigsterUmsatzID = id
			niedrigsterUmsatzName = name
	
    #Umsatz Anteile
	shopTypUmsaetze[shopTyp] += umsatz
	gesamtUmsatz += umsatz

datei.close()
	
#Ausgabe
print("Auswertung")
print("----------")
print("Peachter mit hoechstem Umsatz:", hoechsterUmsatzName)
print("Hoechster Umsatz:", hoechsterUmsatz)

print("Paechter mit niedrigstem Umsatz:", niedrigsterUmsatzName)
print("Niedrigster Umsatz:", niedrigsterUmsatz)

print("Gesamtumsatz:", gesamtUmsatz, "teilt sich auf in:")
print("----------------------------------------------------")
print("Mini-Shop:", shopTypUmsaetze[1], "/ Anteil an Gesamt:", 100 * shopTypUmsaetze[1] / gesamtUmsatz)
print("Midi-Shop:", shopTypUmsaetze[2], "/ Anteil an Gesamt:", 100 * shopTypUmsaetze[2] / gesamtUmsatz)
print("Maxi-Shop:", shopTypUmsaetze[3], "/ Anteil an Gesamt:", 100 * shopTypUmsaetze[3] / gesamtUmsatz)

#Graph Anzeige
plt.title("Umsatze")
plt.scatter(np.array(paechterIDs), np.array(umsatze))
plt.show()
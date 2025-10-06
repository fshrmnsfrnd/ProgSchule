import os 
import matplotlib.pyplot as plt

path, filename = os.path.split(os.path.abspath(__file__))
dateiname = os.path.join(path,"ppDaten.csv")

grosterUmsatzRow: list
grosterUmsatz: int = 0
kleinsterUmsatzRow: list
kleinsterUmsatz: int = 0
gesamtUmsatz: int = 0
umsatzPerShoptyp: dict = {1: 0, 2: 0, 3: 0}
percentPerShoptyp: dict = {1: 0, 2: 0, 3: 0}

xAchse: list[int] = []
yAchse: list[int] = []

isFirst = True
try: 
	with open(dateiname, "r") as datei:
		for zeile in datei:
			spalten = zeile.strip().split(";")
			id: int = int(spalten[0])
			shoptyp: int = int(spalten[1])
			pachterName: str = spalten[2]
			monatsumsatz: int = int(spalten[3])

			if((monatsumsatz > grosterUmsatz) or isFirst):
				grosterUmsatzRow = spalten
				grosterUmsatz = monatsumsatz
			if((monatsumsatz < kleinsterUmsatz) or isFirst):
				kleinsterUmsatzRow = spalten
				kleinsterUmsatz = monatsumsatz
			
			gesamtUmsatz += monatsumsatz
			umsatzPerShoptyp[shoptyp] += monatsumsatz
			
			xAchse.append(id)
			yAchse.append(monatsumsatz)

			isFirst = False
		plt.scatter(xAchse, yAchse, color="b", label="umsatze")
		plt.show()
except Exception as e: 
	print(f"Fehler bei der Datei {dateiname}")
	print(e)
	

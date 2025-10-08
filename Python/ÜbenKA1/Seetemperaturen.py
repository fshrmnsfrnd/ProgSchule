import os
import matplotlib.pyplot as plt

path, filename = os.path.split(os.path.abspath(__file__))
dateiname = os.path.join(path,"Schliersee2020.csv")

gesamt: float = 0
lineCounter: int = 0
minWert: float = 0
maxWert: float = 0

xValues: list = []
yValues: list = []

isFirstRow: bool = True

try:
    with open(dateiname,"r") as datei:
        for zeile in datei:
            spalten = zeile.strip().split(";")
            if("Datum" not in zeile):
                datum:str = spalten[0]
                mittelwert:float = float(spalten[1])
                geprueft:str = spalten[2]

                if(geprueft == "ja"):
                    xValues.append(lineCounter)
                    yValues.append(mittelwert)

                if(isFirstRow):
                    isFirstRow = False
                    minWert = mittelwert
                    maxWert = mittelwert
                
                if(mittelwert > maxWert):
                    maxWert = mittelwert
                if(mittelwert < minWert):
                    minWert = mittelwert
                gesamt += mittelwert
                lineCounter += 1
        
        print(f"Minwert:{minWert}")
        print(f"Maxwert:{maxWert}")
        print(f"Durschschnitt:{gesamt/lineCounter}")

        maxAsList: list = []
        minAsList: list = []
        i:int = 0
        while(i < lineCounter):
            minAsList.append(minWert)
            maxAsList.append(maxWert)
            i += 1

        plt.plot(xValues, yValues, color="black", label="Mittelwerte")
        plt.plot(xValues, maxAsList, color="red", label="Max")
        plt.plot(xValues, minAsList, color="blue", label="Min")
        plt.show()

except Exception as e:
    print(e)
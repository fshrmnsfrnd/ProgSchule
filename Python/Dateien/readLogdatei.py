import os

path, filename = os.path.split(os.path.abspath(__file__))
dateiname = os.path.join(path,"LogVol.dat")

lines = []

with open(dateiname,"r") as datei:

    for zeile in datei:
        lines.append({"serverName": zeile[0:10].strip(), 
                      "volumeName": zeile[11:20].strip(),
                      "sizeInMB": zeile[21:28].strip(),
                      "freeSpaceInMB": zeile[31:38].strip()})

for line in lines:
    if (line["sizeInMB"] * 80 / 100) < line["freeSpaceInMB"]:#Wenn mehr als 80% belegt
        print("Server:", line["serverName"], "Volumen:", line["volumeName"])
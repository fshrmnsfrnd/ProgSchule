#Classes
class Adresse:
    hausnummer: int
    strasse: str
    plz: int
    ort: str

    def __init__(self, hausnummer: int, strasse: str, plz: int, ort: str):
        self.hausnummer = hausnummer
        self.strasse = strasse
        self.plz = plz
        self.ort = ort

class Mitglied:
    nachname: str
    vorname: str
    _adressen: dict[int, Adresse]

    def __init__(self, nachname: str, vorname: str, adressen:list[Adresse]):
        self.nachname = nachname
        self.vorname = vorname
        self._adressen = {}
        for adresse in adressen:
            self.addAdress(adresse)
        
    def addAdress(self, adresse: Adresse):
        self._adressen[self.getNextAdressKey()] = adresse

    def removeAdress(self, index):
        if index in self._adressen:
            self._adressen.pop(index)
        else:
            print("Index of Adress not found")
        
    def getNextAdressKey(self):
        number = 0
        for key in self._adressen:
            if key > number:
                number = key
        number += 1
        return number
    
    def getAdresses(self):
        return self._adressen

#Functions and Variables for Main
def printAllMembers(members:list[Mitglied]):
    for member in members:
        print("Vorname:" + member.vorname)
        print("Nachname:" + member.nachname)
        adressen:dict[int,Adresse] = member.getAdresses()
        for index, adress in adressen.items():
            print("---")
            print("Index:" + str(index))
            print("PLZ:" + str(adress.plz))
            print("Ort:" + adress.ort)
            print("Strasse:" + adress.strasse)
            print("Hausnummer:" + str(adress.hausnummer))
        print("------------------------------------------")

#Main
members:list[Mitglied] = []
adresse1 = Adresse(12, "Hauptstrasse", 12345, "Berlin")
mitglied1 = Mitglied("Müller", "Anna", [adresse1])
members.append(mitglied1)

adresse2_1 = Adresse(7, "Bahnhofstrasse", 54321, "Hamburg")
adresse2_2 = Adresse(15, "Marktplatz", 54321, "Hamburg")
mitglied2 = Mitglied("Schmidt", "Ben", [adresse2_1,adresse2_2])
members.append(mitglied2)

adresse3_1 = Adresse(22, "Ringstrasse", 67890, "München")
adresse3_2 = Adresse(5, "Waldweg", 67890, "München")
adresse3_3 = Adresse(9, "Seestrasse", 67890, "München")
mitglied3 = Mitglied("Meier", "Clara", [adresse3_1, adresse3_2, adresse3_3])
members.append(mitglied3)

printAllMembers(members)
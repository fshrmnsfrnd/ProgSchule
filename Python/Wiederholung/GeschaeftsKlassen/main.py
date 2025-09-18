import Kunde
import Konto
import Adresse

def newPrivatKunde(strasse:str, plz:int, ort:str, ktoNr:str, kontoinhaber:str, saldo:float, kundenNr:int, vorname:str, nachname:str) -> Kunde.Kunde:
    adresse = Adresse.Adresse(strasse, plz, ort)
    konto = Konto.Konto(ktoNr, kontoinhaber, saldo)
    kunde = Kunde.Privatkunde(kundenNr, konto, vorname, nachname, adresse)
    return kunde

def newGeschaeftsKunde(strasse:str, plz:int, ort:str, ktoNr:str, kontoinhaber:str, saldo:float, kundenNr:int, firmenName:str) -> Kunde.Kunde:
    adresse = Adresse.Adresse(strasse, plz, ort)
    konto = Konto.Konto(ktoNr, kontoinhaber, saldo)
    kunde = Kunde.Geschaeftskunde(kundenNr, konto, firmenName, adresse)
    return kunde

privatkunde1 = newPrivatKunde("hauptstrasse", 82163, "Krailling", "2342kfdv", "Peter", 123.345, 32423, "Peter", "Arbeitsloser")
privatkunde1.ausgeben()

geschaeftskunde1 = newGeschaeftsKunde("bahnhufstraße", 32437, "Muenchen", "34985ruh", "kasallek", 342.234, 32432, "Kasallek")
geschaeftskunde1.ausgeben()
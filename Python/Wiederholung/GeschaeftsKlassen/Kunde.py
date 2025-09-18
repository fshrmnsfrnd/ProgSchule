import Konto
import Adresse

class Kunde:
    _kundenNr:int
    _konto:Konto.Konto

    def __init__(self, kundenNr:int, konto:Konto.Konto) -> None:
        self._kundenNr = kundenNr
        self._konto = konto

    def ausgeben(self) -> None:
        print(self)

class Privatkunde(Kunde):
    _vorname:str
    _nachname:str
    _postAdresse:Adresse.Adresse

    def __init__(self, kundenNr:int, konto:Konto.Konto, vorname:str, nachname:str, adresse:Adresse.Adresse) -> None:
        super().__init__(kundenNr, konto)
        self._vorname = vorname
        self._nachname = nachname
        self._postAdresse = adresse
    
    def ausgeben(self) -> None:
        print(self)

class Geschaeftskunde(Kunde):
    _firmenName:str
    _firmenAdresse:Adresse.Adresse

    def __init__(self, kundenNr:int, konto:Konto.Konto, firmenName:str, adresse:Adresse.Adresse) -> None:
        super().__init__(kundenNr, konto)
        self._firmenName = firmenName
        self._firmenAdresse = adresse
    
    def ausgeben(self) -> None:
        print(self)
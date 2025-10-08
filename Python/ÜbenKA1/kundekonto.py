class Konto:
    _ktoNr: str
    _kontoinhaber: str
    _saldo: float

    def __init__(self, ktoNr: str, kontoinhaber: str, saldo: float) -> None:
        self._ktoNr = ktoNr
        self._kontoinhaber = kontoinhaber
        self._saldo = saldo
    
    def auszahlen(self, betrag: float) -> float:
        if(betrag <= self._saldo):
            self._saldo -= betrag
            return betrag
        else:
            print("Nicht genug Geld auf dem Konto")
            return 0
    
    def einzahlen(self, betrag: float) -> None:
        self._saldo += betrag
    
    def ausgeben(self) -> None:
        print(f"Kontonummer: {self._ktoNr}")
        print(f"Kontoinhaber: {self._kontoinhaber}")
        print(f"Saldo: {self._saldo}")

class Adresse:
    _strasse: str
    _plz: str
    _ort: str

    def __init__(self, strasse: str, plz: str, ort: str) -> None:
        self._ort = ort
        self._plz = plz
        self._strasse = strasse
    
    def ausgeben(self) -> None:
        print(f"Strasse: {self._strasse}")
        print(f"PLZ: {self._plz}")
        print(f"Ort: {self._ort}")

class Kunde:
    _kundenNr: int
    konto: Konto

    def __init__(self, kundenNr: int, ktoNr: str, kontoinhaber: str, saldo: float) -> None:
        self._kundenNr = kundenNr
        self.konto = Konto(ktoNr, kontoinhaber, saldo)
    
    def ausgeben(self) -> None:
        print(f"KundenNr: {self._kundenNr}")
        self.konto.ausgeben()

class Privatkunde(Kunde):
    _vorname: str
    _nachname: str
    postAdresse: Adresse

    def __init__(self, vorname: str, nachname: str, kundenNr: int, ktoNr: str, kontoinhaber: str, saldo: float, strasse: str, plz: str, ort: str) -> None:
        super().__init__(kundenNr, ktoNr, kontoinhaber, saldo)
        self._vorname = vorname
        self._nachname = nachname
        self.postAdresse = Adresse(strasse, plz, ort)

    def ausgeben(self) -> None:
        super().ausgeben()
        self.postAdresse.ausgeben()
        print(f"Name: {self._vorname} {self._nachname}")

class Geschaeftskunde(Kunde):
    _firmenname: str
    firmenAdresse: Adresse

    def __init__(self, firmenname: str, kundenNr: int, ktoNr: str, kontoinhaber: str, saldo: float, strasse: str, plz: str, ort: str) -> None:
        super().__init__(kundenNr, ktoNr, kontoinhaber, saldo)
        self._firmenname = firmenname
        self.firmenAdresse = Adresse(strasse, plz, ort)

    def ausgeben(self) -> None:
        super().ausgeben()
        self.firmenAdresse.ausgeben()
        print(f"Name: {self._firmenname}")

k1 = Privatkunde("Nico", "Natzer", 1234567890, "987654321", "Niko Netzer", 999.999, "Jahnstrasse", "82152", "Kreiling")
k1.ausgeben()
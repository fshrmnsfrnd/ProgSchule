class Konto:
    _ktoNr:str
    _kontoinhaber:str
    _saldo:float

    def __init__(self, ktoNr:str, kontoinhaber:str, saldo:float) -> None:
        self._ktoNr = ktoNr
        self._kontoinhaber = kontoinhaber
        self._saldo = saldo

    def auszahlen(self, betrag:float) -> float:
        return betrag
    
    def einzahlen(self, betrag:float) -> None:
        pass

    def ausgeben(self) -> None:
        print(self)
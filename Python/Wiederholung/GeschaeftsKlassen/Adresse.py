class Adresse:
    _strasse:str
    _plz:str
    _ort:str

    def __init__(self, strasse, plz, ort) -> None:
        self._strasse = strasse
        self._plz = plz
        self._ort = ort

    def ausgeben(self) -> None:
        print(self)
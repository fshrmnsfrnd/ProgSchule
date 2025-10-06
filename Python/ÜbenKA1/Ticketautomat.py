class Ticketautomat:
    PREIS: float = 0
    TICKET_NAME: str = "ungueltig"
    bisherGezahlt: float
    gesamtSumme: float

    def __init__(self, preis: float, ticketName: str) -> None:
        if(preis > 0):
            self.PREIS = preis
        
        if(len(ticketName) >= 3):
            self.TICKET_NAME = ticketName
        
        self.bisherGezahlt = 0
        self.gesamtSumme = 0

    def geldEinwerfen(self, betrag: float) -> None:
        if(betrag >= 0):
            self.bisherGezahlt += betrag
            print(f"Bisher eingeworfen: {self.bisherGezahlt}")
        else:
            print("Nur positive Beträge erlaubt")

    def ticketAusgeben(self) -> None:
        if(self.bisherGezahlt >= self.PREIS):
            print(f"**********\n* {self.TICKET_NAME}\n* Python-Kurs\n*\n* {self.PREIS*10} Cent\n**********")
            if(self.bisherGezahlt > self.PREIS):
                print(f"Ihr Restgetld: {self.bisherGezahlt*10} Cent wird ausgegeben.")
            self.gesamtSumme += self.bisherGezahlt
            self.bisherGezahlt = 0
        else:
            print(f"Es sind noch {(self.PREIS-self.bisherGezahlt)*10} Cent zu zahlen")

automat = Ticketautomat(1.0, "Test")
automat.geldEinwerfen(1.0)
automat.ticketAusgeben()
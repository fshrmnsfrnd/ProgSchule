class Ticketautomat:
    preis = 0
    ticketName = "ungueltig"
    bisherGezahlt = 0
    gesamtsumme = 0

    def __init__(self, preis, ticketName) -> None:
        if preis >= 0:
            self.preis = preis

        if len(ticketName) >= 3:
            self.ticketName = ticketName
    
    def geldEinwerfen(self, eingeworfen) -> None:
        if eingeworfen >= 0:
            self.gesamtsumme += eingeworfen
        else:
            print("Kein gueltiger Betrag eingeworfen")
    
    def ticketAusgeben(self, bezahlt) -> None:
        if bezahlt >= self.preis:
            print(self.ticketName)
            print(bezahlt)
            if bezahlt > self.preis:
                differenz = bezahlt - self.preis
                self.gesamtsumme = self.gesamtsumme - differenz
                print("Rueckgeld:", differenz)

automat = Ticketautomat(5, "MeinTicket")
automat.geldEinwerfen(int(input("Einwurf")))
automat.ticketAusgeben
class Buch:
    isbn: list[int]
    titel: str
    autor: str

    def __init__(self, isbn: list[int], titel: str, autor: str) -> None:
        if(self.checkIsbn(isbn)):
            self.isbn = isbn
            self.titel = titel
            self.autor = autor
        else:
            self.isbn = isbn
            self.titel = "Ungueltige ISBN"
            self.autor = "Ungueltige ISBN"
        
    def printDaten(self) -> None:
        print("*** Buchdaten ***")
        print(f"ISBN: {self.isbn}")
        print(f"Titel: {self.titel}")
        print(f"Autor: {self.autor}")
        print("")

    def checkIsbn(self, isbn) -> bool:
        check1 = False
        check2 = False
        check3 = False

        if(len(isbn) == 13):
            check1 = True
        if(isbn[0:3] == [9, 7, 8]):
            check2 = True
        
        sumEven: int = 0
        sumOdd: int = 0
        i: int = 0
        while(i < len(isbn)):
            if(i % 2 == 0):
                sumOdd += isbn[i]
            elif(i != 12):
                sumEven += (isbn[i] * 3)
            i += 1
        
        sum: int = sumEven + sumOdd + isbn[12]
        if(sum % 10 == 0):
            check3 = True
        
        if(check1 and check2 and check3):
            return True
        else:
            return False

# Testprogramm
# korrekte Daten
b1 = Buch([9,7,8,0,5,5,2,1,4,9,5,1,8],"Der Da Vinci Code","Dan Brown")
b1.printDaten()

# fehlerhafte Daten
b2 = Buch([7,7,8,0,5,5,2,1,4,9,5,1,7],"fehlerhaftes Buch","unbekannter Autor")
b2.printDaten()
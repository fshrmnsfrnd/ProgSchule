class Haustier:
    def __init__(self, name: str) -> None:
        self._name: str = name
    
    def getName(self) -> str:
        return self._name

class Hund(Haustier):
    def __init__(self, name: str) -> None:
        super().__init__(name)
    
    def belle(self) -> None:
        print(f'{self.getName()} bellt')
    
    def verjageKatze(self) -> None:
        print(f'{self.getName()} verjagt die Katze')

class Katze(Haustier):
    def __init__(self, name: str, lieblingsfutter: str) -> None:
        super().__init__(name)
        self._lieblingsfutter = lieblingsfutter
    
    def miaue(self) -> None:
        print(f'{self.getName()} miaue')
    
    def getLieblingsfutter(self) -> str:
        return self._lieblingsfutter

# Test der Klassen
print("=== Test Hund ===")
hund1 = Hund("Bello")
print(f"Name: {hund1.getName()}")
hund1.belle()
hund1.verjageKatze()

print("\n=== Test Katze ===")
katze1 = Katze("Mimi", "Thunfisch")
print(f"Name: {katze1.getName()}")
print(f"Lieblingsfutter: {katze1.getLieblingsfutter()}")
katze1.miaue()

print("\n=== Test mehrere Tiere ===")
tiere = [Hund("Rex"), Katze("Whiskers", "Lachs")]
for tier in tiere:
    print(f"Tier: {tier.getName()}")


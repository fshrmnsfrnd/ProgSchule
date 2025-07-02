import math

a = float(input("a: "))
b = float(input("b: "))
c = float(input("c: "))

anzahlLosungen = b**2 - 4 * a * c
if anzahlLosungen > 0:
    anzahlLosungen = 2
elif anzahlLosungen < 0:
    anzahlLosungen = 0
else:
    anzahlLosungen = 1

print("Anzahllösungen:", anzahlLosungen)
if anzahlLosungen > 0:
    try:
        x1 = (-1 * b + math.sqrt(b**2 - 4 * a * c)) / (2 * a)
        x2 = (-1 * b - math.sqrt(b**2 - 4 * a * c)) / (2 * a)
    finally:
        print("X1:", x1, "X2:", x2)
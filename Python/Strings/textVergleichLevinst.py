#Zeigt wieviele Zeichenänderungen es geben muss, damit die Texte gleich sind
import Levenshtein

string1 = "Hallo World"
string2 = "World allo"
distance = Levenshtein.distance(string1, string2)
print(f"Levenshtein-Distanz: {distance}")
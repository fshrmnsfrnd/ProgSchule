#Vergleicht Prozentual die selben Zeichen, an den selben stellen
from difflib import SequenceMatcher

satz_a = 'Hallo World'
satz_b = 'Hi World'

ratio = SequenceMatcher(satz_a, satz_b).ratio()
percent = ratio * 100
print(percent, '%')
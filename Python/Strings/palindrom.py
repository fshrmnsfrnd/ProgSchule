#Palindrom prüfen
word = input("Wort:")

# Wort in Kleinbuchstaben umwandeln und Leerzeichen entfernen
cleaned_word = word.lower().replace(" ", "")

# Palindrom prüfen: Wort mit umgekehrtem Wort vergleichen
if cleaned_word == cleaned_word[::-1]:
    print(f"'{word}' ist ein Palindrom!")
else:
    print(f"'{word}' ist kein Palindrom.")
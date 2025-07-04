satz = input("Satz:")

words = satz.split(" ")

newSatz = ""

for word in words:
    newWord = word[::-1]
    newSatz += newWord + " "

print(newSatz)
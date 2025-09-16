import os
import string
import random

grad = 3
outputLength = 1000

#Datei einlesen
path, filename = os.path.split(os.path.abspath(__file__))
dateiname = os.path.join(path,"jwvGoethe.txt")
#dateiname = os.path.join(path,"test.txt")
with open(dateiname,"r",encoding="UTF-8") as datei:
    text = datei.read()
datei.close()

#Sonderzeichen ersetzen
validLetters = string.ascii_letters + "äöüÄÖÜ"

for letter in text:
    if(letter not in validLetters):
        text = text.replace(letter,"_")

#Text zu Kleinbuchstaben
text = text.casefold()

#Dictionary erstellen
counter = 0
dictionary = {}

while counter < len(text) - (grad + 1):
    gradText = text[counter:counter + grad]
    followingLetter = text[counter + grad]
    if gradText in dictionary:
        dictionary[gradText].append(followingLetter)
    else:
        dictionary.update({gradText : [followingLetter]})
    
    counter += 1

#write Dictionary in File
path, filename = os.path.split(os.path.abspath(__file__))
dateiname = os.path.join(path,"dict.txt")
#dateiname = os.path.join(path,"test.txt")
with open(dateiname,"w",encoding="UTF-8") as datei:
    datei.write(str(dictionary))
datei.close()

#Ausgabe
counter = 0

#Random select first Key + Value
firstKey = random.choice(list(dictionary.items()))[0]
#firstKey = "was_"
firstValues = random.choice(list(dictionary.items()))[1]
firstValue = firstValues[random.randint(0,len(firstValues)-1)]
outputText = firstKey + firstValue
print("FirstValue:" + firstValue)
print("First Output:" + outputText)

while counter <= outputLength:
    nextKey = outputText[0-grad::]
    print("NextKey:" + nextKey)
    if nextKey in dictionary:
        nextValues = dictionary[nextKey]
        outputText += nextValues[random.randint(0,len(nextValues)-1)]
    else:
        print("Key not found")
        counter = outputLength + 1
    counter += 1


print(outputText)

#write Output in File
path, filename = os.path.split(os.path.abspath(__file__))
dateiname = os.path.join(path,"nonsenseText.txt")
with open(dateiname,"w",encoding="UTF-8") as datei:
    datei.write(outputText)
datei.close()

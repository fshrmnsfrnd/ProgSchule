liste = []
ende = False
while ende == False:
    newWord = input("Wort: ")
    if newWord == "Ende" or newWord == "ende":
        ende = True
    else:
        if liste.__contains__(newWord) == False:
            liste.append(newWord)
            liste.sort()
        else:
            print("Bereits in Liste")
    print(liste)

print("Länge:",len(liste))
print("Jedes 2. Wort:", liste[0:-1:2])
vocals = ["a", "e", "i", "o", "u"]
vocalsCounter = 0
text = input("Text:")

for letter in text:
    if letter in vocals:
        vocalsCounter += 1

print(vocalsCounter, "Vokale")
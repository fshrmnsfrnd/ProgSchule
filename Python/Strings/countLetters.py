dic = {}

satz = input("Satz:")

for letter in satz:
    if letter in dic:
        dic[letter] += 1
    else:
        dic.update({letter: 1})

#sortedDic = dict(sorted(dic.items())) #Funktioniert

sortedList = sorted(dic.items())
sortedDic = {}
for key, value in sortedList:
    sortedDic[key] = value

print(sortedDic)
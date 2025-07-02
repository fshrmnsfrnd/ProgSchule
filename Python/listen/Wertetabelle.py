start = -10
stop = 10
step = 1
minimum = []

for i in range(start, stop, step):
    result = 2* i**2 * 3*i +2
    minimum.append(result)
    print(result)

print("Minimum:",minimum)
print("Kleinstes Ergebnis:",min(minimum))


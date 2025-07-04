#Vergleicht wieviele gleiche Wörter vorhanden sind
def jaccard_similarity(str1, str2):
    set1 = set(str1.split())
    set2 = set(str2.split())
    intersection = len(set1.intersection(set2))
    union = len(set1.union(set2))
    return intersection / union

string1 = 'Hallo World'
string2 = 'World Hallo'

similarity = jaccard_similarity(string1, string2)
print(f"Jaccard-Ähnlichkeit: {similarity}")
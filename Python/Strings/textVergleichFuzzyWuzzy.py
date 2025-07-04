from fuzzywuzzy import fuzz

string1 = "0123456789"
string2 = "0123456789"

similarity = fuzz.ratio(string1, string2)
print(f"FuzzyWuzzy-Ähnlichkeit: {similarity}")
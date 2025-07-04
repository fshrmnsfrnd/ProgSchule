from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.metrics.pairwise import cosine_similarity

texts = ["Hallo World", "Hallo Worlds"]
vectorizer = TfidfVectorizer()
text_vectors = vectorizer.fit_transform(texts)
cos_sim = cosine_similarity(text_vectors)
print(f"Kosinussimilarität: {cos_sim[0][1]}")
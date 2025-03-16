from collections import Counter
import re

def w_freq(text):
    words = re.findall(r'\b\w+\b', text.lower())

    word_count = Counter(words)

    sorted_words = sorted(word_count.items(), key=lambda x: x[1], reverse=True)

    print("Word Frequencies:")
    for word,freq in sorted_words:
        print(f"{word}: {freq}")

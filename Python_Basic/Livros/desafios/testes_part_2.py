import unicodedata
import random
import os
import yaml
import shelve
import hashlib

print('\033c')
#analise e geração textual
filename = 'Livros/desafios/dr_jekyll.txt'
punc_list = ".;,-“’”:?—‘!()*"

def split_line(line):
    return line.replace('-', ' ').split()

def clean_word(word):
    return word.strip(punc_list).lower()

def get_unique_words(filename):
    unique_words = {}
    for line in open(filename, "r", encoding="utf-8"):
        for word in split_line(line):
            word = clean_word(word)
            unique_words[word] = 1

    return unique_words

unique_words = get_unique_words(filename)
print(len(unique_words))

def frequence_word(filename):
    word_counter = {}
    for line in open(filename, "r", encoding="utf-8"):
        for word in split_line(line):
            word = clean_word(word)
            if word in word_counter:
                word_counter[word] += 1
            else:
                word_counter[word] = 1
    return word_counter
word_counter = frequence_word(filename)
def second_element(t):
    return t[1]

def print_most_frequence(word_counter, n=5):
    items = sorted(word_counter.items(), key=second_element, reverse=True)

    for word, count in items[:n]:
        print(word, count, sep='\t')

word_list = open('words.txt', 'r', encoding='utf-8').read().split()
valid_words = {}
for word in word_list:
    valid_words[word] = 1

def subtract(d1, d2):
    result = {}
    for key in d1:
        if key not in d2:
            result[key] = d1[key]
    return result

diff = subtract(word_counter, valid_words)

singletons = []
for word, count in diff.items():
    if count == 1:
        singletons.append(word)

print(singletons[-10:])

# aleatória de palavras com base na frequência
words = list(word_counter)
weights = list(word_counter.values())
print(random.choices(words, weights=weights, k=5))

#bigramas
bigram_counter = {}
def count_bigram(bigram):
    key = tuple(bigram)
    if key in bigram_counter:
        bigram_counter[key] += 1
    else:
        bigram_counter[key] = 1
window = []

def process_word(word):
    window.append(word)

    if len(window) == 2:
        count_bigram(window)
        window.pop(0)


for line in open(filename, "r", encoding="utf-8"):
    for word in split_line(line):
        word = clean_word(word)
        process_word(word)

print_most_frequence(bigram_counter, n=10)

bigrams = list(bigram_counter)
weights = list(bigram_counter.values())
random_brigrams = random.choices(bigrams, weights=weights, k=5)

for pair in random_brigrams:
    print(" ".join(pair), end=" ")

successor_map = {}
window = []

def add_bigram_makarov(bigram):
    first, second = bigram

    if first in successor_map:
        successor_map[first].append(second)
    else:
        successor_map[first] = [second]

def process_word_bigram(word):
    window.append(word)

    if len(window) == 2:
        add_bigram_makarov(window)
        window.pop(0)

for line in open(filename, "r", encoding="utf-8"):
    for word in split_line(line):
        word = clean_word(word)
        process_word_bigram(word)

word = random.choice(list(successor_map.keys()))
for i in range(5):
    successor = successor_map[word]
    word = random.choice(successor)
    print(word, end=" ")


print('__________________________________________________________________________', '\n')
caminho = "c:/Users/gabri/OneDrive/Área de Trabalho/oreilly_getting_started_with_sql-master/Dev/Git/Projeto_Hello_Word/Python_Basic/Livros/desafios"
caminho_relativo = 'photos'
caminho_absoluto = os.path.join(caminho, caminho_relativo)
print(os.listdir(caminho_absoluto))

writer = open(os.path.join(caminho_absoluto, 'photos.txt'), 'w')
notacao1 = "Você é uma pessoa muito legal"
notacao2 = "Você é uma pessoa muito simpática"
writer.write(f'Notacao principal: {notacao1}\nNotacao secundaria: {notacao2}')
writer.close()

reader = open(os.path.join(caminho_absoluto, 'photos.txt'), 'r')
for line in reader.readlines():
    print(line, end='')
print()
reader.close()
config = {
    'photos_dir': 'photos',
    'data_dir': 'photos_info',
    'extensions': ['jpg', 'jpeg', 'png', 'gif'],
}

config_filename = 'config.yaml'
writer = open(os.path.join(caminho_absoluto, config_filename), 'w')
yaml.dump(config, writer)
writer.close()
print()
reader = open(os.path.join(caminho_absoluto, config_filename), 'r')
config_loaded = yaml.safe_load(reader)
print(config_loaded, '\n')

os.makedirs(os.path.join(caminho_absoluto, config_loaded['data_dir']), exist_ok=True)

db_file = os.path.join(caminho_absoluto, config['data_dir'], 'captions')

db = shelve.open(db_file, 'c')

key ='photos_tiradas/photo_1.png'
db[key] = 'Dark Souls'

value = db[key]
print(list(db.keys()), list(db.values()))

for key in db:
    print(key, ":", db[key])
print()
db.close()

db = shelve.open(os.path.join(caminho_absoluto, 'anagram_map'), 'n')

word = 'listen'
key = ''.join(sorted(word))
db[key] = word
print(list(db.keys()), ":", db[key])

word = 'silent'
key = ''.join(sorted('silent'))
db[key] = word
print(list(db.keys()), ":", db[key])

anagram_list = [db[key]]
anagram_list.append('listen')
anagram_list.append('eilnst')
db[key] = anagram_list
print(list(db.keys()), ":", db[key], '\n')
db.close()


path1 = os.path.join(caminho_absoluto, config['data_dir'], 'photos_tiradas', 'photo_1.png')


path2 = os.path.join(caminho_absoluto, config['data_dir'], 'photos_tiradas', 'photo_2.png')


def same_contents2(path1, path2): #ineficiente
    data1 = open(path1, 'rb').read()
    data2 = open(path2, 'rb').read()
    return data1 == data2

md5_hash = hashlib.md5()

def md5_digest(filename):
    data = open(filename, 'rb').read
    md5_hash = hashlib.md5()
    md5_hash.update(data)
    digest = md5_hash.hexdigest()
    return digest

def walk(dirname, visit_function=print):
    for name in os.listdir(dirname):
        path = os.path.join(dirname, name)
        if os.path.isfile(path):
            visit_function(path)
        else:
            walk(path, visit_function)

walk(caminho_absoluto)

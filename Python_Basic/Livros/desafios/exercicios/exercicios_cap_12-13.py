trigram_counter = {}
import shelve
import faker

print('\033c')
#analise e geração textual
filename = 'Livros/desafios/dr_jekyll.txt'
punc_list = ".;,-“’”:?—‘!()*"

def split_line(line):
    return line.replace('-', ' ').split()

def clean_word(word):
    return word.strip(punc_list).lower()

trigram_counter = {}
def count_trigram(trigram):
    key = tuple(trigram)
    if key in trigram_counter:
        trigram_counter[key] += 1
    else:
        trigram_counter[key] = 1

window = []
def process_word_trigram(word):
    window.append(word)

    if len(window) == 3:
        count_trigram(window)
        window.pop(0)

def second_element(t):
    return t[1]

def most_frequence(word_counter, n=5):
    most_fequence = {}
    items = sorted(word_counter.items(), key=second_element, reverse=True)

    for word, count in items[:n]:
        most_fequence.update({word: count})

    return most_fequence

successor_map = {}
def add_trigram(trigram):
    first, second, third = trigram

    if first in successor_map:
        successor_map[first, second].append(third)
    else:
        successor_map[first, second] = [third]

def word_50():
    
    ...



def teste_cap_12():
    #teste desafio 1
    for line in open(filename, 'r', encoding='utf-8'):
        for word in split_line(line):
            word = clean_word(word)
            process_word_trigram(word)
    #teste desafio 2
    print(most_frequence(trigram_counter, n=5) == {('said', 'the', 'lawyer'): 20, ('said', 'mr', 'utterson'): 16, ('of', 'edward', 'hyde'): 15, ('the', 'name', 'of'): 13, ('it', 'was', 'a'): 11})
    #teste desafio 3
    add_trigram(['said', 'the', 'lawyer'])
    print(('said', 'the') in successor_map)

def replace_all(padrao, substituicao, arq1, arq2):
    ar1 = open(arq1, 'r', encoding='utf-8')
    ar2 = open(arq2, 'w', encoding='utf-8')

    for line1 in ar1:
        line = ""
        for word in split_line(line1):
            word = clean_word(word)
            if(word == clean_word(padrao)):
                line += substituicao
            else:
                line += word
        ar2.write(line)

    ar1.close()
    ar2.close()

def add_word(word, db=shelve.open('db_sorted','n')):
    wordSorted = "".join(sorted(word))
    if wordSorted in db:
        lista = list(db[wordSorted])
        lista.append(word)
        db[wordSorted] = lista
    else:
        db[wordSorted] = word

def teste_cap_13():
    #teste desafio 1
    replace_all('Cachorros', 'Gato', 'Livros/desafios/text/arq1.txt', 'Livros/desafios/text/arq2.txt')
    err = 0
    for line in open('Livros/desafios/text/arq2.txt', 'r', encoding='utf-8'):
        line = clean_word(line)
        if(clean_word('cachorros') in line):
            err += 1
    print(err == 0)

    #teste desafio 2
    fake = faker.Faker("pt_BR")
    db = shelve.open('db_sorted','c')
    word = []
    for s in range(10):
        word.append(str(fake.word()))
        add_word(word[-1], db=db)
    for s in word:
        wordSorted = "".join(sorted(s))
        if(s not in db[wordSorted]):
            err += 1
    print(err == 0)
    db.close()

    #teste desafio 3


teste_cap_12()
teste_cap_13()
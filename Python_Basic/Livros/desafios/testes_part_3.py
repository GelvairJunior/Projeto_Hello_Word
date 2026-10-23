import os, random, math
from collections import Counter, defaultdict, namedtuple
os.system('cls')
# Conjuntos
def has_duplicate(t): # (teste_2)alternativa da função com dicionario de ter itens duplicados usando conjuntos
    s = set(t)
    return len(s) < len(t)

def subtract(d1, d2): # (teste_2) alternativa, com conjuntos, da função com dicionario para remover palavras que não estão no 2 grupo de palavras
    return set(d1) - set(d2)

def uses_only(word, available): # verifica se todas as letras em word estão presentes em available(desafio 7)
    return set(word) <= set(available)


s = set('cachorro')
g = set('gato')
print(s)
print(s-g)

# Contadores são conjuntos que contam quantas vezes apareceu o atributo unico, como um dicionario
counter = Counter('cachorro')
print(counter)
print(type(counter))
print(counter['s'])
print(counter.most_common())
print(counter + Counter('gato'))
def is_anagram(word1, word2): # (exercios 10)
    return Counter(word1) == Counter(word2)

# defaultdict
d = defaultdict(list)
print(d)
t = d['new key']
t.append('new value')
print(d)

def all_anagrams(filename): # desafio 11
    d = defaultdict(list)
    for line in open(filename):
        word = line.strip().lower()
        t = signature(word)
        d[t].append(word)
    return d


# Expressões condicionais
x = random.randint(-10, 10)
y = math.log(x) if x > 0 else float('nan')

def factorial(n):
    return 1 if n == 0 else n * factorial(n-1)

class kangaroo:
    def __init__(self, name, contents=None):
        self.name = name
        self.contents = [] if contents is None else contents


# Compreensões de lista
title = "monthy python and the holy grail"
t = [word.capitalize() for word in title.split()]
print(' '.join(t))

def palindrome(): # testes_part_2
    word_list = [line.strip() for line in open('words.txt')]
    palindromes = [word for word in word_list if is_palindrome(word)]
    return palindromes

# Expressão geradora
print(sum([1/2 ** n for n in range(10)]))
print(sum(1/2 ** n for n in range(10)))

# Funções any e all
print(any([False, False, True]))
print(any(letter == 't' for letter in 'monty'))
# faz o mesmo que o in porém quando chega no true ele não confere o resto da lista ao contrario do in

print(all([False, False, True]))
print(all(letter == 't' for letter in 'monty'))

def uses_none(word, forbidden): # exercicio 7
    return not any(letter in forbidden for letter in word)

def uses_all(word, required): # exercicio 7
    return all(letter in word for letter in required)


# Named Tuples (criar classes simples)
Point = namedtuple('Point', ['x', 'y']) # testes OOP, testes 3
p = Point(1, 2)
print(p)
print(p == Point(1, 2))
print(p.x, p.y)
print(p[0], p[1])
x, y = p
print(f'x={x}, y={y}')


# Empacotamentos de argumentos nomeados
def mean(*args, **kwargs):
    print(kwargs)
    return sum(args, **kwargs) / len(args)

print(mean(1, 2, start=3))
d = dict(x=4, y=5)
print(Point(**d))

def pack_and_print(**kwargs):
    print(kwargs)

print(pack_and_print(a=1, b=2, c=3))


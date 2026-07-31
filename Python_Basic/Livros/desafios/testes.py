import webbrowser
from ipaddress import summarize_address_range
from subprocess import STARTUPINFO
from doctest import run_docstring_examples
import re

minutos = 60

tempo_filme = 12354897

tempo_filme_hora = tempo_filme % 10
print(tempo_filme_hora)

start = 11
duration = 3
dia = 12
end = (start+duration) % dia
print(end, "Horas")

# Recursão

def countdown(n):
    if n <= 0:
        print("Blastoff!")
    else:
        print(n)
        countdown(n-2)
countdown(5)

def print_n_vezes(string, n):
    if n > 0:
        print(string)
        print_n_vezes(string, n-1)

print_n_vezes("cachoro", 5)

strings = ["a","as", "bat", "car", "dove", "python", "python"]
print(strings)
stringmod = [x.upper() for x in strings if len(x) > 2]
print(stringmod)

unique_lenghts = {len(x) for x in strings}
print(unique_lenghts)

print(set(map(len, strings)))

def factorial(n):
    space = " "* (4*n)
    print(space, 'fatorial ', n)
    if n <= 0:
        print(space, 'Retorna 1')
        return 1
    else:
        recursive = factorial(n-1)
        result = n * recursive
        print(space, 'Retorna ', result)
        return result

def fibonacci(n):
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n-1) + fibonacci(n-2)


fibonacci_De_10 = fibonacci(10)
fatoria_De_5 = factorial(5)
print(fatoria_De_5, fibonacci_De_10)

def has_(word, string):


    return string.lower() in word.lower()


def quantas_letras(string):
    count = 0
    total = 0

    for line in open("texto.txt", "r", encoding="utf-8"):
        for i in line:
            total = total + 1
            if has_(i, string):
                count = count + 1

    porcentagem = count / total * 100
    print(total)
    print(count)
    return porcentagem

def run_docset(func):
    run_docstring_examples(func, globals(), name=func.__name__)

c = quantas_letras("E")
print(c)

def has_incorreto(word, string):
    """
    >>> has_incorreto('banana', 'A')
    False

    >>> has_incorreto('banana', 'o')
    False
    """
    return string in word.lower()

run_docset(has_)

print(strings[5][:])
new_string = 'P' + strings[5][1:]
print(new_string)

def compare_string(string):
    if string == 'python':
        print(string, "tudo certo")
    if string > 'python':
        print(string, "é maior que python")
    if string < 'python':
        print(string, "é menor que python")

compare_string(strings[5][:])
compare_string(strings[5][1:])
compare_string(new_string)#letras maiusculas vem antes das minusculas

py = strings[5][:].upper()
print(py)

def is_especial_line(line):
    return line.startswith("TERMO")

reader = open("texto.txt", "r", encoding="utf-8")
writer = open("texto_modify.txt", "w", encoding="utf-8")

for line in reader:
    if is_especial_line(line):
        continue
    writer.write(line)

reader.close()
writer.close()

reader = open("texto_modify.txt", "r", encoding="utf-8")


print(reader.readline())
reader.close()

reader = open("texto.txt", "r", encoding="utf-8")
total = 0
for line in reader:
    total += line.count("COLETA")

print(total)

writer = open("texto_modify.txt", "w", encoding="utf-8")

for line in open("texto.txt", "r", encoding="utf-8"):
    line = line.replace("COLETA", "***COLLECT***")
    writer.write(line)

pattern = "COLETA"
def find_first(pattern):
    count = 0
    for line in open("texto.txt", "r", encoding="utf-8"):
        result = re.search(pattern, line)
        if result != None:
            count = count + 1

    return count

result = find_first("^COLETA|PREFEITURA")
print(result)

a = "cat"
b = "cat"

print(b is a)

a = [1, 2, 3]
b = [1, 2, 3]

print(b is a)

a = b
print(b is a)

numbers = {'zero': 0, 'one': 1, 'two': 2, 'three': 3, 'four': 4, 'five': 5, 'six': 6, 'seven': 7, 'eight': 8, 'nine': 9}
print(numbers)

word_list = open("texto.txt", "r", encoding="utf-8").read().split()

def reverse_word(word):
    return "".join(reversed(word))

word_dict = {}
for word in word_list:
    word_dict[word] = 1

def too_slow():
    count = 0
    count_loop = 0
    for word in word_list:
        if reverse_word(word) in word_list:
            count += 1    
        count_loop += 1 
    print("Loop iterations (slow): ", count_loop)
    return count

def much_fast():
    count = 0
    count_loop = 0
    palindromes = []
    for word in word_dict:
        if reverse_word(word) in word_dict:
            count += 1
            if len(word) > 3:
                palindromes.append(word)
        count_loop += 1
    print("Loop iterations (fast): ", count_loop)
    print("Palindromes found: ", palindromes[:10])
    return count

print(len(word_list))
print(too_slow())
print(much_fast())

def value_conts(string):
    counter = {}
    for letter in string:
        if letter not in counter:
            counter[letter] = 1
        else:
            counter[letter] += 1
    return counter

counter = value_conts("paralelepípedo")
print(counter)

d = {4 : ['f', 'o', 'u', 'r']}
print(d)

know = {0:0, 1:1}

def fibonacci_memo(n):
    if n in know:
        return know[n]
    else:
        result = fibonacci_memo(n-1) + fibonacci_memo(n-2)
        know[n] = result
        return result

fibonacci_memo(10)

# tuplas são hashable, listas não são. Tuplas podem ser usadas como chaves de dicionários, listas não podem.
t = tuple('paralelepípedo')
print(type(t))

x = sorted(t)
print(t)
print(x)

dici = {}

dici[t] = x
print(dici.keys())
print(dici[t])

a, b = 1, 2
print(a, b)

email = "mail@python.org"
username, domain = email.split("@")
print(username, domain)

d ={"one":1, "two":2, "three":3}

for key, value in d.items():
    print(key, "->", value)

quotient, remainder = divmod(7, 3)
tup = divmod(7, 3)
print(type(tup))
print(quotient, remainder)

def min_max(t):
    return min(t), max(t)

low, hight = min_max([7, 2, 3, 1, 5, 4])
print("min", low , ": max", hight)

#args são tuplas, kwargs são dicionários
def mean(*args):
    return sum(args) / len(args)

print(mean(7, 2, 3, 1, 5, 4))

#divmod(tup) typeerror
divmod(*tup)

#*args é desempacotamento de tuplas
def trimmed_mean(*args):
    low, high = min_max(args)
    trimmed = list(args)
    trimmed.remove(low)
    trimmed.remove(high)
    return mean(*trimmed)


print(trimmed_mean(7, 7, 6, 8, 5, 4, 15, 1))

scores1 = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
scores2 = [15, 16, 85, 1, 50, 20, 78, 88, 10, 50]

winst1 = 0
winst2 = 0
for team1, team2 in zip(scores1, scores2):
    if team1 > team2:
        winst1 += 1
    elif team1 < team2:
        winst2 += 1
    else:
        print("empate")

print("team1 = ", winst1, " vitorias")
print("team2 = ", winst2, " vitorias")

tlist = list(zip(scores1, scores2))

print(type(tlist))
print(tlist)

letters = 'abcdefghijklmnopqrstuvwxyz'
numbers = range(len(letters))
letter_map = dict(zip(letters, numbers))

print(letter_map["z"], ":",letter_map['a'])

for index, element in enumerate('abcdefg'):
    print(index, ":", element)

items = counter.items()
print(items)

print(sorted(items))

def secound_element(t):
    return t[1]

sorted_items = sorted(items, key=secound_element, reverse=True)
print(sorted_items)

def invert_dict(d):
    new={}
    for key, value in d.items():
        if value not in new:
            new[value] = [key]
        else:  
            new[value].append(key)
    return new

invertido_counter = invert_dict(counter)

print(invertido_counter)
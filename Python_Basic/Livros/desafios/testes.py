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
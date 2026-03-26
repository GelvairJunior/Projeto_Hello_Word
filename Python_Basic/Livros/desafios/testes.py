from subprocess import STARTUPINFO

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

strings = ["a","as", "bat", "car", "dove", "python"]
print(strings)
stringmod = [x.upper() for x in strings if len(x) > 2]
print(stringmod)

unique_lenghts = {len(x) for x in strings}
print(unique_lenghts)

print(set(map(len, strings)))

def factorial(n):
    if n <= 0:
        return 1
    else:
        return n * factorial(n-1)

def fibonacci(n):
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n-1) + fibonacci(n-2)


fibonacci_De_10 = fibonacci(10)
fatoria_De_5 = factorial(5.5)
print(fatoria_De_5, fibonacci_De_5)
import math

segundos = 42
minutos = 42
km = 10.0
milhas = 0.0

while minutos > 0:
    minutos -= 1
    segundos += 60
milhas = round(km / 1.61, 2)
minutos = 42.42
print(segundos)
print(milhas)
print(round(milhas/segundos,5))
print(round(milhas/minutos,2))

raio = 5
volumeEsfera = raio*math.pi
print(volumeEsfera)

def ss(s, i):
    frase = s * i
    return frase

print(ss("oi ", 5))

def print_right(text):
    s = 40
    p = len(text)
    s = s - p
    print(" "* s, text)

print_right(ss(" oi", 5))
print_right("Cachorros me mordam")
print_right("piratas")

def espaco(s, i):
    frase = s * i
    return frase

def traingule(s, i):
    v = 0
    while(i >= 0):
        print(espaco(s, v))
        v += 1
        i -= 1

traingule("A", 5)
print(" ")
def retangulo(s, i):
    v = i
    while(i > 0):
        print(espaco(s, v))
        i -= 1

retangulo("A", 5)
import math
from time import time

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

def bottle(bott):
    if(bott > 2):
        print(bott, " garrafas de cerveja na parede,", bott, "garrafas de cerveja.")
        print("Pegue uma e passe adiante,", (bott-1) ,"garrafas de cerveja na parede")
        bottle(bott-1)
    else:
        print("Duas garrafas de cerveja na parede, duas garrafas de cerveja.")
        print("Pegue uma e passe para o próximo, uma garrafa de cerveja na parede.")

        print("Uma garrafa de cerveja na parede, uma garrafa de cerveja.")
        print("Pegue uma e passe para o próximo, sem mais garrafas de cerveja na parede.")

        print("Chega de garrafas de cerveja na parede, chega de garrafas de cerveja.")
        print("Vá à loja e compre mais, 99 garrafas de cerveja na parede.")

bottle(1)

now = time()

segundos = (now//60)
minutos = (segundos//60)
horas = (minutos//60)
dias = (horas//24)

horas = (minutos%24)
minutos = (segundos%60)
segundos = (now%60)

dias = round(dias)
horas = round(horas)
minutos = round(minutos)
segundos = round(segundos)

print(dias, horas, ":", minutos, ":", segundos)
print(now)

def is_triangule(lado1, lado2, lado3):
    maior_lado = (max(lado1, lado2, lado3))
    lados = (lado1 + lado2 + lado3 - maior_lado)

    if lados > maior_lado:
        return "yes"
    return "no"

print(is_triangule(5,10,9))


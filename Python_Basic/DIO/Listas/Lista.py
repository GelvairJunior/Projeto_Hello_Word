#Listas Simples
frutas = ["Laranja", "Maça", "Uva"]
print(frutas)
print(frutas[-1]) # começa pelo ultimo elemento: Uva
print(frutas[-3]) #

frutas = []
print(frutas)

numeros = list(range(10))
print(numeros)

carro = ["Ferrari", "F8", 4200000, 2020, 2900, "São Paulo", True]
print(carro)

#lista Aninhadas/Matriz:

matriz = [
    [1, "Junior", 21],
    [2, "Serana", 22],
    [3, "Gabriel", 26],
]
print(matriz)
print(matriz[0][1])
print(matriz[1][1])
print(matriz[-1][-2])

#Fatiamento
letras = list("python")
print(letras) #[p, y, t, h, o, n]
print(letras[0]) #p

print(letras[2:])
print(letras[:2])
print(letras[1:3])
print(letras[0:3:2])
print(letras[::])
print(letras[::-1])

#Leitura acessando todos os elementos com loops
for carro in carro:
    print(carro)

carro = ["gol", "celta", "palio"]

for indice, carro in enumerate(carro):
    print(f"{indice}: {carro}")

#Compreensão de lista

#filtro 1
numeros = list(range(30))
pares = []

for numero in numeros:
    if numero % 2 == 0:
        pares.append(numero)
print(pares)

#Filtro 2, mais otimizado
#var =  retorno lop para num cada num se numero par
pares = [numero for numero in numeros if numero % 2 == 0]
print(pares)


quadrado = []
for numero in numeros:
    quadrado.append(numero ** 2)

print(quadrado)
quadrado = [numero ** 2 for numero in numeros]
print(quadrado)
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
#var = retorno loop para num cada num se numero par
pares = [numero for numero in numeros if numero % 2 == 0]
print(pares)


quadrado = []
for numero in numeros:
    quadrado.append(numero ** 2)

print(quadrado)
quadrado = [numero ** 2 for numero in numeros]
print(quadrado)

# Métodos
lista = []

#adicionar
lista.append(6)
lista.append("Python")
lista.append([40,30,20])

#compiar e excluir
l2 = lista.copy()
lista.clear()
print(lista)
print(l2)

lista.append("Vermelho")
lista.append("Verde")
lista.append("Vermelho")
#Contar
print(lista.count("Vermelho"))

#Aumentar, adicionar mais coisa na lista, no final
l2.extend(["Java", "C", "Python"])
print(l2)

#Mostra qual é a posição da primeira ocorrencia do que colocar no parenteses
l2.index("Java")
print(l2)

# Estrutura de Pilha, o último que entrar é o primeiro a sair
l2.pop()
print(l2)
l2.pop()
print(l2)
l2.pop()
print(l2)

#Auto-explicativo né
l2.remove("Python")
print(l2)

#Auto-explicativo né
lista.reverse()
print(lista)

#Ordena a lista, tem seus parametros para diversos tipos de ordenação
lista.sort()
print(lista)

lista.sort(key=lambda x: len(x))
print(lista)

lista.sort(reverse=True)
print(lista)

lista.sort(key=lambda x: len(x), reverse=True)
print(lista)

# tamanho da lista
len(l2)

sorted(l2, key=lambda x: len(x))
n = 0
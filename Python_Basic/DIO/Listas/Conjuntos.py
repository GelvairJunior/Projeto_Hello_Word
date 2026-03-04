# estruturas de dados "set" aquilo que tem elementos unicos, nenhum objeto pode ser repetidos
# é a estrutura de dados "Conjuntos" como o de "Record e Vetor/Matriz


num = set([1,5,2,3,1,2,3,4,])
letras = set("Python")
linguagem = set(["Python", "Java", "Java", "PHP"])

print(letras)
print(num)
print(linguagem)

# Conjuntos não tem Indexação, solução para acessar via indices
linguagemLista = list(linguagem)
print(linguagemLista[1] + " Que legal")

for linguagem in linguagem:
    print(f"{linguagem}")

#valor1 = int(input ('digite uma linguagem que nao foi colocada, se não não entra: '))

#linguagem.add("C")

for linguagem in linguagem:
    print(f"{linguagem}")

#linguagem.remove("C") # se nao tiver no conjunto vai dar erro
#linguagem.discard("C") # se nao tiver no conjunto nao da nada
#sorteio = set(linguagem.copy()) # o nome explica né
#linguagem.clear() # nao faça repetir

print(linguagem)
#print(sorteio)
#sorteio.pop() # elimina o primeiro elemento
#print(sorteio)

# Conjuntos são baseado em Conjuntos de Matematica
dado_par = set([2,4,6])
dado_maior = set([4,5,6])
dado_total = set([1,2,3,4,5,6])

print("Aqui é uniao ", dado_par.union(dado_maior))

print("Aqui é intersecção ", dado_par.intersection(dado_maior))

print("Aqui é diferença ", dado_par.difference(dado_maior))

print("Aqui é diferença ", dado_maior.difference(dado_par))

print("Aqui é symetria da diferença ", dado_par.symmetric_difference(dado_maior))

#retorna booleano
print("Aqui é se o dado total é um sub conjunto de dado maior ", dado_total.issubset(dado_maior))
print("Aqui é se o dado total é um super conjunto de dado maior ", dado_total.issuperset(dado_maior))
print("Aqui confere se tem algo num conjunto e no outro ", dado_maior.isdisjoint(dado_par))
print("Aqui sera que no dado maior tem 3: ", 3 in dado_maior)
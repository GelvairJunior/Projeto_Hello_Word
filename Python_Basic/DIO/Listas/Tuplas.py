# Tuplas são estruturas de dados que são listas imutáveis
linguagens = ("C", "Python", "Java",)

numeros = tuple([1,2,3,4],)

pais = ("Brasil",)#tente sempre colocar uma última "," no fim para ter certeza que não vire lista

#quase tudo é igual à lista
print(numeros[0])
print(linguagens[0])

matrizTupla = (
    (1,"a",2),
    ("b",3,4),
    (6,5,"c"),
)
print(matrizTupla)

print(linguagens.count("Python"))
print(linguagens.index("Python"))
print(len(linguagens))
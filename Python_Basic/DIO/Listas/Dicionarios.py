# Dicionarios é um conjunto não-ordenado de pares chave:valor
# Chaves são unicas(imutaveis como tupla ou String)
# Valor pode ser imutaveis ou mutaveis
# bom pensar com JSON
# se colocar uma chave que não existe ele cria essa nova chave
# se colocar a mesma chave e atribuir um valore ele vai sobrescrever

#pessoa = {"nome": "Guilherme", "idade": 28}
pessoa = dict(nome="João", idade=28)

pessoa["telefone"] = "3333-1234"

print(pessoa["nome"])
print(pessoa["idade"])
print(pessoa["telefone"])

pessoa["nome"] = "Maria"
pessoa["idade"] = 18
pessoa["telefone"] = "4444-5555"
print(pessoa)

# Dicionarios aninhados, ajuda no banco de dados

contatos = {
    "gelvair.schumann.moreira.jr@gmail.com": {"nome": "Junior", "telefone":"4444-5555", "extra":{"Funçao": 1}},
    "serana@gmail.com": {"nome": "Serana", "telefone":"4444-33333"},
    "gilherme@gmail.com": {"nome": "guilherme", "telefone":"4444-2222"},
    "melani@gmail.com": {"nome": "melani", "telefone":"4444-1234"},
}

print(contatos["gelvair.schumann.moreira.jr@gmail.com"])

extra = contatos["gelvair.schumann.moreira.jr@gmail.com"]["extra"]
print(extra)

#for chave, valor in contatos:
#    print(chave, contatos[chave])

for chave, valor in contatos.items():
    print(chave, valor)

# métodos dos dicionarios
copia = pessoa.copy()
pessoa.clear()
print(pessoa)
print(copia)

dict.fromkeys(["nome", "telefone"])# adicionar novas chaves, pode ser existente ou não

dict.fromkeys(["nome", "telefone"], "vazio")#valor vazio


print(contatos.get("Chave"))# nao existe entao vai colocar None
print(contatos.get("Chave"), {}) # se nao encontrar retorna um vazio({})
print(contatos.get("gelvair.schumann.moreira.jr@gmail.com", {}))

print(contatos.keys())# retorna todas as chaves do dicionario
print(contatos.values())# retorna todos os valores do dicionarios

itens = contatos.items()

chaves = contatos["gelvair.schumann.moreira.jr@gmail.com"].keys()

print(contatos.pop("melani@gmail.com", {})) # se ele encontra ele retorna o valor removido se nao retorna {}

print(contatos.popitem(), {})# remove o ultimo da lista

print(contatos.setdefault("gelvair.schumann.moreira.jr@gmail.com", "vazio"))# se tiver no dicionario deixa assim
print(contatos.setdefault("idade", 21))# vai criar a chave idade no fim, porque nao existe
print(contatos)

contatos.update({"serana@gmail.com": {"Nome": "Serana Schuman", "telefone":"4444-5555"}}) #Atualiza a chave que vc deseja
contatos.update({"novo@gmail.com": {"Nome": "Novo", "telefone":"4444-33333"}})# se nao tiver ele cria
print(contatos)

resultado = "gelvair.schumann.moreira.jr@gmail.com" in contatos #retorna se existe ou nao
print(resultado)
resultado = "joazinho_da_carrosa@gmail.com" in contatos
print(resultado)

resultado = "idade" in contatos["gelvair.schumann.moreira.jr@gmail.com"]
print(resultado)
resultado = "nome" in contatos["gelvair.schumann.moreira.jr@gmail.com"]
print(resultado)

print(contatos)
del contatos["novo@gmail.com"]
print(contatos)
del contatos["gelvair.schumann.moreira.jr@gmail.com"]["extra"]
print(contatos)

del contatos# aqui apaga o dicionario

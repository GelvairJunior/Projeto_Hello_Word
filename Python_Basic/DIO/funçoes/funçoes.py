# Por padrão, toda funcao java retorna None, se nao especificado

def exibirMensagem():
    print("Olá")

def exibirMensagem2(nome):
    print(f"Seja bem vindo {nome}!")

#argumento nomeado
def exibirMensagem3(nome="Anonimo"):
    print(f"Seja bem vindo {nome}!")

exibirMensagem()
exibirMensagem2("joao")
exibirMensagem3()
exibirMensagem3("joao2")

def sucessoreAntessessor(numero):
    antessessor = numero - 1
    sucessor = numero + 1

    return antessessor, sucessor;

x = sucessoreAntessessor(5)
print(x)

def salvar_carro(marca, modelo, ano, placa):
    print(f"Carro inserido como sucesso! {marca}, {modelo}, {ano}, {placa}")

#salvar_carro(marca="fiat", modelo="Ford", ano=2021, placa="Vanilla")
salvar_carro(**{"marca": "fiat", "modelo": "Ford", "ano": "2021", "placa": "Vanilla"})#Dicionarios

# *Args e **Kwargs

def exibir_poema(data_extenso, *args, **kwargs):
    texto = "\n".join(args)
    meta_dados = "\n".join([f"{chave.title()}: {valor}" for chave, valor in kwargs.items()])
    mensagem = f"{data_extenso}\n\n{texto}\n\n{meta_dados}"

    return mensagem

texto = exibir_poema("Zen of Python", "Beautiful is better than ugly.", autor="Tim Petters", ano=1999)
print(texto)

def somar(a, b):
    return a + b

def subtrair(a, b):
    return a - b

def multiplicar(a, b):
    return a * b

def resultado(a, b, funcao):
    resultado = funcao(a, b)
    print(f"o resultado de a com b é {resultado}")

print(resultado(10, 10, somar))
print(resultado(10, 10, subtrair))
print(resultado(10, 10, multiplicar))

x = somar(10, 10)

def pegar_global(s,x):
    x = x + 12
    return s + x

print(pegar_global(10,x))
print(x)
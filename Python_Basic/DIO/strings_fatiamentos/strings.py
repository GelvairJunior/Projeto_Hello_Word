curso = " pYthOn "

print(curso.upper())
# Tudo maisculo

print(curso.lower())
# Tudo minusculo

print(curso.title())
# Primeira letra maisula

print(curso.strip())
# Tirar todo o espaço

print(curso.lstrip())
# Tirar todo espaço da esquerda

print(curso.rstrip())
# Tirar todo espaço a direta

print(curso.center(10, '#'))
# completa a quantidade de letra definida com o que deseja definir

print(".",join(curso))
# separa cada item e adiciona o que você definir entre cada parte da item (mais comum em lista)

# Exemplos de como pode modificar a variavel do formato que deseja usando o F
PI = 3.14159
nome = "junior schumann moreira"
idade = 20
print(f"valor de PI: {PI: 5.2f}")

print(f'Olá me chamo {nome} e tenho {idade} anos')


# A ordem importa
print(f'Olá me chamo {1} e tenho {0} anos'.format(idade, nome))

print(f'Olá me chamo {0} e tenho {1} anos'.format(idade, nome))

print(f'Olá me chamo %s e tenho %d anos' % (nome, idade))

print(f'Olá me chamo %s e tenho %d anos' % ( idade, nome))

# Fatiamento de strings
print(nome[0])
print(nome[-1])
print(nome[:6])
print(nome[8:])
print(nome[8:16])
print(nome[8:16:2])
print(nome[:])
print(nome[::-1])


# por fim multiplas linhas

menu = f'''
olá Tudo bem {nome}
como está?
nao consigui pensar em o que escrever nessa linha
toy story 4 é bem ruim em
'''

print(menu)
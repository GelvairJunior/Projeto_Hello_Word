valor1 = int(input('digite o valor do valor1: '))
valor2 = int(input('digite o valor do valor2: '))

print('antes de ir quero lembrar que o valores vão se atualizando então isso vai ser uma bagunça bem engraçada')

print('Atribuição simples valor1 = {}'.format(valor1, valor2))
print('Atribuição com adição {} += {} = '.format(valor1, valor2))
valor1 += valor2
print(valor1)

print('Atribuição com subtração {} -= {} = 10'.format(valor1, valor2))
valor1 -= valor2
print(valor1)

print('Atribuição com Multiplicação {} * = {} = 200'.format(valor1, valor2))
valor1 *= valor2
print(valor1)

print('Atribuição com divisão {} /= {} ='.format(valor1, valor2))
valor1 /= valor2
print(valor1)

print('Atribuição com divisão inteira {} //= {} ='.format(valor1, valor2))
valor1 //= valor2
print(valor1)

print('Atribuição com modulo {} %= {} ='.format(valor1, valor2))
valor1 %= valor2
print(valor1)

print('Atribuição com exponenciação {} ** = {} = '.format(valor1, valor2))
valor1 **= valor2
print(valor1)
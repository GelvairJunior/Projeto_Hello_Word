saldo = int(input('Quanto você tem no saldo? '))
saque = int(input('Quanto você está querendo sacar? '))
limite = int(input('Quanto é teu limite? '))
tv = 5000


if saldo >= saque and saque <= limite:
    saldo = saldo - saque
    limite = limite - saque
    print ('pode sacar')
else:
    print('Ganancia')
print('aqui esta diminuido o seu saldo e limite se tiver limite e saldo para o saque, e vai diminuir os dois (limite - saque e saldo - saque).')

dinheiro = limite + saldo
if saldo >= saque or saque <= limite: 
	dinheiro = dinheiro - tv 
	print('Eba conseguiu uma tv')


print('No total você tem ', dinheiro)
print('Aqui você fez um calculo se você consegue comprar uma tv, que era 5000. está somando o seu limite e saldo e divide o valor da tv juntos')
limite = dinheiro/2
saldo = dinheiro/2
print(saldo)
print(limite)

print('Tudo isso Foi exemplos de de como funciona os Operadores lógicos. Agora vou tentar usar o NOT')

fala = input('Me passa uma mensagem que queira passar ao mundo, (o silencio também fala): ')
if not(fala):
     print('você não falou nada e eu te respeito :)')

print('Aqui se você não falar nada vai ter uma mensagem, agora vou explicar o not')

print('se não tiver nada vai considerar falso, sempre o not vai considerar o oposto exemplo se você perguntar se not 5 > 1 ele vai retornar falso se fosse ao contrario seria verdadeiro :)')

print('agora vou usar todos os operadores lógicos em uma linha :)')


idade = 12
estudante = 'estudante'
if not idade < 18 and estudante == 'estudante' or estudante == 'trabalho':
     print('falso')
else:
     print('verdadeiro')

print('Eu ainda não entendi o que eu fiz :)')

# (saldo >= saque and saque <= limite) or (conta_especial and saldo >= saque)


print(True and True)
print(True and False)
print(False and False)
print(False or True)
print(True or False)
print(False or False)


saldos = int(input('digite quanto é o seu saldo: '))
limites = int(input('digite quanto é o seu limite: '))

if (saldos is limites):
    print('Você tem um limite bom ')
    print('Aqui testamos o is se o saldo ter o mesmo valor do limite, você viu isso')


if (saldos is not limites):
    print('Não consegui pensar em um trocadilho, piada ou referencia ):')
    print('Aqui testamos o is not, se o saldo ter um valor diferente do limite, você viu isso')

print('aqui iremos utilizar os Operadores de comparação que são: ')

valor1 = int(input ('mas pimeiro digite um Numero: '))
valor2 = int(input ('digite outro numero Numero: '))

print('< = menor que ex: {} < {} = ira retornar: ' .format(valor1, valor2))
print(valor1 < valor2)

print('<= = menor ou igual que ex: {} <= {} = ira retornar: '.format(valor1, valor2))
print(valor1 <= valor2)

print('> = maior que ex: {} > {} = ira retornar: '.format(valor1, valor2))
print(valor1 > valor2)

print('>= = maior ou igual ex: {} >= {} = ira retornar: '.format(valor1, valor2))
print(valor1 >= valor2)

print('== = igual ex: {} == {} = ira retornar: '.format(valor1, valor2))
print(valor1 == valor2)

print('!= = diferente de ex: {} != {} = ira retornar: '.format(valor1, valor2))
print(valor1 != valor2)

print('os operadores de comparação sempre retornam (true ou false)')

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

anime = str(input('Escreva um anime que você goste vamos ver se acerta: '))
valor = int(input('Digite a idade que você acha que eu tenho: '))
inteiro = int(input('vamos lá você tem 3 chutes: '))
val = int(input('Ultimo chute e vamos ver se em algum você acertou: '))
seq = [inteiro, valor, val]

if 'Naruto' in anime:
    print('Cara você gosta de um anime bem legal, parabéns, agora vamos correr com os braços para trás e falar "esse é meu jeito ninja"')

if 20 not in seq:
    print('Você não acertou minha idade de quando eu escrevi o codigo, hehehe')
else:
    print('acertou em cheio')

print ('nós iremos agora fazer um resumo referente aos operadores aritiméticos')

valor1 = int(input ('digite o primeiro numero: '))
valor2 = int(input ('digite o segundo numero: '))

print ('Aqui vai uma soma basica de {} + {}: '.format(valor1, valor2))
print (valor1 + valor2)

print ('Aqui vai uma subtração basica de {} - {}: '.format(valor1, valor2))
print (valor1 - valor2)

print ('Aqui vai uma multiplicação basica de {} x {}: '.format(valor1, valor2))
print (valor1 * valor2)

print ('Aqui vai uma divisão em ponto flutuante de {}/{}:  '.format(valor1, valor2))
print (valor1 / valor2)

print ('Aqui vai uma divisão descartando parte fracionária de {}//{}: '.format(valor1, valor2))
print (valor1 // valor2)

print ('Aqui vai um módulo basico  {}%{} '.format(valor1, valor2))
print (valor1 % valor2)

print ('Aqui vai uma exponeciação de {}elevado a o{}: '.format(valor1, valor2))
print (valor1 ** valor2)

print ('Operadores aritméticos')
print ('+ = adição')
print ('- = Subtração')
print ('/ = divisão em ponto flutuante')
print ('// = divisão descartando parte fracionária')
print ('* = multiplicação')
print ('% = resto da divisão')
print ('-x = negação')
print ('** = potencia')

print('precedencia dos operadores é o mesmo do da matematica () -> ** -> */% -> +-')
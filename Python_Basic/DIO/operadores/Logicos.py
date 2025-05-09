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
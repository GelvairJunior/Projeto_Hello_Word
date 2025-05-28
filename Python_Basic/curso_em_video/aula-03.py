salario = float(input("salario? "))
if salario < 2000. and salario != 0:
	print('você recebe abaixo da media')
elif salario > 2000. and salario <= 6000:
	print('você recebe na media')
elif salario > 6000:
	print('voce ganha bem')
else :
	print('voce não ganha')

print('quantas vezes voce precisa reiniciar para comprar uma tv de 5000? ')
vezes = 0
tv = 5000 
while tv > 0:
	tv = tv - salario
	print('Ainda falta ', tv)
	vezes = vezes + 1
print('você conseguiu comprar a TV')
print('voce precisou reiniciar ', vezes)
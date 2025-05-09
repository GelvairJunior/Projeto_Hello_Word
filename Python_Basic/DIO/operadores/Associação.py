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
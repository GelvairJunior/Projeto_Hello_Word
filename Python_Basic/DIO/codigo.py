x = str(input('O que você ama? '))

if x == 'Chocolate':
    print ('Você tem bom gosto, mas isso mata')
    resposta = str(input('Você gosta muito de {}'.format(x)))
else:
        print ('sério mesmo? que legal, certeza que você adora {}'.format(x))
        str(input('você vai estudar sobre isso? (sim ou não, caso o contrario não vai funcionar;) ) '))

if resposta == 'sim':
    resposta = True
else:
      resposta = False


if resposta == True:
        print ('Nossa que legal <3 (então faz um site sobre isso)')
else:
        print ('Que pena, mas você deve saber mais')
    

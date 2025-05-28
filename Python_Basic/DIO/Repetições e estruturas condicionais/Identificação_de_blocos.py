print('aqui é antes do bloco')
mostrar = 'oi'
def mostra():
    print('aqui inicia um bloco')
    if mostrar == 'oi':
        print('aqui é outro bloco')
    print('aqui saiu do segundo bloco')
print(mostra())
print('saimos de todos os blocos')
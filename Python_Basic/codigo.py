lista_caminhoes = []
res = 'nao'

class caminhoes:
    def __init__(self, Placa, Tipo, Combustivel):
        self.Placa = Placa
        self.Tipo = Tipo
        self.Combustivel = Combustivel

    def exibir(self):
        print(f"Caminhão com placa {self.Placa}, tipo {self.Tipo}, combustível {self.Combustivel}")

while res == 'nao':
    Placa = input("Digite a placa do caminhão: ")
    Tipo = input('Digite o tipo do caminhão: ')
    Combustivel = input('Digite o Combustivel do caminhão: ')
    
    caminhao1 = caminhoes(Placa, Tipo, Combustivel)
    lista_caminhoes.append(caminhao1) 
    
    res = input('Acabou os caminhões? ')

print('Aqui os caminhões que você tem: ')
for c in lista_caminhoes:
    c.exibir()
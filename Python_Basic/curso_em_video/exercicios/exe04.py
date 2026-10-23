descubra = input('Digite algo: ')

print('O tipo primitivo desse valor é ', type(descubra))

print('Só tem espaço? ', descubra.isspace())
print('É um número? ', descubra.isnumeric())
print('É alfabético? ', descubra.isalpha())
print('É alfanumerico? ', descubra.isalnum())
print('Está em maiúsculas? ', descubra.isupper())
print('Está em minúsculas? ', descubra.islower())
print('Está capitalizada? ', descubra.istitle())
import os
import yaml
import shelve

print('\033c')
caminho = "c:/Users/gabri/OneDrive/Área de Trabalho/oreilly_getting_started_with_sql-master/Dev/Git/Projeto_Hello_Word/Python_Basic/Livros/desafios"
caminho_relativo = './photos'
caminho_absoluto = os.path.join(caminho, caminho_relativo)
print(os.listdir(caminho_absoluto))

writer = open(os.path.join(caminho_absoluto, 'photos.txt'), 'w')
notacao1 = "Você é uma pessoa muito legal"
notacao2 = "Você é uma pessoa muito simpática"
writer.write(f'Notacao principal: {notacao1}\nNotacao secundaria: {notacao2}')
writer.close()

reader = open(os.path.join(caminho_absoluto, 'photos.txt'), 'r')
for line in reader.readlines():
    print(line, end='')
print()
reader.close()
config = {
    'photos_dir': 'photos',
    'data_dir': 'photos_info',
    'extensions': ['jpg', 'jpeg', 'png', 'gif'],
}

config_filename = 'config.yaml'
writer = open(os.path.join(caminho_absoluto, config_filename), 'w')
yaml.dump(config, writer)
writer.close()

reader = open(os.path.join(caminho_absoluto, config_filename), 'r')
config_loaded = yaml.safe_load(reader)
print(config_loaded)


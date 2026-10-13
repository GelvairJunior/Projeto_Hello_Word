import os
os.system('cls')

class Time:
    ...

def print_time(time):
    s = f'{time.hour:02d}:{time.minute:02d}:{time.second:02d}'
    print(s)

def make_time(hour, minute, second):
    time = Time()
    time.hour = hour
    time.minute = minute
    time.second = second
    return time

def time_to_int(time):
    minutes = time.hour * 60 + time.minute
    seconds = minutes * 60 + time.second
    return seconds

def int_to_time(seconds):
    minute, second = divmod(seconds, 60)
    hour, minute = divmod(minute, 60)
    return make_time(hour, minute, second)

def add_time_design(time, hours, minutes, seconds):
    duration = make_time(hours, minutes, seconds)
    seconds = time_to_int(time) + time_to_int(duration)
    return int_to_time(seconds)

def subtrack_time(Time1, Time2):
    seconds = time_to_int(Time1) - time_to_int(Time2)
    return seconds

def is_after(time1, time2):
    return time_to_int(time1) > time_to_int(time2)

def data_to_int(data):
    month = data.year * 12 + data.month
    days = month * 30 + data.days
    return days

def int_to_data(days):
    month, days = divmod(days, 30)
    year, month = divmod(month, 12)
    return make_data(year, month, days)

def is_after_date(data1, data2):
    return data_to_int(data1) > data_to_int(data2)

class Data():
    ...

def make_data(days, month, year):
    data = Data()
    data.days = days
    data.month = month
    data.year = year
    return data

def print_data(data):
    print(f"{data.days:02d}/{data.month:02d}/{data.year:04d}")

def desafio_cap_14():
    print('Testando os desafios do capitulo 14 \n')
    tempo1 = make_time(4, 10, 30)
    tempo2 = make_time(9, 30, 40)
    print('Testando o primeiro desafio')
    print(abs(subtrack_time(tempo1, tempo2)) == 19210, '\n')

    print('Testando o segundo desafio')
    print(is_after(tempo1, tempo2) == False, '\n')

    print('Testando o terceiro desafio')
    gta = make_data(19, 11, 2026)
    print_data(gta)
    zelda = make_data(5, 11, 2026)
    print_data(zelda)
    print(is_after_date(gta, zelda) == True)

class Data:
    def __init__(self, dia = 0, mes = 0, ano = 1970):
        self.dia = dia
        self.mes = mes
        self.ano = ano

    def __str__(self):
        return f'{self.dia}/{self.mes}/{self.ano}'

    def __add__(self, other):
        dias = self.date_in_int() + other.date_in_int()
        return Data.int_to_data(dias)

    def __sub__(self, other):
        dias = self.date_in_int() - other.date_in_int()
        return Data.int_to_data(dias)

    def date_in_int(self):
        meses = self.ano * 12 + self.mes
        dias = meses * 30 + self.dia
        return dias

    # estatico
    def int_to_data(dias):
        mes, dia = divmod(dias, 30)
        ano, mes = divmod(mes, 12)
        return Data(dia, mes, ano)

    def is_after(self, other):
        return self.date_in_int() > other.date_in_int()

def desafio_cap_15():
    print('Testando os desafios do capitulo 15 \n')
    gta = Data(19, 11, 2026)
    print('Testando o primeiro desafio')
    print(gta, '\n')
    zelda = Data(5, 11, 2026)
    print('Testando o segundo desafio')
    print(gta.is_after(zelda) == True, '\n')
    diferenca = gta - zelda
    print('Testando o terceiro desafio')
    print(diferenca.dia == 14 and diferenca.mes == 0 and diferenca.ano == 0, '\n')

def desafio_cap_16():
    print('Testando os desafios do capitulo 16 \n')

desafio_cap_14()
desafio_cap_15()
desafio_cap_16()
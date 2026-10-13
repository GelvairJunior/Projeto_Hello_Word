import os
from copy import copy
os.system('cls')

class Time:
    ...

lunch = Time()
lunch.hour = 9
lunch.minute = 59
lunch.second = 3

def print_time(time):
    s = f'{time.hour:02d}:{time.minute:02d}:{time.second:02d}'
    print(s)

def make_time(hour, minute, second):
    time = Time()
    time.hour = hour
    time.minute = minute
    time.second = second
    return time

print(type(lunch))
print(lunch.hour)
print_time(lunch)

game = make_time(18, 1, 30)
print_time(game)

def increment_time(time, hour, minute, second):
    time.second += second
    time.minute += minute
    time.hour += hour

    carry, time.second = divmod(time.second, 60)
    carry, time.minute = divmod(time.minute + carry, 60)
    carry, time.hour = divmod(time.hour + carry, 60)

start = copy(game)
increment_time(game, 2, 30, 32)
print_time(game)

def add_time(time, hours, minutes, seconds):
    total = copy(time)
    increment_time(total, hours, minutes, seconds)
    return total

new_end = add_time(start, 3, 20, 20)
print_time(new_end)
print_time(start)

new_end = add_time(start, 10, 50, 50)
print_time(new_end)

### Focado em design
print('\nfazendo de forma focando em design do código e evitando exceções: \n')
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

start = copy(lunch)
end_lunch = add_time_design(start, 1, 92, 125)
print_time(start)
print_time(end_lunch)

print(vars(end_lunch))

class TIME:

    def __init__(self, hour=0, minute=0, second=0):
        assert self.is_valid()
        self.hour = hour
        self.minute = minute
        self.second = second

    def __str__(self):
        return f'{self.hour:02d}:{self.minute:02d}:{self.second:02d}'

    def __add__(self, other):
        seconds = self.time_to_int() + other.time_to_int()
        return TIME.int_to_time(seconds)

    def time_to_int(self):
        minutes = self.hour * 60 + self.minute
        seconds = minutes * 60 + self.second
        return seconds

    #metodo estatico
    def int_to_time(seconds):
        minute, second = divmod(seconds, 60)
        hour, minute = divmod(minute, 60)
        return TIME(hour, minute, second)

    def add_time(self, hours, minutes, seconds):
        duration = TIME(hours, minutes, seconds)
        seconds = time_to_int(self) + time_to_int(duration)
        return TIME.int_to_time(seconds)

    def is_after(self, other):
        return self.time_to_int() > other.time_to_int()

    def is_valid(self):
        if self.hour < 0 or self.minute < 0 or self.second < 0:
            return False
        if self.minute >= 60 or self.second >= 60:
            return False
        if not isinstance(self.hour, int):
            return False
        if not isinstance(self.minute, int):
            return False
        return True


os.system('cls')
start = TIME(4, 30, 20)
print(start.__str__())
print(start.time_to_int())
start = TIME.int_to_time(16228)
print(start)
end = start.add_time(1, 30, 30)
print(end)

print(end.is_after(start))

duration = TIME(4, 22)
end = start + duration
print(end)
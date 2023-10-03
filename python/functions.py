from functools import reduce


datos = {2, 4, 5, 6, 7, 8, 9, 10, 11, 12}

func = lambda x: x**2

mapa = map(func, datos)
print(datos)
print(mapa)

pares = filter(lambda x: x % 2 == 0, datos)
print(list(pares))

reducion = reduce(lambda x, y: x + y, datos)

for key in mapa:
    print(key)


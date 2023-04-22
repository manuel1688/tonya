# CLASES: En este caso, resulta que hay una asignación directa entre los atributos del módulo y 
# los nombres globales definidos en el módulo: ¡comparten el mismo espacio de nombres! 1

# El espacio de nombres local para una función se crea cuando se llama a la función y se elimina cuando la función 
# devuelve o genera una excepción que no se maneja dentro de la función. (En realidad, olvidar sería una mejor manera 
# de describir lo que realmente sucede). Por supuesto, cada invocación recursiva tiene su propio espacio de nombres local.

def scope_test():
    def do_local():
        spam = "local spam"

    def do_nonlocal():
        nonlocal spam
        spam = "nonlocal spam"

    def do_global():
        global spam
        spam = "global spam"

    spam = "test spam"
    do_local()
    print("After local assignment:", spam)
    do_nonlocal()
    print("After nonlocal assignment:", spam)
    do_global()
    print("After global assignment:", spam)

scope_test()
print("In global scope:", spam)

class MyClass:
    """A simple example class"""
    i = 12345

    def f(self):
        return 'hello world'

print(MyClass.__doc__)

class Complex:
    def __init__(self, realpart, imagpart):
        self.r = realpart
        self.i = imagpart

x = Complex(3.0,-4.5)
print(x.r, x.i)

class Dog:
    """A Dog example class"""
    def __init__(self, name):
        
        self.name = name
        self.tricks = []    # creates a new empty list for each dog

    def add_trick(self, trick):
        
        self.tricks.append(trick)

d = Dog('Fido')
e = Dog('Buddy')
d.add_trick('roll over')
e.add_trick('play dead')
print(d.tricks)
print(e.tricks)

#Las lista como todo en python puede almacenar tiderentes tipo de datos

fruits = ["orange", "apple", "pear", "banana", "kiwi", "apple", "banana"]
print("fruits: --> ",fruits)
print("\n\n")
other_fruits = ["pineapple", "grape"]
print("other_fruits: --> ",other_fruits)
print("\n\n")

#Extend: Extiende una lista con otra lista, este metodo modifica la lista
other_fruits.extend(fruits)
print("other_fruits extended: --> ",other_fruits)
print("\n\n")

# with + we can extend a list: Growing a List: Plus (+)
new_list = fruits + other_fruits
print("new_list = fruits = other_fruits: --> ", new_list)
print("\n\n")

#remove retorna error cuando no existe el item
# new_list.remove(1)

new_list.pop()
print("new_list = fruits = other_fruits: --> ", new_list)
print("\n\n")



# new_list.insert(1,1)
# print(new_list)


#pop saca de la lista el ultimo elemento y retorna el resultado
# print(new_list.pop())
# print(new_list)

#sort
# new_list.sort()
# print(new_list)

# new_list.reverse()
# print(new_list)


# fruits.count("apple")
# fruits.count("tangerine")
# fruits.index("banana")
# fruits.index("banana", 4)  # Find next banana starting a position 4
# fruits.reverse()
# fruits.append("grape")
# fruits.sort()
# fruits.pop()


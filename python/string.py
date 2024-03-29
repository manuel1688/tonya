#String
this_string = 'Simon\'s skateboard is in the garage.'
print(this_string)

#String methods

my_string = "sebastian thrun"
my_string = my_string.capitalize() 
print(my_string)

text = 'groß'

# convert text to lowercase using casefold()
print('Using casefold():', text.casefold()) 

# convert text to lowercase using lower()
print('Using lower():', text.lower())

#center
txt = "banana"
x = txt.center(20)
print(x)

txt = "banana"
x = txt.center(20, "O")
print(x)

#count
print(my_string.count("a"))

# unicode string
string = 'pythön!'

# print string
print('The string is:', string)

# strict error
#By default, the encode() method doesn't require any parameters.
#It returns an utf-8 encoded version of the string. In case of failure, it raises a UnicodeDecodeError exception.
print('The encoded version (with strict) is:', string.encode())
print('The encoded version (with strict) is:', string.encode(encoding='UTF-8',errors='strict'))

# ignore error
print('The encoded version (with ignore) is:', string.encode("ascii", "ignore"))

# replace error
print('The encoded version (with replace) is:', string.encode("ascii", "replace"))

# xmlcharrefreplace error
print('The encoded version (with xmlcharrefreplace) is:', string.encode("ascii", "xmlcharrefreplace"))

# backslashreplace error
print('The encoded version (with backslashreplace) is:', string.encode("ascii", "backslashreplace"))

# namereplace error
print('The encoded version (with namereplace) is:', string.encode("ascii", "namereplace"))

# my_string.format()
txt = "For only {price:.2f} dollars!"
print(txt.format(price = 49))

price = 49
txt = f"""For only {price:.2f} dollars!"""
print(txt)

# my_string.isalpha()
string_with_letter = "abcdef"
string_with_number = "123abcdef"

print(string_with_letter.isalpha())
print(string_with_number.isalpha())

# my_string.islower() valida si todos los catacteres están en minuscula
string_a = "ABCD"
string_b = "aBcd"

print(string_a.islower())
print(string_b.islower())

# my_string.istitle() valida si cada palabra empieza con mayuscula
txt = "Hello, And Welcome To my World!"

x = txt.istitle()

print(x)
# my_string.endswith()
# my_string.format_map()
# my_string.isdecimal()
# my_string.isnumeric()
# my_string.isupper()
# my_string.expandtabs()
# my_string.index()
# my_string.isdigit()
# my_string.isprintable()
# my_string.join()
# my_string.find()
# my_string.isalnum()
# my_string.isidentifier() 
# my_string.isspace()
# my_string.ljust()
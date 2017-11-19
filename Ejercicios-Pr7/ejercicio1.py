"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA7 - EJERCICIO 1
Escribe un programa que pida un texto por pantalla, este texto lo pase como
parámetro a un procedimiento, y éste lo imprima primero todo en minúsculas y
luego todo en mayúsculas."""

print("Escribe un texto: ")
text=input()

text1=text

print (text1.capitalize())

print (text1.upper())



def texto(text):
    texto.capitalize()
    texto.upper()

print(texto())

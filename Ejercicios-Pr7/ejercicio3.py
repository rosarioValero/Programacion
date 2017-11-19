"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA7 - EJERCICIO 3
Escribe un programa que lea una frase, y la pase como parámetro a un
procedimiento, y éste debe mostrar la frase con un carácter en cada línea. """

print("Introduce una frase")
texto=input()

def espacio(texto):
    for i in range(0, len(texto)):
        print(texto[i])
print(espacio(texto))

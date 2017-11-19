"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA7 - EJERCICIO 4
Escribe un programa que pida una frase, y le pase como parámetro a una función
dicha frase. La función debe sustituir todos los espacios en blanco
de una frase por un asterisco, y devolver el resultado para
que el programa principal la imprima por pantalla."""

print("Introduce una frase")
texto=input()


def frase(texto):
    blanco= ' '
    for i in range(len(texto)):
        if texto[i] == ' ':
            blanco+='*'
        else:
            blanco+=texto[i]
    return blanco
print (frase(texto))

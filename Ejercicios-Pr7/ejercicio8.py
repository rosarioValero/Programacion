"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA7 - EJERCICIO 8
Escribe un programa que pida una frase, y pase la frase como parámetro a una
función que debe eliminar los espacios en blanco (compactar la frase).
El programa principal imprimirá por pantalla el resultado final."""

def pide_texto():
    frase=input()
    return frase

def sustituir_espacio(frase):
    result=""
    for i in range(len(frase)):
        if frase[i] == " ":
            result+=""
        else:
            result+=frase[i]
    return result

texto=pide_texto()
print(sustituir_espacio(texto))
    

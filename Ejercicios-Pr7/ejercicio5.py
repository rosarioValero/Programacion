"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA7 - EJERCICIO 5
Escribe un programa que te pida una frase y una vocal, y pase estos datos como
parámetro a una función que se encargará de cambiar todas las vocales de la
frase por la vocal seleccionada. Devolverá la función la frase modificada,
y el programa principal la imprimirá."""

print("Escribe una frase")
frase=input()

print("Escribe una vocal")
vocal=input()
"""cuando llamas un dato por teclado también haz de llamarlo en la funcion """
def texto(frase,vocal):
    
    vocales=['a', 'e',' i',' o' ,'u']
    result=""

    for i in range(len(frase)):
        if frase[i] in vocales:
            result+=vocal
        else:
            result+=frase[i]
    return result

print("La frase es ahora:", texto(frase,vocal))


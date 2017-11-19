"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA7 - EJERCICIO 6
Escribe un programa que lea el nombre de una persona y un carácter,
le pase estos datos a una función que comprobará si dicho carácter
está en su nombre. El resultado de dicha función lo
imprimirá el programa principal por pantalla."""

print("Introduce un nombre")
nomb=input()
print("Introduce un carácter")
caract=input()

def comprobar(nomb,caract):
    
    for i in range(len(nomb)):
        if nomb[i] == caract:
            return "Carácter encontrado"
    return "Carácter no encontrado"
    
print("El carácter", caract, "de", comprobar(nomb, caract))

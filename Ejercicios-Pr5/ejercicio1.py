"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA5 - EJERCICIO 1
Escriu un programa que te demani paraules i les guardi en una llista.
Per a terminar d'introduir paraules, simplement pitja Enter.
El programa termina escribint la llista de paraules."""

print("Introduce una palabra")
pal=input()

lista=[]

while pal!="":
    lista.append(pal)
    print("Introduce otra palabra")
    pal=input()
print(lista)



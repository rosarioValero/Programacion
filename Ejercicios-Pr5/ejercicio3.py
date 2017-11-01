"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA5 - EJERCICIO 3
Escriu un programa que demani notes i les guardi en una llista.
Per a terminar d'introduir notes, escriu una nota que no estigui entre 0 i 10.
El programa termina escrivint la llista de notes."""

print("Introduce una nota")
nota=float(input())

lista=[]

while (nota>0 and nota<10):
    lista.append(nota)
    print("Introduce otra nota")
    nota=float(input())

print(lista)

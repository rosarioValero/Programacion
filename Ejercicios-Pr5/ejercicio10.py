"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA5 - EJERCICIO 10
Escriu un programa que et demani els noms i notes d'alumnes.
Si escrius una nota fora de l'interval de 0 a 10, el programa entendrà
que no vols introduir més notes d'aquest alumne. Si no escrius el nom,
el programa entendrà que no vols introduir més alumnes.
Nota: La llista en la que es guarden els noms i notes és [ [nom1, nota1, nota2, etc],
[nom2, nota1, nota2, etc], [nom3,nota1, nota2, etc], etc] """

print("Dame un nombre")
nomb=input()

lista=[]
lista1=[]

while nomb!="":
    lista.append(nomb)
    print("Introduce una nota")
    nota=float(input())
    
    while nota>=0 and nota<=10:
        lista.append(nota)
        print("Introduce otra nota")
        nota=float(input())
    lista1.append(lista)
    print("Introduce otro nombre")
    nomb=input()
    lista=[]
    
print("Los nombres y notas son: ",lista1)

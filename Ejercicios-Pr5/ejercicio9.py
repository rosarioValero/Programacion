"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA5 - EJERCICIO 9
Escriu un programa que et demani noms de persones i els seus números de telèfon.
Per a terminar de escriure nombres i numeros s'ha de pulsar Intro quan et demani el nom.
El programa termina escribint noms i números de telèfon.
Nota: La llista en la que es guarden els noms i
números de telèfon és [ [nom1, telef1], [nom2, telef2], [nom3, telef3], etc]"""

print("Dame un nombre")
nomb=input()

lista=[]
lista1=[]

while nomb!="":
    lista.append(nomb)
    print("Introduce un telefono")
    telf=(input())
    lista.append(telf)
    lista1.append(lista)
    print("Introduce otro nombre")
    nomb=input()
    lista=[]
    
print("Los nombres y telefonos son: ",lista1)

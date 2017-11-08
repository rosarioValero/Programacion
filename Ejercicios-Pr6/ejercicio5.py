"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA6 - EJERCICIO 5
Escribe un programa que permita crear dos listas de palabras y que,
a continuación, elimine de la
primera lista los nombres de la segunda lista """

print("Dime cuántas palabras tiene la lista")
num=int(input())

if num <1:
    print("No es posible!")
else:
    lista=[]
    for i in range(num):
        print("Dime la palabra: ", str(i + 1) + ": ")
        palabra=input()
        lista +=[palabra]
    print("La lista creada es: ", lista)

print("Dime cuántas palabras tiene la lista de palabras a eliminar: ")
num2=int(input())
if num2 <1:
    print("No es posible!")
else:
    delete=[]
    for i in range(num2):
        print("Dime la palabra: ", str(i + 1) + ": ")
        palabra=input()
        delete +=[palabra]
    print("La lista de palabras a eliminar es: ", delete)

    for i in delete:
        for j in range(len(lista)-1, -1, -1):
            if lista[j] == i:
                del(lista[j])
    print("La lista de ahora: ", lista)

"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA5 - EJERCICIO 5
Escriu un programa que te demani dos nombres cada vegada més grans
i els guardi en una llista.Per a terminar d'escriure els nombres,
escriu un nombre que no sigui major a l'anterior. El
programa termina escribint la llista de nombres. """

print("Introduce un número")
num1=int(input())
lista=[num1]

print("Introduce otro número")
num2=int(input())
lista= lista + [num2]

while num2>=num1:
    num1=num2
    print("Introduce otro número: ",num2)
    num2=int(input())
    lista.append(num2)

lista.pop()   
print(lista)

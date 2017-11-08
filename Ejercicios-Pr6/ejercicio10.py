"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA6 - EJERCICIO 10
Escribe un programa que pida un número y a continuación escriba la lista
de todos los divisores del número (incluidos el uno y él mismo). """

print("Dime un número: ")
num=int(input())
divisor=0
lista=[]
    
for i in range(1,num+1):
    if num%i == 0:
        lista.append(i)
        i=i+1
        divisor +=1
print(num, "tiene", divisor, "divisores:", lista)
    

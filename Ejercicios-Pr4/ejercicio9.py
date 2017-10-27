"""Escriu un programa que demani l'amplada
i l'alçada d'un rectangle i ho dibuixi de la següent
manera"""
print("Introduce una anchura")
ancho = int(input())
print("Introduce una altura")
altura = int(input())

for i in range(ancho):
        print("*")
    
for b in range(altura-2):
    print("*")
    for m in range(ancho+1):
        print("*")
     
for n in range(ancho):
    print("*")




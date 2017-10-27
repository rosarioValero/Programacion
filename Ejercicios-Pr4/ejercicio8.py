"""Escriu un programa que demani l'amplada d'un triangle
i ho dibuixi de la següent manera:"""

print("introduce una anchura")
altura =int(input())
for i in range(altura):
      print("*"*i)
for i in range(altura,0,-1):
    print("*"*i)

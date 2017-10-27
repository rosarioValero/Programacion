""" Escriu un programa que demani l'amplada i alçada d'un rectangle i ho dibuixi
de la segúent manera-"""
print("Introduce el ancho de un rectangulo")
ancho =int(input())
print("Introduce la altura de un rectangulo")
altura= int(input())
for i in range(altura):
    print("*"*ancho)

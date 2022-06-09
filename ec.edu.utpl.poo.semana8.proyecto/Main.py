# Se utiliza el from y el nombre de la clase y el import * para importar la clase Motorcylce
from Motorcycle import *

# crear un objeto de la clase Motorcycle enviando elementos para inicializar los valores
motorcycle1 = Motorcycle("BMW", "Black", 2020)

# mostrar datos utilizando metodos get para retornar valores
print("Brand: " + motorcycle1.brand)
print("Color: " + motorcycle1.color)
print("Year: " + str(motorcycle1.year))

# cambiamos el valor del año con el metodo set a un numero que no este incluido en el rango

print("\nYear change")

# utilizamos el metodo get para mostrar el año ingresado anterior
print("Previous Year: \t" + str(motorcycle1.year))

# utilizamos el metodo set para otorgar un nuevo valor a year
motorcycle1.year = 2010

# mostrar el valor modificado del objeto
print("New Year: \t" + str(motorcycle1.year))
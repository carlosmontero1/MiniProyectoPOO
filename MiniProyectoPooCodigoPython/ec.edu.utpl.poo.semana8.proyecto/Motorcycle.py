# importamos date de datetime para obtener el año en que estamos para que el año de la moto no sea mayor al actual
from datetime import date

class Motorcycle:

    def __init__(self, brand, color, year):
        self.__brand = brand
        self.__color = color
        if (year > 1885 and year < date.today().year):
            self.__year = year
        else :
            raise Exception("El año de la motocycleta no puede ser antes de 1885 o mayor a este año")

    @property
    def brand (self):
        return self.__brand

    @brand.setter
    def brand(self, b):
        self.__brand = b

    @property
    def color(self):
        return self.__color

    @color.setter
    def color(self, c):
        self.__color = c

    @property
    def year(self):
        return self.__year

    @year.setter
    def year(self, y):
        if (y > 1885 and y < date.today().year):
            self.__year = y
        else :
            raise Exception("El año de la motocycleta no puede ser antes de 1885 o mayor a este año")


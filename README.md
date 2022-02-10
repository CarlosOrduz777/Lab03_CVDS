# Lab03

## Autores: Carlos Orduz - Daniel Ramos

## Comando para ejecutar pruebas en maven

mvn -U package

## Clases de equivalencia para Registry

1. Invalid_Age: La edad no puede ser un número negativo
2. Duplicated: Cuando ya esta registrado el ID de la persona 
3. Underage: 0 < edad < 18
4. Dead: La persona no esta viva (isAlive = false)
5. Valid: Cuando no se cumple ninguna de las condiciones anteriormente mencionadas

## Especificacion calculoTarifa

```

/**
calcular la tarifa de cada billete según el trayecto, la antelación
en la que se obtiene el billete y la edad del pasajero, de acuerdo
con la normativa 005.
@param tarifaBase valor base del vuelo
@param diasAntelacion dias de antelación del vuelo
@param edad - edad del pasajero
@throws ExcepcionParametrosInvalidos Se lanza la excepcion cuando los datos ingresados sean menor que 0
**/
public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad)

```
## Clases de equivalencia para Tarifas

1. El parámetro tarifa es mayor a 0, los días de antelación son menores a 20 y la edad está entre 18 años y 65. Se debe obtener el valor de la tarifa sin ninguna alteración.

2. El parámetro tarifa es mayor a 0, los días de antelación menores a 20 y la edad menor a 18 años. Se debe obtener el valor de la tarifa con un descuento del 5%.

3. El parámetro tarifa es mayor a 0, los días de antelación menores a 20 y la edad mayor a 65 años. Se debe obtener el valor de la tarifa con un descuento del 8%.

4. El parámetro tarifa es mayor a 0, los días de antelación mayores a 20 y la edad mayor a 18 y menor a 65 años. Se debe obtener el valor de la tarifa con un descuento del 15%.

5. El parámetro tarifa es mayor a 0, los días de antelación mayores a 20 y la edad menor a 18 años. Se debe obtener el valor de la tarifa con un descuento del 20%.

6. El parámetro tarifa es mayor a 0, los días de antelación mayores a 20 y la edad mayor a 65 años. Se debe obtener el valor de la tarifa con un descuento del 23%.

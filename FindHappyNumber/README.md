# Descripcion del problema:

#### Determinar si un numero es "happy"

un número "happy" es un número definido por el siguiente proceso: Comenzando con un entero positivo, reemplazar el número por la suma del cuadrado de sus dígitos, y repetir el proceso hasta que el número es igual a 1 (donde permanecerá), o se ciclará indefinidamente en un ciclo que no incluye 1. Aquellos números para los que este proceso termina en 1 son numeros felices ("Happy" numbers)

> Example:
>
>Input: 94
>
>Output: true
>
>Explanation:
>
>9^2 + 4^2 = 97
>
>9^2 + 7^2 = 130
>
>1^2 + 3^2 + 0^2 = 10
>
>1^2 + 0^2 = 1 "it's a happy number"

### Solución

Primero tenemos que separar el número en sus dígitos, para posteriormente cada uno elevarlos al cuadraro y sumar todos los cuadrados, y repetir el mismo proceso,

sabiendo esto podemos separar el problema en 3 pasos, crear una arreglo de digitos, sumar el cuadrado de los elementos de ese arreglo y repetir hasta que de como resultado o no 1

El código propuesto es el siguiente, aprovechando los métodos de la clase String, como saber el tamaño, para poder definir un arreglo no nulo, y obtener el caracter de cada string por posiciones,
asi pues, tomando como referencia el ejemplo anterior, el numero 94, se transformaría en un strin de la siguiente forma "94", donde el caracter en la posicion 0 es el "9", y el caracter en la posición 1 es "4", así al mismo tiempo que leemos el string, podemos ir guardando su valor numerico en un arreglo de enteros

```private static int[] toArray(int number) {
		
		//String split method
		String number2 = ((Integer) number).toString();
		int array[] = new int[number2.length()];
		
		for(int i=0; i<number2.length(); i++) {
			array[i] =Character.getNumericValue( number2.charAt(i) );
		}
		
		return array;
		

	}
```

##### solucion alterna

Este mismo proceso se puede lograr si sabemos el tamaño del arreglo, o usando un ArrayList, y vamos sacando el modulo del numero, y dividiendolo entre 10 cada vez, mientras el numero sea mayor a 0

```
//mod method
int array[] = new int[((Integer)number).toString().length()];
int i = 0;
while(number > 0 ) {
	array[i] = number % 10;
	number /= 10;
	i++;
}
return array;
```

una vez que tenemos nuetro arreglo de enteros, lo siguiente es solo guardar en una variable, la suma del cuadrado de cada elemento al irlo recorriendo

```
private static int sumaCuadrados(int array[]) {		
	int result = 0;
	for(int i=0 ; i < array.length ; i++) {
		result += (array[i] * array[i]);
	}
	return result;
}
```

#### Propuesta de optimización

Podemos observar que ambos ciclos iteran por el numero total de elementos del arreglo, esto se puede aprovechar y meter todas las operaciones dentro de un solo ciclo de la siguiente manera

```
private static int isHappy2(int number) {
	int result = 0;
	
	String number2 = ((Integer) number).toString();
	int array[] = new int[number2.length()];
	
	for(int i=0; i<number2.length(); i++) {
		array[i] =Character.getNumericValue( number2.charAt(i) );
		result += (array[i] * array[i]);
	}
	return result;
}
```

Asi, solo restaría, realizar este proceso hasta encontrar si el número es happy o no con el siguiente código, el cual asegura que solo si el resultado es igual a 1, sale del ciclo y regresa un true, porque es happy, de lo contrario continuará en el ciclo indefinidamente como indica el problema

```
public static boolean isHappy(int number) {
		
		int result = isHappy2(number);
		
		while(result != 1) {
			result = isHappy2(result);
		}
		
		return true;
	}
```

a este método, se le puede encontrar una solucion recursiva, desafortunadamente, al no encontrar solucion con numeros que no son happy, llenará la pila en algun momento y terminará el programa, sin embargo se incluye la solución

```
//recursive method
int resultado = sumaCuadrados(toArray(number));
if( resultado == 1 ) {
	return true;
} else {
	return isHappy(resultado);
}
```

### Pruebas del programa

Metodo main

```
package com.reto2.app;
import model.Reto2;

public class MainApp {

	public static void main(String[] args) {

		if(Reto2.isHappy(94));
			System.out.println("it's a happy number");
		
	}

}
```

##### Resultado
>it's a happy number
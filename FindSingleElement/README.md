# Reto 1 Generations

### Descripcion del Problema:

Dado un arreglo de elementos ordenados qu consiste solo de enteros, donde cada elemento aparece dos veces con excepcion de un elemento que aparece solo una vez. Encontrar ese elemento unico que aparece solo una vez.

>Example 1:
>
>Input: [1,1,2,3,3,4,4,8,8]
>Output: 2
>
>
>Example 2:
>
>Input: [3,3,7,7,10,11,11]
>Output: 10


### Solución

Tomando en cuenta que los elementos aparecen en pares y no más, y hay un elemento único, podemos ir revisando de dos en dos, y al encontrar una pareja cuyos elementos no sean iguales, tendrémos el elemento único

El código resultanet es el siguiente

```
package model;

public abstract class Reto1 {
	public static Integer findSigleElement(int array[]) {
		
		for(int i=0; i<array.length ; i+=2) {
			if(i == array.length-1) {
				return array[i];
			}else if ((array[i] != array[i + 1])){
				return array[i];
			}
		}
		
		return null;
	}
}
```

De este código podemos notar un ciclo, que recorre el arreglo con incrementos de 2 en 2, el unico inconveniente que presenta esto es cuando el elemento único se encuentra al final del arreglo, e intentamos accesar a un elemento fuera del rango, para esto se incluye la siguiente linea

```
if(i == array.length-1) {
	return array[i];
}else if ((array[i] != array[i + 1])){
	return array[i];
}
```

la cual nos indica, que si ya hemos llegado al final del arreglo, siendo este de tamaño impar (lo que nos asegura que existe un elemento unico), sin haberlo encontrado aun, por ende el eleménto unico es el último, de otra forma, si no hemos llegado al final del arreglo, compara el elemento actual con el siguiente, y si son diferentes, deja de buscar y regresa el elemento actual, ya que el elemento unico, dado la naturaleza del problema, que vienenen pares, solo puede caer en una posición par (ya que el indice de los arreglos empieza en 0) por ejemplo 0,2,4,... 

### Pruebas del programa

Nuestro metodo main
```
package com.reto1.app;

import model.Reto1;

public class MainApp {

	public static void main(String[] args) {
		
		
		int array1[] = {1,1,2,3,3,4,4,8,8};
		System.out.println(Reto1.findSigleElement(array1));
		
		int array2[] = {3,3,7,7,10,11,11};
		System.out.println(Reto1.findSigleElement(array2));
		
		//case where there is no unique element
		int array3[] = {1,1,2,2,3,3,4,4,5,5};
		System.out.println(Reto1.findSigleElement(array3));
		
		//case where the unique element is at the end of the array
		int array4[] = {1,1,6};
		System.out.println(Reto1.findSigleElement(array4));
		
		//case where the unique element is at the beginning of the array
		int array5[] = {0,5,5};
		System.out.println(Reto1.findSigleElement(array5));
	}

}
```

#### Resultado

```
2
10
null
6
0
```
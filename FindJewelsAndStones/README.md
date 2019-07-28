# Descripcion del problema

#### Encontrar joyas y piedras

Se te entrega un String J representando los tipos de piedras que son joyas, y un String S representando las piedras que tienes. Cada caracter en S es un tipo de piedra que tienes. Y quieres saber cuantas de esas piedras que tienes son tambien joyas.

las letras en J estan garantizadas a ser diferentes, y todos los caracyeres en J y S son letras, las letras son "case sensitive" (sensible a mayusculas y minusculas), así "a" es considerada como un tipo diferente de piedra que "A"

> Example 1:
>
>
>Input J = "aA", S = "aAAbbbb"
>
>Output: 3
>
>
>Example 2:
>
>
>Input: J = "z", S = "ZZ"
>
>Output: 0



#### nota
 * S y J consistiran unicamente de letras  y tendrán una longitud como mucho de 50
 * Los caracteres en J son distintos


### Solucion

Aprovechando los metodos de la clase String, podemos comvertir el String S a un arreglo con el metodo "toCharArray()", para poder recorrerlo y comparar cada "piedra" que tenemos, y usando el metodo "indexOf(char c)" podemos revisar si en el arreglo J se encuentra cada una de las "piedras" y que corresponda a una "joya", si nuestra condicion `jewels.indexOf(s) != -1` regresa un "true", solo aumentamos la cuenta de las joyas, en caso de que no encuentre nada, el resultado permanecerá en 0

```
public abstract class reto3 {

	public static int FindJewelsAndStones(String jewels, String batch) {
		int count = 0;
		
		for(char s : batch.toCharArray()) {
			if(jewels.indexOf(s) != -1)
				count++;
		}
		return count;
	}
	
}
```

### Pruebas del programa
 
Método main

```
package com.reto3.app;

import model.reto3;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J = "aA";
		String S = "aAAbbbb";
		
		System.out.println(reto3.FindJewelsAndStones(J, S));
		
		String J2 = "z";
		String S2 = "ZZ";
		
		System.out.println(reto3.FindJewelsAndStones(J2, S2));
	}

}
```

#### Resultado

>3
>
>0

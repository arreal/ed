// debe de indicarte donde se encuentra el dato directamente introducido en el codigo, sino imprimir -1 position
package org.intitutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		int[] v = new int [] {9, 15, 7, 12, 6}; // Arry tipo entero
		
		for (int index = 0; index < 5; index++)
			System.out.printf("v[%s]=%s\n", index, v[index]);
		System.out.println();
		
		int value = 33;
		
		int position = indexOf(v ,value);
		System.out.println("position="+position);

	}

	public static int indexOf(int[] v, int value) {
		int index = 0;
		while (index < v.length && v[index] != value)
			index++;
		if (index == v.length)
			return index;
		return -1;
		
	}
	
}

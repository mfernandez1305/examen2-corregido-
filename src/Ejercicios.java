import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicios {
	
	//Devuelve true si todos los elementos de 'mi_lista' son pares, de lo contrario devuelve false
	static boolean sonPares(ArrayList<Integer> mi_lista)
	{
		int pares=0;//se declara la variable y se inicializa en cero 
		for(int m = 0; m < mi_lista.size(); m++)//se inicia el ciclo for 
		{
			if (mi_lista.get(m)%2==0)//se evalua si el residuo de los numeros contenidos en la lista es igual a cero 
			{
				pares ++;//se aumenta la cantidad de la vaiable pares 
			}
			if(pares==mi_lista.size()){//se evalua si la variable pares es igual al tamaño de mi_lista
				return true;//devuelve verdaderos
			}
		}
		return false;//devuelve falso
		//atributo a https://github.com/KevinLanza/Progra2Examen2/blob/master/src/Ejercicios.java
	}
	
	//Devuelve el numero menor almacenado en 'mi_lista'
	static int getMenor(ArrayList<Integer> mi_lista)
	{
		int menor=mi_lista.get(0);//se declara la variable para evaluar cual es el menor
		for(int m = 0; m < mi_lista.size(); m++)//se inicia el ciclo for 
		{
			if (mi_lista.get(m)<menor)//se evalua si el valor obtenido en la lista es menor que el valor de la variable menor
			{
				menor = mi_lista.get(m);// se iguala la variable menor con el valor obtenido en la lista
			}
		}
		return menor;//devuelve la variable menor
		//atributo a https://github.com/KevinLanza/Progra2Examen2/blob/master/src/Ejercicios.java
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	static int getNumeroMayor(String nombre_archivo)
	{
		//este ejercicio esta corregido con la correcion de mi examen en http://pastebin.com/dtdtuk3S
		int mayor=0;//declaramos la variable mayor
        try {//intenta
               
                Scanner s= new Scanner (new File(nombre_archivo));//creamos el scanner que buscara los datos del archivo
       
                while(s.hasNext()){//iniciamos el ciclo
                        int num=s.nextInt();//revisa cada  linea del archivo
                        if(num>mayor)//evalua si num es mayor que la variable mayor
                                mayor=num;//iguala las variables
                }      
                System.out.print("el mayor es: " +mayor);//imprime el numero mayor
        }catch (Exception e){//atrapa los errores
                e.printStackTrace();//imprime los errores
        }
        return mayor;//devuelve el mayor
        }
	
	
	//Devuelve cuantas veces existe la string buscada en el archivo con nombre nombre_archivo
	static int cuantasVecesExiste(String nombre_archivo, String buscada)
	{
		int existe=0;//se declara la variable existe y se inicializa 
		try{
			
			Scanner s= new Scanner (new File(nombre_archivo));// se coloca el escaner que permitira ingresar datos 
			while(s.hasNext()){// se inicia el while leyendo los datos que estan en el archivo
			
			if(s.next().equals(buscada))//se evalua si el escaner es igual que el contenido de la variable buscada, esta linea la copie de la correccion hecha a alex fabian en http://pastebin.com/ysRAkkdU
				existe ++;// se aumenta la cantidad de la variable existe
			}
		}catch(Exception e){//atrapa cualquier error
		e.printStackTrace();//imprime el error
		}
		
		return existe;//devuelve la variable existe 
	}
}


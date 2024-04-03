# PARCIAL PRACTICO 2 TERCIO

Este parcial presenta un prototipo de sistema de microservicios diseñado para abordar funciones numéricas clave: la factorización de números enteros y la identificación de números primos. La factorización de números enteros, un problema computacionalmente complejo sin algoritmos clásicos eficientes conocidos, es esencial en la criptografía clásica, ya que la seguridad de muchos algoritmos se basa en la dificultad de factorizar números grandes. Utilizando tecnologías como Maven para la gestión de dependencias, Git y GitHub para el control de versiones y colaboración, SparkJava para la construcción de aplicaciones web rápidas y escalables, junto con HTML5 y JavaScript para la interfaz de usuario, este sistema proporciona una plataforma para investigar y comprender la descomposición de números enteros en sus factores primos, así como para determinar si un número dado es primo, aspecto crucial en la teoría de números y aplicaciones de seguridad informática. El despliegue en tres máquinas virtuales de EC2 de AWS garantiza la disponibilidad y escalabilidad del sistema, permitiendo que múltiples usuarios accedan a estas funcionalidades numéricas esenciales.

## Empezando

El proyecto contiene las siguientes clases:
- [Factors](https://github.com/MPulidoM/Parcial2_AREP/blob/main/src/main/java/edu/eci/arep/Factors.java) Que realiza las operaciones de acuerdo a sacar los factores, teniendo en cuenta que Todos los números tienen 1 como factor, además, para verificar si un número es factor de otro basta con comprobar su módulo y examinar los números hasta n/2, incluyendo al propio n.
-  [Primes](https://github.com/MPulidoM/Parcial2_AREP/blob/main/src/main/java/edu/eci/arep/Primes.java) Que realiza las operaciones de acuerdo a sacar los primos, teniendo en cuenta que un número es primo si únicamente es divisible por 1 y por sí mismo, lo que implica que su conjunto de factores tiene un tamaño de 2.
-  [MathServer](https://github.com/MPulidoM/Parcial2_AREP/blob/main/src/main/java/edu/eci/arep/MathServer.java) Implementa un servidor web utilizando SparkJava que responde a solicitudes GET para calcular los factores y números primos de un número entero dado.

## Requisitos previos

[Maven](https://maven.apache.org/) : Con esta herramienta se creo la estructura del proyecto y se manejan las dependencias que se necesitan

[Git](https://git-scm.com/) : Se basa en un sistema de control de versiones distribuido, donde cada desarrollador tiene una copia completa del historial del proyecto.

Para asegurar una correcta instalación de Maven, es crucial confirmar que la versión del JDK de Java sea compatible. Si el JDK no está actualizado, la instalación de las versiones actuales de Maven podría fallar, generando problemas durante el uso de la herramienta.
```
java -version 
```

## Arquitectura
Este proyecto consta de tres clases, Factors, Primes y MathServer, que trabajan juntas para proporcionar una API para calcular los factores y números primos de un entero determinado. La clase MathServer es el punto de entrada de la aplicación y configura los puntos finales de la API utilizando el marco Spark. Incluye dos rutas principales: una para calcular los factores y otra para calcular los números primos. La clase Factors es responsable de calcular los factores de un número entero dado, y la clase Primes calcula los números primos hasta un número entero dado. El método MakeFactors de la clase Factors devuelve una ArrayList de factores, mientras que el método MakePrimes de la clase Primes devuelve una ArrayList de números primos. La clase MathServer utiliza estos métodos para devolver respuestas JSON para los puntos finales de la API.



## Instalando

Debemos clonar el repositorio:
```
git clone https://github.com/MPulidoM/Parcial2_AREP.git
```
Se accede al directorio del proyecto:
```
cd Parcial2_AREP
```
![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/a612a531-d6ef-490f-9869-a2e17878255e)

Damos el siguiente comando de Maven:
```
mvn clean install
```
Se corre la clase de MathServer (; Windows - : Linux)
```
 java -cp "target/classes;target/dependency/*" edu.eci.arep.MathServer
```
![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/cf827730-de73-4c1f-8dfb-423bbcd7acb6)

Después debemos entrar a las siguientes rutas:

Para ver el funcionamiento de **Factores**
```
http://localhost:4567/factors?value="Numero entero positivo"
```
Para ver el funcionamiento de **Primos**
```
http://localhost:4567/primes?value="Numero entero positivo"
```

## Pruebas - Local

**FACTORES**

![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/c4ee943f-f978-46ae-8c91-4b7d4b86e115)

![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/0ca3c91b-f556-4cec-b567-ab230a950d5c)

**PRIMOS**

![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/977967a9-99b0-455c-b493-ea40e30b5464)


## AWS

- Se ven las instancias en ejecución
  
![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/d0bb724c-a34d-4e04-a6e3-cd3cf86fc780)


--> Conexión con la Instancia:

  ![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/2ec4ba5e-fc6b-44ff-864e-210855949117)
  ![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/314770b3-0b96-4d5b-8afb-9edc9534ece4)
  ![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/0ff68728-27c2-4542-8b9f-14ea37bd8c05)

- Se dan los siguientes comandos después de haber conectado con la máquina, esto lo realizamos desde la página de AWS:

  Instalar lo necesario para correr el Repositorio:

  ```
    sudo yum install java
  ```
  
  ```
    sudo yum install maven
  ```
  ```
    sudo yum install git
  ```
  
 Con lo anterior ya instalado hacemos lo siguiente:
 
 Debemos clonar el repositorio:
   ```
   git clone https://github.com/MPulidoM/Parcial2_AREP.git
   ```
 Se accede al directorio del proyecto:
   ```
   cd Parcial2_AREP
   ```
 Damos el siguiente comando de Maven:
   ```
   mvn clean install
   ```
Se corre la clase de MathServer (; Windows - : Linux)
  ```
   java -cp "target/classes:target/dependency/*" edu.eci.arep.MathServer
  ```
**Pruebas - AWS**

Se ve corriendo en las instancias el repositorio clonado:

![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/66198177-a7d6-4fde-91f3-584aecb9c4f0)

![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/db7e234e-4a05-4371-b368-977398359638)

![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/aff8c99d-f943-4c39-9a78-fdc0822fe28f)


**FACTORES**

![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/c6a41477-1a84-4a7f-8f9c-ad705c2d98a5)

**PRIMOS**

![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/44761ba9-12c3-4fe6-9dc2-10dab8ce6bcb)

**Despliegue AWS**

En las pruebas realizadas se tuvieron los siguientes links , en los valores dados son los usados en los ejemplos:

-   miprimerservidor:
```
 http://ec2-3-84-246-196.compute-1.amazonaws.com:4567/factors?value=112
```
- Instancia2:
```
http://ec2-52-90-30-179.compute-1.amazonaws.com:4567/primes?value=100
```
- Instancia3:
```
 http://ec2-54-208-25-106.compute-1.amazonaws.com:4567/factors?value=15
```
  [VIDEO DESPLIEGUE AWS](https://www.youtube.com/watch?v=GtwvFoHSRJQ)


## Autores

* **Mariana Pulido Moreno** - *Arep 101* - [MPulidoM](https://github.com/MPulidoM)

## Construido con

* [Maven](https://maven.apache.org/) - Gestión de dependencias
* [Java](https://www.java.com/es/) - Lenguaje Utilizado
* [GitHub](https://git-scm.com/) - Control de Versiones
* [AWS](https://awsacademy.instructure.com/courses/58453/modules/items/5197637) - Despliegue







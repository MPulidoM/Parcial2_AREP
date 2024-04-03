# Parcial2_AREP

- La factorización de números enteros es un problema complejo para el cual no se conocen algoritmos clásicos eficientes. La criptografía clásica está soportada en la dificultad para encontrar los factores primos de números grandes.
Diseñe, construya y despliegue un aplicación web para investigar los factores de números enteros y los números primos. El programa debe estar desplegado en tres máquinas virtuales de EC2 de AWS como se describe abajo. Las tecnologías usadas en la solución deben ser maven, git, github, sparkjava, html5, y js. No use liberías adicionales.

- PROBLEMA:
Diseñe un prototipo de sistema de microservicios que tenga un servicio servicio de las funciones numéricas


FACTORES:
- 1 es un factor de todos los números
- De ahí en adelante simplemente mirando el módulo puede verificar si es o no factor.
- Puede mirar todos los numeros hasta n/2
- n pertenece también a los factores.


PRIMOS: 
- 1 es un número primo
- De ahí en adelante recuerde que un número es primo si solo es divisible por 1 y por si mismo.
- Es decir un número es primo si el tamaño del conjunto de factores es 2.


Autor: Mariana Pulido Moreno 

# CORRERLO DE MANERA lOCAL

Clonamos el Repositorio
```
git clone https://github.com/MPulidoM/Parcial2_AREP.git
```
Nos dirigimos al directorio del Proyecto
```
cd Parcial2_AREP
```
![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/a612a531-d6ef-490f-9869-a2e17878255e)

Ahora damos el siguiente comando de Maven 
```
mvn clean install
```
Y damos el siguiente comando para ver el funcionamiento(; Windows - : Linux)
```
 java -cp "target/classes;target/dependency/*" edu.eci.arep.MathServer
```
![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/cf827730-de73-4c1f-8dfb-423bbcd7acb6)

Se debe entrar al siguiente link

Para ver el funcionamiento de **Factores**
```
http://localhost:4567/factors?value="Numero entero positivo"
```
Para ver el funcionamiento de **Primos**
```
http://localhost:4567/primes?value="Numero entero positivo"
```

# FUNCIONAMIENTO

FACTORES

![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/c4ee943f-f978-46ae-8c91-4b7d4b86e115)

![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/0ca3c91b-f556-4cec-b567-ab230a950d5c)

PRIMOS
![image](https://github.com/MPulidoM/Parcial2_AREP/assets/118181543/977967a9-99b0-455c-b493-ea40e30b5464)



AWS






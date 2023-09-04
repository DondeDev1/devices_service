# Devices MicroService

# Integraciones

Este proyecto esta cimentado sobre el proyecto  [QUARKUS](https://es.quarkus.io/). El cual es la base del servicio y esta complementado por librerias como Panache,Hibernate, RestEasy ... entre otros. 

## Ejecucion del proyecto

Para correr el proyecto de forma local basta con compilarlo 

> mvn clean package

Esto generara un archivo jar dentro del modulo de entrada, el cual es la carpeta **Bootstrap**, para ejecutar el servicio basta con localizar el archivo bootstrap-1.0-SNAPSHOT-runner.jar  dentro de la carpeta target y ejecutarlo de la siguiente manera.

> java -jar ./bootstrap-1.0-SNAPSHOT-runner.jar

## Configuracion

La configuracion del servidor de quarkus se aloja dentro de el archivo /bootstrap/src/main/resources/application.properties

## Estructura

El microservicio sigue una estructura [Hexagonal](https://en.wikipedia.org/wiki/Hexagonal_architecture_(software)) y consta de 4 modulo, domain es la capa de dominio, application la capa de aplicacion o adaptadores y framework que conforma la capa de infraestructura o de puertos.

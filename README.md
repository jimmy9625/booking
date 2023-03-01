# booking

La API Restful-Booker es un servicio web que proporciona una plataforma para reservar y gestionar reservas de habitaciones de hotel. Esta API se encuentra alojada en el sitio web https://restful-booker.herokuapp.com y está disponible para ser utilizada por cualquier aplicación que desee integrar sus funcionalidades

# Documentación
La documentación de la API Restful-Booker está disponible en la página web https://restful-booker.herokuapp.com/apidoc/index.html. En esta página, se detallan los diferentes endpoints disponibles, así como los parámetros que se pueden utilizar en cada uno de ellos. La documentación también proporciona información sobre los códigos de estado HTTP que pueden ser devueltos por el servicio y las respuestas que se pueden esperar de cada endpoint.

# Pruebas Automatizadas
Este repositorio contiene pruebas automatizadas para realizar pruebas de integración de API. Las pruebas automatizadas utilizan el patrón de diseño Screenplay para organizar los pasos de las pruebas.

Requerimientos
Antes de poder ejecutar las pruebas, es necesario tener instalado en el equipo lo siguiente:

* JDK 8 o superior
* Gradle

# Dependencias
Este proyecto utiliza Gradle como gestor de dependencias. Las dependencias utilizadas son las siguientes:

* Screenplay
* Serenity
* RestAssured
* JUnit
* Gson

# Instrucciones de uso
* 1 Clone el repositorio de Github:
  git clone https://github.com/tu_usuario/tu_repositorio.git
* 2 Instale las dependencias del proyecto:

     cd tu_repositorio
  
    ./gradlew build
    
 * 3 Ejecute las pruebas automatizadas:
   ./gradlew test

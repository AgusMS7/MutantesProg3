🧬 Mutant Detection API
📖 Descripción
Esta API permite analizar secuencias de ADN para determinar si un individuo es mutante o humano, utilizando una serie de patrones establecidos. La API está diseñada siguiendo los criterios de Magneto y permite procesar solicitudes tanto en producción como localmente.

🌍 URL de Producción
La API está actualmente desplegada en Render y puedes acceder a sus funcionalidades a través de los siguientes enlaces:

API Principal: https://mutantesprog3.onrender.com
Documentación Interactiva (Swagger UI): https://mutantesprog3.onrender.com/swagger-ui/index.html
Puedes realizar solicitudes de prueba utilizando herramientas como Postman o cURL.

Endpoints principales:
POST: Detectar mutante
URL: https://mutantesprog3.onrender.com/mutant
Ejemplo de body para POST:
json
Copiar código
{
  "dna": ["ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"]
}
GET: Obtener estadísticas de ADN
URL: https://mutantesprog3.onrender.com/stats
⚙️ Tecnologías Utilizadas:
Java 17
Spring Boot
Gradle
Hibernate
H2 Database
OpenAPI (Swagger UI)
Render (Deployment)
🛠️ Cómo ejecutar el proyecto localmente:
1. Clonar el repositorio:
Primero, debes clonar el repositorio en tu máquina local:

bash
Copiar código
git clone https://github.com/ambargorgon/mutantes-apirest
cd mutantes-apirest
2. Ejecutar la aplicación:
Para iniciar el proyecto, debes ejecutar la clase principal MutantesProg3Application utilizando tu IDE o desde la línea de comandos con Gradle.

bash
Copiar código
./gradlew bootRun
3. Acceso local a la API:
Una vez que la aplicación esté ejecutándose localmente, podrás interactuar con los siguientes endpoints:

Swagger UI: http://localhost:8080/swagger-ui/index.html
POST (Detección de Mutantes): http://localhost:8080/mutant
GET (Estadísticas de ADN): http://localhost:8080/stats
4. Acceso a la base de datos H2:
Puedes acceder a la consola de la base de datos H2 en http://localhost:8080/h2-console/. Los detalles de conexión (usuario, contraseña, URL JDBC) están configurados en el archivo application.properties.

🧑‍💻 Endpoints de la API:
Ruta	Método	Descripción
/mutant	POST	Detecta si un ADN pertenece a un mutante
/stats	GET	Muestra estadísticas sobre ADN almacenado
🧬 Endpoint /mutant/ (POST)
Este endpoint permite analizar una secuencia de ADN para determinar si pertenece a un mutante. El cuerpo de la solicitud debe ser un JSON con el siguiente formato:

Formato de Solicitud:
Clave dna: Arreglo de strings, donde cada string representa una fila de la matriz de ADN.
Restricciones:
Matriz NxN: El número de filas y columnas debe ser el mismo.
Tamaño mínimo: 4x4.
Bases Nitrogenadas Válidas: Cada string debe contener solo las letras A, T, C, o G.
Respuestas:
200 OK: Si el ADN pertenece a un mutante.
403 Forbidden: Si el ADN no pertenece a un mutante.
400 Bad Request: Si la entrada no cumple con las restricciones.
📊 Endpoint /stats/ (GET)
Este endpoint proporciona estadísticas de las secuencias de ADN almacenadas en la base de datos, incluyendo:

La cantidad de mutantes y humanos analizados.
La proporción entre mutantes y humanos.
🧪 Pruebas Unitarias e Integración
La API incluye pruebas unitarias y de integración para asegurar su correcto funcionamiento. Estas pruebas se encuentran en la carpeta src/test/java/com/example/mutantes/.

Puedes ejecutar las pruebas mediante Gradle:

bash
Copiar código
./gradlew test
Las pruebas incluyen la validación de:

Servicios (MutantServiceTest)
Respuestas de la API para distintos casos de ADN.
✨ Extras:
Consola H2: Acceso a la base de datos en memoria H2.
OpenAPI: Documentación interactiva con Swagger UI.
Desarrollado por Agustín Sandoval.

Link del proyecto en producción: https://mutantesprog3.onrender.com

🧬 Mutant Detection API
📖 Descripción
API que detecta si una secuencia de ADN pertenece a un mutante o a un humano, utilizando patrones establecidos.

🌍 URL de Producción
API Principal: https://mutantesprog3.onrender.com
Swagger UI: https://mutantesprog3.onrender.com/swagger-ui/index.html
Ejemplos:
POST: Detectar mutante
URL: /mutant
Body:
json
Copiar código
{
  "dna": ["ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"]
}
GET: Obtener estadísticas de ADN
URL: /stats
⚙️ Tecnologías
Java 17
Spring Boot
Gradle
H2 Database
Render
🛠️ Cómo ejecutar localmente:
Clonar el repositorio:

bash
Copiar código
git clone https://github.com/ambargorgon/mutantes-apirest
cd mutantes-apirest
Ejecutar la aplicación:

bash
Copiar código
./gradlew bootRun
Acceder a la API localmente:

Swagger UI: http://localhost:8080/swagger-ui/index.html
POST Mutant: http://localhost:8080/mutant
GET Stats: http://localhost:8080/stats
Base de datos H2: http://localhost:8080/h2-console/
🧪 Pruebas
Las pruebas unitarias e integración se pueden ejecutar con:

bash
Copiar código
./gradlew test
Desarrollado por Agustín Sandoval
https://mutantesprog3.onrender.com

# 🧬 Mutant Detection API

## 📖 Descripción
API que detecta si una secuencia de ADN pertenece a un mutante o a un humano, utilizando patrones establecidos.

## 🌍 URL de Producción
- **API Principal**: [https://mutantesprog3.onrender.com](https://mutantesprog3.onrender.com)
- **Swagger UI**: [https://mutantesprog3.onrender.com/swagger-ui/index.html](https://mutantesprog3.onrender.com/swagger-ui/index.html)

### Ejemplos:
- **POST**: Detectar mutante  
  URL: `/mutant`  
  Body:
    ```json
    {
      "dna": ["ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"]
    }
    ```
- **GET**: Obtener estadísticas de ADN  
  URL: `/stats`

## ⚙️ Tecnologías
- Java 17
- Spring Boot
- Gradle
- H2 Database
- Render

## 🛠️ Cómo ejecutar localmente:
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/ambargorgon/mutantes-apirest
   cd mutantes-apirest
2. Ejecutar la aplicación:
   ```bash
   ./gradlew bootRun
##🧪 Pruebas
Las pruebas unitarias e integración se pueden ejecutar con:

  ./gradlew test

Desarrollado por Agustín Sandoval
https://mutantesprog3.onrender.com

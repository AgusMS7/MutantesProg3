🦸‍♂️ Detección de Mutantes API
¡Bienvenido a la API de Detección de Mutantes! Este proyecto te permite verificar si una secuencia de ADN pertenece a un mutante o no. 🌱

🌍 Enlace de la API
Puedes acceder a la API desplegada en Render en el siguiente enlace: https://mutantesprog3.onrender.com

🛠️ Cómo Usar la API
1. Verificar si un ADN es Mutante
Para verificar si una secuencia de ADN corresponde a un mutante, puedes hacer una solicitud POST a la siguiente ruta:

bash
Copiar código
POST /mutant
Ejemplo de Solicitud
Envía un JSON con la secuencia de ADN en el cuerpo de la solicitud. Aquí tienes un ejemplo:

json
Copiar código
{
  "dna": [
    "ATGCGA",
    "CAGTGC",
    "TTATGT",
    "AGAAGG",
    "CCCCTA",
    "TCACTG"
  ]
}
Respuesta Exitosa
Si la secuencia pertenece a un mutante, recibirás una respuesta con código HTTP 200:

json
Copiar código
{
  "isMutant": true
}
Respuesta No Exitosa
Si la secuencia no pertenece a un mutante, recibirás un código HTTP 403:

json
Copiar código
{
  "isMutant": false
}
2. Estadísticas de Mutantes
También puedes obtener estadísticas sobre los ADN verificados haciendo una solicitud GET a:

bash
Copiar código
GET /stats
Esto te dará un resumen de cuántos ADN mutantes y humanos se han verificado. 📊

🚀 Prerequisitos
Antes de usar la API, asegúrate de tener:

Un cliente HTTP como Postman para enviar solicitudes.

👨‍💻 Autor
Agustín Sandoval

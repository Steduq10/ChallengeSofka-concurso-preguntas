# ChallengeSofka-concurso-preguntas
El programa se desarrolló con Java con gradle. En este proyecto se desarrolla la simulación de un concurso de preguntas en donde el jugador deberá responder una serie de preguntas y 
avanzar en distintos niveles o categorias para ganar fabulosos premios. El juego consta de 5 categorias en la que se incluyen 5 preguntas
en cada una de ellas; el juego elige de forma aleatoria una de ellas para que el jugador responda de forma correcta y avance al siguiente
nivel. El jugador deberá responder todas las preguntas de forma correcta para poder llevarse el premio mayor. Si el jugador responde
cualquiera de las preguntas incorrectamente pierde y no gana ningún premio. Si el jugador decide retirarse del juego se lleva el premio
acumulado que lleva hasta el momento.

Para el desarrollo del programa se realizó lo siguiente:
1. Se creó un paquete domain, que incluye las clases Jugador, Pregunta, Premio, Ronda y un paquete Category.
- En la clase Pregunta, se listaron las preguntas agrupadas de a 5, en 5 distintos métodos.
- En la clase Ronda, se configuró la función que selecciona de forma aleatoria una de las preguntas de acuerdo a la categoria.
- En el paquete category, se incluyen las clases de Categoria1, Categoria2, Categoria3, Categoria4 y Categoria5.
  En cada una de las categorias se configura el comportamiento del código dependiendo de la respuesta del jugador a las preguntas que
  se le realizan.
- En la clase Premio, por medio de enum se establecen los premios a recibir por el jugador en cada uno de los niveles alcanzados.
- En la clase Jugador, se definen los métodos y las funciones que almacenan los atributos de nombre, resultado y acumulado del jugador.
2. Se creó el paquete exceptions, que incluye las clases para el manejo de excepciones que puedan ocurrir en el programa y evitar que este
   se cierre de forma abrupta.
3. Se creo el paquete accesoDatos, se define la interface IAccesoDatos y su implementación AccesoDatosImpl. Aquí se establecen los métodos
   de crearArchivo, escribirArchivo, listar, crear, borrar y existe, necesarios para la persistencia de datos.
4. Se crea la capa bussiness, con la interface y su implementación que definen la funcionalidad de los métodos de listar, iniciarHistorial
 y agregarJugador.
6. Por último se crea la capa view que incluye la clase Concurso, en la cual se ejecuta el programa.

El historial del concurso de preguntas se almacena en un archivo txt llamado historial.txt

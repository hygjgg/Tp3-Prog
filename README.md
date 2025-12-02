ANÁLISIS COMPARATIVO

1. ¿Cuándo es mejor usar una Pila y cuándo una Cola?

Las Pilas (Stacks) siguen el principio LIFO (“Last In, First Out”), donde el último elemento en entrar es el primero en salir.
Son ideales para situaciones donde la estructura debe recordar el “último estado”, permitiendo operaciones como deshacer acciones, volver atrás, o resolver tareas en orden inverso al que llegaron.
Las pilas resultan especialmente útiles en algoritmos como análisis de expresiones, llamados recursivos, navegadores web (botón “atrás”) y control de versiones.

Las Colas (Queues) siguen el principio FIFO (“First In, First Out”), donde el primer elemento en entrar es el primero en salir.
Son perfectas cuando se busca equidad en el orden de procesamiento, tal como ocurre en filas de atención, procesamiento de solicitudes o programación de tareas por orden de llegada.
Son ideales para sistemas de turnos, administración de recursos, scheduling en sistemas operativos o mensajería con prioridad temporal.

Resumen general:

Pila: se usa cuando lo más reciente es lo más importante.

Cola: se usa cuando lo primero que llega debe ser lo primero procesado.



---

2. Ventajas de implementar Pilas y Colas con Listas Enlazadas vs. Arrays

 Ventajas de Listas Enlazadas

Tamaño dinámico: no requieren reservar memoria fija ni preocuparse por desbordes del arreglo.

Inserción y eliminación eficientes: agregar o quitar elementos al principio o al final es O(1).

No hace falta redimensionar: evita operaciones costosas como copiar arreglos enteros al crecer.


 Ventajas de Arrays

Acceso aleatorio rápido (O(1)) a cualquier posición.

Mejor aprovechamiento de caché y memoria contigua.


 Por qué Listas Enlazadas son mejores en este TP

Las Pilas y Colas piden trabajar principalmente con:

insertar al inicio o al final,

quitar del inicio,

no acceder a posiciones aleatorias.


Las listas enlazadas son ideales para estas operaciones ya que son O(1), mientras que con arrays habría riesgo de:

quedarse sin espacio,

tener que redimensionar,

desplazar elementos al insertar o eliminar.


Por eso, para Pilas y Colas básicas, las listas enlazadas son más eficientes y elegantes que los arrays.


---

3. Ejemplos del mundo real donde se usan Pilas y Colas

Ejemplos de Pilas (LIFO):

Deshacer cambios en editores de texto o IDEs.

Historial de navegación: última página visitada es la primera en volver.

Llamadas recursivas: la estructura de ejecución de una función recursiva es una pila.

Procesamiento de expresiones matemáticas, por ejemplo, con notación postfija.


Ejemplos de Colas (FIFO):

Líneas de espera reales: supermercados, bancos, pasajes.

Planificación de procesos en sistemas operativos (round robin).

Mensajes en servidores: la primera solicitud recibida es la primera atendida.

Turnos de atención para consultas, como el caso del TP.

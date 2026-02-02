SpeedFast – Semana 4
Descripción

Proyecto de la Semana 4 que simula un sistema de entregas concurrentes para la empresa SpeedFast.
Cada repartidor se ejecuta como un hilo independiente utilizando programación concurrente en Java, procesando pedidos de forma simultánea y mostrando el avance por consola.

Funcionamiento

Se utilizan pedidos de tipo Comida, Encomienda y Express.

Cada Repartidor implementa Runnable.

La clase Main ejecuta los repartidores en paralelo mediante ExecutorService.

Se simulan tiempos de entrega con pausas aleatorias.

Estructura del proyecto
speedfast/
├── interfaces/
├── pedidos/
├── concurrencia/
└── Main.java

Ejecución

Abrir el proyecto en IntelliJ IDEA.

Ejecutar la clase Main.

Observar la simulación de entregas concurrentes en la consola.

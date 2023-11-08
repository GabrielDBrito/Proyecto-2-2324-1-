# Proyecto-2-2324-1-

Implemente en Java un programa que simule una cola de impresión utilizando el TDA  Montículo Binario.  Las primitivas de este tipo de datos abstracto son: insertar y eliminar_min.

	A continuación los requerimientos de la solución:
El programa debe poseer una interfaz gráfica.
El programa permitirá agregar un usuario en la simulación, el cual tendrá un identificador (nombre de usuario) y un tipo. Cada tipo de usuario se le asignará un nivel de prioridad que podría ser utilizado para disminuir los tiempos de espera de los documentos que este envíe a la cola de impresión.
El programa deberá ofrecer la posibilidad de cargar a los usuarios desde un archivo “.CSV”
	El formato del archivo debe ser como se indica a continuación: 
usuario, tipo
Jperez, prioridad_alta
m_himiot_alfaro, prioridad_media
yurdaneta_1, prioridad_baja
…


- El sistema operativo ofrecerá la funcionalidad de eliminar un usuario, lo que implicará la eliminación de sus documentos creados, pero no de los que ya estén en la cola de impresión.
- Por cada usuario se pueden crear documentos. Un usuario puede tener varios documentos creados de manera que, en un momento dado, se puede seleccionar uno de ellos y mandarlo a imprimir. Por cada documento se conoce el nombre, tamaño y tipo. 
- Cuando un documento es enviado a la cola de impresión (cola de prioridad), es decir, se manda a imprimir, se crea un registro con los datos del documento y una etiqueta que guarda el tiempo transcurrido desde el inicio de la simulación. Cuando un documento se manda a imprimir, se puede indicar si es prioritario o no. Si no es prioritario, entonces el mismo es agregado a la cola de impresión en función del tiempo medido por el reloj. Si es prioritario, entonces la etiqueta del tiempo es alterada en función del tipo de usuario y, por lo tanto, agregado a la cola en función del valor obtenido tras la aplicación de la prioridad sobre la etiqueta de tiempo generada por el reloj. Tome en cuenta que el registro agregado (encolado) a la cola de impresión no tiene información sobre el propietario del documento. - Agregar a la cola de impresión es equivalente a la primitiva insertar del TDA montículo binario, lo cual implica que se deben cumplir con las restricciones que se imponen en este TDA a la hora de insertar un elemento.
- En todo momento se podrán observar los usuarios creados y por cada usuario se podrán observar sus documentos creados. Además, se podrán diferenciar aquellos que estén en la cola de impresión de los que aún no han sido enviados a la cola de impresión.
- Un usuario podrá eliminar un documento que aún no ha sido enviado a la cola de impresión.
- En todo momento se podrá observar la cola de impresión, para lo cual, se dispondrán de dos vistas, en la primera, se verá la cola como una simple secuencia de registros correspondientes a los documentos agregados a la cola de impresión y en la otra se podrá ver la cola como una estructura de árbol.
- El sistema operativo necesitará de un reloj que mida el tiempo desde la inicialización de la simulación.
- El sistema operativo deberá proporcionar funcionalidades que permita controlar la cola de impresión. Para eso se necesitarán las funciones:
- Liberar impresora: que simulará el avance en la cola de impresión, es decir, se toma el elemento que tiene la etiqueta de tiempo más pequeña, se desencola y se “imprime”. No pierda de vista que esta operación es equivalente a eliminar_min del Montículo binario.
- Eliminar un documento de la cola. Es decir, se especifica el usuario  y se procede a lo propio. A este respecto, se debe tomar en cuenta que no existe la primitiva ELIMINAR en los montículos binarios, por lo que el proceso de eliminación consistirá en cambiar la etiqueta de tiempo del registro correspondiente, de forma que sea el de menor prioridad en la cola, por lo tanto, debe ser movido al inicio de la cola y luego eliminado de la cola, pero sin haber sido impreso, lo que es equivalente a la primitiva eliminar_min de un montículo binario.
- Un aspecto muy importante es que la cola de impresión no guarda información referente a los propietarios de los documentos que contiene, de manera que esto es una dificultad a la hora de mandar a eliminar un documento. La manera de solventar esto es utilizar una tabla de dispersión (puede consultar la siguiente fuente como punto de partida para comprender el mecanismo de las tablas de dispersión) en la que se registre la información de cada usuario que ha enviado un documento a la cola de impresión, el lugar que ocupa el documento en la cola (etiqueta de tiempo), así como la información propia del documento. Es imperativo que la búsqueda de un usuario tenga una complejidad lo más cercana a O(1), lo cual puede ser logrado precisamente con la aplicación de las tablas de dispersión. Por otra parte, es importante recalcar que no se puede buscar (recorrer) en un montículo, pues este debe cumplir con las restricciones de una cola, aunque adopte la estructura de un árbol. 

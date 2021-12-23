# Swing_P02_compendio
***
La práctica consiste en una interfaz gráfica, que permite gestionar una plataforma de pisos de alquiler turísticos, siguiendo los  estándares básicos de usabilidad.
***
La publicación contiene: 
  -
1. Un directorio llamado desarrollo en el que incluyo el directorio del proyecto de la práctica.  
2. Un directorio llamado ejecutable donde incluyo el ejecutable de la aplicación.  
3. Un directorio llamado documentación técnica donde incluyo el javadoc de la aplicación.  
4. Un directorio llamado documentos donde incluyo el documento sobre usabilidad.  
5. Un documento README.md  
***
Desarrollo del proyecto:  
  - 
1. Cree el proyecto en eclipse.
2. Cree el main la ventana principal y la ventana de dialogo.
3. Busqué una paleta de colores y las imagenes que iba a usar para los botones.  
1. La ventana principal:
    - Hice el menu de la ventana principal junto con su funcionalidad.
    - Añadí dos botones a la ventana principal para dar de alta y de baja un piso.
    - Hice la fncionalidad de la ventana.
1. La ventana de dialogo:
    - Cree cuato paneles auxiliares (manteniendo la paleta de colores elegida).
        1. El titulo
            - Solo contiene el mombre de la empresa.
        2. Para los datos del arrendador
            - Contiene los campos: nombre, apellidos, DNI y telefono.
        3. Para los datos del apartamento
            - Es un gridlayout
            - Tiene varios paneles auxiliares para ordenar los componentes y distinta funcionalidades dependiendo de que se vaya haciendo.
        4. Para escribir esos datos
            - Son dos paneles unidos por un JTabbedPane.
            - Cada panel tiene un JTextArea para poder escribir los datos. 
    - Los añadí a la ventana de dialogo.
    - Añadí 3 botones a la parte inferior.
        1. Imprimir 
            - Escribe los datos del panel del arrendador y del panel del apartamento en el panel de los datos.
        2. Nuevo
            - Limpia la ventana entera.
        4. Guardar
            - Muestra un mensaje si se han completado todos los campos o no.
***
Despliegue
  - 
 
 - Windows: Para ejecutar la aplicación lo unico que hay que hacer es hacer doble click en la carpeta que se llama `ejecutable` y una vez ahi hacer doble click de nuevo en el archivo que se llama `swing_c_p02_plazaGuiradoPaula.jar`.
 - Línea de comandos: Para ejecutar la aplicación lo que hay que hacer es abrir la linea de comandos desde la carpeta así que hay que hacer es hacer doble click en la carpeta que se llama `ejecutable` y escribir donde se encuetra la ruta `cmd` y darle al intro una vez abierto la linea de comandos en el directorio escribimos `java -jar swing_c_p02_plazaGuiradoPaula.jar` le damos al intro otra vez y se nos ejecutará el proyecto.
***
Construido
  - 
Construido con java en eclipse.
***
Versionado
  - 
1.0
***
Autores
  - 
Paula Plaza Guirado.
***
Licencia
  - 
De uso libre.
***
Recursos adicionales
  - 
[Link](https://github.com/Paupg02/Swing_P02_compendio) a GitHub.
***

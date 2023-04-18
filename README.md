# Challenge ONE | Java | Back-end | Hotel Alura

<p align="center" >
     <img width="300" heigth="300" src="https://user-images.githubusercontent.com/91544872/189419040-c093db78-c970-4960-8aca-ffcc11f7ffaf.png">
</p>

---
## 🖥️ Tecnologías Utilizadas:

- Java
- Excepciones (try-catch)
- Eclipse
- Biblioteca JCalendar
- MySql
- Plugin WindowBuilder </br>

---
## ⚠️ Importante! ⚠️

☕ Use Java versión 8 o superior para compatibilidad. </br></br>
📝 Se realizaron las validaciones pertinentes para evitar errores de usuario y almacenamiento de datos innecesarios

El proyecto inicia con esta interfaz, la cual al dar click sobre el icono de login se autoriza el ingreso
![imagen](https://user-images.githubusercontent.com/121052500/232880553-caf476e1-b329-4368-94cf-b332362a8a74.png)

En la siguiente ventana se presenta un formulario de ingreso, el cual tiene predeterminada el usuario "admin" y la contraseña "admin",

![imagen](https://user-images.githubusercontent.com/121052500/232880958-7130e8da-b865-4b4f-916e-bf8b3cfbd2bd.png)

En caso de que no desee ingresar con estos datos, se ofrece la posibilidad que el usuario registrado al igual que la contraseña sean almacenados mientras una
opcion de confirmacion

Si el usuario decide registrar usuario, la informacion se almacenara y podra ingresar con esta informacion

![imagen](https://user-images.githubusercontent.com/121052500/232881192-6a587dcf-ccf1-4cac-8617-35b8784dd541.png)

En esta ventana se da la bienvenida al proceso de Creacion, lectura, actualizacion y eliminacion de informacion.

![imagen](https://user-images.githubusercontent.com/121052500/232881386-f928d1d8-9624-4f0b-8671-a7bb72d2ae88.png)

Al dar click en "registro de reservas" se inicia el proceso de insercion de informacion para reservar en el hotel
![imagen](https://user-images.githubusercontent.com/121052500/232882679-f54c343a-53f8-427a-b4d5-d978dbaa8951.png)

En caso de no ingresar alguna informacion correspondiente en los campos, se arrojara un aviso de alerta de que hace falta informacion
![imagen](https://user-images.githubusercontent.com/121052500/232882840-3c1ea893-0c02-4d3f-a1fe-21ce5f42e4e9.png)

al ingresar los datos en la reserva se calcula automaticamente el valor de la estadia, al igual que se limita al usuario en caso de ingresar fechas erroneas al tratar de realizar cambios en la fecha de ingreso
![imagen](https://user-images.githubusercontent.com/121052500/232883116-601e327d-e5d0-4846-acdf-ee15683c9cc2.png)
![imagen](https://user-images.githubusercontent.com/121052500/232883194-a8570ea4-74d0-4723-86c3-69d63d73302b.png)

Una vez la informacion suministrada este correcta, se da paso al ingreso de informacion del huesped y se genera un mensaje con el numero de reserva
![imagen](https://user-images.githubusercontent.com/121052500/232883407-c8519f4c-8146-4aa0-9071-67a07bc27f28.png)

De igual forma al paso anterior, se realizan las validacion que los campos se encuentren totalmente diligenciados, en caso de devolverse a la ventana anterior o clickear en cerrar, el id de reserva es eliminado de la base de datos

![imagen](https://user-images.githubusercontent.com/121052500/232883831-610dc970-3277-4a5d-9f69-1505f4f1c091.png)
si la informacion se ingreso de manera adecuada se recibira este mensaje, confirmando que la informacion de la reserva y el huesped se almaceno correctamente en la base de datos
![imagen](https://user-images.githubusercontent.com/121052500/232883943-733dad96-7a17-4a19-8693-6e6602f86c87.png)

una vez tengamos un registro completo de nuestra reserva y huesped, podemos realizar consultas en la seccion Busqueda

![imagen](https://user-images.githubusercontent.com/121052500/232884194-957c7705-aea4-44d0-9bfd-11f2d13cf4d2.png)

En el campo de texto junto al boton buscar, podemos ingresar unicamente el id de reserva o el apellido, para ambos casos nos llenara los campos de reserva y huespedes
![imagen](https://user-images.githubusercontent.com/121052500/232884578-cf4909f4-0fcd-4f26-a887-4b5114b274ac.png)
![imagen](https://user-images.githubusercontent.com/121052500/232884621-2e7ac25c-3fdb-4775-b322-683b7e7f7460.png)

Se autoriza la modificacion de todos los parametros excepto el id de reserva y se actualizan en la base de datos luego de dar click en editar. en este caso modificaremos el telefono
Si la informacion se almacena correctamente se obtiene el siguiente mensaje
![imagen](https://user-images.githubusercontent.com/121052500/232885029-b65011a4-4c46-4911-b463-701ed5782096.png)

finalmente, existe la opcion de eliminar un registro. Si se elimina la informacion en huespedes, esta tambien sera eliminada en reservas
Cuando los datos se eliminan correctamente se obtiene el siguiente mensaje.

![imagen](https://user-images.githubusercontent.com/121052500/232885805-24d7c4a5-763b-48f4-b183-a6c333a48933.png)

💙 <strong>Linkedin</strong></br>
<a href="https://www.linkedin.com/in/daniel-betancur-giraldo-834291264/" target="_blank">
<img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>

💙 <strong>Insignia de culminacion</strong></br>
![imagen](https://user-images.githubusercontent.com/121052500/232895835-8567240b-3a4b-494e-ae40-995ea4337fd6.png)




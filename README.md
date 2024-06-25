# ARSW-Lab3

#### Calculadora Web con Spring MVC y Thymeleaf desplegada en AWS EC2

Este proyecto implementa una calculadora simple utilizando Spring MVC y Thymeleaf para la interfaz de usuario, desplegada en un servidor EC2 de Amazon Web Services (AWS).

### Arquitectura

El proyecto sigue una arquitectura básica de aplicaciones web utilizando Java, Spring Framework y Thymeleaf, desplegada en AWS EC2:

- **Controlador**: `GreetingController.java`
  - Este controlador gestiona las peticiones HTTP relacionadas con la calculadora.
  - Define un método `calculadora()` que maneja las solicitudes GET en la ruta `/calculadora`.
  - Utiliza anotaciones de Spring (`@Controller` y `@GetMapping`) para mapear la URL y los parámetros de la solicitud HTTP a los métodos de Java.
  - Procesa los parámetros `primerValor`, `segundoValor` y `operacion` para realizar operaciones matemáticas simples (suma, resta, multiplicación, división) y devuelve el resultado a través del objeto `Model`.

- **Vista**: `calculadora.html`
  - Esta plantilla HTML utiliza Thymeleaf para integrar dinámicamente los resultados de las operaciones.
  - Presenta un formulario con campos para `primerValor`, `segundoValor` y opciones de operación (`suma`, `resta`, `multiplicacion`, `division`) usando botones de radio.
  - Al enviar el formulario, muestra el resultado de la operación seleccionada.

- **Despliegue en AWS EC2**:
  - La aplicación está desplegada en un servidor EC2 de AWS.
  - Se accede a la aplicación a través de la IP pública o el nombre de dominio asignado al servidor EC2.
    
*![image](https://github.com/Knight072/ARSW-Lab3/assets/116401447/62a85e07-c27f-4f5f-b0fd-0c7469059a03)


### Uso

1. **Requisitos previos**:
   - Java JDK instalado.
   - Maven instalado.
   - IDE compatible con Spring (por ejemplo, IntelliJ IDEA, Eclipse).

2. **Configuración**:
   - Clona el repositorio.
   - Importa el proyecto en tu IDE.

3. **Despliegue en AWS EC2**:
   - Crea una instancia EC2 en AWS y asegúrate de tener acceso SSH.
   - Configura el entorno de desarrollo y despliega la aplicación utilizando Maven o mediante un archivo JAR ejecutable.

4. **Acceso**:
   - Accede a la aplicación desde un navegador web utilizando la IP pública o el nombre de dominio de la instancia EC2 seguido de `/calculadora` (por ejemplo, `http://ec2-3-94-130-211.compute-1.amazonaws.com:8080/calculadora`).



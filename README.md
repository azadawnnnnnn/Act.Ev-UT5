# Act.Ev-UT5 - Gestor de Notas

¡Hola! 👋 Este es mi proyecto de gestión de notas para la asignatura de Programación. Es una aplicación que he desarrollado en Java donde puedes crear una cuenta, hacer login y guardar tus notas personales.

## ¿Qué hace el proyecto? 📝

- **Registro de usuarios** ✍️
  - Te puedes crear una cuenta con tu email
  - Las contraseñas se guardan de forma segura
  - ¡Cada usuario tiene su propio espacio!

- **Login** 🔐
  - Accede a tu cuenta de forma segura
  - Tus notas están protegidas

- **Gestión de notas** 📚
  - Crea todas las notas que quieras
  - Edítalas cuando necesites
  - Bórralas si ya no las necesitas
  - Se guardan automáticamente

## Cómo está organizado 📂

```
Mi proyecto/
├── src/
│   ├── data/                          # Aquí guardo todos los datos
│   │   ├── users.txt                  # Lista de usuarios
│   │   └── usuarios/                  # Carpeta con las notas de cada uno
│   └── notasgestionusuarios/
│       ├── controlador/               # El cerebro de la aplicación
│       │   └── Main.java             
│       ├── modelo/                    # La lógica y los datos
│       │   ├── GestorArchivos.java   
│       │   └── Nota.java             
│       └── vista/                     # Las ventanas que ves
│           ├── Login.java            
│           ├── Registro.java         
│           └── Notas.java            
```

## Tecnologías que he usado 💻

- Java (el lenguaje principal)
- Swing (para hacer las ventanas)
- Archivos de texto (para guardar todo)

## Estructura del código 🏗️

He usado el patrón MVC (Modelo-Vista-Controlador) que nos han enseñado en clase:
- **Modelo**: Maneja los datos y la lógica
- **Vista**: Las ventanas que ves cuando usas la app
- **Controlador**: Conecta todo y hace que funcione

---
Hecho por Azael RM ~ 1ºDAW - A
Probando y aprendiendo Git 🚀

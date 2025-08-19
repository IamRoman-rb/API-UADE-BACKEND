---

```markdown
# 💱 CryptoTradeApp  

Aplicación desarrollada en **Java** utilizando principios de **POO** (Programación Orientada a Objetos), pensada para gestionar la compra y venta de criptomonedas de manera sencilla y escalable.  

## 🚀 Características principales  
- Registro y autenticación de usuarios.  
- Gestión de billeteras virtuales.  
- Compra y venta de criptomonedas.  
- Historial de transacciones.  
- Arquitectura basada en clases y relaciones POO.  

## 🛠️ Tecnologías utilizadas  
- **Java** (versión 17 o superior)  
- **Maven** o **Gradle** (para la gestión de dependencias)  
- **JUnit** (para pruebas unitarias)  

## 📂 Estructura del proyecto  
```

CryptoTradeApp/
├── src/
│   ├── main/java/
│   │   ├── models/       # Clases del dominio (Usuario, Transacción, Criptomoneda, etc.)
│   │   ├── services/     # Lógica de negocio
│   │   ├── utils/        # Utilidades y helpers
│   │   └── App.java      # Punto de entrada
│   └── test/java/        # Pruebas unitarias
├── docs/                 # Documentación
├── README.md             # Este archivo
└── .gitignore

````

## ⚡ Instalación y ejecución  
1. Clonar el repositorio:  
   ```bash
   git clone https://github.com/tuusuario/CryptoTradeApp.git
   cd CryptoTradeApp
````

2. Compilar y ejecutar:

   ```bash
   mvn clean install
   mvn exec:java -Dexec.mainClass="App"
   ```

## 🧪 Pruebas

Para correr las pruebas unitarias:

```bash
mvn test
```

## 📌 Próximas mejoras

* Integración con APIs de precios de criptomonedas en tiempo real.
* Interfaz gráfica con JavaFX o un cliente web.
* Sistema de notificaciones y alertas de mercado.

## 👤 Autor

**Roman Borla**

* 💻 Desarrollador Web Full Stack
* 🎓 Estudiante de Ingeniería en Informática en **UADE**
* 🌐 [GitHub](https://github.com/tuusuario)

---


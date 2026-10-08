# Ecuaciones_Lineales

Programa en Java para resolver sistemas 3x3 con Gauss y Gauss-Jordan.

### Estructura Modular

- `defmatrizz.java`: Define la matriz aumentada.
- `Gauss.java`: Triangulación superior (eliminación gaussiana).
- `GaussJordan.java`: Reusa Gauss, normaliza y hace barrido superior para sacar x.
- `Lanzador_gausjordan.java`: Main, lanza todo e imprime.

### Pasos para Compilar y Ejecutar

```bash
javac *.java
java Lanzador_gausjordan
```

### Ejemplo de Prueba con Salida por Consola

Matriz en `defmatrizz.java`:
```
3.0  -0.1  -0.2 | 7.85
0.1   7.0  -0.3 | -19.3
0.3  -0.2  10.0 | 71.4
```

**Salida real:**
```
Soluciones del sistema (Gauss-Jordan):
x1 = 3.0
x2 = -2.5
x3 = 7.0
```

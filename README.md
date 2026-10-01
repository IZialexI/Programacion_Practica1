# Práctica 1 — Elementos básicos

Ejercicio F0 (DAM). Pide datos por teclado y calcula el importe de una compra.

## Qué hace
Solicita el **nombre** del cliente, la **letra de sección**, la **cantidad** de unidades y el **precio** por unidad, y calcula:

- **Subtotal**: unidades × precio.
- **Total**: subtotal + 21 % de IVA.
- **Descuento**: `true` si se compran más de 5 unidades y el total supera 50 (se almacena en un `boolean`).
- **Puntos de fidelidad**: el total con IVA truncado a entero mediante conversión explícita `(int)`.

Muestra subtotal y total con dos decimales y los puntos enteros.

## Ejecución
```bash
javac Practica1_ElementosBasicos.java
java Practica1_ElementosBasicos
```

Nota: el precio se introduce con **coma** decimal (p. ej. `10,50`) por el locale `es_ES`.

## Ficheros
- `Practica1_ElementosBasicos.java` — código fuente.

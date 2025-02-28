# Automatización de proceso de compra para página de Alkosto
En esta automatización uso el patrón POM para realizar un proceso de compra, con datos obtenidos de excel.

## Herramientas
Java 11 (amazon coretto), Serenity BDD, Cucumber, gradle, excel.

## Pasos
- Abrir la página en Chrome
- Abrir la pestaña de búsqueda
- Buscar un producto (proveniente del excel en parametros)
- Validar la existencia del producto
- Abrir el producto
- Agregar al carrito
- Abrir el carrito
- Validar el precio del carrito con el precio anteriormente estimado del producto en el excel
- Seguir compra
- Rellenar correo (mi correo)
- Rellenar datos de un formulario para continuar con la compra
- Seleccionar la el select de autorizo tratamiento de datos
- Finalizar test

En caso de necesitarse, cambiar correo (excel) para evitar la petición de iniciar sesión en alkosto

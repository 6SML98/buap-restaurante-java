# Sistema de restaurante

Aplicación Java Swing de restaurante con pantallas de clientes, empleados, menú y pedidos. Conserva los metadatos del trabajo académico original.

## Requisitos

JDK 17, NetBeans o Ant y AbsoluteLayout.jar de NetBeans en lib/.

## Ejecutar

Abre la carpeta en NetBeans o ejecuta `ant jar`. El inicio es `Interfaces2.InterfazRestaurante2`.

Para probar el modelo en PowerShell:

```powershell
New-Item -ItemType Directory build/test-classes -Force | Out-Null
$fuentes = (Get-ChildItem src -Recurse -Filter *.java).FullName
javac -encoding UTF-8 -cp "lib/*" -d build/test-classes $fuentes tests/ModelCheck.java
Set-Location build/test-classes
java -cp ".;../../lib/*" ModelCheck
```

## Verificación del 8 de octubre de 2026

Construcción JAR con Ant e imágenes referenciadas verificadas. La prueba comprueba el cálculo desde el archivo solicitado y la escritura de pedidos. Se corrigieron ambos fallos. No se recorrieron todas las pantallas de escritorio ni sus operaciones de usuario.

## Versiones anteriores

versiones/ conserva variantes académicas anteriores. Las pruebas descritas corresponden al código principal; no se garantiza que todas las variantes funcionen.

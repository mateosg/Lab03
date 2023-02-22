# Diseño de tipos para reserva de habitaciones

## Cliente

El tipo cliente representa a una persona que ha hecho una reserva de habitación en el hotel. Los atributos que definen a un cliente son:

- `nombre`: String con el nombre del cliente.
- `apellido1`: String con el primer apellido del cliente.
- `apellido2`: String con el segundo apellido del cliente.
- `dni`: String con el DNI del cliente.

Este tipo es inmutable.
Además, el tipo cliente debe implementar un método estático llamado `parse` que reciba una cadena de texto y devuelva un objeto de tipo cliente con los valores correspondientes. El formato del texto es cada atributo (en el mismo orden que en la descripción) separado por comas

## Habitación

El tipo habitación representa a una habitación del hotel. Los atributos que definen a una habitación son:

- `tipo`: Enumerado con los valores `Individual` y `Doble`, que indican si la habitación es individual o doble.
- `numero`: int que indica el número de la habitación.
- `precio`: double que indica el precio por noche de la habitación.
Solo el precio es modificable.

Además, el tipo habitación debe implementar un método estático llamado `parse` que reciba una cadena de texto y devuelva un objeto de tipo habitación con los valores correspondientes a esa cadena. El formato del texto es cada atributo (en el mismo orden que en la descripción) separado por comas

## Reserva

El tipo reserva representa a una reserva de habitación en el hotel. Los atributos que definen a una reserva son:

- `fechaEntrada`: LocalDate que indica la fecha de entrada en la habitación.
- `fechaSalida`: LocalDate que indica la fecha de salida de la habitación.
- `duracion`: int que indica la duración de la estancia en días. Debe ser mayor que 0.
- `cliente`: Objeto de tipo Cliente que indica el cliente que ha hecho la reserva.
- `habitacion`: Objeto de tipo Habitación que indica la habitación reservada.
Todas las propiedades son modificables, excepto el cliente.

Además, el tipo reserva debe implementar un método estático llamado `parse` que reciba una cadena de texto y devuelva un objeto de tipo reserva con los valores correspondientes. En este caso, la cadena debe tener el siguiente formato: `fecha_entrada;fecha_salida;duracion;{nombre,apellido1,apellido2,dni};{tipo,numero,precio}`. Además, se deben verificar las siguientes restricciones:

- La fecha de salida no puede ser anterior a la fecha de entrada.
- El precio por noche de la habitación debe ser mayor que 0.

Para los tipos diseñados con clases, genere lo métodos de Object de forma automática con Eclipse.

# Features

## Feature 1

Como _Game Master_ quiero crear una nave espacial. Las naves tienen `health` que se representa con un número entero. Un valor de 0 o menor que 0 significa que la nave está destruida; un valor positivo significa que la nave sigue funcionando.

## Feature 2

Como _Game Master_ quiero ver todas las naves espaciales creadas.

## Feature 3

Como _Game Master_ quiero poder hacer que una nave cualquiera `A` dispare a otra nave cualquiera `B`. La consecuencia de que `A` dispare a `B` es que la `health` de `B` decrementa en 1.

## Feature 4

Como _Game Master_ quiero que el `health` de las naves no pueda ser negativo. 
Dicho de otra manera, el `health` nunca podrá decrementar por debajo de 0. 
Tampoco podrán crearse naves con `health` negativo.

## Feature 5

Como _Game Master_ quiero que las naves no puedan disparar si están destruidas.

## Feature 6

Como _Game Master_ quiero que las naves tengan un arma (`weapon`). A partir de hora, cuando una nave cualquiera `A` dispara a otra nave cualquiera `B`, la nave `A` ordena a su `weapon` que dispare contra `B`.

## Feature 7

Un poco de contexto: _En el año en el que se ambienta este simulador, 2535, ya existen los generadores de electricidad portátiles basados en fusión nuclear que permiten realizar viajes espaciales sin tener que repostar durante décadas_.

Como _Game Master_ quiero que las naves tengan un generador el cual suministra energía a toda la nave:
- La cantidad de energía total que el generador puede suministrar a la nave en su conjunto en un momento dado se llama `total-power` y es un número entero positivo (0 incluido).
- La cantidad de energía que la nave en su conjunto consume (todavía no existe nada en la nave que consuma energía) nunca puede superar `total-power`.
- La cantidad de `total-power` que la nave no está usando es `power-not-in-use` y es un número entero positivo (0 incluido).
- `power-not-in-use` nunca puede ser más grande que `total-power`.

## Feature 8

A partir de ahora, como _Game Master_, quiero que `weapon` necesite cierta cantidad de energía para funcionar (`weapon-power-needed`, entero mayor que 0):
- La cantidad de energía que `weapon` usa en cada momento se llama `power-consumed-by-weapon` (entero igual a 0 o mayor).
- `power-consumed-by-weapon` no puede ser mayor que `weapon-power-needed`.
- Si `power-consumed-by-weapon` es menor que `weapon-power-needed`, `weapon` no puede disparar.
- `power-consumed-by-weapon` consume la energía que suministra el generador (`power-not-in-use`). Eso significa que la siguiente igualdad debe ser siempre cierta:
```
power-consumed-by-weapon + power-not-in-use = total-power
```
- Por defecto, `weapon` siempre intenta consumir toda la energía que necesita para funcionar. Por el momento, el _Game Master_ no puede elegir cuanta energía consume `weapon` del generador (`power-not-in-use`).

## Feature 9

Como _Game Master_ quiero poder elegir cuanta energía consume `weapon` (`power-consumed-by-weapon`) en cualquier momento de la simulación. Siempre respetando las reglas mencionadas en _features_ anteriores.

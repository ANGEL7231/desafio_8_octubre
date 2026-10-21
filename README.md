"# desafio_8_octubre" 
1. ¿Por qué Boveda es una interfaz y no una clase? ¿Qué ventaja da?

Porque Boveda solo describe qué se puede hacer con una bóveda, pero no dice cómo se hace. Es como un plano o una lista de lo que debe tener.

La ventaja es que después puedes tener varias formas distintas de hacer una bóveda y todas van a servir igual, sin tener que cambiar el código que las usa.

2. ¿Qué pasaría en factorial si olvidas el caso base?

El método se llamaría a sí mismo para siempre, sin parar nunca. al final el programa se cae por quedarse sin memoria.

3. ¿Qué ventaja tuvo usar genéricos (<T>) en lugar de Object?

Que puedes decir desde el principio qué tipo de cosas guarda cada bóveda: una de números, otra de textos, etc. Así el programa te avisa si intentas meter algo que no corresponde, y no tienes que estar convirtiendo todo manualmente cada vez que sacas algo. Con Object todo entra como "cosa genérica" y luego toca adivinar y convertir, lo que es más fácil de equivocar.

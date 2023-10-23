# M2S04 - Atividades em Java

### [M02S04] Ex 01 - Herança e Polimorfismo

a) Crie a interface "Operavel", com os métodos depositar(double valor) e sacar(double valor).
b) Crie a classe Abstrata Conta com o atributo "saldo" (double) e um método protegido (protected) "ObterSaldoAtual()".
c) Crie uma classe "ContaCorrente" que implemente a interface Operavel e herde da classe Conta. Faça uma implementação dos métodos herdados.

### [M02S04] Ex 02 - Sobrescrita

a) Crie uma classe 'Funcionario' com o método público "obterCargo" que retorne uma String com o texto "Sou Funcionário".
b) Crie uma classe Gerente que herde de Funcionário, sobrescrevendo o método de obter cargo com o texto "Sou Gerente".
c) Transforme a classe Gerente numa classe que não pode mais ser extendida (ou seja, que não pode ter subclasses).

### [M02S04] Ex 03 - Interfaces

a) Crie uma Interface chamada "Tributavel", que tenha o método "calcularValorComImposto".
b) Crie uma classe chamada "Produto" que implemente esta interface criada anteriormente.
Nesta classe crie os atributos "valor" e "valor imposto", ambos double.
No método herdado, retorne a soma dos atributos de valores.

### [M02S04] Ex 04 - Exceções

Escreva um código que pergunte ao usuário (pela linha de comando) sua idade.

Caso seja informado um valor negativo, zero ou maior que cem, lance uma exceção que seja capturada por um bloco de try-catch e imprima no console uma mensagem explicativa para o usuário, e a seguir repita a pergunta para o usuário até que seja informado um valor de idade válido.

Neste exercício é livre para se criar uma exceção própria ou usar alguma exceção já existente na linguagem.

Quando for informado uma idade válida, imprima no console a frase: "Olá, você tem xx anos de idade!"

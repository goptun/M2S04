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

### [M02S04] Ex 05 - Super-Herois (parte 1)

Crie um projeto Java para implementar um cadastro de personagens que podem ser Herói ou Vilão.
Crie uma classe principal para iniciar a aplicação (com método main).

### [M02S04] Ex 06 - Super-Herois (parte 2)

Crie no projeto java as classes:

Personagem (classe abstrata): atributos 'nome' e 'superpoder', ambas do tipo String;

Heroi (subclasse de Personagem): atributo 'nomeVidaReal' (String);

Vilao (subclasse de Personagem): atributo 'tempoDePrisao' (Integer).

Estas classes devem estar no pacote 'org.devinhouse.superherois.model', e devem ter somente construtores com parâmetros para preencher os atributos (sem construtor padrão/default).

### [M02S04] Ex 05 - Super-Herois (parte 1)

Crie um projeto Java para implementar um cadastro de personagens que podem ser Herói ou Vilão.
Crie uma classe principal para iniciar a aplicação (com método main).

### [M02S04] Ex 06 - Super-Herois (parte 2)

Crie no projeto java as classes:

Personagem (classe abstrata): atributos 'nome' e 'superpoder', ambas do tipo String;

Heroi (subclasse de Personagem): atributo 'nomeVidaReal' (String);

Vilao (subclasse de Personagem): atributo 'tempoDePrisao' (Integer).

Estas classes devem estar no pacote 'org.devinhouse.superherois.model', e devem ter somente construtores com parâmetros para preencher os atributos (sem construtor padrão/default).

### [M02S04] Ex 07 - Super-Herois (parte 3)

a) Crie no pacote 'org.devinhouse.superherois.cli' uma classe 'Display' para conter todos os métodos de interação com o usuário.

b) Apresente no console do usuário um menu com as opções:

1 - Cadastrar Herói

2 - Cadastrar Vilão

3 - Listar

4 - Sair

O sistema não deve ser encerrado até que o usuário selecione a opção 4, devendo ser exibido novamente o menu de opções após finalizar
cada operação selecionada.

Para as opções 1 e 2, implemente um cadastramento de Herói e Vilão, respectivamente, solicitando os dados via console para o usuário e
preenchendo os atributos dos respectivos objetos.
Armazene os personagens cadastrados em um ArrayList.
A opção 3 deve listar no console todos os personagens cadastrados até então.
A opção 4 deve encerrar o programa.

### [M02S04] Ex 08 - Super-Herois (parte 4)

Crie uma classe de repositório de dados chamada "PersonagemRepository" no pacote 'org.devinhouse.superherois.repository'.
Nesta classe, crie um atributo privado do tipo lista (List/ArrayList) para armazenar os personagens cadastrados, fornecendo métodos
públicos para inserir e consultar os personagens.

### [M02S04] Ex 09 - Super-Herois (parte 5)

Crie uma classe de exceção chamada "OpcaoInvalidaException" no pacote 'org.devinhouse.superherois.exception'.
Esta exceção deve ser lançada quando o usuário informa uma opção que não tem correspondência com as opções disponíveis no menu.
Implemente um bloco de tratamento (try-catch) adequado para quando esta exceção for lançada, imprimindo uma mensagem explicativa para o usuário.

### [M02S04] Ex 10 - Super-Herois (parte 6)

Na classe Personagem:
a) Implemente/sobrescreva o método 'equals()', identificando os personagens pelo nome, ou seja, são iguais se tem o mesmo nome.
b) Faça esta classe implementar a interface Comparable, comparando os personagens em ordem alfabética de nome.

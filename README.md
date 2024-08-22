# Cálculo do MDC

Trabalho de APA com o objettivo de desenvolver o entendimento de funções iterativas e recursivas e de formas de
análise de algoritmos.

## Estrutura de pasta


- `src`: O codigo esta nesta pasta, na classe `Main.java`


## Relatorio

### Explicação
Iterativa (fi): A função mdcIterativo usa um loop while para continuar dividindo a por b até que b se torne zero. O valor de a naquele ponto será o MDC.

Recursiva (fr): A função mdcRecursivo chama a si mesma, reduzindo o problema a subproblemas menores, até que b seja igual a zero. O valor de a será o MDC.

### Análise de Complexidade Temporal:

Ambas as funções têm uma complexidade de tempo de O(log(min(a, b))). Isso ocorre porque o algoritmo de Euclides reduz o tamanho dos números em cada passo de forma proporcional.

### Considerações:

A versão recursiva pode ser mais elegante e fácil de entender, mas em linguagens que não otimizam chamadas recursivas (tail call optimization), a versão iterativa pode ser mais eficiente em termos de uso de memória, especialmente para valores grandes de a e b.
Para linguagens como Java, a versão iterativa é geralmente preferível devido à limitação do tamanho da pilha de chamadas, o que pode causar um StackOverflowError para valores grandes.

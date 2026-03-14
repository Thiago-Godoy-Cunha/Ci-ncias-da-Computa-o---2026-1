# Atividade Aula Vivencial - 14.03

## Objetivo
Criar um programa em Python que leia valores inteiros do teclado e mantenha a leitura enquanto o usuário digitar valores menores que o valor anterior. Quando o usuário digitar um valor maior ou igual ao valor anterior, o programa deve exibir a soma dos valores lidos (excluindo o último valor digitado) e encerrar.

## Funcionamento
- O programa solicita um valor inteiro ao usuário.
- Enquanto o valor digitado for **menor** que o valor anterior, o programa continua pedindo novos valores.
- Quando o valor digitado for **maior ou igual** ao valor anterior, o programa calcula e exibe a soma de todos os valores digitados antes desse valor de parada.

## Exemplo de execução
```
Digite um valor:
15
Digite um valor:
10
Digite um valor:
7
Digite um valor:
5
Digite um valor:
3
Digite um valor:
4
Soma dos valores: 40
```

## Arquivo Python
O código está em `Atividade aula vivencial - 14.03.py` e implementa exatamente o comportamento descrito.

## Observações
- O último valor digitado que interrompe a sequência **não** é incluído na soma.
- O programa valida se a entrada é um número inteiro e solicita novamente em caso de erro.

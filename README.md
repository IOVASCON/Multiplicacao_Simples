# Simulação Bancária

Este é um programa simples em Java para simular operações bancárias básicas. A aplicação permite ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual. Desafio módulo 2 - item 10 do programa " Santander 2024 - Backend com Java " na plataforma DIO

## Funcionalidades

- **Depositar**: O usuário pode depositar um valor e o saldo é atualizado.
- **Sacar**: O usuário pode sacar um valor se houver saldo suficiente; caso contrário, uma mensagem de saldo insuficiente é exibida.
- **Consultar Saldo**: O usuário pode consultar o saldo atual.
- **Encerrar**: O programa pode ser encerrado pelo usuário.

## Estrutura do Projeto

- `src/SimulacaoBancaria.java`: Contém o código fonte da aplicação.
- `bin/`: Diretório onde os arquivos compilados serão armazenados.
- `README.md`: Este arquivo, com informações sobre o projeto.

## Pré-requisitos

- **Java JDK 21**: Certifique-se de que o JDK 21 está instalado e configurado no seu PATH.

## Compilação e Execução

### Compilação

Para compilar o projeto, execute o seguinte comando no terminal:

```sh
javac -d bin src/SimulacaoBancaria.java

Execução

Para executar o projeto, execute o seguinte comando no terminal:

java -cp bin SimulacaoBancaria

Uso

Ao executar o programa, um menu será exibido com as seguintes opções:

    Depositar: Permite que o usuário deposite um valor na conta.
    Sacar: Permite que o usuário saque um valor da conta.
    Consultar Saldo: Exibe o saldo atual da conta.
    Encerrar: Encerra o programa.

Exemplo de Uso

Escolha uma opção:
1: Depositar
2: Sacar
3: Consultar Saldo
0: Encerrar
1
Digite o valor a ser depositado: 500
Saldo atual: 500.0
Escolha uma opção:
1: Depositar
2: Sacar
3: Consultar Saldo
0: Encerrar
2
Digite o valor a ser sacado: 300
Saldo atual: 200.0
Escolha uma opção:
1: Depositar
2: Sacar
3: Consultar Saldo
0: Encerrar
3
Saldo atual: 200.0
Escolha uma opção:
1: Depositar
2: Sacar
3: Consultar Saldo
0: Encerrar
0
Programa encerrado.

Contribuição

Se você deseja contribuir com este projeto, sinta-se à vontade para fazer um fork do repositório e enviar pull requests.
Licença

Este projeto está licenciado sob a MIT License.

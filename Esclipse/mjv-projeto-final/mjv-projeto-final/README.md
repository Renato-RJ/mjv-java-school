## Projeto final - MJV Java SCHOOL

### Obrigatoriedades:
Apresentar a API sua aplicação devidamente documentada para uma demonstração de uma jornada de consumo dos recursos pertinentes a proposta do teu projeto.

### Orientações: 
Detalhar no README do projeto modelo de consumo de endpoint para facilitar a utilização da API:

### Forma de entrega: 

Disponibilizar o link do github do projeto bem descrito quanto às funcionalidades, implementações relevantes, participação dos membros da equipe, READEME com a jornada na plataforma e a API Rest documentada pelo Swagger, opcionalmente em um ambiente Azure, Heroku ou OnPromisse.

### Critérios de Aceite - Expectativa da Entrega: 

1.	Apresentar a estrutura do projeto no github ou na IDE;

2.	Apresentar a API da plataforma devidamente documentada e preferencialmente no Heroku;

3.	Realizar uma demonstração de uma jornada de consumo dos recursos para conforme requisitados;

4.	Requisitos Técnicos: Implementação aplicando as boas práticas de programação, uso de:
	**ORM-JPA, Framework de persistência,  integridade do banco de dados e segurança na API(+).** 
 
## ⚙️ LocaBike - Projeto Final / Repositório 

- [Repositório do Projeto Final](https://github.com/Renato-RJ/mjv-java-school/tree/main/Esclipse/mjv-projeto-final/mjv-projeto-final)

  

## ⚙️ Alunos participantes / Github

- [Bruno Alessandro](https://github.com/BrunoAMieli)

- [Fábio Ericeira](https://github.com/FabioEriceira)

- [Gabriel Cruz](https://github.com/ProbBC)

- [Paulo Ricardo](https://github.com/Paulo-Ultra)

- [Renato Gonçalves](https://github.com/Renato-RJ)


## ⚙️ Dependências 

* [JDK 11: Para executar o Projeto](https://www.oracle.com/java/technologies/downloads/#java11)

* [Maven 4.0.0 : Para executar build do Projeto](https://maven.apache.org/download.cgi)

## ⚙️ Executando o projeto
``` shell 
# CHECANDO A VERSÃO DO JAVA
java -version

# CHECANDO A VERSÃO DO MVN
mvn -v

# INICIANDO O PROJETO
mvn spring-boot:run

# BUILD O PROJETO
mvn clean install
```

## 🌐 Endpoints
📄  As urls interativas, construídas através do [Swagger](https://swagger.io/tools/swagger-ui/)

|*_Método_* | *_URL_*       | *Finalidade*       |   
|--------|------------|------------------|
| POST   |/cliente | Cadastra um novo cliente|
| GET    |/cliente | Mostra todos os clientes|
| PUT    |/cliente | Atualiza um cliente|
| DELETE    |/cliente/{id} | Exclui o cliente pelo id|
|    | |  |
| *Método* | *URL*        | *Finalidade*       |
| POST   |/equipamento | Cadastra um novo equipamento|
| GET    |/equipamento | Lista todos os equipamentos|
| DELETE    |/equipamento/{id} | Desativa o equipamento pelo id|
|    | |  |
| *Método* | *URL*        | *Finalidade*       |
| POST   |/locacao_item | Cria/Simula um orçamento de locação|
| GET    |/locacao_item | Lista todos os orçamentos das locações|
| GET    |/locacao_item/{id} | Detalha um orçamento pelo id|
| PUT    |/locacao_item | Altera um orçamento de locação|
| DELETE    |/locacao_item/{id} | Exclui o item da locação pelo id|
|    | |  |
| *Método* | *URL*        | *Finalidade*       |
| POST   |/locacao | Faz uma alocação/Conclui um orçamento|
| GET    |/locacao| Lista todos as locações|
| DELETE    |/locacao/{id} | Cancela uma locação pelo id|

##### Apresentação

1. Cadastro/Alteração/Exclusão de cliente(s);
2. Cadastro/Alteração/Exclusão de equipamento(s);
3. Fazer uma simulação de uma locação, alterar e excluir;
4. Fechar uma locação direta, uma através do orçamento; uma multiplos itens e cancelar locação.

##### JSON Cadastros

* Cadastrando Cliente
``` shell 
*CLIENTE 01:

{
"id": 0,
"nome": "Antonio Fonseca",
"cpf": "3456123789",
"contato": "22999866877",
"endereco": {
"id": 0,
"rua": "Rua 20 de maio",
"numero": "48",
"complemento": "Casa",
"bairro": "Penha",
"cidade": "São Paulo",
"estado": "SP",
"cep": "34512678"
}
}
*CLIENTE 02:
{
"id": 0,
"nome": "José Pereira",
"cpf": "123456789",
"contato": "22999887766",
"endereco": {
"id": 0,
"rua": "Beira Mar",
"numero": "36",
"complemento": "Casa",
"bairro": "Copacabana",
"cidade": "Rio de Janeiro",
"estado": "rj",
"cep": "12345678"
}
}
*CLIENTE 03
{
"id": 0,
"nome": "Maria Antonieta",
"cpf": "789123456",
"contato": "22999776688",
"endereco": {
"id": 0,
"rua": "Rua das Palmeiras",
"numero": "15",
"complemento": "Casa",
"bairro": "Leblon",
"cidade": "Rio de Janeiro",
"estado": "rj",
"cep": "12367845"
}
}

*DELETANDO UM CLIENTE:
Primeiro identifica o cliente através de sua ID, depois executa o DELETE com o referido ID;

*ALTERANDO UM CLIENTE
{
"id": 	//CONFERIR ID NO GET CLIENTE//
"nome": "Maria Antonieta",
"cpf": "789123456",
"contato": "22999000088",
"endereco": {
"id": 0,
"rua": "Rua das Pedras",
"numero": "27",
"complemento": "Casa",
"bairro": "Algum de lá",
"cidade": "Aracaju",
"estado": "SE",
"cep": "9967845"
}
}
```
* Cadastrando Equipamento
``` shell 
*EQUIPAMENTO 01
{
"tipoBike": "SPEED",
"marca": "Soul",
"modelo": "3R5",
"grupoCambio": "Sram Rival",
"tamQuadro": "52",
"suspensao": "Garfo Rígido",
"qtdDisponivel": 4,
"valorUnitario": 45.70
}
*EQUIPAMENTO 02
{
"tipoBike": "MTB",
"marca": "Oggi",
"modelo": "7.4",
"grupoCambio": "Shimano SLX",
"tamQuadro": "17",
"suspensao": "Ar e Óleo",
"qtdDisponivel": 8,
"valorUnitario": 43.25
}
*EQUIPAMENTO 03
{
"tipoBike": "MTB",
"marca": "Sense",
"modelo": "Impact Race",
"grupoCambio": "Sram GX Eagle",
"tamQuadro": "17",
"suspensao": "Ar e Óleo",
"qtdDisponivel": 6,
"valorUnitario": 56.70
}

*DELETANDO UM EQUIPAMENTO:
Se faz a identificação do equipamento e através de sua ID, executo o DELETE.
```
* Realizando uma Simulação/Orçamento de uma alocação.
``` shell 
*SIMULAÇÃO 01
{
"id": 0,
"dataRetirada": "2022-05-26",
"dataDevolucao": "2022-05-18",
"equipamentoId": 1,
"locacaoId": 0
}
*SIMULAÇÃO 02
{
"id": 0,
"dataRetirada": "2022-06-02",
"dataDevolucao": "2022-06-11",
"equipamentoId": 1,
"locacaoId": 0
}
*SIMULAÇÃO 03
{
"id": 0,
"dataRetirada": "2022-07-02",
"dataDevolucao": "2022-07-04",
"equipamentoId": 1,
"locacaoId": 0
}

*ALTERANDO UMA SIMULAÇÃO:
{
"id": 					//PEGAR ALGUM NO GET,
"dataRetirada": "2022-07-12", 	//ALTERAR CONFORME DESEJO
"dataDevolucao": "2022-07-14",	//ALTERAR CONFORME DESEJO
"equipamentoId": 1,			//ALTERAR CONFORME DISPONIBILDIADE
"locacaoId": 0
}
*DELETANDO UMA SIMULAÇÃO
Se identifica o ID da simulação desejada e realiza o DELETE da mesma. Não é possível deletar uma simulação que já esteja atrelada a uma alocação.
```
* Realizando uma Locação
``` shell 
*ALUGANDO DIRETO, SEM ORÇAMENTO PRÉVIO:
{
"id": 0,
"clienteId": 4, //VERIFICAR IDs no get cliente
"equipamento": [
{
"id": 0,
"dataRetirada": "2022-05-18",
"dataDevolucao": "2022-05-28",
"equipamentoId": 1, //VERIFICAR IDs no get cliente
"locacaoId": 0
}
]
}
*ALUGANDO MAIS DE UM EQUIPAMENTO POR CONTRATO SEM ORÇAMENTO PRÉVIO:
{
"id": 0,
"clienteId": 4, CONFERIR NOS GET CLIENTE
"equipamento": [
{
"id": 0,
"dataRetirada": "2022-05-20",
"dataDevolucao": "2022-05-22",
"equipamentoId": 1, CONFERIR NO GET
"locacaoId": 0
},
{
"id": 0,
"dataRetirada": "2022-05-22",
"dataDevolucao": "2022-05-25",
"equipamentoId": 1, CONFERIR NO GET
"locacaoId": 0
}
]
}
*ALUGANDO ATRAVÉS DE UM ORÇAMENTO PRÉVIO:
{
"id": 0,
"clienteId": 4,
"equipamento": [
{
"id": 77,
"equipamentoId": 1
}
]
}
*ALUGANDO MAIS DE UM EQUIPAMENTO POR CONTRATO COM ORÇAMENTO PRÉVIO.
{
"id": 0,
"clienteId": 4, //CONFERIR NO GET
"equipamento": [
{
"id": 80,
"equipamentoId": 1 //CONFERIR NO GET
},
{
"id": 81,
"equipamentoId": 1 //CONFERIR NO GET
}
]
}
*CANCELANDO UMA ALOCAÇÃO:
Basta identificar a locação desejada e através de seu ID executar um DELETE.
```

# tema-sistemas-hearth-stone-challenge
Desafio proposto por Tema sistemas, consiste na criação de uma API que gerencie cartas de magic

## Cenário ##
_O jogo HearthStone é um jogo de cartas onde cada oponente precisa eliminar o
outro. Ele é jogado em turnos e cada jogador recebe suas cartas, que são divididas em
classes (Mago, Paladino, Caçador, Druida e “qualquer classe”)._

- As cartas podem ser de criaturas ou de magias e possuem seu custo em mana,
podendo ser de zero a dez. Há uma descrição da ação da carta, um nome e seu
poder de dano e defesa.

- Cada jogador pode montar um baralho com até 30 cartas da sua classe ou cartas
que permitem qualquer classe. É permitido no máximo duas cartas iguais no
mesmo baralho.

## Desafio ##
- Criar  uma  API  Rest  com o path “/carta”  usando  JAXRS  para  cadastrar,  consultar  e 
excluir uma carta. Permitir consultar uma carta por nome, id, classe ou tipo. Utilize os 
padrões de mercado para criação da API Rest. 

## Realizando a build ##
Para executar esse projeto, você deve clonar este repositório e seguir as seguintes orientações:
 - [Como compilar o Frontend](https://github.com/jonasdsg/tema-sistemas-hearth-stone-challenge/tree/main/hearth-stone-front#readme)
 - *Para o backend você pode optar entre a versão com SpringBoot(Recomendado) ou JAX-RS 
 - - [Como compilar o Backend SpringBoot](https://github.com/jonasdsg/tema-sistemas-hearth-stone-challenge/tree/main/hearth-stone-back#readme)
 - - [Como compilar o Backend JAX-RS](https://github.com/jonasdsg/tema-sistemas-hearth-stone-challenge/tree/main/hearth-stone-jaxrs#readme)
 
## Acessando projeto já compilado
Você pode testar o app já publicado [Neste link aqui](https://jonasdsg.github.io/tema-sistemas-hearth-stone-challenge/)
Ou fazer requisições para o backend para https://hs-tema-challenge.herokuapp.com/carta

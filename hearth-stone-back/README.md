# Hearth Stone back
Este projeto foi feito com SpringBoot 2.5.4

## Requisitos Minimos
- 4GB de memória RAM
- 500MB de espaço em disco
- Java 8 [Tutotial de instalação no Winddows](https://jonasdsg.medium.com/como-instalar-e-configurar-o-java-para-desenvolvimento-no-windows-jdk-2b4de4a8c905?source=user_profile---------1----------------------------)  [Tutorial de instalação no Linux](https://jonasdsg.medium.com/como-instalar-e-configurar-o-java-para-desenvolvimento-jdk-no-linux-qualquer-distribui%C3%A7%C3%A3o-ffbab58a5195?source=user_profile---------0----------------------------)
- Maven [Download](https://maven.apache.org/ref/3.8.2/download.cgi)

## Instalação
- Clone o repositório e acesse o diretório **hearth-stone-back**
- execute o comando **mvn clean package** via terminal (Bash ou Commander)
- execute o comando **java -jar target/hearth-stone-back-0.0.1-SNAPSHOT.jar**

**Deverá ser apresentada a seguinte saída via console:**
![image](https://user-images.githubusercontent.com/46661562/131259719-dd266e93-2e7f-4411-931c-08d3ad65eb13.png)

**obs** _Verifique se não ocorreu exceptions, se ocorreu você pode ter executado o maven com uma versão diferente do java 8_

## Testando a API ##
- Com POSTMAN -> use a seguinte [Collection](https://pastebin.com/66qvNdPN) e importar ela no [Postman](https://www.postman.com/downloads/)
- Com Frontend -> siga as [instruções deste link](https://github.com/jonasdsg/tema-sistemas-hearth-stone-challenge/tree/main/hearth-stone-front)

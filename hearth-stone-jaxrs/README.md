# hearth-stone-jaxrs
Versão do backend utilizando as especificações JakartaEE.

## Requisitos Minimos
- 4GB de memória RAM
- 500MB de espaço em disco
- Java 8 [Tutotial de instalação no Winddows](https://jonasdsg.medium.com/como-instalar-e-configurar-o-java-para-desenvolvimento-no-windows-jdk-2b4de4a8c905?source=user_profile---------1----------------------------)  [Tutorial de instalação no Linux](https://jonasdsg.medium.com/como-instalar-e-configurar-o-java-para-desenvolvimento-jdk-no-linux-qualquer-distribui%C3%A7%C3%A3o-ffbab58a5195?source=user_profile---------0----------------------------)
- Maven [Download](https://maven.apache.org/ref/3.8.2/download.cgi)
- Wildfly 24.0.x ou superior [Download](https://www.wildfly.org/downloads/)

## Instalação
- Baixe o Wildfly e extraia a pasta.
- Clone o repositório e acesse o diretório **hearth-stone-jaxrs**
- execute o comando **mvn clean package** via terminal (Bash ou Commander)
- copie o arquivo  **target/hearth-stone-jaxrs-0.0.1-SNAPSHOT.war** para o diretório **wildfly-{versao}/standalone/deployments**
- execute o arquivo **wildfly-{versao}/bin/standalone.sh** para linux ou **wildfly-{versao}/bin/standalone.bat** para windows.

Veja se a tela foi exibida sem erros:
![image](https://user-images.githubusercontent.com/46661562/131282672-68cd52a2-cda6-4ae0-82bf-e654e9a1238f.png)

**Obs:** _Fique atento ao contexto da publicação_
![image](https://user-images.githubusercontent.com/46661562/131282672-68cd52a2-cda6-4ae0-82bf-e654e9a1238f.png)


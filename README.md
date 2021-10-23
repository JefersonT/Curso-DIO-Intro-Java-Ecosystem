# Curso-DIO-Intro-Java-Ecosystem
Curso de Introdução ao Ecossistema e Documentação Java


# Introdução ao Ecossistema Java

- **INTRODUÇÃO AO ECOSSISTEMA JAVA**
    - **INTRODUÇÃO AO ECOSSISTEMA JAVA**
        
        > Java é uma linguagem de programação e plataforma computacional lançada pela primeira vez pela Sun Microsystems em 1995. Oracle, 2021
        > 
        
        Características:
        
        - Compilada
        - Interpretada
        - Fortemente tipada
        - Linguagem de alto nível
        - Executada em uma máquina virtual - JVM
        
        ![Untitled](Introduc%CC%A7a%CC%83o%20ao%20Ecossistema%20Java%20efe2a9581414448dbe2543c770fe2639/Untitled.png)
        
    - **ENTENDENDO A JVM**
        
        JVM (Java Virtual Machine) é uma máquina virtual responsável pel atradução dos ByteCodes oriundos do compilador Javac (Java Compiler) em código de máquina de cada sistema operacional.
        
        Características:
        
        - Execução de pilhas
        - Gerenciamento de memória - alocação e desalocação de memória
        - Gerenciamento de threads - execução de threads
        - Otimização de código (Compilação JIT - Just In Time)
        - Garbage Collector (GC) - responsável por fazer limpeza da memória.
        
        Diferença Java para outras linguagens compiladas:
        
        ![Untitled](Introduc%CC%A7a%CC%83o%20ao%20Ecossistema%20Java%20efe2a9581414448dbe2543c770fe2639/Untitled%201.png)
        
        Quais as diferenças entre JRE e JDK?
        
        - JRE (Java Runtime Environment) - responsável por executar os programas em Java.
        - JDK (Java Development Kit) - utilitários que permite o desenvolvimento de programas em Java. Já possui a JVM para executar os programas.
        
        Quais os tipos de plataformas Java?
        
        - **Java SE (Java Standard Edition)** - contém as especificações do Java e pode ser implementado por diversas empresas como Oracle, OpenJDK, Azul Zulu, etc.
        - **Java EE (Java Enterprise Edition)** - contém todas as espeficicações do Java SE e um número de programas úteis para que executam em servidores. Em 2019 foi renomeado para Jakarta EE.
        - **Java ME (Java Micro Edition)** - contém especificações para desenvolvimento de programas para dispositivo pequenos como celulares, PDAs. entre outros.
        
        Quais as implementações Java SE?
        
        - **OpenJDK**
        - Oracle JDK
        - AdoptOpenJDK
        - Amazon Corretto
        - GraaIVM CE
        - Azul Zulu
    - **INSTALANDO A JVM**
        
        ```bash
        sudo apt install curl
        
        #Instalando Java Version Manager https://github.com/shyiko/jabba:
        curl -sl https://github.com/shyiko/jabba/raw/master/install.sh | bash && . ~/.jabba/jabba.sh
        
        jabba ls-remote #listar todas as versões do jdk disponíveis
        jabba install openjdk@1.11 #instalar o jdk e a versão específica
        jaba use openjdk@1.11 #usar o jdk instalado
        java -version #verificar a versão do java instalado
        ```
        
    - **EXECUTANDO UM PROGRAMA JAVA**
        
        Criando class principal (src/com/dio/MyFirstProgram.java):
        
        ![Untitled](Introduc%CC%A7a%CC%83o%20ao%20Ecossistema%20Java%20efe2a9581414448dbe2543c770fe2639/Untitled%202.png)
        
        ```bash
        mkdir src
        ls scr/
        mkdir com
        ls com/
        mkdir dio
        ls dio/
        vim MyFirstProgram.java
        ```
        
        Ou simplesmente criar através o IDE que preferir.
        
        Compilando:
        
        ```bash
        #Executar dentro da pasta do pro
        jabba use openjdk@1.11
        javac -d target/ -sourcepath src/ src/com/dio/MyFirstProgram.java
        ```
        
        Executando:
        
        ```bash
        #Executar dentro da pasta do projeto
        cd target/
        java com.dio.MyFirstProgram.java
        ```
        
- **CONTEXTUALIZAÇÃO DE USO JAVA VERSÃO 11**
    - **PALAVRAS RESERVADAS**
        
        ![Untitled](Introduc%CC%A7a%CC%83o%20ao%20Ecossistema%20Java%20efe2a9581414448dbe2543c770fe2639/Untitled%203.png)
        
    - **DECLARAÇÕES DE CLASSES**
        
        Estrutura básica de uma classe:
        
        ```java
        //uma classe sempre será composta por um modificador de acesso "public, private ..."
        //pela palavra reservada "class"
        //e pelo nome da classe "Order"
        public class Order {
        	// atributos e métodos
        }
        ```
        
        Estrutura com atributos e métodos:
        
        ```java
        public class Order {
        	// atributos
        	// modificador de acesso, 
        	// palavra reservada, 
        	// tipo do atributo ou variável
        	// nome da várialvel ou tributo
        	private final String code;  
        	private final BigDecimal totalValue;
        
        	// Métodos
        	// modificador de acesso,
        	// tipo de retorno
        	// nome do método
        	public BigDecimal calculateFee() {
        	}
        }
        ```
        
        Estrutura completa de uma classe:
        
        ```java
        package com.dio.base; //definição do pacote
        
        import java.math.BigDecimal; //importação de classe
        
        public class Order {
        	private final String code;  
        	private final BigDecimal totalValue;
        	
        	// método contrutor
        	public Order (String code, BigDecimal totalValue) {
        		this.code = code;
        		this.totalValue = totalValue;
        	}
        
        	//método para calcular as taxas
        	public BigDecimal calculateFee() {
        		return this.totalValue.multiply(new BigDecimal("0.99"));
        	}
        }
        ```
        
    - **MODIFICADORES DE ACESSO**
        
        Tipos de modificadores:
        
        - *public* - Qualquer classe de qualquer pacote poderá acessar o atributo ou método.
        - *protected* - Qualquer classe definida no mesmo pacote ou subclasse.
        - Sem modificador - Apenas classes definidas no mesmo pacote.
        - *private* - Apenas a própria classe.
    - **MÉTODOS**
        
        Métodos são funções que definem o comportamento de uma classe.
        
        Tipos de métodos:
        
        - Métodos construtores - Definem como uma classe será instanciada "construída"
        - Métodos comuns - Definem comportamentos que podem ou não estar atribuídas às regras de negócio. Ex: calcular taxas de um pedido, etc.
    - **ESTRUTURA DE CONDIÇÃO**
        
        Estrutura de condição é responsável por fazer o desvio do fluxo de execução do código de acordo com uma dada condição.
        
        Tipos de estrutura de condição:
        
        - if - else
        - switch - case
    - **ESTRUTURA DE REPETIÇÃO**
        
        Estrutura de repetição é responsável por executar repetitivamente uma instrução ou um bloco de instruções até uma condição estiver sendo satisfeita.
        
        Tipos de estrutura de repetição:
        
        - while
        - do - while
        - for
        - enhanced for
- **DOCUMENTAÇÃO JAVA**
    - **COMENTÁRIO EM LINHA**
        
        ```java
        //Comentário em lina é feito com "//"
        public class Order {
        	// atributos e métodos
        }
        ```
        
    - **COMENTÁRIO EM BLOCO**
        
        ```java
        /**
         * Comentário em bloco
         * são iniciados por "/**"
         * e finalizados por "*/"
        */
        
        public class Order {
        	// atributos e métodos
        }
        ```
        
    - **JAVADOC**
        
        Javadoc é uma ferramenta para documentação no formato HTML que se baseia nos comentários do código-fonte.
        
        Os comentários precisam conter tags para que a documentação fique legível.
        
    - **TAGS JAVADOC**
        
        Tipos de tags:
        
        - @author - Especifica o autor da classe ou do método.
        - @deprecated - Identifica classes ou métodos obsoletos.
        - @link - Possibilita a definição de um link para um outro documento local ou remoto através de um URL
        - @param - Descreve um parâmetro que será passado a um método.
        - @return - Descreve qual o tipo de retorno de um método.
        - @see - Associa a outras classes ou métodos.
        - @since - Descreve desde quando uma classe ou métodos foi adicionado.
        - @version - Descreve a versão da classe ou método.
        
        Feito os comentários utilizando o Javadoc executar o seguintes comando na pasta do projeto.
        
        ```bash
        jabba use openjdk@1.11
        java -version
        
        javadoc -d javadoc/ -sourcepath src/ -subpackages com.dio
        ```
        
        Assim irá dentro da pasta javadoc o index.html onde irá mostrar a documentação em forma de documentação.
        
- **MERCADO E CARREIRA JAVA**
    - **COMUNIDADE JAVA**
        - O tamanho da comunidade auxilia na escolha de uma linguagem de programação de uma empresa.
        - Qualidade e facilidade para encontrar informações sobre a linguagem diminuem a curva de aprendizado.
        - Atualmente existem comunidades de tecnologias onde é possível encontrar um grupo voltado para a linguagem.
        
        Comunidades:
        
        - OpenSanca - opensanca.com.br
        - SouJava - soujava.org.br
        - DevOpsPBS - devopspbs.org
    - **CARREIRA**
        - Muitas empresas de tecnologia aplicam a carreira em "Y".
        - É importante se especializar em uma área: backend, frontend, SRE (site reliability engineering), data engineer, etc.
        - Escolher e focar em uma plataforma de desenvolvimento Java: web, desktop ou mobile.
        
        Carreira em "Y":
        
        ![Untitled](Introduc%CC%A7a%CC%83o%20ao%20Ecossistema%20Java%20efe2a9581414448dbe2543c770fe2639/Untitled%204.png)
        
    - **MERCADO ATUAL**
        - Atualmente o mercado para profissionais de TI em geral está em alta.
        - O mercado está carente de profissionais qualificados.
        - Startups de diversos ramos adotaram a linguagem Java: PagSeguro, iFood, AWS, Mercado Livre, Itaú, C6 Bank, Dafiti, Luizalabs, etc.
    - **REQUISITOS DO PROFISSIONAL**
        - Ao evoluir na carreira de Java ou em qualquer carreira de TI é necessário desenvolver tanto Soft Skills quanto Hard Skills.
        - Cada vez mais Soft Skills estão se tornando mais prioritárias que Hard Skills
        
        Exemplos de Soft Skills:
        
        - Resolução de Problemas Complexos
        - Pensamento Crítico
        - Criatividade
        - Gestão de Pessoas
        - Coordenação em equipe
        - Liderança
        
        Exemplos de Hard Skills:
        
        - Spring Boot
        - Spring Cloud
        - Apache Kafka
        - RabbitMQ
        - Arquitetura Cloud
        - Banco de dados relacional e não relacional

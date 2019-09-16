<h2> Repositório criado para consolidar o aprendizado do framework spring, tendo como referência pequenos projetos </h2>
<br>
<h2> Listando anotações do Spring com uma breve descrição </h2> 
<br>

<h3> @Configuration </h3>
<p> Quando usado no topo de qualquer classe, é declarado que essa classe fornece um ou mais métodos @Bean que podem ser processados
pelo spring </p> 

<h3> @Bean </h3> 
<p> Métodos anotados, são objetos instanciados, montados de outra forma, pelo Spring Ioc.

<strong> Spring Ioc: </strong> A inversão de controle é um padrão de projeto onde a sequência (controle) de chamadas dos métodos não é
determinada diretamente pelo programador. Este controle é delegado a uma infraestrutura de software, muitas vezes chamada de container, ou a qualquer outro componente que
possa tomar controle sobre a execução.

<h3> @ComponentScan </h3>
<p> É usado após a anotação @configuration, especifíca que o pacote desejado para ser gerenciado pelo spring. 
Quando usado sem argumentos @ComponentScan assume que o spring irá escanear o pacote corrent e seus sub-diretórios </p>

<h3> @Component </h3>
<p>  A mesma serve para indicar ao framework que aquela classe é um bean que deverá ser administrado pela implementação de 
IoC Container do Spring. </p> 

<h3> @Autowired </h3>
<p> Indica o ponto de injeção dentro de sua classe </p>

<h3> @Qualifier </h3> 
<p> Quando um @Bean é anotado com um nome, a anotação @Qualifier permite que vc referencie pelo nome o objeto desejado. </p> 

<br><h3> Spring Boot </h3> 
<p> 
  Spring Boot é um projeto que visa facilitar o desenvolvimento, configuraçã que façam uso dos frameworks da família spring. </p>
 
<p> 
  <strong> Convenção sobre configuração: </strong> O Spring boot trabalha com configurações padrões. Apenas particularidades   precisam ser adicionadas 
</p>

<p> <strong>  Servidor Java embutido:</strong> Não é necessário instalar um servidor java em separado para inicialiar uma aplicação. </p>

<p> <strong> Sem XML: </strong> O Spring Boot aboliu uso do xml para configuração (Graças a deus hehe!) </p>

<p> <strong> mvn spring-boot:run </strong> - Roda o projeto a partir do maven </p><br>

<h3> Spring Data JPA </h3> 

<p> Spring Data JPA é uma framework da família spring que tem como objetivo auxiliar na tarefa de persistir dados JPA </p>

<p> <strong> Repositórios:</strong> Permitem consultas, operações de CRUD.  </p> 
<p> <strong> Entidades: </strong> Mapeam Tabelas no BD.  </p>

<h3> @Query </h3>
<p> Permite a construção de consultas utilizando a linguagem JPQL (Java Persistence QUery Language )</p>

<h3> @Transactional </h3>
<p> Anotação responsavel por controle de transaçes no banco, caso haja um alteração inesperada, o spring desfaz todas as alteraçoes no banco.</p> 
 

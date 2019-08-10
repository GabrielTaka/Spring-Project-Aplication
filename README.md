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

a SOAP-based web service server with Spring.
git clone https://github.com/girogope-gp/pokemon-api

You can run the application from the command line with Maven. 
You can also build a single executable JAR file that contains all the necessary dependencies, classes, and resources and run that. 
Building an executable jar makes it easy to ship, version, and deploy the service as an application throughout the development lifecycle, across different environments, 
and so forth.

java -jar build/libs/pokemon-0.1.0.jar

If you use Maven, you can run the application by using ./mvnw spring-boot:run. 
Alternatively, you can build the JAR file with ./mvnw clean package and then run the JAR file, as follows:

java -jar target/pokemon-0.1.0.jar

You can use SoapUI or command-line tools if you are on a *nix/Mac system. The following example uses curl from the command line:

curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws

The WSDL will be available on: http://localhost:8080/ws/pokemon.wsdl


Application Structure

*Presentation Layer: Controller that handle requests and responses.
*Business Logic Layer: Service that process business logic.
*Data Access Layer: Repository that interact with the REST API.


RESTful API Consumption

*Use HttpClient to consume the Pokemon API and obtain paginated results.

*Exposing a SOAP Service

*Use JAXB2 to create the SOAP service that exposes the results.


Design Patterns
* **Singleton**: To ensure there is only one instance of the HTTP client.
  In the PokemonRepository implement the Singleton pattern to ensure there is only one instance of the HTTP client consuming the API, 
  which saves resources and improves performance.
  
* **DTO (Data Transfer Object)**: To transfer data between layers.
  The use of PokemonDTO allows encapsulation of data transferred between the data access layer and presentation layer, facilitating data manipulation and transport.


## Microservice for Teachers Management.

### Description
This system uses a feign client to map Instructors to Teachers. Made using a variation of Hexagonal architecture. <br>
This is the consumer.<br>
That is the <a href="https://github.com/guigann/ms-teachers-management-consumer" target="_blank"> producer</a>. <br>

### [Documentation](docs/MS%20Teachers%20Management%20Consumer%20V1.pdf)

> :warning: **Make sure to run the producer first**
> 
### How to Run
1. Clone the repository

```
git clone https://github.com/guigann/ms-teachers-management-consumer.git
```
2. Make sure that maven is installed in the project and that the .jar files are generated in the **/target** folder, otherwise, perform the step below:
```
mvn clean
mvn install
mvn package
```
3. Run the docker-compose for Kafka
```
docker-compose -f docker-compose.yml build
docker-compose -f docker-compose.yml up
```
> **Note:** Make sure to run the above commands in the **project root directory**.
4. Finally, run the project and enjoy :)

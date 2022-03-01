# prog-jee

## Commandes à retenir

### Maven
 - mvn archetype:generate <nom> <version> ...
 - mvn compile
 - mvn test
 - mvn package
 - mvn clean
 - mvn site

### Java compilation
 - javac (.java --> .class)
 - java (.class)
 - jvm
 
### Variables d'environnement
 - source .bashrc
 - $PATH
 - $JAVA_HOME
 - rm -rf  ~/m2 ##supprime le cahce maven

### Fichiers Maven
 - pom.xml (MVN):
    tout ce qui est nécessaire pour compiler/run notre programme
 - manifest.mf (JVM):
    dépendances du projet
 - persistance.xml (noms de sclasses rendues persistantes)



- google Guice = injection de dépendance

### Persistance
- ORM (Object Relational Mapping)
- DAO (Data Access Object) --> methode CRUD (Create Read Update Delete) --> JPQL (SQL pour java)
- Entity
- JPA (Java Persistance API) standard java pour persistance
- Hibernate
- Entity Manager (em)
- transaction = ensemble de requetes de mise a jours validées qu'une fois que toutes les requetes sont validées, sinon rollback
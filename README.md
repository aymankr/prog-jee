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
 - manifest.mf (JVM,[machine virtuelle Java]):
    indique les dépendances du projet à la JVM 
 - persistance.xml (noms de sclasses rendues persistantes) : 
    info sur la BD, CREATE/UPDATE/VALIDATE/... , chemin d'acces
 - web.xml : 
    decris l'appli web (Servlets ici ou dans les classes avec des anotations)
 - binary.xml:
    utilisé quand on fait "mvn assembly assembly"
 - logback.xml:
    configurer les logs (emplacement des fichier/niveaux de logs(par package/...) )

- google Guice = injection de dépendance

### Persistance
 - ORM (Object Relational Mapping)
 - DAO (Data Access Object) --> methode CRUD (Create Read Update Delete) --> JPQL (SQL pour java)
 - Entity
 - JPA (Java Persistance API) standard java pour persistance
 - Hibernate
 - Entity Manager (em)
 - transaction = ensemble de requetes de mise a jours validées qu'une fois que toutes les requetes sont validées, sinon rollback
 
 
 - JEE (Java Enterprise Edition)
 - EJB (Enterprise Java Beam)
 - JSE (Java Server Edition) --> donne un .war a placer dans un serveur web (tomcat) pour lancer l'appli
 - Servlet .java (controller mvc) --> reçoit requette http/renvoie une répose http (POST/GET)
 - JSP .jsp (Java Server Page) (vues mvc)--> code HTML avec du code java dedans
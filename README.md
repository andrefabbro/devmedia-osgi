# OSGI Example Projects

Build with gradle, example:

```
cd devmedia-hello-service/
gradle install
cd ../devmedia-osgi-exemplo/
gradle build
```

Start Apache Felix OSGi container:

```
cd $PATH_TO_APACHE_FELIX_INSTALL/
java -jar bin/felix.jar
```

In Gogo Shell install the bundles:

```
install devmedia-hello-service.jar
install devmedia-osgi-exemplo.jar
```
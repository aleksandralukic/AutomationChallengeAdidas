#### Requirements:

- Java 9.0.4 or higher
- EclipseIDE installed (Oxygen)

#### SETUP

##### Requirements test:

Test that node and Java are installed by typing the following into the terminal, which returns the installed versions of Node, npm and Java:

`node -v`

`npm -v`

`java--version`

##### Maven installation

[Here](https://maven.apache.org/download.cgi#Installation) you can download the binary archive needed for Maven.

The installation of Apache Maven is a simple process of extracting the archive and adding the `bin` folder with the `mvn` command to the `PATH`.

Detailed steps are:

- Ensure `JAVA_HOME` environment variable is set and points to your JDK installation

You can check this by typing

- Extract distribution archive in any directory

`tar xzvf apache-maven-3.5.3-bin.tar.gz`

- Add the `bin` directory of the created directory `apache-maven-3.5.3` to the `PATH` environment variable
- Confirm with `mvn -v` in a new shell.
- Check environment variable value

`echo $JAVA_HOME`

`/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home`

- Adding to `PATH`

`export PATH=/opt/apache-maven-3.5.3/bin:$PATH`

##### Creating a maven project

First, [download Maven](https://maven.apache.org/download.html) and follow the [installation instructions](https://maven.apache.org/download.html#Installation). After that, type the following in a terminal or in a command prompt:

`mvn --version`

You will need somewhere for your project to reside, create a directory somewhere and start a shell in that directory. On your command line, execute the following Maven goal by replacing the groupID and ArtifactID with values bellow:

`mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`

Replace the values by following:

`mvn archetype:generate -DgroupID=**{project-packaging}**`

`-DartifactId=**{project-name}**`

`-DarchetypeArtifacrId=maven-archetype-quickstart`

`-DinteractiveMode=false`

Connect the project to EclipseIDE: (in the project folder)

`mvn eclipse:eclipse`

##### Configuring the dependencies in the POM

If you have successfully completed the steps above you will see pom.xml in your project when you open EclipseIDE.

The `pom.xml` file is the core of a project's configuration in Maven. It is a single configuration file that contains the majority of information required to build a project in just the way you want. The POM is huge and can be daunting in its complexity, but it is not necessary to understand all of the intricacies just yet to use it effectively. To add dependencies you can go and search online for them here: <https://mvnrepository.com/>

Mostly used commands in the Maven:

`mvn compile`

`mvn clean`

`mvn test`

By running the following command in your CLI you will run the specific test: `mvn test -Dtest=classname`

Dependencies you will need are included in the POM file.

# API TEST

This is a short test created using Restfull API testing tool.

I've used a couple of commong URL's to check if it is possible to get weather for one location and I've verified if the JSON response is matching the city I was getting forecast for.


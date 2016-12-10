# liferay-kotlin-maven-support
Parent repository to support maven archetype generation of Liferay plugins with Kotlin.

Kotlin is a new statically-typed programming language developed by Jetbrain that runs on <b>Java Virtual Machine</b>. The main benefits are:

  -Null-safe language.
  -Any 3rd library type extension.
  -Concise and simple to write.
  
You can view more details in https://kotlinlang.org/ .

For use any of archetypes included here you have to clone the repository in your machine and execute from the repository root folder:

<b>mvn clean install</b>

This is required one time only, after this you can list and use the local archeypes executing:

<b>mvn archetype:generate -DarchetypeCatalog=local</b>



# liferay-kotlin-maven-support
Parent repository to support maven archetype generation of Liferay plugins with Kotlin.

Kotlin is a new statically-typed programming language developed by Jetbrain that runs on <b>Java Virtual Machine</b>. The main benefits are:

  &nbsp;&nbsp;&nbsp;&nbsp;-Null-safe language.<br>
  &nbsp;&nbsp;&nbsp;&nbsp;-Any 3rd library type extension.<br>
  &nbsp;&nbsp;&nbsp;&nbsp;-Concise and simple to write.
  
You can view more details in https://kotlinlang.org/ .

You have two options to use the archetypes of this repo:

&nbsp;&nbsp;&nbsp;&nbsp;1- For use any of archetypes included here you have to clone the repository in your machine and execute from the repository root folder:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>mvn clean install</b>

&nbsp;&nbsp;&nbsp;&nbsp;2- You can install each archetype separately downloading the jar with these commands:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>wget https://github.com/atrujillofalcon/liferay-kotlin-maven-support/releases/download/1.0.0-beta/liferay-kotlin-portlet-archetype-1.0.0-beta.jar</b>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;and after execute:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>mvn install:install-file -Dfile=liferay-kotlin-portlet-archetype-1.0.0-beta.jar -DgroupId=atrujillo.liferay.archetypes -DartifactId=liferay-kotlin-portlet-archetype -Dversion=1.0.0-beta -Dpackaging=maven-archetype</b>

This is required one time only, after this you can list and use the local archeypes executing:

<b>mvn archetype:generate -DarchetypeCatalog=local</b>


[![](https://jitpack.io/v/atrujillofalcon/liferay-kotlin-maven-support.svg)](https://jitpack.io/#atrujillofalcon/liferay-kotlin-maven-support)

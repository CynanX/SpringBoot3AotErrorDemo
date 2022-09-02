# Spring Boot 3 Aot Error Demo

Demo application showing AoT compilation error when using SB3 snapshot

When trying to compile this application with the native profile you will see the following exception: -

```
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.reflect.Executable.getDeclaringClass()" because "executable" is null
	at org.springframework.beans.factory.aot.DefaultBeanRegistrationCodeFragments.extractDeclaringClass(DefaultBeanRegistrationCodeFragments.java:84)
	at org.springframework.beans.factory.aot.DefaultBeanRegistrationCodeFragments.getTarget(DefaultBeanRegistrationCodeFragments.java:75)
	at org.springframework.beans.factory.aot.BeanDefinitionMethodGenerator.generateBeanDefinitionMethod(BeanDefinitionMethodGenerator.java:97)
	at org.springframework.beans.factory.aot.BeanRegistrationsAotContribution.lambda$generateRegisterMethod$2(BeanRegistrationsAotContribution.java:83)
	at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:721)
	at org.springframework.beans.factory.aot.BeanRegistrationsAotContribution.generateRegisterMethod(BeanRegistrationsAotContribution.java:81)
	at org.springframework.beans.factory.aot.BeanRegistrationsAotContribution.lambda$applyTo$1(BeanRegistrationsAotContribution.java:67)
	at org.springframework.aot.generate.GeneratedMethod.<init>(GeneratedMethod.java:48)
	at org.springframework.aot.generate.GeneratedMethods.add(GeneratedMethods.java:85)
	at org.springframework.aot.generate.GeneratedMethods.add(GeneratedMethods.java:72)
	at org.springframework.beans.factory.aot.BeanRegistrationsAotContribution.applyTo(BeanRegistrationsAotContribution.java:66)
	at org.springframework.context.aot.BeanFactoryInitializationAotContributions.applyTo(BeanFactoryInitializationAotContributions.java:78)
	at org.springframework.context.aot.ApplicationContextAotGenerator.lambda$processAheadOfTime$0(ApplicationContextAotGenerator.java:58)
	at org.springframework.context.aot.ApplicationContextAotGenerator.withGeneratedClassHandler(ApplicationContextAotGenerator.java:66)
	at org.springframework.context.aot.ApplicationContextAotGenerator.processAheadOfTime(ApplicationContextAotGenerator.java:53)
	at org.springframework.boot.AotProcessor.performAotProcessing(AotProcessor.java:144)
	at org.springframework.boot.AotProcessor.process(AotProcessor.java:105)
	at org.springframework.boot.AotProcessor.main(AotProcessor.java:213)
```

# Project Base for Vaadin Flow and Spring Boot

Demo to show a defect when using `@Autowired Detail detail;` to inject a `@Component` into the `MainView`.
This won't compile when you use a `DatePicker` like so `DatePicker datePicker = new DatePicker();` in the `@Component` `Detail.java`!


```
               _                     _                  _             _         _                     _         __              _   
  __ _  _   _ | |_   ___  __      __(_) _ __   ___   __| |         __| |  __ _ | |_   ___          __| |  ___  / _|  ___   ___ | |_ 
 / _` || | | || __| / _ \ \ \ /\ / /| || '__| / _ \ / _` | _____  / _` | / _` || __| / _ \ _____  / _` | / _ \| |_  / _ \ / __|| __|
| (_| || |_| || |_ | (_) | \ V  V / | || |   |  __/| (_| ||_____|| (_| || (_| || |_ |  __/|_____|| (_| ||  __/|  _||  __/| (__ | |_ 
 \__,_| \__,_| \__| \___/   \_/\_/  |_||_|    \___| \__,_|        \__,_| \__,_| \__| \___|        \__,_| \___||_|   \___| \___| \__|
                                                                                                                                    

2018-09-08 15:18:37.661  INFO 25090 --- [  restartedMain] com.gork.spring.Application              : Starting Application on Georgs-MacBook-Pro.local with PID 25090 (/Users/georg/Develop/vaadin/flow/autowired-date-defect/target/classes started by georg in /Users/georg/Develop/vaadin/flow/autowired-date-defect)
2018-09-08 15:18:37.661  INFO 25090 --- [  restartedMain] com.gork.spring.Application              : No active profile set, falling back to default profiles: default
2018-09-08 15:18:37.664  INFO 25090 --- [  restartedMain] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@3fe8c95d: startup date [Sat Sep 08 15:18:37 CEST 2018]; root of context hierarchy
2018-09-08 15:18:37.873  INFO 25090 --- [  restartedMain] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'dispatcherServletRegistration' with a different definition: replacing [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration; factoryMethodName=dispatcherServletRegistration; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/autoconfigure/web/servlet/DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration.class]] with [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=com.vaadin.flow.spring.SpringBootAutoConfiguration; factoryMethodName=dispatcherServletRegistration; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [com/vaadin/flow/spring/SpringBootAutoConfiguration.class]]
2018-09-08 15:18:37.958  INFO 25090 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2018-09-08 15:18:37.959  INFO 25090 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2018-09-08 15:18:37.959  INFO 25090 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.31
2018-09-08 15:18:37.978  INFO 25090 --- [ost-startStop-1] o.a.c.c.C.[Tomcat-3].[localhost].[/]     : Initializing Spring embedded WebApplicationContext
2018-09-08 15:18:37.979  INFO 25090 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 315 ms
2018-09-08 15:18:37.996  INFO 25090 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcher mapped to [/*]
2018-09-08 15:18:37.996  INFO 25090 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet springServlet mapped to [/vaadinServlet/*]
2018-09-08 15:18:37.996  INFO 25090 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-09-08 15:18:37.997  INFO 25090 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2018-09-08 15:18:37.997  INFO 25090 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2018-09-08 15:18:37.997  INFO 25090 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-09-08 15:18:38.052  WARN 25090 --- [  restartedMain] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'detail': Invocation of init method failed; nested exception is java.lang.NullPointerException
2018-09-08 15:18:38.052  INFO 25090 --- [  restartedMain] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2018-09-08 15:18:38.061  INFO 25090 --- [  restartedMain] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2018-09-08 15:18:38.063 ERROR 25090 --- [  restartedMain] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'detail': Invocation of init method failed; nested exception is java.lang.NullPointerException
	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor.postProcessBeforeInitialization(InitDestroyAnnotationBeanPostProcessor.java:138) ~[spring-beans-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyBeanPostProcessorsBeforeInitialization(AbstractAutowireCapableBeanFactory.java:422) ~[spring-beans-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1698) ~[spring-beans-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:579) ~[spring-beans-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:501) ~[spring-beans-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:317) ~[spring-beans-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$$Lambda$98/475923627.getObject(Unknown Source) ~[na:na]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:228) ~[spring-beans-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:315) ~[spring-beans-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:760) ~[spring-beans-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:869) ~[spring-context-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:550) ~[spring-context-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:140) ~[spring-boot-2.0.2.RELEASE.jar:2.0.2.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:759) [spring-boot-2.0.2.RELEASE.jar:2.0.2.RELEASE]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:395) [spring-boot-2.0.2.RELEASE.jar:2.0.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:327) [spring-boot-2.0.2.RELEASE.jar:2.0.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1255) [spring-boot-2.0.2.RELEASE.jar:2.0.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1243) [spring-boot-2.0.2.RELEASE.jar:2.0.2.RELEASE]
	at com.gork.spring.Application.main(Application.java:13) [classes/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_05]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_05]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_05]
	at java.lang.reflect.Method.invoke(Method.java:483) ~[na:1.8.0_05]
	at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:49) [spring-boot-devtools-2.0.2.RELEASE.jar:2.0.2.RELEASE]
Caused by: java.lang.NullPointerException: null
	at com.vaadin.flow.component.datepicker.DatePicker.<init>(DatePicker.java:81) ~[vaadin-date-picker-flow-1.0.6.jar:na]
	at com.vaadin.flow.component.datepicker.DatePicker.<init>(DatePicker.java:67) ~[vaadin-date-picker-flow-1.0.6.jar:na]
	at com.gork.spring.Detail.init(Detail.java:21) ~[classes/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_05]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_05]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_05]
	at java.lang.reflect.Method.invoke(Method.java:483) ~[na:1.8.0_05]
	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor$LifecycleElement.invoke(InitDestroyAnnotationBeanPostProcessor.java:365) ~[spring-beans-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor$LifecycleMetadata.invokeInitMethods(InitDestroyAnnotationBeanPostProcessor.java:308) ~[spring-beans-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor.postProcessBeforeInitialization(InitDestroyAnnotationBeanPostProcessor.java:135) ~[spring-beans-5.0.6.RELEASE.jar:5.0.6.RELEASE]
	... 24 common frames omitted


```
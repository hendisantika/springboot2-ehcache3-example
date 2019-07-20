# springboot2-ehcache3-example
## Introduction to Caching

Caching represents a mechanism to increase system performance by storing the recently used data items by reducing database trips. It acts as a temporary memory present between application and database. In general, there are four types of caches i.e.

* In-memory caching
* Database caching
* Web server caching
* CDN caching

Caching annotations in spring boot

Following annotations are used in a spring boot application.

* @EnableCaching: This annotation enables the caching capability in a spring boot application
* @Cacheable: This method level annotation tells the spring framework to make the method response is cacheable
* @CachePut: This annotation updates the cache before the method execution
* @CacheEvict: This annotation removes the specific key from the cache. If developers want to remove all the entries from the cache they can use the allEntries=true attribute

Now, open the your favorite IDE and let’s see how to implement this tutorial in spring boot.
## Project Demo
1. Clone the repo: `git clone https://github.com/hendisantika/springboot2-ehcache3-example.git`

2. Go yo your folder: `cd springboot2-ehcache3-example`

3. Run the application: `mvn clean spring-boot:run`

4. Console Output:
```

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.6.RELEASE)

2019-07-21 06:35:02.667  INFO 98567 --- [           main] .s.Springboot2Ehcache3ExampleApplication : Starting Springboot2Ehcache3ExampleApplication on Hendis-MacBook-Pro.local with PID 98567 (/Users/hendisantika/IdeaProjects/springboot2-ehcache3-example/target/classes started by hendisantika in /Users/hendisantika/IdeaProjects/springboot2-ehcache3-example)
2019-07-21 06:35:02.669  INFO 98567 --- [           main] .s.Springboot2Ehcache3ExampleApplication : No active profile set, falling back to default profiles: default
2019-07-21 06:35:03.647  WARN 98567 --- [           main] o.t.o.p.UpfrontAllocatingPageSource      : Attempting to allocate 100.0MB of offheap when there is only 89.5MB of free physical memory - some paging will therefore occur.
2019-07-21 06:35:03.648  INFO 98567 --- [           main] o.t.o.p.UpfrontAllocatingPageSource      : Allocating 100.0MB in chunks
2019-07-21 06:35:03.720  INFO 98567 --- [           main] org.ehcache.core.EhcacheManager          : Cache 'employeeCache' created in EhcacheManager.
2019-07-21 06:35:03.793  INFO 98567 --- [           main] org.ehcache.jsr107.Eh107CacheManager     : Registering Ehcache MBean javax.cache:type=CacheStatistics,CacheManager=file./Users/hendisantika/IdeaProjects/springboot2-ehcache3-example/target/classes/ehcache.xml,Cache=employeeCache
2019-07-21 06:35:03.803  INFO 98567 --- [           main] org.ehcache.jsr107.Eh107CacheManager     : Registering Ehcache MBean javax.cache:type=CacheStatistics,CacheManager=file./Users/hendisantika/IdeaProjects/springboot2-ehcache3-example/target/classes/ehcache.xml,Cache=employeeCache
2019-07-21 06:35:03.929  INFO 98567 --- [           main] .s.Springboot2Ehcache3ExampleApplication : Started Springboot2Ehcache3ExampleApplication in 1.627 seconds (JVM running for 5.668)
Getting employee from DB
2019-07-21 06:35:03.979  INFO 98567 --- [e [_default_]-0] c.h.s.listener.CustomCacheEventLogger    : Cache event = CREATED, Key = 1,  Old value = null, New value = Employee [id=1, firstName=Uzumaki, lastName=Naruto]
2019-07-21 06:35:03.981  INFO 98567 --- [           main] .s.Springboot2Ehcache3ExampleApplication : Employee [id=1, firstName=Uzumaki, lastName=Naruto]
2019-07-21 06:35:03.986  INFO 98567 --- [           main] .s.Springboot2Ehcache3ExampleApplication : Employee [id=1, firstName=Uzumaki, lastName=Naruto]
2019-07-21 06:35:03.986  INFO 98567 --- [e [_default_]-0] c.h.s.listener.CustomCacheEventLogger    : Cache event = CREATED, Key = 5,  Old value = null, New value = Employee [id=5, firstName=Uchiha, lastName=Madara]
2019-07-21 06:35:03.987  INFO 98567 --- [           main] .s.Springboot2Ehcache3ExampleApplication : Employee [id=5, firstName=Uchiha, lastName=Madara]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  34.471 s
[INFO] Finished at: 2019-07-21T06:35:33+07:00
[INFO] ------------------------------------------------------------------------
2019-07-21 06:35:34.007  INFO 98567 --- [       Thread-8] org.ehcache.core.EhcacheManager          : Cache 'employeeCache' removed from EhcacheManager.

```

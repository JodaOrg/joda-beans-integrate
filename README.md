Joda-Beans-Integrate
--------------------

This project provides some integration modules for [Joda-Beans](http://www.joda.org/joda-beans).
Please see the main project for more details abot Joda-Beans.

The integration projcts are licensed under the business-friendly [Apache 2.0 licence](http://www.joda.org/joda-beans/license.html).

Integration is provided for:

* Freemarker (templating)
* Kryo (serialization)
* Mongo v1.x (storage)

Available in Maven Central:

```xml
<dependency>
  <groupId>org.joda</groupId>
  <artifactId>joda-beans-integrate-freemarker</artifactId>
  <version>2.1</version>
</dependency>
<dependency>
  <groupId>org.joda</groupId>
  <artifactId>joda-beans-integrate-kryo</artifactId>
  <version>2.1</version>
</dependency>
<dependency>
  <groupId>org.joda</groupId>
  <artifactId>joda-beans-integrate-mongo</artifactId>
  <version>2.1</version>
</dependency>
```


### Support
Please use GitHub issues and Pull Requests for support.


### Release process

* `mvn clean release:clean release:prepare release:perform`

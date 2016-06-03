# spring-lazy-loading-beans-example

Example of lazy loading beans and loading properties from application.properties .

## Output Example

```
INFO: Refreshing org.springframework.context.support.GenericApplicationContext@9f70c54: startup date [Thu Jun 02 18:42:28 PDT 2016]; root of context hierarchy
Hello, com.example.entities.HelloWorldBean@470f1802Autowired: com.example.entities.HelloWorldBean@470f1802
Jun 02, 2016 6:42:28 PM org.springframework.context.annotation.AnnotationConfigApplicationContext prepareRefresh
INFO: Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@9225652: startup date [Thu Jun 02 18:42:28 PDT 2016]; root of context hierarchy
Employee [id=1, firstName=John, lastName=Doe, type=manager]
Employee [id=2, firstName=John, lastName=Doe, type=director]
director
class com.example.entities.EmployeeDTO
Employee [id=2, firstName=John, lastName=Doe, type=director]
Jun 02, 2016 6:42:28 PM org.springframework.context.support.GenericApplicationContext doClose
INFO: Closing org.springframework.context.support.GenericApplicationContext@9f70c54: startup date [Thu Jun 02 18:42:28 PDT 2016]; root of context hierarchy

Process finished with exit code 0
```

- run <code>app-config</code> and <code>discovery</code> servers
- run this application  
<code>mvn spring-boot:run</code>

### Test Application
- <code>http://localhost:8083/books/local-service-instance</code>
  - example return <code>book-service:marcuss-mbp-2.lan:8083</code>  
  - schema <code>spring.cloud.config.name:url-host:port</code>
- <code>http://localhost:8083/books/1</code>
- <code>http://localhost:8083/books</code>
- <code>http://localhost:8083/books/service-instances/book-service</code>
  - returns information of book-service
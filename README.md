# student-department-microservice

This project is in progress.. I intend to do the following:-

1) There will be 2 services :-
   --Student service : This will have a database which holds the Student data. There will be an endpoint to retieve Student data 
     by fist name & last name.
    
   --Department service : This will have a database which stores the department details and student name. For retieving Student data,
     Student service will be invoked.
2)  Use Feign for microservice communication.

3) Use Eureka as naming server

4) Use Ribbon for client side load balancing.

5) Use Zuul for API routing

6) Use Hysterix for circuit breaker

7) Spring security to protect end points

CI, Docker to follow...
  

# Java Project 
- It's simple java project about Dynamic Proxy which act as bridge between user & target class
- Dynamic Proxy which act as placeholder of the interface that target class implement it OR it's Proxy of the Target class
- Daynamic Proxy uses implementation of invocation Handler as assistent
- create SalaryInvocationHandler class which implement of invocation Handler
- this handler accept obj of the target Object (ITEmployee) & has invoke() method
- inside invoke() method , apply non-functional code & execute the target method on the top of the target class (ITEmployee)
- create Proxy obj based on the interface (Employee) that target class (ITEmployee) implement it & obj of invocation Handler (SalaryInvocationHandler)
- cast the proxy obj to the Employee interface 
- call the taget method on the top of Proxy obj 

### Prerequisites
- java 17

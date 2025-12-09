# Java Project 
- It's simple java project about Dynamic Proxy which act as bridge between user & target class
- Dynamic Proxy which act as placeholder of the interface that target class implement it OR it's Proxy of the Target class
- Daynamic Proxy uses implementation of invocation Handler as assistent
- create implemented class of invocation Handler which accept obj of the target Object & has invoke() method
- inside invoke() method , apply non-functional code & execute the target method
- create Proxy obj based on the interface that target class implement it & obj of invocation Handler
- call the taget method on the top of Proxy obj 

### Prerequisites
- java 17

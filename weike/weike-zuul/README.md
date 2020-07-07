#Zuul Gateway
1. 通过访问127.0.0.1:9524/mydept/dept/info/xxxx
2. 对网关进行访问;
3. 从consumer访问可以使用以下形式访问
    1. http://SPRINGCLOUD-DEPT/dept/info/xxxx
    2. departmentService.getInfo()
    3. 或直接调用服务地址
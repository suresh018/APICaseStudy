It automates gitHub v3 version REST API. It uses java RestAssured to call rest api. I have used TestNg framework for this automation.
It is devided into following packages 
gitHub: Here all product related stuff are defined which can differ product to product like API end point, Api definition, parameters and deserivalize class. 
I have used gitHub api, so named it as gitHub.
testCases: This is the test suit. Here each method is an individual test case.

I have automated one api "current_user" which returns details of a user. This API requires Basic Authentication. So user has to provide the username 
and password in HttpMethods.java to call this api. The end point of this api is "https://api.github.com/user".

The response is in json format which is then deserialized and stored in UserDetails class object defined in DeSerializeClass.


This is a basic framework. We can read input/testdata from like username and password from xml file. Also we can implement better report by using Extent report.
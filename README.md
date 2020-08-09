# Credit Application
Credit application endpoint using spring boot.

POST Endpoint: /api/appliction 

request Parameters: 
```
identityNo
name
phone
mothlyIncome
```
Basic auth
```
username:admin
passowrd:admin
HTTP Header: Authorization: Basic YWRtaW46YWRtaW4=
```

response:

```json
{
    "errorCode":0,
    "errorMessage":null,
    "creditLimit":18000,
    "suitableForCredit":true
}
```

Swagger Url: /swagger-ui.html

H2 Database: /h2-console
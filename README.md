#JPA MAPPINGS

> User below url for posting request

http://localhost:8080/swagger-ui.html#

> One-To-Many
```
{
  "customer": {
    "name": "param",
    "addresses": [
    {
      "addressType": "BILLING",
      "city": "BENGLURU",
      "state": "KA"
    },
    {
      "addressType": "SHIPPING",
      "city": "BENGLURU",
      "state": "KA"
    }
    ]
  }
}

> One-To-One
{
  "library": {
    "title": "book1",
    "issueDate": "10/02/2020",
    "student": {
      "name": "student1"
    }
  }
}

```




#one to many -> https://www.youtube.com/watch?v=8qhaDBCJh6I&t=828s
#one to one ->

# LoginApp

Flutter와 SpringBoot로 만드는 Simple Login 앱

spring boot + kotlin + gradle + JPA

blog : https://cholol.tistory.com/562

---
API 
```json
//회원가입 POST ~/members/join
//Input
{
  "email": "moonpower",
  "password": "asdf"
}
//Output
{
  "email": "moonpower",
  "password": "asdf",
  "id": 2,
  "createdAt": "2022-04-13T23:28:14.356167223"
}

// 로그인 POST ~/members/Login
//Input
{
  "email": "moonpower",
  "password": "asdf"
}
//Output
{
  "email": "moonpower",
  "password": "asdf",
  "id": 2,
  "createdAt": "2022-04-13T23:28:14.356167223"
}
```
---
실제 로그인은 이렇게 만들면 안됩니다. 응답에 password가 있엉.... ㅋㅋ 
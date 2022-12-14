# 코멘토 2주차 과제📑
REST API를 학습해보고, SW활용률을 위한 API 가이드 문서 초안을 작성해보기  
## 1. API란 무엇인가?  
API는 어떤 서버의 특정한 부분에 접속해서 그 안에 있는 데이터와 서비스를 이용할 수 있게 해주는 소프트웨어 도구입니다.  
API를 이용하면 두 개의 소프트웨어가 서로 통신을 주고받을 수 있으며,  
이는 우리가 모바일을 이용해서 하는 모든 행동들의 기반을 이루고 있다고 할 수 있습니다.  
API가 있음으로써 IT 아키텍처가 간단하게 만들어질 수 있고, 마케팅에 힘을 실어주며, 데이터 공유를 더 쉽게 해줍니다.  
## 2. REST API
REST(Representational State Transfer)는 네트워크를 통해서 컴퓨터들끼리 통신할 수 있게 해주는 아키텍처 스타일입니다.    
REST API는 컴퓨터들이 HTTP를 통해 통신할 때, 같은 형식에 맞춰 통신하도록 하는 것으로,  
인터넷 식별자(URI)와 HTTP 프로토콜을 기반으로 합니다.  
REST는 HTTP 프로토콜 덕분에 ‘단순함’이 핵심이라고 할 수 있습니다(데이터 포맷으로는 브라우저 간 호환성이 좋은 제이슨(JSON)을 사용)  
URI를 통해 자원을 명시하고, HTTP Method(Post, Get, PUT, Delete)를 통해 해당자원의 CRUD를 적용합니다.  
* CRUD  
Create : 생성(POST)  
READ : 조회(GET)  
Update : 수정(PUT)  
Delete : 삭제(Delete)  

## 3. REST API의 장•단점  
* 장점  
•	HTTP를 활용하여, 별도의 인프라이 구축 필요 없다.  
•	HTTP 표준 프로토콜에 따르는 모든 플랫폼에서 사용 가능하다.  
•	Rest API에 메시지가 의도하는 바를 명확하게 나타낼 수 있다.  
•	여러가지 서비스 디자인에서 생길 수 있는 문제를 최소화 한다.  
•	서버와 클라이언트의 역할을 명확하게 분리한다.  
* 단점  
•	표준이 존재하지 않는다.  
•	사용할 수 있는 메소드가 제한적이다.  
•	구형 브라우저가 아직 제대로 지원하지 못한다 ( PUT, DELETE, pushState )  

## 4. HTTP 통신  
HTTP란 브라우저와 서버가 통신할 수 있도록 만들어주는 여러 프로토콜 가운데 한 종류로  
웹 브라우저와 웹 서버 사이에 HTML(웹 문서를 만들기 위한 언어) 문서를 주고받는데 쓰이는 통신 프로토콜입니다.  
![HTTP요청 응답](https://user-images.githubusercontent.com/104816594/201745735-7100f13a-d6da-4c63-936a-7849aed6ff00.png)  
HTTP 프로토콜로 데이터를 주고받기 위해서는 요청(Request)을 보내고 응답(Response)을 받아야 합니다. 
그리고 요청과 응답을 보면 클라이언트와 서버를 이해해야 합니다.  
클라이언트는 요청을 보내는 쪽을 의미하며 일반적으로 웹 관점에서 브라우저를 의미하고,  
서버는 요청을 받는 쪽을 의미하며 일반적으로 데이터를 보내주는 원격지의 컴퓨터를 의미합니다.  
 

## 5. 브라우저에 URL을 입력 후 요청하여 서버에서 응답하는 과정  
요청은 웹 브라우저의 URL 을 통해 어느 웹사이트(도메인) 의 어느 경로에 있는 페이지를 요청할지 나타내는 행위이며,    
응답은 HTTP Request 를 통해 요청된 정보에 대해 웹서버가 클라이언트에 보내는 응답형식 및 결과를 나타냅니다.    
예를 들어서  우리가 http://naver.com으로 요청을 보내면 DNS 서버를 통해 알아낸 IP주소와 입력한 URL정보가 함께 요청으로 전달됩니다.   
URL 정보와 전달받은 IP 주소는 HTTP Protocol을 사용하여 HTTP Request Message를 생성하고,  
TCP Protocol 을 사용해 인터넷을 거쳐 해당 IP주소의 컴퓨터 웹서버로 전송합니다.  
![HTTP Request Message](https://user-images.githubusercontent.com/104816594/201745732-ccb90926-f4a6-40c0-9af3-3296d3c22b30.png)  
 
우리는 클라이언트인 웹 브라우저를 통해서 네이버 서버에 네이버 시작 페이지를 보여 달라는 요청을 하는 것 이고,  
네이버 서버는 요청을 받으면 네이버 시작페이지에 해당하는 html 페이지를 클라이언트에 돌려줍니다.(응답)  

* 요청을 보내고 응답을 받을 때 우리는 그 정보들을 패킷(Packet)이라는 작은 조각에 실어서 보내게 됩니다.   
<img width="50%" src ="https://user-images.githubusercontent.com/104816594/201745739-0c24adca-90a5-4782-b136-7b35e2164917.png"/>  
패킷은 크게 '헤더(Header)'와 '바디(Body)'로 되어 있는데, Header에는 보내는 사람의 주소, 받는 사람의 주소, 패킷의 생명 시간 (TTL, Time To Live) 등이 담겨 있고, Body에는 우리가 전하고자 하는 실제 내용이 들어 있습니다.  

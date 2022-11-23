# 코멘토 2주차 과제📑  
✅ Spring Boot 환경설정을 진행하여 스프링 프레임워크에 비해 얼마나 간단한지 익히기     
✅ RestController를 사용한 간단한 API를 구현해보기  
## 1. SpringBoot 개발 환경 셋팅  
## 2. 통계 API(SW활용현황)을 위한 DB, TABLE 생성  
## 3. [20년도 로그인 수 API] Spring Boot, mybatis, mariadb 연동  
### 1) 프로젝트 셋팅  
* API를 만들기 위함이니 Spring Boot Devtools, Spring Web, MyBatis Framework 만 선택  
### 2) Pom.xml 수정   
*  Dependency수정(DB관련 내용 포함)  
* 스프링 부트 버전 2.2.2로 수정
### 3) application.properties 수정  
* 스프링 프레임워크에서는 port, contextpath, view, db 등 각자 따로 설정해주었다면, 스프링 부트에서는 한곳에서 진행
*  설정내용은 serverport, contextpath를 진행하고, suffix에 jsp를 줌으로써  
/WEB-INF/views 아래에 jsp 파일로 자동으로 맵핑해주도록한다.  
### 4) 기본 테스트 진행  
*  src/main 아래 webapp, views 폴더를 차례대로 만들고 test.jsp를 생성  
*  com.devfun.settingweb_boot.test 패키지를 만들고 settingTest.java** 를 만들어 아래와 같은 컨트롤러를 작성  

### 5) 웹페이지 출력화면  
* localhost:8031/test의 url을 입력한 화면  



# 코멘토 1주차 과제(환경 셋팅)📑  
스프링의 개발환경을 구축하는 1주차과제를 통해 추후에 진행될 스프링 부트와의 환경 차이를 느낄 수 있다.
## 1. [JDK 1.8 설치]  
오라클 사이트에서 JDK 1.8을 다운받고 환경변수를 세팅하였다.  
![jdk 버전](https://user-images.githubusercontent.com/104816594/201615991-2f66e318-cd5e-416f-81ce-c3e0a40dc906.PNG)
## 2. [Eclipse, Spring 다운로드 및 설치]  
Eclipse와 Spring을 설치  
## 3. [톰캣 설정]  
톰캣 설치하고 설정하는 과정  
* 톰캣의 개념  
Tomcat은 Java Servlet과 JSP가 실행할 수 있는 환경을 제공하여 동적인 페이지를 생성합니다.   
그리고 DB 연결 및 데이터 조작, 다른 응용프로그램들과 상호 작용이 가능합니다.  
## 4. [Hello World 출력]  
#### 1. 이클립스에서 스프링 프로젝트를 만들고 스프링 버전과 JDK 버전을 버전에 맞게 수정한다.  
#### 2. 서버를 셋팅하여 실행버튼을 눌러 localhost:8080/프로젝트명/으로 접속하면 Hello World가 정상적으로 실행된다.  
## 5. [mariaDB, mySql WorkBench 설치 및 샘플 DB 구축]  
mariaDB, MySql WorkBench를 설치하고 movie 테이블을 생성하여 데이터를 넣고 조회해본다.  
![무비테이블](https://user-images.githubusercontent.com/104816594/201621393-d30e39d1-3a9b-499a-9ade-80890f4d6610.PNG)![테이블 정보](https://user-images.githubusercontent.com/104816594/201621396-f5d71c29-1453-4ec4-80e2-27c9f9796203.PNG)    
## 6. [스프링, Mariadb, MyBatis 연동, 데이터 조회]  
#### 1. pom.xml 수정  
#### 2. root-context.xml 수정   
* MaridDB에서 내가 설정한 username과 password, 주소를 value값에 넣어주어야 한다.    
![root](https://user-images.githubusercontent.com/104816594/201678685-f58c7393-819a-4e7c-aa12-23660e297871.PNG)  

* context bound 에러 발생  
해결 : <beans>안에 xmlns:context="http://www.springframework.org/schema/context" 을 추가해주고 xsi:schemaLocation코드에  
  http://www.springframework.org/schema/context  
  https://www.springframework.org/schema/context/spring-context.xsd 을 추가해주면 된다.
  ![context](https://user-images.githubusercontent.com/104816594/201615986-23b2b15b-ed4e-4250-b4b0-5ecf47dde2c8.PNG)
#### 3. 디렉토리의 구조를 주의해서 mybatis-config.xml / logback.xml / log4jdbc.log4j2.properties test.xml을 작성 
![mybatis 파일 구조](https://user-images.githubusercontent.com/104816594/201621390-e7b180a3-210d-4a04-8556-a25df6a26408.PNG)  
#### 4. 데이터 조회/ 처리를 위한 java코드를 작성  
* MovieVO.java 파일 작성  
  출력화면을 봤을 때, DB에 있는 영화이름, 감독, 장르를 가져오면 된다  
  따라서 DB에 있는 테이블의 칼럼명과 동일하게 멤버변수를 Private로 선언해주고 또 getter, setter 함수를 작성해주면 된다. 
  ![MovieVO](https://user-images.githubusercontent.com/104816594/201618850-b7623b4b-8bce-46c4-8ef3-992244560aca.PNG) 
  
#### 5. 테스트를 위한 화면 관련 소스 home.jsp를 작성하고 Tomcat 세팅을 변경
#### 6. localhost:8080로 접속하여 DB에 있던 영화이름 감독 장르를 보여주는 페이지를 구동
![캡처](https://user-images.githubusercontent.com/104816594/201614727-4ea6f1c5-65e6-4a46-9a4a-e8e932a99329.PNG)
  


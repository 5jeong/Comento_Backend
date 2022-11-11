# 코멘토 1주차 과제(환경 셋팅)   
1주차 과제는 
## 1. [JDK 1.8 설치]  
오라클 사이트에서 JDK 1.8을 다운받고 환경변수를 세팅하였다.  
## 2. [Eclipse, Spring 다운로드 및 설치]  
Eclipse와 Spring을 설치  
## 3. [톰캣 설정]  
톰캣 설치하고 설정하는 과정  
* 톰캣의 개념  
Tomcat은 Java Servlet과 JSP가 실행할 수 있는 환경을 제공하여 동적인 페이지를 생성합니다. 
그리고 DB 연결 및 데이터 조작, 다른 응용프로그램들과 상호 작용이 가능합니다.  
## 4. [Hello World 출력]  
1. 이클립스에서 스프링 프로젝트를 만들고 스프링 버전과 JDK 버전을 버전에 맞게 수정한다.  
2. 서버를 셋팅하여 실행버튼을 눌러 localhost:8080/프로젝트명/으로 접속하면 Hello World가 정상적으로 실행된다.  
## 5. [mariaDB, mySql WorkBench 설치 및 샘플 DB 구축]  
mariaDB, MySql WorkBench를 설치하고 movie 테이블을 생성하여 데이터를 넣고 조회해본다.  

## 6. [스프링, Mariadb, MyBatis 연동, 데이터 조회]  
### 1. pom.xml 수정  
### 2. root-context.xml 수정   
MaridDB에서 내가 설정한 username과 password, 주소를 value값에 넣어주어야 한다.     
* context bound 에러 발생  
해결 : <beans>안에 xmlns:context="http://www.springframework.org/schema/context" 을 추가해주고 xsi:schemaLocation코드에  
  http://www.springframework.org/schema/context  
  https://www.springframework.org/schema/context/spring-context.xsd 을 추가해주면 된다.  
### 3. 디렉토리의 구조를 주의해서 mybatis-config.xml / logback.xml / log4jdbc.log4j2.properties test.xml을 작성한다  
### 4. 데이터 조회/ 처리를 위한 java코드를 작성한다.  
* MovieVO.java 파일 작성  
  출력화면을 봤을 때, DB에 있는 영화이름, 감독, 장르를 가져오면 되므로 DB에 있는 테이블의 칼럼명과 동일하게
  멤버변수를 Private로 선언해주고 또 getter, setter 함수를 작성해주면 된다.  
### 5. 테스트를 위한 화면 관련 소스 home.jsp를 작성하고 Tomcat 세팅을 변경한다.  
### 6. localhost:8080로 접속하여 DB에 있던 영화이름 감독 장르를 보여주는 페이지를 구동한다.  
  
  


# 코멘토 3주차 과제📑  
✅ Spring Boot 환경설정을 진행하여 스프링 프레임워크에 비해 얼마나 간단한지 알아보기     
✅ RestController를 사용한 간단한 API를 구현해보기  
## 1️⃣ SpringBoot 개발 환경 셋팅
<details>  
<summary></summary>
  
### 1) 프로젝트 셋팅  
* API를 만들기 위함이니 Spring Boot Devtools, Spring Web, MyBatis Framework 만 선택  
### 2) Pom.xml 수정   
*  Dependency수정(DB관련 내용 포함)  
* 스프링 부트 버전 2.2.2로 수정  
![pom xml수정](https://user-images.githubusercontent.com/104816594/203600774-8b894668-9f50-4f83-84be-e1050b0b73a1.PNG)  
### 3) application.properties 수정  
* 스프링 프레임워크에서는 port, contextpath, view, db 등 각자 따로 설정해주었다면, 스프링 부트에서는 한곳에서 진행
*  설정내용은 serverport, contextpath를 진행하고, suffix에 jsp를 줌으로써  
/WEB-INF/views 아래에 jsp 파일로 자동으로 맵핑해주도록한다.  
![application properties수정](https://user-images.githubusercontent.com/104816594/203600782-cd0c43ec-fcab-4fd9-bf35-c5b10c0ee60d.PNG)  
### 4) 기본 테스트 진행  
*  src/main 아래 webapp, views 폴더를 차례대로 만들고 test.jsp를 생성  
*  com.devfun.settingweb_boot.test 패키지를 만들고 settingTest.java** 를 만들어 아래와 같은 컨트롤러를 작성  
![파일구조](https://user-images.githubusercontent.com/104816594/203601761-0fd752de-0559-4db5-864d-ffd00cbf95e9.PNG)  

### 5) 웹페이지 출력화면  
* localhost:8031/test의 url을 입력한 화면  
![테스트화면](https://user-images.githubusercontent.com/104816594/203600795-266fbd16-aec1-4d28-a4db-a9ffeff5a9f1.PNG)  
</details>  

## 2️⃣ 통계 API(SW활용현황)을 위한 DB, TABLE 생성
<details>    
<summary></summary>  
  
### 1) 마리아DB 테이블 생성 쿼리문   
![마리아DB 테이블 생성](https://user-images.githubusercontent.com/104816594/203602139-0c1464a2-85c2-4abb-942f-0269b793edaf.PNG)  
### 2) requestInfo 테이블 데이터 넣기 
![요청정보 테이블 데이터 넣기](https://user-images.githubusercontent.com/104816594/203602194-4d31a0ef-0f61-4d8a-bcca-ba759573210d.PNG)  
### 3) requestCode, user 테이블 데이터 넣기  
![요청코드, 사용자 테이블 데이터 넣기](https://user-images.githubusercontent.com/104816594/203602207-129963bd-3645-4666-96dd-5f2f8d518aba.PNG)  
### 4) requestInfo 테이블 데이터 출력  
![요청 정보 출력](https://user-images.githubusercontent.com/104816594/203602217-aa326393-4db2-4346-8fa5-2df84282bc57.PNG)  
### 5) requestCode 테이블 데이터 출력  
![요청코드 출력](https://user-images.githubusercontent.com/104816594/203602232-aae8e05b-f12e-4cf8-9f24-252d6091d465.PNG)  
### 6) user 테이블 데이터 출력 
![사용자 출력](https://user-images.githubusercontent.com/104816594/203602245-479d0341-02d2-4344-8637-5c7a5f46d5fd.PNG) 
</details>  

## 3️⃣ [20년도 로그인 수 API] Spring Boot, mybatis, mariadb 연동  
<details>    
<summary></summary> 
  
</details>  

# 코멘토 4주차 과제📑   
✅ API 3차과제에서 작성한 API와 SQL을 중심으로 API 개발하기      
✅ 2차과제로 진행한 API 가이드 문서를 보완하기
## 1️⃣ 년도별 로그인수 API
<details>  
<summary></summary>
  
### 1. 설명   
* 년도별로 SW사용자의 로그인 수를 판단한다.
### 2) 요청 URL   
*  http://localhost:8021/yearStatistic?{year}  
 ex ) http://localhost:8021/yearStatistic?year=20
### 3) Request Parameters 
Name | Type | Mandatory | explain 
:----: |:-----: | :--------:| :---:   
year |String | O | 년(20)
### 4) Response Parameters
Name | Type | Mandatory | explain 
:----: |:-----: | :--------:| :---:   
totCnt |String | O | 년도별 로그인 수
year |String | O | 조회할 년도
is_success |String | O | 성공여부
### 5) ResponseBody  
  ![년도별 로그인수](https://user-images.githubusercontent.com/104816594/205297264-b5567830-68f4-48a9-a2af-e989c95d40ee.PNG)  
</details> 

## 2️⃣ 월별 로그인수 API  
<details>  
<summary></summary>
  
### 1. 설명   
* 월별로 SW사용자의 로그인 수를 판단한다.
### 2) 요청 URL   
*  http://localhost:8021/MonthStatistic?{yearMonth}    
ex ) http://localhost:8021/monthStatistic?yearMonth=2008
### 3) Request Parameters 
Name | Type | Mandatory | explain 
:----: |:-----: | :--------:| :---:   
yearMonth |String | O | 년/월(2008)
### 4) Response Parameters
Name | Type | Mandatory | explain 
:----: |:-----: | :--------:| :---:   
totCnt |String | O | 월별 로그인 수
yearMonth |String | O | 조회할 년/월
is_success |String | O | 성공 여부
### 5) ResponseBody  
![월별 로그인수](https://user-images.githubusercontent.com/104816594/205297255-a4bd86ad-934e-47c4-815d-ce7139e045a2.PNG)  
</details> 

## 3️⃣ 일자별 로그인수 API  
<details>  
<summary></summary>
  
### 1. 설명   
* 일자별로 SW사용자의 로그인 수 판단한다.
### 2) 요청 URL   
*  http://localhost:8021/dayStatistic?{yearMonthDay}    
ex ) http://localhost:8021/dayStatistic?yearMonthDay=200818 
### 3) Request Parameters 
Name | Type | Mandatory | explain 
:----: |:-----: | :--------:| :---:   
yearMonthDay |String | O | 년/월/일(200818)
### 4) Response Parameters
Name | Type | Mandatory | explain 
:----: |:-----: | :--------:| :---:   
totCnt |String | O | 일자별 로그인 수
yearMonthDay |String | O | 조회할 년/월/일
is_success |String | O | 성공 여부
### 5) ResponseBody  
![일별 로그인수](https://user-images.githubusercontent.com/104816594/205301704-7ad0faf4-a765-47fe-894d-70efa574d302.PNG)  
</details>  

## 4️⃣ 월기준 평균 하루 로그인수API  
<details>  
<summary></summary>  

### 1. 설명   
* 월을 기준으로 SW사용자의 평균 하루 로그인 수를 판단한다.
### 2) 요청 URL   
*  http://localhost:8021/monthDayAverageStatistic{yearMonth}  
ex ) http://localhost:8021/monthDayAverageStatistic?yearMonth=2008
### 3) Request Parameters 
Name | Type | Mandatory | explain 
:----: |:-----: | :--------:| :---:   
yearMonth |String | O | 년/월(2008)
### 4) Response Parameters
Name | Type | Mandatory | explain 
:----: |:-----: | :--------:| :---:   
averageCnt |String | O | 월기준 평균 하루 로그인 수
yearMonth |String | O | 조회할 년/월
is_success |String | O | 성공 여부
### 5) ResponseBody  
![월기준 평균 하루 로그인수](https://user-images.githubusercontent.com/104816594/205297259-ccc2968b-eee1-41e5-a33b-57d0b5feec1a.PNG)
</details>    

## 5️⃣ 휴일을 제외한 월별 로그인수 API  
<details>  
<summary></summary>  
  

### 1. 설명   
* 휴일을 제외한 월별 SW사용자 로그인 수를 판단한다.
### 2) 요청 URL   
*  http://localhost:8021/exceptHolidaymonthStatistic?{yearMonth}   
ex ) http://localhost:8021/exceptHolidaymonthStatistic?yearMonth=2008
### 3) Request Parameters 
Name | Type | Mandatory | explain 
:----: |:-----: | :--------:| :---:   
yearMonth |String | O | 년/월(2008)
### 4) Response Parameters
Name | Type | Mandatory | explain 
:----: |:-----: | :--------:| :---:   
totCnt |String | O | 휴일을 제외한 월별 로그인 수
yearMonth |String | O | 조회할 년/월
is_success |String | O | 성공 여부
### 5) ResponseBody  
![휴일을 제외한 월별 로그인수](https://user-images.githubusercontent.com/104816594/205297250-3cc85e25-fef8-4782-9222-7d8e547eec31.PNG)  
</details>    

## 6️⃣ 월별 부서별 로그인수 API  
<details>  
<summary></summary>  
  
### 1. 설명   
* 월별 부서별 SW사용자의 로그인 수를 판단한다.
### 2) 요청 URL   
*  http://localhost:8021/departmentMonthStatistic?{yearMonth}&&{department}   
ex ) http://localhost:8021/departmentMonthStatistic?yearMonth=2008&&department=인사  
### 3) Request Parameters 
Name | Type | Mandatory | explain 
:----: |:-----: | :--------:| :---:   
yearMonth |String | O | 년/월(200818)
department|String | O | 부서  

### 4) Response Parameters
Name | Type | Mandatory | explain 
:----: |:-----: | :--------:| :---:   
totCnt |String | O | 부서별 로그인 수
yearMonth |String | O | 조회할 년/월  
department |String | O | 부서  
is_success |String | O | 성공 여부
### 5) ResponseBody  
![부서별 월별 로그인수](https://user-images.githubusercontent.com/104816594/205297262-0036b3bc-90bd-4a85-b5e1-ca4d4d69faa1.PNG)  
</details>  

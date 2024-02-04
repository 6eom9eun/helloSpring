`SpringBoot`  
<h2>'스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술 : 김영한'</h2>

- 스프링 프로젝트 생성
- 스프링 부트로 웹 서버 실행
- 회원 도메인 개발
- 웹 MVC 개발
- DB 연동
    - JDBC (Java Database Connectivity)
        - JDBC API로 직접 코딩하는 건 20년 전 이야기
    - JPA (Java Persistence API)
        - 기존의 반복 코드, 기본적인 SQL도 JPA가 직접 만들어서 실행해줌
        - SQL과 데이터 중심의 설계에서 객체 중심의 설계로 패러다임을 전환
        - 개발 생산성 크게 증가
    - 스프링 데이터 JPA
        - JPA를 편리하게 사용하도록 도와주는 기술
- 테스트 케이스 작성
    - JUnit을 이용한 단위 테스트
- AOP (Aspect Oriented Programming)
  - 모든 메소드의 호출 시간 측정

---
<h3>빌드하고 실행하기</h3>
1. ./gradlew build

    - ./gradlew clean 하면 빌드 지워짐
    - ./gradlew clean build 하면 빌드 지우고 다시 빌드
    
2. cd build/libs<br>
3. java -jar ~~~SNAPSHOT.jar<br>
4. 실행 확인

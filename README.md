# 커피 주문 애플리케이션

## 기능 구현 목록 정리

- [x] 키오스크
  - [ ] 손님, 바리스타 (콘솔 입력 기능)
    - [x] 손님 선택 시 메뉴 (콘솔 출력 기능)
    - [x] 상품 주문 기능
      - [x] 상품 선택 목록 (콘솔 출력 기능)
      - [x] 여러 카테고리의 상품 선택 기능 (콘솔 입력 기능)
      - [x] 상품 수량 지정 기능 (콘솔 입력 기능)
      - [x] 미입력 엔터시 상품 선택 종료 (콘솔 입력 기능)
      - [x] 상품 주문 내역 (콘솔 출력 기능)
      - [x] 상품명, 주문 수량, 가격 (콘솔 출력 기능)
      - [ ] 중복된 상품 합치기 기능
      - [x] 쿠폰 기능
        - [x] 쿠폰 적립 질문 기능 (콘솔 출력 기능)
          - [x] 쿠폰 적립 "YES" (콘솔 입력 기능)
            - [x] 전화번호 질문 기능 (콘솔 출력 기능)
            - [x] 전화번호 대답 기능 (콘솔 입력 기능)
            - [x] 현재 보유한 쿠폰 수량 출력 기능 (콘솔 출력 기능)
            - [x] 현재 보유 쿠폰 10개 일 시에 쿠폰 사용 질문 기능 (콘솔 출력 기능)
              - [x] 쿠폰 사용 "YES" (콘솔 입력 기능)
                - [x] 사용할 메뉴 목록 (콘솔 출력 기능)
                - [x] 사용할 메뉴 선택 (콘솔 입력 기능)
                - [ ] 사용한 메뉴 쿠폰 적용 기능 (콘솔 입력 기능)
                - [ ] 쿠폰 사용 완료 (콘솔 출력 기능)
              - [x] 쿠폰 사용 "NO" (콘솔 입력 기능)
            - [x] 쿠폰 적립 "NO" (콘솔 입력 기능)
      - [ ] 최종 주문 내역 (콘솔 출력 기능)
      - [ ] 주문 완료 (콘솔 출력 기능)

## 깃허브
**[java-coffee-order](https://github.com/programmers-lecture/java-coffee-order)**

## 요구사항

- 커피 가게의 도메인을 파악한다.
- 프로그램을 모두 콘솔 UI로 진행한다.
- 사용자는 손님과 바리스타 두명이 있다. (이번 요구사항은 손님만 구현)
- 가격이 입력되어 있지 않는 메뉴는 0원이다.
- 손님이 메뉴를 고르지 않을 경우 validate를 진행한다.
- 이미 쿠폰이 있는 경우는 +를 진행한다.
- validate를 고려해서 프로그램을 작성한다.

## 1단계 (2주차)
- 손님 역할을 구현한다.

## 2단계 (3주차)
- 관리자인 바리스타 구현한다.

## 프로그램 실행 결과

```

사용자를 선택하세요
1. 손님 / 2. 바리스타

// 손님 선택
메뉴를 골라주세요 (번호, 갯수)
1. 커피
1-1 에스프레소 // 2000원
1-2 아메리카노 // 3000원
1-3 콜드블루 // 4000원
1-4 카페라떼
...
2. 티
2-1 그린티 ..
3. 디저트
3-1. 케잌
...

1-1, 1
1-2, 2

주문 내역은 아래와 같습니다.
에스프레소 1개 2000원
아메리카노 1개 3000원

총 가격 : 5000원

쿠폰을 적립하시겠습니까?
1. 네 / 2. 아니요

// 1번 선택시
전화번호를 입력해주세요. (형식 : 000-0000-0000)
010-1234-1234

현재 쿠폰 갯수는 2개 입니다.

// 쿠폰이 10개인 경우
쿠폰을 사용하시겠습니까?
1. 네 2. 아니요

// 1번 선택시
사용할 메뉴를 골라주세요.
1-1. 에스프레소
1-2. 아메리카노

1-1

사용이 완료되었습니다.

주문 내역은 아래와 같습니다.

에스프레소 1개 쿠폰사용
아메리카노 1개 3000원

총 가격 : 3000원

주문 완료가 되었습니다.

// 바리스타 선택
사용할 메뉴를 선택하세요
1. 커피 등록
2. 수량 등록
3. 가격 변경
4. 주문 내역 확인
5. 쿠폰 내역 확인

// 1번 선택 시

번호와 이름, 가격을 입력해주세요. (ex) 1. 커피, 1-1. 에스프레소, 2000)

입력이 완료되었습니다.

// 2번 선택 시
번호와 수량을 선택해주세요. (ex) 1-1, 10)

1. 커피
1-1 에스프레소 // 1개
1-2 아메리카노 // 2개
1-3 콜드블루 // 3개
1-4 카페라떼
...
2. 티
2-1 그린티 ..
3. 디저트
3-1. 케잌
...

입력이 완료되었습니다.

// 3번 선택시
번호와 가격을 선택해주세요. (ex) 1-1, 2500)

1. 커피
1-1 에스프레소 // 2000원
1-2 아메리카노 // 3000원
1-3 콜드블루 // 4000원
1-4 카페라떼
...
2. 티
2-1 그린티 ..
3. 디저트
3-1. 케잌
...

// 4번 선택시
1. 1-1 에스프레소 1개 / 1-2 아메리카노 1개 -> 총 5000원
2. 1-1 에스프레소 1개(쿠폰 사용) / 1-2 아메리카노 1개 -> 총 3000원
-----------------
현재까지 매출 : 8000원

// 5번 선택시
1. 010-1234-1234 - 2개
```

## 미션 가이드 (학생)

1. ReadMe에 각 객체에 대한 간단한 다이어그램(설명)을 작성한다.
2. ReadMe에 각 요구사항에 대한 체크 리스트를 작성한다.
3. 커밋은 최소한의 단위로 진행한다.
4. 객체지향 생활 체조를 지켜서 개발한다.

[객체지향생활체조](https://developerfarm.wordpress.com/2012/02/03/object_calisthenics_summary/)
# java-convenience-store-precourse

## 구현기능

### 데이터 가져오기
 - [v] resources에 있는 데이터들 가져오기

### 입력
- 물건 입력 받을 때
 - [v] 입력한 형식이 맞는지 확인(,로 구분 후 '[]'를 통해 물건 구분)
 - [v] 구매할 물건 종류가 있는지 파악
 - [v] 물건 개수가 아닌 다른 문자 입력 시 예외 처리
 - [] 물건 재고가 있는지 파악하기
 - [] 멤버십 할인 받을 지 여부 파악
 - [] 재고가 모두 소진 상태에서 물건을 더 구매할 시 예외처리

### 프로모션 할인
 - [] 구매할 물건이 프로모션 물건인지 확인
 - [] 현재 프로모션 기간인지 확인
 - [] 프로모션 재고가 남아있는지 확인
 - [] 프로모션 재고가 없을 경우 고객에게 사전 안내하기
 - [] 프로모션 개수만큼 사왔는데 무료 증정 안가져왔을 추가할 지 확인

### 멤버십 할인
 - [] 프로모션 재고는 제외한 금액에서 할인 금액 정산.
 - [] 프로모션 재고만 구매할 경우 멤버십 할인 물어보지만, 계산 필요 없음

### 재고 관리
 - [] 고객이 구매할 때 마다 재고 계산

### 계산
 - [] 프로모션 할인과 멤버십 할인 후 고객이 내야 할 금액 계산
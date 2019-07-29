# sever-sent-event
Springboot2 WebFlux with SSE

## What is Server Sent-Event??    

[Server Sent Event](https://www.w3schools.com/html/html5_serversentevents.asp)    

딱히 뭐라고 설명하기 애매하지만 마치 WebSocket처럼 비슷하게 작동한다.    
다만 WebSocket처럼 wss같은 다른 프로토콜이 필요하지 않는다는 점?    
또한 WebSocket같은 양방향은 아니고 서버에서 클라이언트로 푸쉬하는 단방향이라는 점?    
심플하게 말하면 그렇다. 

어디에 쓰느냐가 관건인데 이 프로젝트를 남기는 이유는 사실 이것은 일종의 푸쉬 노티 정보나 챠트같이 실시간으로 정보를 받아서 처리하는 부분에 좀 특화되어 있다.    

그렇다. 거래소의 챠트 부분을 그릴 때 필요한 정보는 웹소켓으로도 가능하지만 SSE로 가볍게 처리할 수 있다.


또한 이 프로젝트는 upbit-api-with-telegram에서 웹소켓으로 받는 정보를 클라이언트로 넘겨주기 위해 찾다가 알게 된 부분으로 등장 시키는 2015년도라고 하니 최신 기술은 아니다.    

## Prerequisites     

간단한 view를 위해서 freemarker를 사용한다.    


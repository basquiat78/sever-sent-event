package io.basquiat.sse.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

import io.basquiat.sse.domain.ServerSendEventResponse;
import reactor.core.publisher.Flux;

/**
 * 
 * Server Sent-Event Service
 * 
 * created by basquiat
 *
 */
@Service("sse")
public class SseService {

	/**
	 * 시퀀스와 요청받은 시간의 로컬타입을 스트링으로 객체에 담아 반환하는 서비스
	 * @param sequence
	 * @return Flux<ServerSendEventResponse>
	 */
	public Flux<ServerSendEventResponse> sse(long sequence){
		ServerSendEventResponse sser = ServerSendEventResponse.builder()
															  .sequence(sequence)
															  .localTime(LocalTime.now().toString())
															  .build();
		return Flux.just(sser);
	}

}

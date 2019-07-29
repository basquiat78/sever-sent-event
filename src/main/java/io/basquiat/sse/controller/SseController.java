package io.basquiat.sse.controller;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.basquiat.sse.domain.ServerSendEventResponse;
import io.basquiat.sse.service.SseService;
import reactor.core.publisher.Flux;

/**
 * 
 * Server Sent-Event Controller
 * 
 * created by basquiat
 *
 */
@RestController
@RequestMapping("")
public class SseController {

	@Autowired
	private SseService sse;
	
	/**
	 * 1초마다 시간 정보를 객체로 반환하는 컨트롤러
	 * @return Flux<ServerSendEventResponse>
	 */
	@GetMapping(path = "/sse-flux", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<ServerSendEventResponse> streamFlux() {
		return Flux.interval(Duration.ofSeconds(1))
				   .flatMap(sequence -> sse.sse(sequence));
	}

}

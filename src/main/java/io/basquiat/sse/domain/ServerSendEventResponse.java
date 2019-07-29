package io.basquiat.sse.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * Server Sent-Event 응답 도메인
 * 
 * created by basquiat
 *
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServerSendEventResponse {

	/** sequence */
	private long sequence;
	
	/** localTime */
	private String localTime;
	
}

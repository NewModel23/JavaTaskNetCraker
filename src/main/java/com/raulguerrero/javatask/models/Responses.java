package com.raulguerrero.javatask.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "successful",
    "functionalMessage",
    "technicalMessage",
    "traceId",
    "payload"
})
public class Responses {

	@JsonProperty("successful")
	private Boolean successful;
	@JsonProperty("functionalMessage")
	private String functionalMessage;
	@JsonProperty("technicalMessage")
	private String technicalMessage;
	@JsonProperty("traceId")
	private String traceId;
	@JsonProperty
	("payload")
	private TransactionNbr payload;
	
	
	
	public Boolean getSuccessful() {
		return successful;
	}
	public void setSuccessful(Boolean successful) {
		this.successful = successful;
	}
	public String getFunctionalMessage() {
		return functionalMessage;
	}
	public void setFunctionalMessage(String functionalMessage) {
		this.functionalMessage = functionalMessage;
	}
	public String getTechnicalMessage() {
		return technicalMessage;
	}
	public void setTechnicalMessage(String technicalMessage) {
		this.technicalMessage = technicalMessage;
	}
	public String getTraceId() {
		return traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public TransactionNbr getPayload() {
		return payload;
	}
	public void setPayload(TransactionNbr payload) {
		this.payload = payload;
	}
	
	
	
	
	
}

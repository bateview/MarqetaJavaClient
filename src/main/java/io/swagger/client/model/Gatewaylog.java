/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Gatewaylog;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * Gatewaylog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class Gatewaylog {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("traceNumber")
  private Long traceNumber = null;

  @SerializedName("paymentTypeCode")
  private String paymentTypeCode = null;

  @SerializedName("achTransactionType")
  private String achTransactionType = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("gatewayVersion")
  private String gatewayVersion = null;

  @SerializedName("gatewayResponse")
  private Object gatewayResponse = null;

  @SerializedName("timedOut")
  private Boolean timedOut = false;

  @SerializedName("deal_Id")
  private Long dealId = null;

  @SerializedName("order_Id")
  private String orderId = null;

  @SerializedName("request_method")
  private String requestMethod = null;

  @SerializedName("response_code")
  private String responseCode = null;

  @SerializedName("response_subcode")
  private String responseSubcode = null;

  @SerializedName("response_reasoncode")
  private String responseReasoncode = null;

  @SerializedName("response_message")
  private String responseMessage = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("fraud_avs")
  private String fraudAvs = null;

  @SerializedName("fraud_auth")
  private String fraudAuth = null;

  @SerializedName("fraud_cvv")
  private String fraudCvv = null;

  @SerializedName("gateway_transactionId")
  private String gatewayTransactionId = null;

  @SerializedName("original_gateway")
  private Gatewaylog originalGateway = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("duplicate")
  private String duplicate = null;

  @SerializedName("post_date")
  private OffsetDateTime postDate = null;

  @SerializedName("response_time")
  private OffsetDateTime responseTime = null;

  @SerializedName("api_duration")
  private Long apiDuration = null;

  @SerializedName("gateway_duration")
  private Long gatewayDuration = null;

  @SerializedName("ach_status")
  private String achStatus = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("modified")
  private OffsetDateTime modified = null;

  public Gatewaylog id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Gatewaylog traceNumber(Long traceNumber) {
    this.traceNumber = traceNumber;
    return this;
  }

   /**
   * Get traceNumber
   * @return traceNumber
  **/
  @ApiModelProperty(value = "")
  public Long getTraceNumber() {
    return traceNumber;
  }

  public void setTraceNumber(Long traceNumber) {
    this.traceNumber = traceNumber;
  }

  public Gatewaylog paymentTypeCode(String paymentTypeCode) {
    this.paymentTypeCode = paymentTypeCode;
    return this;
  }

   /**
   * Get paymentTypeCode
   * @return paymentTypeCode
  **/
  @ApiModelProperty(value = "")
  public String getPaymentTypeCode() {
    return paymentTypeCode;
  }

  public void setPaymentTypeCode(String paymentTypeCode) {
    this.paymentTypeCode = paymentTypeCode;
  }

  public Gatewaylog achTransactionType(String achTransactionType) {
    this.achTransactionType = achTransactionType;
    return this;
  }

   /**
   * Get achTransactionType
   * @return achTransactionType
  **/
  @ApiModelProperty(value = "")
  public String getAchTransactionType() {
    return achTransactionType;
  }

  public void setAchTransactionType(String achTransactionType) {
    this.achTransactionType = achTransactionType;
  }

  public Gatewaylog memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @ApiModelProperty(value = "")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public Gatewaylog gatewayVersion(String gatewayVersion) {
    this.gatewayVersion = gatewayVersion;
    return this;
  }

   /**
   * Get gatewayVersion
   * @return gatewayVersion
  **/
  @ApiModelProperty(value = "")
  public String getGatewayVersion() {
    return gatewayVersion;
  }

  public void setGatewayVersion(String gatewayVersion) {
    this.gatewayVersion = gatewayVersion;
  }

  public Gatewaylog gatewayResponse(Object gatewayResponse) {
    this.gatewayResponse = gatewayResponse;
    return this;
  }

   /**
   * Get gatewayResponse
   * @return gatewayResponse
  **/
  @ApiModelProperty(value = "")
  public Object getGatewayResponse() {
    return gatewayResponse;
  }

  public void setGatewayResponse(Object gatewayResponse) {
    this.gatewayResponse = gatewayResponse;
  }

  public Gatewaylog timedOut(Boolean timedOut) {
    this.timedOut = timedOut;
    return this;
  }

   /**
   * Get timedOut
   * @return timedOut
  **/
  @ApiModelProperty(value = "")
  public Boolean isTimedOut() {
    return timedOut;
  }

  public void setTimedOut(Boolean timedOut) {
    this.timedOut = timedOut;
  }

  public Gatewaylog dealId(Long dealId) {
    this.dealId = dealId;
    return this;
  }

   /**
   * Get dealId
   * @return dealId
  **/
  @ApiModelProperty(value = "")
  public Long getDealId() {
    return dealId;
  }

  public void setDealId(Long dealId) {
    this.dealId = dealId;
  }

  public Gatewaylog orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Gatewaylog requestMethod(String requestMethod) {
    this.requestMethod = requestMethod;
    return this;
  }

   /**
   * Get requestMethod
   * @return requestMethod
  **/
  @ApiModelProperty(value = "")
  public String getRequestMethod() {
    return requestMethod;
  }

  public void setRequestMethod(String requestMethod) {
    this.requestMethod = requestMethod;
  }

  public Gatewaylog responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  @ApiModelProperty(value = "")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public Gatewaylog responseSubcode(String responseSubcode) {
    this.responseSubcode = responseSubcode;
    return this;
  }

   /**
   * Get responseSubcode
   * @return responseSubcode
  **/
  @ApiModelProperty(value = "")
  public String getResponseSubcode() {
    return responseSubcode;
  }

  public void setResponseSubcode(String responseSubcode) {
    this.responseSubcode = responseSubcode;
  }

  public Gatewaylog responseReasoncode(String responseReasoncode) {
    this.responseReasoncode = responseReasoncode;
    return this;
  }

   /**
   * Get responseReasoncode
   * @return responseReasoncode
  **/
  @ApiModelProperty(value = "")
  public String getResponseReasoncode() {
    return responseReasoncode;
  }

  public void setResponseReasoncode(String responseReasoncode) {
    this.responseReasoncode = responseReasoncode;
  }

  public Gatewaylog responseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

   /**
   * Get responseMessage
   * @return responseMessage
  **/
  @ApiModelProperty(value = "")
  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  public Gatewaylog status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Gatewaylog fraudAvs(String fraudAvs) {
    this.fraudAvs = fraudAvs;
    return this;
  }

   /**
   * Get fraudAvs
   * @return fraudAvs
  **/
  @ApiModelProperty(value = "")
  public String getFraudAvs() {
    return fraudAvs;
  }

  public void setFraudAvs(String fraudAvs) {
    this.fraudAvs = fraudAvs;
  }

  public Gatewaylog fraudAuth(String fraudAuth) {
    this.fraudAuth = fraudAuth;
    return this;
  }

   /**
   * Get fraudAuth
   * @return fraudAuth
  **/
  @ApiModelProperty(value = "")
  public String getFraudAuth() {
    return fraudAuth;
  }

  public void setFraudAuth(String fraudAuth) {
    this.fraudAuth = fraudAuth;
  }

  public Gatewaylog fraudCvv(String fraudCvv) {
    this.fraudCvv = fraudCvv;
    return this;
  }

   /**
   * Get fraudCvv
   * @return fraudCvv
  **/
  @ApiModelProperty(value = "")
  public String getFraudCvv() {
    return fraudCvv;
  }

  public void setFraudCvv(String fraudCvv) {
    this.fraudCvv = fraudCvv;
  }

  public Gatewaylog gatewayTransactionId(String gatewayTransactionId) {
    this.gatewayTransactionId = gatewayTransactionId;
    return this;
  }

   /**
   * Get gatewayTransactionId
   * @return gatewayTransactionId
  **/
  @ApiModelProperty(value = "")
  public String getGatewayTransactionId() {
    return gatewayTransactionId;
  }

  public void setGatewayTransactionId(String gatewayTransactionId) {
    this.gatewayTransactionId = gatewayTransactionId;
  }

  public Gatewaylog originalGateway(Gatewaylog originalGateway) {
    this.originalGateway = originalGateway;
    return this;
  }

   /**
   * Get originalGateway
   * @return originalGateway
  **/
  @ApiModelProperty(value = "")
  public Gatewaylog getOriginalGateway() {
    return originalGateway;
  }

  public void setOriginalGateway(Gatewaylog originalGateway) {
    this.originalGateway = originalGateway;
  }

  public Gatewaylog amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Gatewaylog duplicate(String duplicate) {
    this.duplicate = duplicate;
    return this;
  }

   /**
   * Get duplicate
   * @return duplicate
  **/
  @ApiModelProperty(value = "")
  public String getDuplicate() {
    return duplicate;
  }

  public void setDuplicate(String duplicate) {
    this.duplicate = duplicate;
  }

  public Gatewaylog postDate(OffsetDateTime postDate) {
    this.postDate = postDate;
    return this;
  }

   /**
   * Get postDate
   * @return postDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPostDate() {
    return postDate;
  }

  public void setPostDate(OffsetDateTime postDate) {
    this.postDate = postDate;
  }

  public Gatewaylog responseTime(OffsetDateTime responseTime) {
    this.responseTime = responseTime;
    return this;
  }

   /**
   * Get responseTime
   * @return responseTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getResponseTime() {
    return responseTime;
  }

  public void setResponseTime(OffsetDateTime responseTime) {
    this.responseTime = responseTime;
  }

  public Gatewaylog apiDuration(Long apiDuration) {
    this.apiDuration = apiDuration;
    return this;
  }

   /**
   * Get apiDuration
   * @return apiDuration
  **/
  @ApiModelProperty(value = "")
  public Long getApiDuration() {
    return apiDuration;
  }

  public void setApiDuration(Long apiDuration) {
    this.apiDuration = apiDuration;
  }

  public Gatewaylog gatewayDuration(Long gatewayDuration) {
    this.gatewayDuration = gatewayDuration;
    return this;
  }

   /**
   * Get gatewayDuration
   * @return gatewayDuration
  **/
  @ApiModelProperty(value = "")
  public Long getGatewayDuration() {
    return gatewayDuration;
  }

  public void setGatewayDuration(Long gatewayDuration) {
    this.gatewayDuration = gatewayDuration;
  }

  public Gatewaylog achStatus(String achStatus) {
    this.achStatus = achStatus;
    return this;
  }

   /**
   * Get achStatus
   * @return achStatus
  **/
  @ApiModelProperty(value = "")
  public String getAchStatus() {
    return achStatus;
  }

  public void setAchStatus(String achStatus) {
    this.achStatus = achStatus;
  }

  public Gatewaylog created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Gatewaylog modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gatewaylog gatewaylog = (Gatewaylog) o;
    return Objects.equals(this.id, gatewaylog.id) &&
        Objects.equals(this.traceNumber, gatewaylog.traceNumber) &&
        Objects.equals(this.paymentTypeCode, gatewaylog.paymentTypeCode) &&
        Objects.equals(this.achTransactionType, gatewaylog.achTransactionType) &&
        Objects.equals(this.memo, gatewaylog.memo) &&
        Objects.equals(this.gatewayVersion, gatewaylog.gatewayVersion) &&
        Objects.equals(this.gatewayResponse, gatewaylog.gatewayResponse) &&
        Objects.equals(this.timedOut, gatewaylog.timedOut) &&
        Objects.equals(this.dealId, gatewaylog.dealId) &&
        Objects.equals(this.orderId, gatewaylog.orderId) &&
        Objects.equals(this.requestMethod, gatewaylog.requestMethod) &&
        Objects.equals(this.responseCode, gatewaylog.responseCode) &&
        Objects.equals(this.responseSubcode, gatewaylog.responseSubcode) &&
        Objects.equals(this.responseReasoncode, gatewaylog.responseReasoncode) &&
        Objects.equals(this.responseMessage, gatewaylog.responseMessage) &&
        Objects.equals(this.status, gatewaylog.status) &&
        Objects.equals(this.fraudAvs, gatewaylog.fraudAvs) &&
        Objects.equals(this.fraudAuth, gatewaylog.fraudAuth) &&
        Objects.equals(this.fraudCvv, gatewaylog.fraudCvv) &&
        Objects.equals(this.gatewayTransactionId, gatewaylog.gatewayTransactionId) &&
        Objects.equals(this.originalGateway, gatewaylog.originalGateway) &&
        Objects.equals(this.amount, gatewaylog.amount) &&
        Objects.equals(this.duplicate, gatewaylog.duplicate) &&
        Objects.equals(this.postDate, gatewaylog.postDate) &&
        Objects.equals(this.responseTime, gatewaylog.responseTime) &&
        Objects.equals(this.apiDuration, gatewaylog.apiDuration) &&
        Objects.equals(this.gatewayDuration, gatewaylog.gatewayDuration) &&
        Objects.equals(this.achStatus, gatewaylog.achStatus) &&
        Objects.equals(this.created, gatewaylog.created) &&
        Objects.equals(this.modified, gatewaylog.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, traceNumber, paymentTypeCode, achTransactionType, memo, gatewayVersion, gatewayResponse, timedOut, dealId, orderId, requestMethod, responseCode, responseSubcode, responseReasoncode, responseMessage, status, fraudAvs, fraudAuth, fraudCvv, gatewayTransactionId, originalGateway, amount, duplicate, postDate, responseTime, apiDuration, gatewayDuration, achStatus, created, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gatewaylog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    traceNumber: ").append(toIndentedString(traceNumber)).append("\n");
    sb.append("    paymentTypeCode: ").append(toIndentedString(paymentTypeCode)).append("\n");
    sb.append("    achTransactionType: ").append(toIndentedString(achTransactionType)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    gatewayVersion: ").append(toIndentedString(gatewayVersion)).append("\n");
    sb.append("    gatewayResponse: ").append(toIndentedString(gatewayResponse)).append("\n");
    sb.append("    timedOut: ").append(toIndentedString(timedOut)).append("\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    requestMethod: ").append(toIndentedString(requestMethod)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseSubcode: ").append(toIndentedString(responseSubcode)).append("\n");
    sb.append("    responseReasoncode: ").append(toIndentedString(responseReasoncode)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fraudAvs: ").append(toIndentedString(fraudAvs)).append("\n");
    sb.append("    fraudAuth: ").append(toIndentedString(fraudAuth)).append("\n");
    sb.append("    fraudCvv: ").append(toIndentedString(fraudCvv)).append("\n");
    sb.append("    gatewayTransactionId: ").append(toIndentedString(gatewayTransactionId)).append("\n");
    sb.append("    originalGateway: ").append(toIndentedString(originalGateway)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    duplicate: ").append(toIndentedString(duplicate)).append("\n");
    sb.append("    postDate: ").append(toIndentedString(postDate)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    apiDuration: ").append(toIndentedString(apiDuration)).append("\n");
    sb.append("    gatewayDuration: ").append(toIndentedString(gatewayDuration)).append("\n");
    sb.append("    achStatus: ").append(toIndentedString(achStatus)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

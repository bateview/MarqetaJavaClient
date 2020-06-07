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
import io.swagger.client.model.InternalAuthorizationTransaction;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * InternalFindOriginalRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class InternalFindOriginalRequest {
  @SerializedName("authorization_tranlog")
  private InternalAuthorizationTransaction authorizationTranlog = null;

  @SerializedName("override_days")
  private Integer overrideDays = null;

  @SerializedName("context")
  private Map<String, Object> context = null;

  @SerializedName("configuration")
  private Map<String, String> _configuration = null;

  /**
   * Gets or Sets finders
   */
  @JsonAdapter(FindersEnum.Adapter.class)
  public enum FindersEnum {
    AMOUNT_LOCAL_TXN_DATE("AMOUNT_LOCAL_TXN_DATE"),
    
    APPROVAL_CODE_RRN("APPROVAL_CODE_RRN"),
    
    APPROVAL_CODE_STAN("APPROVAL_CODE_STAN"),
    
    APPROVAL_CODE_STAN_LOCAL_TXN_DATE("APPROVAL_CODE_STAN_LOCAL_TXN_DATE"),
    
    CHARGEBACK_NREF_("CHARGEBACK_NREF_"),
    
    EXPIRABLE_AUTH_DIGEST("EXPIRABLE_AUTH_DIGEST"),
    
    LOCAL_TXN_DATE_MID_AMOUNT("LOCAL_TXN_DATE_MID_AMOUNT"),
    
    LOCAL_TXN_DATE_MID_AMOUNT_TIP("LOCAL_TXN_DATE_MID_AMOUNT_TIP"),
    
    MOD_LOCAL_TXN_DATE_MID_AMOUNT_TIP("MOD_LOCAL_TXN_DATE_MID_AMOUNT_TIP"),
    
    MOST_RECENT_CHARGEBACK_TXN("MOST_RECENT_CHARGEBACK_TXN"),
    
    NRID_EXCEPT_PULSE("NRID_EXCEPT_PULSE"),
    
    NRID("NRID"),
    
    NULL_RESULT("NULL_RESULT"),
    
    PULSE_STAN_RRN("PULSE_STAN_RRN"),
    
    RRN_EXCEPT_PULSE("RRN_EXCEPT_PULSE"),
    
    RRN("RRN"),
    
    TXN_TOKEN("TXN_TOKEN");

    private String value;

    FindersEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FindersEnum fromValue(String text) {
      for (FindersEnum b : FindersEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FindersEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FindersEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FindersEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FindersEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("finders")
  private List<FindersEnum> finders = null;

  @SerializedName("original_timestamp")
  private OffsetDateTime originalTimestamp = null;

  @SerializedName("original_stan")
  private String originalStan = null;

  public InternalFindOriginalRequest authorizationTranlog(InternalAuthorizationTransaction authorizationTranlog) {
    this.authorizationTranlog = authorizationTranlog;
    return this;
  }

   /**
   * Get authorizationTranlog
   * @return authorizationTranlog
  **/
  @ApiModelProperty(required = true, value = "")
  public InternalAuthorizationTransaction getAuthorizationTranlog() {
    return authorizationTranlog;
  }

  public void setAuthorizationTranlog(InternalAuthorizationTransaction authorizationTranlog) {
    this.authorizationTranlog = authorizationTranlog;
  }

  public InternalFindOriginalRequest overrideDays(Integer overrideDays) {
    this.overrideDays = overrideDays;
    return this;
  }

   /**
   * Get overrideDays
   * @return overrideDays
  **/
  @ApiModelProperty(value = "")
  public Integer getOverrideDays() {
    return overrideDays;
  }

  public void setOverrideDays(Integer overrideDays) {
    this.overrideDays = overrideDays;
  }

  public InternalFindOriginalRequest context(Map<String, Object> context) {
    this.context = context;
    return this;
  }

  public InternalFindOriginalRequest putContextItem(String key, Object contextItem) {
    if (this.context == null) {
      this.context = new HashMap<String, Object>();
    }
    this.context.put(key, contextItem);
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getContext() {
    return context;
  }

  public void setContext(Map<String, Object> context) {
    this.context = context;
  }

  public InternalFindOriginalRequest _configuration(Map<String, String> _configuration) {
    this._configuration = _configuration;
    return this;
  }

  public InternalFindOriginalRequest putConfigurationItem(String key, String _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new HashMap<String, String>();
    }
    this._configuration.put(key, _configurationItem);
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Map<String, String> _configuration) {
    this._configuration = _configuration;
  }

  public InternalFindOriginalRequest finders(List<FindersEnum> finders) {
    this.finders = finders;
    return this;
  }

  public InternalFindOriginalRequest addFindersItem(FindersEnum findersItem) {
    if (this.finders == null) {
      this.finders = new ArrayList<FindersEnum>();
    }
    this.finders.add(findersItem);
    return this;
  }

   /**
   * Get finders
   * @return finders
  **/
  @ApiModelProperty(value = "")
  public List<FindersEnum> getFinders() {
    return finders;
  }

  public void setFinders(List<FindersEnum> finders) {
    this.finders = finders;
  }

  public InternalFindOriginalRequest originalTimestamp(OffsetDateTime originalTimestamp) {
    this.originalTimestamp = originalTimestamp;
    return this;
  }

   /**
   * Get originalTimestamp
   * @return originalTimestamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getOriginalTimestamp() {
    return originalTimestamp;
  }

  public void setOriginalTimestamp(OffsetDateTime originalTimestamp) {
    this.originalTimestamp = originalTimestamp;
  }

  public InternalFindOriginalRequest originalStan(String originalStan) {
    this.originalStan = originalStan;
    return this;
  }

   /**
   * Get originalStan
   * @return originalStan
  **/
  @ApiModelProperty(value = "")
  public String getOriginalStan() {
    return originalStan;
  }

  public void setOriginalStan(String originalStan) {
    this.originalStan = originalStan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalFindOriginalRequest internalFindOriginalRequest = (InternalFindOriginalRequest) o;
    return Objects.equals(this.authorizationTranlog, internalFindOriginalRequest.authorizationTranlog) &&
        Objects.equals(this.overrideDays, internalFindOriginalRequest.overrideDays) &&
        Objects.equals(this.context, internalFindOriginalRequest.context) &&
        Objects.equals(this._configuration, internalFindOriginalRequest._configuration) &&
        Objects.equals(this.finders, internalFindOriginalRequest.finders) &&
        Objects.equals(this.originalTimestamp, internalFindOriginalRequest.originalTimestamp) &&
        Objects.equals(this.originalStan, internalFindOriginalRequest.originalStan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationTranlog, overrideDays, context, _configuration, finders, originalTimestamp, originalStan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalFindOriginalRequest {\n");
    
    sb.append("    authorizationTranlog: ").append(toIndentedString(authorizationTranlog)).append("\n");
    sb.append("    overrideDays: ").append(toIndentedString(overrideDays)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    finders: ").append(toIndentedString(finders)).append("\n");
    sb.append("    originalTimestamp: ").append(toIndentedString(originalTimestamp)).append("\n");
    sb.append("    originalStan: ").append(toIndentedString(originalStan)).append("\n");
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


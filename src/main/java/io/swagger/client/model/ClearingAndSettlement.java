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
import java.io.IOException;

/**
 * ClearingAndSettlement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class ClearingAndSettlement {
  /**
   * Default value of GPA does not apply when JIT funding is enabled
   */
  @JsonAdapter(OverdraftDestinationEnum.Adapter.class)
  public enum OverdraftDestinationEnum {
    GPA("GPA"),
    
    MSA("MSA"),
    
    MERCHANT_CAMPAIGN_ACCOUNT("MERCHANT_CAMPAIGN_ACCOUNT"),
    
    GLOBAL_OVERDRAFT_ACCOUNT("GLOBAL_OVERDRAFT_ACCOUNT");

    private String value;

    OverdraftDestinationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OverdraftDestinationEnum fromValue(String text) {
      for (OverdraftDestinationEnum b : OverdraftDestinationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OverdraftDestinationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OverdraftDestinationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OverdraftDestinationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OverdraftDestinationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("overdraft_destination")
  private OverdraftDestinationEnum overdraftDestination = OverdraftDestinationEnum.GPA;

  public ClearingAndSettlement overdraftDestination(OverdraftDestinationEnum overdraftDestination) {
    this.overdraftDestination = overdraftDestination;
    return this;
  }

   /**
   * Default value of GPA does not apply when JIT funding is enabled
   * @return overdraftDestination
  **/
  @ApiModelProperty(value = "Default value of GPA does not apply when JIT funding is enabled")
  public OverdraftDestinationEnum getOverdraftDestination() {
    return overdraftDestination;
  }

  public void setOverdraftDestination(OverdraftDestinationEnum overdraftDestination) {
    this.overdraftDestination = overdraftDestination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearingAndSettlement clearingAndSettlement = (ClearingAndSettlement) o;
    return Objects.equals(this.overdraftDestination, clearingAndSettlement.overdraftDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftDestination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearingAndSettlement {\n");
    
    sb.append("    overdraftDestination: ").append(toIndentedString(overdraftDestination)).append("\n");
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


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
 * SelectiveAuth
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class SelectiveAuth {
  /**
   * Gets or Sets saMode
   */
  @JsonAdapter(SaModeEnum.Adapter.class)
  public enum SaModeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    SaModeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SaModeEnum fromValue(String text) {
      for (SaModeEnum b : SaModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SaModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SaModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SaModeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return SaModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sa_mode")
  private SaModeEnum saMode = SaModeEnum.NUMBER_1;

  @SerializedName("enable_regex_search_chain")
  private Boolean enableRegexSearchChain = false;

  /**
   * Gets or Sets dmdLocationSensitivity
   */
  @JsonAdapter(DmdLocationSensitivityEnum.Adapter.class)
  public enum DmdLocationSensitivityEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4);

    private Integer value;

    DmdLocationSensitivityEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DmdLocationSensitivityEnum fromValue(String text) {
      for (DmdLocationSensitivityEnum b : DmdLocationSensitivityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DmdLocationSensitivityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DmdLocationSensitivityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DmdLocationSensitivityEnum read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return DmdLocationSensitivityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dmd_location_sensitivity")
  private DmdLocationSensitivityEnum dmdLocationSensitivity = DmdLocationSensitivityEnum.NUMBER_0;

  public SelectiveAuth saMode(SaModeEnum saMode) {
    this.saMode = saMode;
    return this;
  }

   /**
   * Get saMode
   * @return saMode
  **/
  @ApiModelProperty(value = "")
  public SaModeEnum getSaMode() {
    return saMode;
  }

  public void setSaMode(SaModeEnum saMode) {
    this.saMode = saMode;
  }

  public SelectiveAuth enableRegexSearchChain(Boolean enableRegexSearchChain) {
    this.enableRegexSearchChain = enableRegexSearchChain;
    return this;
  }

   /**
   * Get enableRegexSearchChain
   * @return enableRegexSearchChain
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnableRegexSearchChain() {
    return enableRegexSearchChain;
  }

  public void setEnableRegexSearchChain(Boolean enableRegexSearchChain) {
    this.enableRegexSearchChain = enableRegexSearchChain;
  }

  public SelectiveAuth dmdLocationSensitivity(DmdLocationSensitivityEnum dmdLocationSensitivity) {
    this.dmdLocationSensitivity = dmdLocationSensitivity;
    return this;
  }

   /**
   * Get dmdLocationSensitivity
   * @return dmdLocationSensitivity
  **/
  @ApiModelProperty(value = "")
  public DmdLocationSensitivityEnum getDmdLocationSensitivity() {
    return dmdLocationSensitivity;
  }

  public void setDmdLocationSensitivity(DmdLocationSensitivityEnum dmdLocationSensitivity) {
    this.dmdLocationSensitivity = dmdLocationSensitivity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectiveAuth selectiveAuth = (SelectiveAuth) o;
    return Objects.equals(this.saMode, selectiveAuth.saMode) &&
        Objects.equals(this.enableRegexSearchChain, selectiveAuth.enableRegexSearchChain) &&
        Objects.equals(this.dmdLocationSensitivity, selectiveAuth.dmdLocationSensitivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saMode, enableRegexSearchChain, dmdLocationSensitivity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectiveAuth {\n");
    
    sb.append("    saMode: ").append(toIndentedString(saMode)).append("\n");
    sb.append("    enableRegexSearchChain: ").append(toIndentedString(enableRegexSearchChain)).append("\n");
    sb.append("    dmdLocationSensitivity: ").append(toIndentedString(dmdLocationSensitivity)).append("\n");
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


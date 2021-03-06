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
import io.swagger.client.model.Gpa;
import io.swagger.client.model.Msa;
import java.io.IOException;

/**
 * OrderScope
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class OrderScope {
  @SerializedName("gpa")
  private Gpa gpa = null;

  @SerializedName("msa")
  private Msa msa = null;

  public OrderScope gpa(Gpa gpa) {
    this.gpa = gpa;
    return this;
  }

   /**
   * Get gpa
   * @return gpa
  **/
  @ApiModelProperty(value = "")
  public Gpa getGpa() {
    return gpa;
  }

  public void setGpa(Gpa gpa) {
    this.gpa = gpa;
  }

  public OrderScope msa(Msa msa) {
    this.msa = msa;
    return this;
  }

   /**
   * Get msa
   * @return msa
  **/
  @ApiModelProperty(value = "")
  public Msa getMsa() {
    return msa;
  }

  public void setMsa(Msa msa) {
    this.msa = msa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderScope orderScope = (OrderScope) o;
    return Objects.equals(this.gpa, orderScope.gpa) &&
        Objects.equals(this.msa, orderScope.msa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gpa, msa);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderScope {\n");
    
    sb.append("    gpa: ").append(toIndentedString(gpa)).append("\n");
    sb.append("    msa: ").append(toIndentedString(msa)).append("\n");
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


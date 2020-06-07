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
import io.swagger.client.model.CacheError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateCachesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class CreateCachesResponse {
  @SerializedName("created")
  private List<String> created = null;

  @SerializedName("already_exists")
  private List<String> alreadyExists = null;

  @SerializedName("errors")
  private List<CacheError> errors = null;

  public CreateCachesResponse created(List<String> created) {
    this.created = created;
    return this;
  }

  public CreateCachesResponse addCreatedItem(String createdItem) {
    if (this.created == null) {
      this.created = new ArrayList<String>();
    }
    this.created.add(createdItem);
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public List<String> getCreated() {
    return created;
  }

  public void setCreated(List<String> created) {
    this.created = created;
  }

  public CreateCachesResponse alreadyExists(List<String> alreadyExists) {
    this.alreadyExists = alreadyExists;
    return this;
  }

  public CreateCachesResponse addAlreadyExistsItem(String alreadyExistsItem) {
    if (this.alreadyExists == null) {
      this.alreadyExists = new ArrayList<String>();
    }
    this.alreadyExists.add(alreadyExistsItem);
    return this;
  }

   /**
   * Get alreadyExists
   * @return alreadyExists
  **/
  @ApiModelProperty(value = "")
  public List<String> getAlreadyExists() {
    return alreadyExists;
  }

  public void setAlreadyExists(List<String> alreadyExists) {
    this.alreadyExists = alreadyExists;
  }

  public CreateCachesResponse errors(List<CacheError> errors) {
    this.errors = errors;
    return this;
  }

  public CreateCachesResponse addErrorsItem(CacheError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<CacheError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public List<CacheError> getErrors() {
    return errors;
  }

  public void setErrors(List<CacheError> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCachesResponse createCachesResponse = (CreateCachesResponse) o;
    return Objects.equals(this.created, createCachesResponse.created) &&
        Objects.equals(this.alreadyExists, createCachesResponse.alreadyExists) &&
        Objects.equals(this.errors, createCachesResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, alreadyExists, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCachesResponse {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    alreadyExists: ").append(toIndentedString(alreadyExists)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

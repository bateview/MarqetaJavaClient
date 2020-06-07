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
 * StoreModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class StoreModel {
  @SerializedName("name")
  private String name = null;

  @SerializedName("active")
  private Boolean active = true;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("contact_email")
  private String contactEmail = null;

  @SerializedName("longitude")
  private Float longitude = null;

  @SerializedName("latitude")
  private Float latitude = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("province")
  private String province = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("partial_auth_flag")
  private Boolean partialAuthFlag = true;

  @SerializedName("mid")
  private String mid = null;

  @SerializedName("network_mid")
  private String networkMid = null;

  @SerializedName("merchant_token")
  private String merchantToken = null;

  @SerializedName("partial_approval_capable")
  private Boolean partialApprovalCapable = false;

  @SerializedName("keyed_auth_cvv_enforced")
  private Boolean keyedAuthCvvEnforced = false;

  public StoreModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StoreModel active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public StoreModel contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public StoreModel contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Get contactEmail
   * @return contactEmail
  **/
  @ApiModelProperty(value = "")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public StoreModel longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public StoreModel latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public StoreModel address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public StoreModel address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @ApiModelProperty(value = "")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public StoreModel city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public StoreModel state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public StoreModel province(String province) {
    this.province = province;
    return this;
  }

   /**
   * Get province
   * @return province
  **/
  @ApiModelProperty(value = "")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public StoreModel zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @ApiModelProperty(required = true, value = "")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public StoreModel phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public StoreModel country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public StoreModel token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The unique identifier of the merchant
   * @return token
  **/
  @ApiModelProperty(value = "The unique identifier of the merchant")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public StoreModel partialAuthFlag(Boolean partialAuthFlag) {
    this.partialAuthFlag = partialAuthFlag;
    return this;
  }

   /**
   * Get partialAuthFlag
   * @return partialAuthFlag
  **/
  @ApiModelProperty(value = "")
  public Boolean isPartialAuthFlag() {
    return partialAuthFlag;
  }

  public void setPartialAuthFlag(Boolean partialAuthFlag) {
    this.partialAuthFlag = partialAuthFlag;
  }

  public StoreModel mid(String mid) {
    this.mid = mid;
    return this;
  }

   /**
   * Get mid
   * @return mid
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMid() {
    return mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }

  public StoreModel networkMid(String networkMid) {
    this.networkMid = networkMid;
    return this;
  }

   /**
   * Get networkMid
   * @return networkMid
  **/
  @ApiModelProperty(value = "")
  public String getNetworkMid() {
    return networkMid;
  }

  public void setNetworkMid(String networkMid) {
    this.networkMid = networkMid;
  }

  public StoreModel merchantToken(String merchantToken) {
    this.merchantToken = merchantToken;
    return this;
  }

   /**
   * Get merchantToken
   * @return merchantToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMerchantToken() {
    return merchantToken;
  }

  public void setMerchantToken(String merchantToken) {
    this.merchantToken = merchantToken;
  }

  public StoreModel partialApprovalCapable(Boolean partialApprovalCapable) {
    this.partialApprovalCapable = partialApprovalCapable;
    return this;
  }

   /**
   * Get partialApprovalCapable
   * @return partialApprovalCapable
  **/
  @ApiModelProperty(value = "")
  public Boolean isPartialApprovalCapable() {
    return partialApprovalCapable;
  }

  public void setPartialApprovalCapable(Boolean partialApprovalCapable) {
    this.partialApprovalCapable = partialApprovalCapable;
  }

  public StoreModel keyedAuthCvvEnforced(Boolean keyedAuthCvvEnforced) {
    this.keyedAuthCvvEnforced = keyedAuthCvvEnforced;
    return this;
  }

   /**
   * Get keyedAuthCvvEnforced
   * @return keyedAuthCvvEnforced
  **/
  @ApiModelProperty(value = "")
  public Boolean isKeyedAuthCvvEnforced() {
    return keyedAuthCvvEnforced;
  }

  public void setKeyedAuthCvvEnforced(Boolean keyedAuthCvvEnforced) {
    this.keyedAuthCvvEnforced = keyedAuthCvvEnforced;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreModel storeModel = (StoreModel) o;
    return Objects.equals(this.name, storeModel.name) &&
        Objects.equals(this.active, storeModel.active) &&
        Objects.equals(this.contact, storeModel.contact) &&
        Objects.equals(this.contactEmail, storeModel.contactEmail) &&
        Objects.equals(this.longitude, storeModel.longitude) &&
        Objects.equals(this.latitude, storeModel.latitude) &&
        Objects.equals(this.address1, storeModel.address1) &&
        Objects.equals(this.address2, storeModel.address2) &&
        Objects.equals(this.city, storeModel.city) &&
        Objects.equals(this.state, storeModel.state) &&
        Objects.equals(this.province, storeModel.province) &&
        Objects.equals(this.zip, storeModel.zip) &&
        Objects.equals(this.phone, storeModel.phone) &&
        Objects.equals(this.country, storeModel.country) &&
        Objects.equals(this.token, storeModel.token) &&
        Objects.equals(this.partialAuthFlag, storeModel.partialAuthFlag) &&
        Objects.equals(this.mid, storeModel.mid) &&
        Objects.equals(this.networkMid, storeModel.networkMid) &&
        Objects.equals(this.merchantToken, storeModel.merchantToken) &&
        Objects.equals(this.partialApprovalCapable, storeModel.partialApprovalCapable) &&
        Objects.equals(this.keyedAuthCvvEnforced, storeModel.keyedAuthCvvEnforced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, active, contact, contactEmail, longitude, latitude, address1, address2, city, state, province, zip, phone, country, token, partialAuthFlag, mid, networkMid, merchantToken, partialApprovalCapable, keyedAuthCvvEnforced);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    partialAuthFlag: ").append(toIndentedString(partialAuthFlag)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    networkMid: ").append(toIndentedString(networkMid)).append("\n");
    sb.append("    merchantToken: ").append(toIndentedString(merchantToken)).append("\n");
    sb.append("    partialApprovalCapable: ").append(toIndentedString(partialApprovalCapable)).append("\n");
    sb.append("    keyedAuthCvvEnforced: ").append(toIndentedString(keyedAuthCvvEnforced)).append("\n");
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

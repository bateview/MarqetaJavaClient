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
import org.threeten.bp.OffsetDateTime;

/**
 * FileProcessingResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class FileProcessingResponse {
  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("last_modified_time")
  private OffsetDateTime lastModifiedTime = null;

  @SerializedName("token")
  private String token = null;

  /**
   * Gets or Sets fileProcessType
   */
  @JsonAdapter(FileProcessTypeEnum.Adapter.class)
  public enum FileProcessTypeEnum {
    MASTERCARD_CLEARING("MASTERCARD_CLEARING"),
    
    VISA_CLEARING("VISA_CLEARING"),
    
    PULSE_CLEARING("PULSE_CLEARING"),
    
    DISCOVER_CLEARING("DISCOVER_CLEARING");

    private String value;

    FileProcessTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FileProcessTypeEnum fromValue(String text) {
      for (FileProcessTypeEnum b : FileProcessTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FileProcessTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FileProcessTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FileProcessTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FileProcessTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("file_process_type")
  private FileProcessTypeEnum fileProcessType = null;

  @SerializedName("source_file")
  private String sourceFile = null;

  @SerializedName("archive_file")
  private String archiveFile = null;

  /**
   * Gets or Sets fileProcessStatus
   */
  @JsonAdapter(FileProcessStatusEnum.Adapter.class)
  public enum FileProcessStatusEnum {
    QUEUED("QUEUED"),
    
    STARTED("STARTED"),
    
    COMPLETED("COMPLETED"),
    
    ERROR("ERROR"),
    
    TERMINATED("TERMINATED");

    private String value;

    FileProcessStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FileProcessStatusEnum fromValue(String text) {
      for (FileProcessStatusEnum b : FileProcessStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FileProcessStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FileProcessStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FileProcessStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FileProcessStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("file_process_status")
  private FileProcessStatusEnum fileProcessStatus = null;

  public FileProcessingResponse createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * yyyy-MM-ddTHH:mm:ssZ
   * @return createdTime
  **/
  @ApiModelProperty(required = true, value = "yyyy-MM-ddTHH:mm:ssZ")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public FileProcessingResponse lastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * yyyy-MM-ddTHH:mm:ssZ
   * @return lastModifiedTime
  **/
  @ApiModelProperty(required = true, value = "yyyy-MM-ddTHH:mm:ssZ")
  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public FileProcessingResponse token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public FileProcessingResponse fileProcessType(FileProcessTypeEnum fileProcessType) {
    this.fileProcessType = fileProcessType;
    return this;
  }

   /**
   * Get fileProcessType
   * @return fileProcessType
  **/
  @ApiModelProperty(required = true, value = "")
  public FileProcessTypeEnum getFileProcessType() {
    return fileProcessType;
  }

  public void setFileProcessType(FileProcessTypeEnum fileProcessType) {
    this.fileProcessType = fileProcessType;
  }

  public FileProcessingResponse sourceFile(String sourceFile) {
    this.sourceFile = sourceFile;
    return this;
  }

   /**
   * Get sourceFile
   * @return sourceFile
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSourceFile() {
    return sourceFile;
  }

  public void setSourceFile(String sourceFile) {
    this.sourceFile = sourceFile;
  }

  public FileProcessingResponse archiveFile(String archiveFile) {
    this.archiveFile = archiveFile;
    return this;
  }

   /**
   * Get archiveFile
   * @return archiveFile
  **/
  @ApiModelProperty(value = "")
  public String getArchiveFile() {
    return archiveFile;
  }

  public void setArchiveFile(String archiveFile) {
    this.archiveFile = archiveFile;
  }

  public FileProcessingResponse fileProcessStatus(FileProcessStatusEnum fileProcessStatus) {
    this.fileProcessStatus = fileProcessStatus;
    return this;
  }

   /**
   * Get fileProcessStatus
   * @return fileProcessStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public FileProcessStatusEnum getFileProcessStatus() {
    return fileProcessStatus;
  }

  public void setFileProcessStatus(FileProcessStatusEnum fileProcessStatus) {
    this.fileProcessStatus = fileProcessStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileProcessingResponse fileProcessingResponse = (FileProcessingResponse) o;
    return Objects.equals(this.createdTime, fileProcessingResponse.createdTime) &&
        Objects.equals(this.lastModifiedTime, fileProcessingResponse.lastModifiedTime) &&
        Objects.equals(this.token, fileProcessingResponse.token) &&
        Objects.equals(this.fileProcessType, fileProcessingResponse.fileProcessType) &&
        Objects.equals(this.sourceFile, fileProcessingResponse.sourceFile) &&
        Objects.equals(this.archiveFile, fileProcessingResponse.archiveFile) &&
        Objects.equals(this.fileProcessStatus, fileProcessingResponse.fileProcessStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, lastModifiedTime, token, fileProcessType, sourceFile, archiveFile, fileProcessStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileProcessingResponse {\n");
    
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    fileProcessType: ").append(toIndentedString(fileProcessType)).append("\n");
    sb.append("    sourceFile: ").append(toIndentedString(sourceFile)).append("\n");
    sb.append("    archiveFile: ").append(toIndentedString(archiveFile)).append("\n");
    sb.append("    fileProcessStatus: ").append(toIndentedString(fileProcessStatus)).append("\n");
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

/*
 * WSO2 API Manager - Gateway
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Gateway. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/master/components/apimgt/org.wso2.carbon.apimgt.rest.api.gateway/src/main/resources/gateway-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v2.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.gateway.api.v2.dto;

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
 * DeployResponseDTO
 */

public class DeployResponseDTO {
  /**
   * This attribute declares whether deployment task is successfull or failed. 
   */
  @JsonAdapter(DeployStatusEnum.Adapter.class)
  public enum DeployStatusEnum {
    DEPLOYED("DEPLOYED"),
    
    UNDEPLOYED("UNDEPLOYED"),
    
    ERROR("ERROR");

    private String value;

    DeployStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeployStatusEnum fromValue(String text) {
      for (DeployStatusEnum b : DeployStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeployStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeployStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeployStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeployStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("deployStatus")
  private DeployStatusEnum deployStatus = null;

  @SerializedName("jsonPayload")
  private String jsonPayload = null;

  public DeployResponseDTO deployStatus(DeployStatusEnum deployStatus) {
    this.deployStatus = deployStatus;
    return this;
  }

   /**
   * This attribute declares whether deployment task is successfull or failed. 
   * @return deployStatus
  **/
  @ApiModelProperty(example = "DEPLOYED", required = true, value = "This attribute declares whether deployment task is successfull or failed. ")
  public DeployStatusEnum getDeployStatus() {
    return deployStatus;
  }

  public void setDeployStatus(DeployStatusEnum deployStatus) {
    this.deployStatus = deployStatus;
  }

  public DeployResponseDTO jsonPayload(String jsonPayload) {
    this.jsonPayload = jsonPayload;
    return this;
  }

   /**
   * Attributes that returned after the api deployment 
   * @return jsonPayload
  **/
  @ApiModelProperty(value = "Attributes that returned after the api deployment ")
  public String getJsonPayload() {
    return jsonPayload;
  }

  public void setJsonPayload(String jsonPayload) {
    this.jsonPayload = jsonPayload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployResponseDTO deployResponse = (DeployResponseDTO) o;
    return Objects.equals(this.deployStatus, deployResponse.deployStatus) &&
        Objects.equals(this.jsonPayload, deployResponse.jsonPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployStatus, jsonPayload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployResponseDTO {\n");
    
    sb.append("    deployStatus: ").append(toIndentedString(deployStatus)).append("\n");
    sb.append("    jsonPayload: ").append(toIndentedString(jsonPayload)).append("\n");
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


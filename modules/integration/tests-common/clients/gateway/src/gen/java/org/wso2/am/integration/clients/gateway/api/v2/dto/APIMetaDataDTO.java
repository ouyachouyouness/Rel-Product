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
 * APIMetaDataDTO
 */

public class APIMetaDataDTO {
  @SerializedName("apiUUID")
  private String apiUUID = null;

  @SerializedName("apiId")
  private Integer apiId = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("policy")
  private String policy = null;

  @SerializedName("apiType")
  private String apiType = null;

  @SerializedName("isDefaultVersion")
  private Boolean isDefaultVersion = null;

  @SerializedName("status")
  private String status = null;

  public APIMetaDataDTO apiUUID(String apiUUID) {
    this.apiUUID = apiUUID;
    return this;
  }

   /**
   * UUID of API.
   * @return apiUUID
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", value = "UUID of API.")
  public String getApiUUID() {
    return apiUUID;
  }

  public void setApiUUID(String apiUUID) {
    this.apiUUID = apiUUID;
  }

  public APIMetaDataDTO apiId(Integer apiId) {
    this.apiId = apiId;
    return this;
  }

   /**
   * Get apiId
   * @return apiId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getApiId() {
    return apiId;
  }

  public void setApiId(Integer apiId) {
    this.apiId = apiId;
  }

  public APIMetaDataDTO provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * API Provider name.
   * @return provider
  **/
  @ApiModelProperty(example = "admin", value = "API Provider name.")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public APIMetaDataDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the API
   * @return name
  **/
  @ApiModelProperty(example = "PizzaAPI", value = "Name of the API")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public APIMetaDataDTO version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of the API.
   * @return version
  **/
  @ApiModelProperty(example = "v1.0.0", value = "Version of the API.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public APIMetaDataDTO context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Context of the API.
   * @return context
  **/
  @ApiModelProperty(example = "/pizza/v1.0.0", value = "Context of the API.")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public APIMetaDataDTO policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * API level throttling policy.
   * @return policy
  **/
  @ApiModelProperty(example = "Gold", value = "API level throttling policy.")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public APIMetaDataDTO apiType(String apiType) {
    this.apiType = apiType;
    return this;
  }

   /**
   * Type of the API.
   * @return apiType
  **/
  @ApiModelProperty(example = "APIProduct", value = "Type of the API.")
  public String getApiType() {
    return apiType;
  }

  public void setApiType(String apiType) {
    this.apiType = apiType;
  }

  public APIMetaDataDTO isDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
    return this;
  }

   /**
   * Whether this is the default version of the API.
   * @return isDefaultVersion
  **/
  @ApiModelProperty(example = "false", value = "Whether this is the default version of the API.")
  public Boolean isIsDefaultVersion() {
    return isDefaultVersion;
  }

  public void setIsDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
  }

  public APIMetaDataDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of API.
   * @return status
  **/
  @ApiModelProperty(example = "Published", value = "Status of API.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIMetaDataDTO apIMetaData = (APIMetaDataDTO) o;
    return Objects.equals(this.apiUUID, apIMetaData.apiUUID) &&
        Objects.equals(this.apiId, apIMetaData.apiId) &&
        Objects.equals(this.provider, apIMetaData.provider) &&
        Objects.equals(this.name, apIMetaData.name) &&
        Objects.equals(this.version, apIMetaData.version) &&
        Objects.equals(this.context, apIMetaData.context) &&
        Objects.equals(this.policy, apIMetaData.policy) &&
        Objects.equals(this.apiType, apIMetaData.apiType) &&
        Objects.equals(this.isDefaultVersion, apIMetaData.isDefaultVersion) &&
        Objects.equals(this.status, apIMetaData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiUUID, apiId, provider, name, version, context, policy, apiType, isDefaultVersion, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIMetaDataDTO {\n");
    
    sb.append("    apiUUID: ").append(toIndentedString(apiUUID)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
    sb.append("    isDefaultVersion: ").append(toIndentedString(isDefaultVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


/*
 * WSO2 API Manager - Publisher API
 * This document specifies a **RESTful API** for WSO2 **API Manager** - **Publisher**.  # Authentication The Publisher REST API is protected using OAuth2 and access control is achieved through scopes. Before you start invoking the the API you need to obtain an access token with the required scopes. This guide will walk you through the steps that you will need to follow to obtain an access token. First you need to obtain the consumer key/secret key pair by calling the dynamic client registration (DCR) endpoint. You can add your preferred grant types in the payload. A Sample payload is shown below. ```   {   \"callbackUrl\":\"www.google.lk\",   \"clientName\":\"rest_api_publisher\",   \"owner\":\"admin\",   \"grantType\":\"client_credentials password refresh_token\",   \"saasApp\":true   } ``` Create a file (payload.json) with the above sample payload, and use the cURL shown bellow to invoke the DCR endpoint. Authorization header of this should contain the base64 encoded admin username and password. **Format of the request** ```   curl -X POST -H \"Authorization: Basic Base64(admin_username:admin_password)\" -H \"Content-Type: application/json\"   \\ -d @payload.json https://<host>:<servlet_port>/client-registration/v0.17/register ``` **Sample request** ```   curl -X POST -H \"Authorization: Basic YWRtaW46YWRtaW4=\" -H \"Content-Type: application/json\"   \\ -d @payload.json https://localhost:9443/client-registration/v0.17/register ``` Following is a sample response after invoking the above curl. ``` { \"clientId\": \"fOCi4vNJ59PpHucC2CAYfYuADdMa\", \"clientName\": \"rest_api_publisher\", \"callBackURL\": \"www.google.lk\", \"clientSecret\": \"a4FwHlq0iCIKVs2MPIIDnepZnYMa\", \"isSaasApplication\": true, \"appOwner\": \"admin\", \"jsonString\": \"{\\\"grant_types\\\":\\\"client_credentials password refresh_token\\\",\\\"redirect_uris\\\":\\\"www.google.lk\\\",\\\"client_name\\\":\\\"rest_api123\\\"}\", \"jsonAppAttribute\": \"{}\", \"tokenType\": null } ``` Next you must use the above client id and secret to obtain the access token. We will be using the password grant type for this, you can use any grant type you desire. You also need to add the proper **scope** when getting the access token. All possible scopes for publisher REST API can be viewed in **OAuth2 Security** section of this document and scope for each resource is given in **authorization** section of resource documentation. Following is the format of the request if you are using the password grant type. ``` curl -k -d \"grant_type=password&username=<admin_username>&password=<admin_passowrd&scope=<scopes seperated by space>\" \\ -H \"Authorization: Basic base64(cliet_id:client_secret)\" \\ https://<host>:<servlet_port>/oauth2/token ``` **Sample request** ``` curl https://localhost:9443/oauth2/token -k \\ -H \"Authorization: Basic Zk9DaTR2Tko1OVBwSHVjQzJDQVlmWXVBRGRNYTphNEZ3SGxxMGlDSUtWczJNUElJRG5lcFpuWU1h\" \\ -d \"grant_type=password&username=admin&password=admin&scope=apim:api_view apim:api_create\" ``` Shown below is a sample response to the above request. ``` { \"access_token\": \"e79bda48-3406-3178-acce-f6e4dbdcbb12\", \"refresh_token\": \"a757795d-e69f-38b8-bd85-9aded677a97c\", \"scope\": \"apim:api_create apim:api_view\", \"token_type\": \"Bearer\", \"expires_in\": 3600 } ``` Now you have a valid access token, which you can use to invoke an API. Navigate through the API descriptions to find the required API, obtain an access token as described above and invoke the API with the authentication header. If you use a different authentication mechanism, this process may change.  # Try out in Postman If you want to try-out the embedded postman collection with \"Run in Postman\" option, please follow the guidelines listed below. * All of the OAuth2 secured endpoints have been configured with an Authorization Bearer header with a parameterized access token. Before invoking any REST API resource make sure you run the `Register DCR Application` and `Generate Access Token` requests to fetch an access token with all required scopes. * Make sure you have an API Manager instance up and running. * Update the `basepath` parameter to match the hostname and port of the APIM instance.  [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/a09044034b5c3c1b01a9) 
 *
 * The version of the OpenAPI document: v3
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonCreator;
/**
* API definition information
*/
    @ApiModel(description = "API definition information")

public class AsyncAPISpecificationValidationResponseInfoDTO {
        public static final String SERIALIZED_NAME_NAME = "name";
        @SerializedName(SERIALIZED_NAME_NAME)
            private String name;

        public static final String SERIALIZED_NAME_VERSION = "version";
        @SerializedName(SERIALIZED_NAME_VERSION)
            private String version;

        public static final String SERIALIZED_NAME_CONTEXT = "context";
        @SerializedName(SERIALIZED_NAME_CONTEXT)
            private String context;

        public static final String SERIALIZED_NAME_DESCRIPTION = "description";
        @SerializedName(SERIALIZED_NAME_DESCRIPTION)
            private String description;

        public static final String SERIALIZED_NAME_ASYNC_A_P_I_VERSION = "asyncAPIVersion";
        @SerializedName(SERIALIZED_NAME_ASYNC_A_P_I_VERSION)
            private String asyncAPIVersion;

        public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
        @SerializedName(SERIALIZED_NAME_PROTOCOL)
            private String protocol;

        public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";
        @SerializedName(SERIALIZED_NAME_ENDPOINTS)
            private List<String> endpoints = null;

        public static final String SERIALIZED_NAME_GATEWAY_VENDOR = "gatewayVendor";
        @SerializedName(SERIALIZED_NAME_GATEWAY_VENDOR)
            private String gatewayVendor;

        public static final String SERIALIZED_NAME_ASYNC_TRANSPORT_PROTOCOLS = "asyncTransportProtocols";
        @SerializedName(SERIALIZED_NAME_ASYNC_TRANSPORT_PROTOCOLS)
            private List<String> asyncTransportProtocols = null;


        public AsyncAPISpecificationValidationResponseInfoDTO name(String name) {
        
        this.name = name;
        return this;
        }

    /**
        * Get name
    * @return name
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "Streetlights", value = "")
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


        public AsyncAPISpecificationValidationResponseInfoDTO version(String version) {
        
        this.version = version;
        return this;
        }

    /**
        * Get version
    * @return version
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "1.0.0", value = "")
    
    public String getVersion() {
        return version;
    }


    public void setVersion(String version) {
        this.version = version;
    }


        public AsyncAPISpecificationValidationResponseInfoDTO context(String context) {
        
        this.context = context;
        return this;
        }

    /**
        * Get context
    * @return context
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "/streetlights", value = "")
    
    public String getContext() {
        return context;
    }


    public void setContext(String context) {
        this.context = context;
    }


        public AsyncAPISpecificationValidationResponseInfoDTO description(String description) {
        
        this.description = description;
        return this;
        }

    /**
        * Get description
    * @return description
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "A sample API that uses a streetlights as an example to demonstrate AsyncAPI specifications", value = "")
    
    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


        public AsyncAPISpecificationValidationResponseInfoDTO asyncAPIVersion(String asyncAPIVersion) {
        
        this.asyncAPIVersion = asyncAPIVersion;
        return this;
        }

    /**
        * Get asyncAPIVersion
    * @return asyncAPIVersion
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "2.0", value = "")
    
    public String getAsyncAPIVersion() {
        return asyncAPIVersion;
    }


    public void setAsyncAPIVersion(String asyncAPIVersion) {
        this.asyncAPIVersion = asyncAPIVersion;
    }


        public AsyncAPISpecificationValidationResponseInfoDTO protocol(String protocol) {
        
        this.protocol = protocol;
        return this;
        }

    /**
        * Get protocol
    * @return protocol
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "WEBSUB", value = "")
    
    public String getProtocol() {
        return protocol;
    }


    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }


        public AsyncAPISpecificationValidationResponseInfoDTO endpoints(List<String> endpoints) {
        
        this.endpoints = endpoints;
        return this;
        }

    /**
        * contains host/servers specified in the AsyncAPI file/URL
    * @return endpoints
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(value = "contains host/servers specified in the AsyncAPI file/URL")
    
    public List<String> getEndpoints() {
        return endpoints;
    }


    public void setEndpoints(List<String> endpoints) {
        this.endpoints = endpoints;
    }


        public AsyncAPISpecificationValidationResponseInfoDTO gatewayVendor(String gatewayVendor) {
        
        this.gatewayVendor = gatewayVendor;
        return this;
        }

    /**
        * Get gatewayVendor
    * @return gatewayVendor
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "wso2", value = "")
    
    public String getGatewayVendor() {
        return gatewayVendor;
    }


    public void setGatewayVendor(String gatewayVendor) {
        this.gatewayVendor = gatewayVendor;
    }


        public AsyncAPISpecificationValidationResponseInfoDTO asyncTransportProtocols(List<String> asyncTransportProtocols) {
        
        this.asyncTransportProtocols = asyncTransportProtocols;
        return this;
        }

    /**
        * contains available transports for an async API
    * @return asyncTransportProtocols
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(value = "contains available transports for an async API")
    
    public List<String> getAsyncTransportProtocols() {
        return asyncTransportProtocols;
    }


    public void setAsyncTransportProtocols(List<String> asyncTransportProtocols) {
        this.asyncTransportProtocols = asyncTransportProtocols;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            AsyncAPISpecificationValidationResponseInfoDTO asyncAPISpecificationValidationResponseInfo = (AsyncAPISpecificationValidationResponseInfoDTO) o;
            return Objects.equals(this.name, asyncAPISpecificationValidationResponseInfo.name) &&
            Objects.equals(this.version, asyncAPISpecificationValidationResponseInfo.version) &&
            Objects.equals(this.context, asyncAPISpecificationValidationResponseInfo.context) &&
            Objects.equals(this.description, asyncAPISpecificationValidationResponseInfo.description) &&
            Objects.equals(this.asyncAPIVersion, asyncAPISpecificationValidationResponseInfo.asyncAPIVersion) &&
            Objects.equals(this.protocol, asyncAPISpecificationValidationResponseInfo.protocol) &&
            Objects.equals(this.endpoints, asyncAPISpecificationValidationResponseInfo.endpoints) &&
            Objects.equals(this.gatewayVendor, asyncAPISpecificationValidationResponseInfo.gatewayVendor) &&
            Objects.equals(this.asyncTransportProtocols, asyncAPISpecificationValidationResponseInfo.asyncTransportProtocols);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, context, description, asyncAPIVersion, protocol, endpoints, gatewayVendor, asyncTransportProtocols);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class AsyncAPISpecificationValidationResponseInfoDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    asyncAPIVersion: ").append(toIndentedString(asyncAPIVersion)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    gatewayVendor: ").append(toIndentedString(gatewayVendor)).append("\n");
    sb.append("    asyncTransportProtocols: ").append(toIndentedString(asyncTransportProtocols)).append("\n");
sb.append("}");
return sb.toString();
}

/**
* Convert the given object to string with each line indented by 4 spaces
* (except the first line).
*/
private String toIndentedString(Object o) {
if (o == null) {
return "null";
}
return o.toString().replace("\n", "\n    ");
}

}


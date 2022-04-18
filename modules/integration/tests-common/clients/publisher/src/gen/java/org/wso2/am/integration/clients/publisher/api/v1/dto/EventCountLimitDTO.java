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
import org.wso2.am.integration.clients.publisher.api.v1.dto.EventCountLimitAllOfDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ThrottleLimitBaseDTO;
import com.fasterxml.jackson.annotation.JsonCreator;
/**
* EventCountLimitDTO
*/

public class EventCountLimitDTO {
        public static final String SERIALIZED_NAME_TIME_UNIT = "timeUnit";
        @SerializedName(SERIALIZED_NAME_TIME_UNIT)
            private String timeUnit;

        public static final String SERIALIZED_NAME_UNIT_TIME = "unitTime";
        @SerializedName(SERIALIZED_NAME_UNIT_TIME)
            private Integer unitTime;

        public static final String SERIALIZED_NAME_EVENT_COUNT = "eventCount";
        @SerializedName(SERIALIZED_NAME_EVENT_COUNT)
            private Long eventCount;


        public EventCountLimitDTO timeUnit(String timeUnit) {
        
        this.timeUnit = timeUnit;
        return this;
        }

    /**
        * Unit of the time. Allowed values are \&quot;sec\&quot;, \&quot;min\&quot;, \&quot;hour\&quot;, \&quot;day\&quot;
    * @return timeUnit
    **/
      @ApiModelProperty(example = "min", required = true, value = "Unit of the time. Allowed values are \"sec\", \"min\", \"hour\", \"day\"")
    
    public String getTimeUnit() {
        return timeUnit;
    }


    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }


        public EventCountLimitDTO unitTime(Integer unitTime) {
        
        this.unitTime = unitTime;
        return this;
        }

    /**
        * Time limit that the throttling limit applies.
    * @return unitTime
    **/
      @ApiModelProperty(example = "10", required = true, value = "Time limit that the throttling limit applies.")
    
    public Integer getUnitTime() {
        return unitTime;
    }


    public void setUnitTime(Integer unitTime) {
        this.unitTime = unitTime;
    }


        public EventCountLimitDTO eventCount(Long eventCount) {
        
        this.eventCount = eventCount;
        return this;
        }

    /**
        * Maximum number of events allowed
    * @return eventCount
    **/
      @ApiModelProperty(example = "3000", required = true, value = "Maximum number of events allowed")
    
    public Long getEventCount() {
        return eventCount;
    }


    public void setEventCount(Long eventCount) {
        this.eventCount = eventCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            EventCountLimitDTO eventCountLimit = (EventCountLimitDTO) o;
            return Objects.equals(this.timeUnit, eventCountLimit.timeUnit) &&
            Objects.equals(this.unitTime, eventCountLimit.unitTime) &&
            Objects.equals(this.eventCount, eventCountLimit.eventCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeUnit, unitTime, eventCount);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class EventCountLimitDTO {\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    unitTime: ").append(toIndentedString(unitTime)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
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


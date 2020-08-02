# SystemApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminResetPost**](SystemApi.md#adminResetPost) | **POST** /__admin/reset | Reset mappings and request journal
[**adminSettingsPost**](SystemApi.md#adminSettingsPost) | **POST** /__admin/settings | Update global settings
[**adminShutdownPost**](SystemApi.md#adminShutdownPost) | **POST** /__admin/shutdown | 

<a name="adminResetPost"></a>
# **adminResetPost**
> adminResetPost()

Reset mappings and request journal

Reset mappings to the default state and reset the request journal

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    apiInstance.adminResetPost();
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#adminResetPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="adminSettingsPost"></a>
# **adminSettingsPost**
> adminSettingsPost(body)

Update global settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
Body12 body = new Body12(); // Body12 | 
try {
    apiInstance.adminSettingsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#adminSettingsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body12**](Body12.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="adminShutdownPost"></a>
# **adminShutdownPost**
> adminShutdownPost()



Shutdown the WireMock server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    apiInstance.adminShutdownPost();
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#adminShutdownPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


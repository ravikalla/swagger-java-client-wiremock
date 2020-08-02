# ScenariosApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminScenariosGet**](ScenariosApi.md#adminScenariosGet) | **GET** /__admin/scenarios | Get all scenarios
[**adminScenariosResetPost**](ScenariosApi.md#adminScenariosResetPost) | **POST** /__admin/scenarios/reset | Reset the state of all scenarios

<a name="adminScenariosGet"></a>
# **adminScenariosGet**
> InlineResponse2004 adminScenariosGet()

Get all scenarios

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScenariosApi;


ScenariosApi apiInstance = new ScenariosApi();
try {
    InlineResponse2004 result = apiInstance.adminScenariosGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScenariosApi#adminScenariosGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminScenariosResetPost"></a>
# **adminScenariosResetPost**
> adminScenariosResetPost()

Reset the state of all scenarios

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScenariosApi;


ScenariosApi apiInstance = new ScenariosApi();
try {
    apiInstance.adminScenariosResetPost();
} catch (ApiException e) {
    System.err.println("Exception when calling ScenariosApi#adminScenariosResetPost");
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


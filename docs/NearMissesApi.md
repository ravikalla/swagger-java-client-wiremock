# NearMissesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminNearMissesRequestPatternPost**](NearMissesApi.md#adminNearMissesRequestPatternPost) | **POST** /__admin/near-misses/request-pattern | Find near misses matching request pattern
[**adminNearMissesRequestPost**](NearMissesApi.md#adminNearMissesRequestPost) | **POST** /__admin/near-misses/request | Find near misses matching specific request
[**adminRequestsUnmatchedNearMissesGet**](NearMissesApi.md#adminRequestsUnmatchedNearMissesGet) | **GET** /__admin/requests/unmatched/near-misses | 

<a name="adminNearMissesRequestPatternPost"></a>
# **adminNearMissesRequestPatternPost**
> InlineResponse2002 adminNearMissesRequestPatternPost(body)

Find near misses matching request pattern

Find at most 3 near misses for closest logged requests to the specified request pattern

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NearMissesApi;


NearMissesApi apiInstance = new NearMissesApi();
Body9 body = new Body9(); // Body9 | 
try {
    InlineResponse2002 result = apiInstance.adminNearMissesRequestPatternPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NearMissesApi#adminNearMissesRequestPatternPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body9**](Body9.md)|  |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminNearMissesRequestPost"></a>
# **adminNearMissesRequestPost**
> InlineResponse2002 adminNearMissesRequestPost(body)

Find near misses matching specific request

Find at most 3 near misses for closest stub mappings to the specified request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NearMissesApi;


NearMissesApi apiInstance = new NearMissesApi();
Body8 body = new Body8(); // Body8 | 
try {
    InlineResponse2002 result = apiInstance.adminNearMissesRequestPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NearMissesApi#adminNearMissesRequestPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body8**](Body8.md)|  |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminRequestsUnmatchedNearMissesGet"></a>
# **adminRequestsUnmatchedNearMissesGet**
> InlineResponse2002 adminRequestsUnmatchedNearMissesGet()



Retrieve near-misses for all unmatched requests

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NearMissesApi;


NearMissesApi apiInstance = new NearMissesApi();
try {
    InlineResponse2002 result = apiInstance.adminRequestsUnmatchedNearMissesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NearMissesApi#adminRequestsUnmatchedNearMissesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


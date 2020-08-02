# RequestsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminRequestsCountPost**](RequestsApi.md#adminRequestsCountPost) | **POST** /__admin/requests/count | Count requests by criteria
[**adminRequestsDelete**](RequestsApi.md#adminRequestsDelete) | **DELETE** /__admin/requests | Delete all requests in journal
[**adminRequestsFindPost**](RequestsApi.md#adminRequestsFindPost) | **POST** /__admin/requests/find | Find requests by criteria
[**adminRequestsGet**](RequestsApi.md#adminRequestsGet) | **GET** /__admin/requests | Get all requests in journal
[**adminRequestsRemoveByMetadataPost**](RequestsApi.md#adminRequestsRemoveByMetadataPost) | **POST** /__admin/requests/remove-by-metadata | Delete requests mappings matching metadata
[**adminRequestsRemovePost**](RequestsApi.md#adminRequestsRemovePost) | **POST** /__admin/requests/remove | Remove requests by criteria
[**adminRequestsRequestIdDelete**](RequestsApi.md#adminRequestsRequestIdDelete) | **DELETE** /__admin/requests/{requestId} | Delete request by ID
[**adminRequestsRequestIdGet**](RequestsApi.md#adminRequestsRequestIdGet) | **GET** /__admin/requests/{requestId} | Get request by ID
[**adminRequestsResetPost**](RequestsApi.md#adminRequestsResetPost) | **POST** /__admin/requests/reset | Empty the request journal
[**adminRequestsUnmatchedGet**](RequestsApi.md#adminRequestsUnmatchedGet) | **GET** /__admin/requests/unmatched | Find unmatched requests

<a name="adminRequestsCountPost"></a>
# **adminRequestsCountPost**
> InlineResponse2001 adminRequestsCountPost(body)

Count requests by criteria

Count requests logged in the journal matching the specified criteria

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestsApi;


RequestsApi apiInstance = new RequestsApi();
Body4 body = new Body4(); // Body4 | 
try {
    InlineResponse2001 result = apiInstance.adminRequestsCountPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RequestsApi#adminRequestsCountPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body4**](Body4.md)|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminRequestsDelete"></a>
# **adminRequestsDelete**
> adminRequestsDelete()

Delete all requests in journal

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestsApi;


RequestsApi apiInstance = new RequestsApi();
try {
    apiInstance.adminRequestsDelete();
} catch (ApiException e) {
    System.err.println("Exception when calling RequestsApi#adminRequestsDelete");
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

<a name="adminRequestsFindPost"></a>
# **adminRequestsFindPost**
> adminRequestsFindPost(body)

Find requests by criteria

Retrieve details of requests logged in the journal matching the specified criteria

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestsApi;


RequestsApi apiInstance = new RequestsApi();
Body7 body = new Body7(); // Body7 | 
try {
    apiInstance.adminRequestsFindPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RequestsApi#adminRequestsFindPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body7**](Body7.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminRequestsGet"></a>
# **adminRequestsGet**
> adminRequestsGet(limit, since)

Get all requests in journal

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestsApi;


RequestsApi apiInstance = new RequestsApi();
String limit = "limit_example"; // String | The maximum number of results to return
String since = "since_example"; // String | Only return logged requests after this date
try {
    apiInstance.adminRequestsGet(limit, since);
} catch (ApiException e) {
    System.err.println("Exception when calling RequestsApi#adminRequestsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String**| The maximum number of results to return | [optional]
 **since** | **String**| Only return logged requests after this date | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminRequestsRemoveByMetadataPost"></a>
# **adminRequestsRemoveByMetadataPost**
> adminRequestsRemoveByMetadataPost(body)

Delete requests mappings matching metadata

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestsApi;


RequestsApi apiInstance = new RequestsApi();
Body6 body = new Body6(); // Body6 | 
try {
    apiInstance.adminRequestsRemoveByMetadataPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RequestsApi#adminRequestsRemoveByMetadataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body6**](Body6.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminRequestsRemovePost"></a>
# **adminRequestsRemovePost**
> adminRequestsRemovePost(body)

Remove requests by criteria

Removed requests logged in the journal matching the specified criteria

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestsApi;


RequestsApi apiInstance = new RequestsApi();
Body5 body = new Body5(); // Body5 | 
try {
    apiInstance.adminRequestsRemovePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RequestsApi#adminRequestsRemovePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body5**](Body5.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminRequestsRequestIdDelete"></a>
# **adminRequestsRequestIdDelete**
> adminRequestsRequestIdDelete(requestId)

Delete request by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestsApi;


RequestsApi apiInstance = new RequestsApi();
String requestId = "requestId_example"; // String | The UUID of the logged request
try {
    apiInstance.adminRequestsRequestIdDelete(requestId);
} catch (ApiException e) {
    System.err.println("Exception when calling RequestsApi#adminRequestsRequestIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**| The UUID of the logged request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="adminRequestsRequestIdGet"></a>
# **adminRequestsRequestIdGet**
> adminRequestsRequestIdGet(requestId)

Get request by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestsApi;


RequestsApi apiInstance = new RequestsApi();
String requestId = "requestId_example"; // String | The UUID of the logged request
try {
    apiInstance.adminRequestsRequestIdGet(requestId);
} catch (ApiException e) {
    System.err.println("Exception when calling RequestsApi#adminRequestsRequestIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**| The UUID of the logged request |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminRequestsResetPost"></a>
# **adminRequestsResetPost**
> adminRequestsResetPost()

Empty the request journal

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestsApi;


RequestsApi apiInstance = new RequestsApi();
try {
    apiInstance.adminRequestsResetPost();
} catch (ApiException e) {
    System.err.println("Exception when calling RequestsApi#adminRequestsResetPost");
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

<a name="adminRequestsUnmatchedGet"></a>
# **adminRequestsUnmatchedGet**
> adminRequestsUnmatchedGet()

Find unmatched requests

Get details of logged requests that weren&#x27;t matched by any stub mapping

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestsApi;


RequestsApi apiInstance = new RequestsApi();
try {
    apiInstance.adminRequestsUnmatchedGet();
} catch (ApiException e) {
    System.err.println("Exception when calling RequestsApi#adminRequestsUnmatchedGet");
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
 - **Accept**: application/json


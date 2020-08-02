# StubMappingsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminMappingsDelete**](StubMappingsApi.md#adminMappingsDelete) | **DELETE** /__admin/mappings | Delete all stub mappings
[**adminMappingsFindByMetadataPost**](StubMappingsApi.md#adminMappingsFindByMetadataPost) | **POST** /__admin/mappings/find-by-metadata | 
[**adminMappingsGet**](StubMappingsApi.md#adminMappingsGet) | **GET** /__admin/mappings | Get all stub mappings
[**adminMappingsPost**](StubMappingsApi.md#adminMappingsPost) | **POST** /__admin/mappings | Create a new stub mapping
[**adminMappingsRemoveByMetadataPost**](StubMappingsApi.md#adminMappingsRemoveByMetadataPost) | **POST** /__admin/mappings/remove-by-metadata | Delete stub mappings matching metadata
[**adminMappingsResetPost**](StubMappingsApi.md#adminMappingsResetPost) | **POST** /__admin/mappings/reset | Reset stub mappings
[**adminMappingsSavePost**](StubMappingsApi.md#adminMappingsSavePost) | **POST** /__admin/mappings/save | Persist stub mappings
[**adminMappingsStubMappingIdDelete**](StubMappingsApi.md#adminMappingsStubMappingIdDelete) | **DELETE** /__admin/mappings/{stubMappingId} | Delete a stub mapping
[**adminMappingsStubMappingIdGet**](StubMappingsApi.md#adminMappingsStubMappingIdGet) | **GET** /__admin/mappings/{stubMappingId} | Get stub mapping by ID
[**adminMappingsStubMappingIdPut**](StubMappingsApi.md#adminMappingsStubMappingIdPut) | **PUT** /__admin/mappings/{stubMappingId} | Update a stub mapping

<a name="adminMappingsDelete"></a>
# **adminMappingsDelete**
> adminMappingsDelete()

Delete all stub mappings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StubMappingsApi;


StubMappingsApi apiInstance = new StubMappingsApi();
try {
    apiInstance.adminMappingsDelete();
} catch (ApiException e) {
    System.err.println("Exception when calling StubMappingsApi#adminMappingsDelete");
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

<a name="adminMappingsFindByMetadataPost"></a>
# **adminMappingsFindByMetadataPost**
> InlineResponse200 adminMappingsFindByMetadataPost(body)



Find stubs by matching on their metadata

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StubMappingsApi;


StubMappingsApi apiInstance = new StubMappingsApi();
Body2 body = new Body2(); // Body2 | 
try {
    InlineResponse200 result = apiInstance.adminMappingsFindByMetadataPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StubMappingsApi#adminMappingsFindByMetadataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body2**](Body2.md)|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminMappingsGet"></a>
# **adminMappingsGet**
> InlineResponse200 adminMappingsGet(limit, offset)

Get all stub mappings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StubMappingsApi;


StubMappingsApi apiInstance = new StubMappingsApi();
Integer limit = 56; // Integer | The maximum number of results to return
Integer offset = 56; // Integer | The start index of the results to return
try {
    InlineResponse200 result = apiInstance.adminMappingsGet(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StubMappingsApi#adminMappingsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The maximum number of results to return | [optional]
 **offset** | **Integer**| The start index of the results to return | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminMappingsPost"></a>
# **adminMappingsPost**
> InlineResponse201 adminMappingsPost(body)

Create a new stub mapping

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StubMappingsApi;


StubMappingsApi apiInstance = new StubMappingsApi();
Body body = new Body(); // Body | 
try {
    InlineResponse201 result = apiInstance.adminMappingsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StubMappingsApi#adminMappingsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)|  | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminMappingsRemoveByMetadataPost"></a>
# **adminMappingsRemoveByMetadataPost**
> adminMappingsRemoveByMetadataPost(body)

Delete stub mappings matching metadata

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StubMappingsApi;


StubMappingsApi apiInstance = new StubMappingsApi();
Body3 body = new Body3(); // Body3 | 
try {
    apiInstance.adminMappingsRemoveByMetadataPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling StubMappingsApi#adminMappingsRemoveByMetadataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body3**](Body3.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="adminMappingsResetPost"></a>
# **adminMappingsResetPost**
> adminMappingsResetPost()

Reset stub mappings

Restores stub mappings to the defaults defined back in the backing store

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StubMappingsApi;


StubMappingsApi apiInstance = new StubMappingsApi();
try {
    apiInstance.adminMappingsResetPost();
} catch (ApiException e) {
    System.err.println("Exception when calling StubMappingsApi#adminMappingsResetPost");
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

<a name="adminMappingsSavePost"></a>
# **adminMappingsSavePost**
> adminMappingsSavePost()

Persist stub mappings

Save all persistent stub mappings to the backing store

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StubMappingsApi;


StubMappingsApi apiInstance = new StubMappingsApi();
try {
    apiInstance.adminMappingsSavePost();
} catch (ApiException e) {
    System.err.println("Exception when calling StubMappingsApi#adminMappingsSavePost");
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

<a name="adminMappingsStubMappingIdDelete"></a>
# **adminMappingsStubMappingIdDelete**
> adminMappingsStubMappingIdDelete(stubMappingId)

Delete a stub mapping

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StubMappingsApi;


StubMappingsApi apiInstance = new StubMappingsApi();
String stubMappingId = "stubMappingId_example"; // String | The UUID of stub mapping
try {
    apiInstance.adminMappingsStubMappingIdDelete(stubMappingId);
} catch (ApiException e) {
    System.err.println("Exception when calling StubMappingsApi#adminMappingsStubMappingIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stubMappingId** | **String**| The UUID of stub mapping |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="adminMappingsStubMappingIdGet"></a>
# **adminMappingsStubMappingIdGet**
> InlineResponse201 adminMappingsStubMappingIdGet(stubMappingId)

Get stub mapping by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StubMappingsApi;


StubMappingsApi apiInstance = new StubMappingsApi();
String stubMappingId = "stubMappingId_example"; // String | The UUID of stub mapping
try {
    InlineResponse201 result = apiInstance.adminMappingsStubMappingIdGet(stubMappingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StubMappingsApi#adminMappingsStubMappingIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stubMappingId** | **String**| The UUID of stub mapping |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminMappingsStubMappingIdPut"></a>
# **adminMappingsStubMappingIdPut**
> InlineResponse201 adminMappingsStubMappingIdPut(stubMappingId, body)

Update a stub mapping

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StubMappingsApi;


StubMappingsApi apiInstance = new StubMappingsApi();
String stubMappingId = "stubMappingId_example"; // String | The UUID of stub mapping
Body1 body = new Body1(); // Body1 | 
try {
    InlineResponse201 result = apiInstance.adminMappingsStubMappingIdPut(stubMappingId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StubMappingsApi#adminMappingsStubMappingIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stubMappingId** | **String**| The UUID of stub mapping |
 **body** | [**Body1**](Body1.md)|  | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


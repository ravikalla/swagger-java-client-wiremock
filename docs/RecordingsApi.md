# RecordingsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminRecordingsSnapshotPost**](RecordingsApi.md#adminRecordingsSnapshotPost) | **POST** /__admin/recordings/snapshot | Take a snapshot recording
[**adminRecordingsStartPost**](RecordingsApi.md#adminRecordingsStartPost) | **POST** /__admin/recordings/start | Start recording
[**adminRecordingsStatusGet**](RecordingsApi.md#adminRecordingsStatusGet) | **GET** /__admin/recordings/status | Get recording status
[**adminRecordingsStopPost**](RecordingsApi.md#adminRecordingsStopPost) | **POST** /__admin/recordings/stop | Stop recording

<a name="adminRecordingsSnapshotPost"></a>
# **adminRecordingsSnapshotPost**
> InlineResponse200 adminRecordingsSnapshotPost(body)

Take a snapshot recording

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RecordingsApi;


RecordingsApi apiInstance = new RecordingsApi();
Body11 body = new Body11(); // Body11 | 
try {
    InlineResponse200 result = apiInstance.adminRecordingsSnapshotPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingsApi#adminRecordingsSnapshotPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body11**](Body11.md)|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminRecordingsStartPost"></a>
# **adminRecordingsStartPost**
> adminRecordingsStartPost(body)

Start recording

Begin recording stub mappings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RecordingsApi;


RecordingsApi apiInstance = new RecordingsApi();
Body10 body = new Body10(); // Body10 | 
try {
    apiInstance.adminRecordingsStartPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingsApi#adminRecordingsStartPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body10**](Body10.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="adminRecordingsStatusGet"></a>
# **adminRecordingsStatusGet**
> InlineResponse2003 adminRecordingsStatusGet()

Get recording status

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RecordingsApi;


RecordingsApi apiInstance = new RecordingsApi();
try {
    InlineResponse2003 result = apiInstance.adminRecordingsStatusGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingsApi#adminRecordingsStatusGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminRecordingsStopPost"></a>
# **adminRecordingsStopPost**
> InlineResponse200 adminRecordingsStopPost()

Stop recording

End recording of stub mappings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RecordingsApi;


RecordingsApi apiInstance = new RecordingsApi();
try {
    InlineResponse200 result = apiInstance.adminRecordingsStopPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingsApi#adminRecordingsStopPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


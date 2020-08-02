# AdminmappingsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**method** | **String** | The HTTP request method e.g. GET |  [optional]
**url** | **String** | The path and query to match exactly against. Only one of url, urlPattern, urlPath or urlPathPattern may be specified. |  [optional]
**urlPath** | **String** | The path to match exactly against. Only one of url, urlPattern, urlPath or urlPathPattern may be specified. |  [optional]
**urlPathPattern** | **String** | The path regex to match against. Only one of url, urlPattern, urlPath or urlPathPattern may be specified. |  [optional]
**urlPattern** | **String** | The path and query regex to match against. Only one of url, urlPattern, urlPath or urlPathPattern may be specified. |  [optional]
**queryParameters** | **Object** | Query parameter patterns to match against in the &lt;key&gt;: { \&quot;&lt;predicate&gt;\&quot;: \&quot;&lt;value&gt;\&quot; } form |  [optional]
**headers** | **Object** | Header patterns to match against in the &lt;key&gt;: { \&quot;&lt;predicate&gt;\&quot;: \&quot;&lt;value&gt;\&quot; } form |  [optional]
**basicAuthCredentials** | [**AdminmappingsRequestBasicAuthCredentials**](AdminmappingsRequestBasicAuthCredentials.md) |  |  [optional]
**cookies** | **Object** | Cookie patterns to match against in the &lt;key&gt;: { \&quot;&lt;predicate&gt;\&quot;: \&quot;&lt;value&gt;\&quot; } form |  [optional]
**bodyPatterns** | **List&lt;Object&gt;** | Request body patterns to match against in the &lt;key&gt;: { \&quot;&lt;predicate&gt;\&quot;: \&quot;&lt;value&gt;\&quot; } form |  [optional]

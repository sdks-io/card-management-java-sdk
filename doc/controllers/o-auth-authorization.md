# O Auth Authorization

```java
OAuthAuthorizationController oAuthAuthorizationController = client.getOAuthAuthorizationController();
```

## Class Name

`OAuthAuthorizationController`


# Request Token Bearer Token

Create a new OAuth 2 token.

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<OAuthToken> requestTokenBearerTokenAsync(
    final String authorization,
    final String scope,
    final Map<String, Object> fieldParameters)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `authorization` | `String` | Header, Required | Authorization header in Basic auth format |
| `scope` | `String` | Form, Optional | Requested scopes as a space-delimited list. |
| `fieldParameters` | `Map<String, Object>` | Optional | Pass additional field parameters. |

## Server

`Server.OAUTH_SERVER`

## Response Type

[`OAuthToken`](../../doc/models/o-auth-token.md)

## Example Usage

```java
String authorization = "Authorization8";

Map<String, Object> fieldParameters = new LinkedHashMap<String, Object>() {{
    put("key0", ApiHelper.deserialize("\"additionalFieldParams9\""));
}};

oAuthAuthorizationController.requestTokenBearerTokenAsync(authorization, null, fieldParameters).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | OAuth 2 provider returned an error. | [`OAuthProviderException`](../../doc/models/o-auth-provider-exception.md) |
| 401 | OAuth 2 provider says client authentication failed. | [`OAuthProviderException`](../../doc/models/o-auth-provider-exception.md) |


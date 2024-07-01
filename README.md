
# Getting Started with Shell Card Management APIs

## Introduction

The Shell Card Management API is REST-based and employs OAUTH 2.0,Basic and ApiKey authentication.
The API endpoints accept JSON-encoded request bodies, return JSON-encoded responses and use standard HTTP response codes.  
All resources are located in the Shell Card Platform.  The Shell Card Platform is the overall platform that encompasses all the internal Shell systems used to manage resources.
The internal workings of the platform are not important when interacting with the API. However, it is worth noting that the platform uses a microservice architecture to communicate with various backend systems and some API calls are processed asynchronously.
All endpoints use the `POST` verb for retrieving, updating, creating and deleting resources in the Shell Card Platform. The endpoints that retrieve resources from the Shell Card Platform allow flexible search parameters in the API request body.

Go to the Shell Developer Portal: [https://developer.shell.com](https://developer.shell.com)

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.sdks</groupId>
  <artifactId>cards-management-sdk</artifactId>
  <version>1.1.0</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/io.sdks/cards-management-sdk/1.1.0

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.SIT`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `basicAuthCredentials` | [`BasicAuthCredentials`](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/$a/https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/basic-authentication.md) | The Credentials Setter for Basic Authentication |
| `bearerTokenCredentials` | [`BearerTokenCredentials`](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/$a/https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
ShellCardManagementAPIsClient client = new ShellCardManagementAPIsClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .basicAuthCredentials(new BasicAuthModel.Builder(
            "Username",
            "Password"
        )
        .build())
    .bearerTokenCredentials(new BearerTokenModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .build())
    .environment(Environment.SIT)
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| SIT | **Default** |
| Production | - |

## Authorization

This API uses the following authentication schemes.

* [`BasicAuth (Basic Authentication)`](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/$a/https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/basic-authentication.md)
* [`BearerToken (OAuth 2 Client Credentials Grant)`](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/$a/https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/oauth-2-client-credentials-grant.md)

## List of APIs

* [O Auth Authorization](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/controllers/o-auth-authorization.md)
* [Customer](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/controllers/customer.md)
* [Restriction](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/controllers/restriction.md)
* [Card](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/controllers/card.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/http-request.md)
* [HttpResponse](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/http-string-response.md)
* [HttpContext](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/http-body-request.md)
* [Headers](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/headers.md)
* [ApiException](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sdks-io/card-management-java-sdk/tree/1.1.0/doc/http-client-configuration-builder.md)


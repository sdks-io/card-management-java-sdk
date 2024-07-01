/*
 * ShellCardManagementAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest;

import com.shell.apitest.authentication.BasicAuthCredentials;
import com.shell.apitest.authentication.BasicAuthModel;
import com.shell.apitest.authentication.BearerTokenCredentials;
import com.shell.apitest.authentication.BearerTokenModel;
import com.shell.apitest.http.client.ReadonlyHttpClientConfiguration;

/**
 * Configuration Interface for the library.
 */
public interface Configuration {

    /**
     * Current API environment.
     * @return a copy of environment
     */
    Environment getEnvironment();

    /**
     * Http Client Configuration instance.
     * @return a copy of httpClientConfig
     */
    ReadonlyHttpClientConfiguration getHttpClientConfig();

    /**
     * The timeout to use for making HTTP requests. The timeout to use for making HTTP requests.
     * @return a copy of timeout
     */
    long timeout();

    /**
     * The credentials to use with BasicAuth.
     * @return basicAuthCredentials
     */
    BasicAuthCredentials getBasicAuthCredentials();

    /**
     * The auth credential model for BasicAuth.
     * @return the instance of BasicAuthModel
     */
    BasicAuthModel getBasicAuthModel();

    /**
     * The credentials to use with BearerToken.
     * @return bearerTokenCredentials
     */
    BearerTokenCredentials getBearerTokenCredentials();

    /**
     * The auth credential model for BearerToken.
     * @return the instance of BearerTokenModel
     */
    BearerTokenModel getBearerTokenModel();

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    String getBaseUri(Server server);

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    String getBaseUri();
}

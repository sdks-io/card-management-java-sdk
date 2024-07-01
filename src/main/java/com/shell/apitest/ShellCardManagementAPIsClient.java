/*
 * ShellCardManagementAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest;

import com.shell.apitest.authentication.BasicAuthCredentials;
import com.shell.apitest.authentication.BasicAuthManager;
import com.shell.apitest.authentication.BasicAuthModel;
import com.shell.apitest.authentication.BearerTokenCredentials;
import com.shell.apitest.authentication.BearerTokenManager;
import com.shell.apitest.authentication.BearerTokenModel;
import com.shell.apitest.controllers.CardController;
import com.shell.apitest.controllers.CustomerController;
import com.shell.apitest.controllers.OAuthAuthorizationController;
import com.shell.apitest.controllers.RestrictionController;
import com.shell.apitest.http.client.HttpClientConfiguration;
import com.shell.apitest.http.client.ReadonlyHttpClientConfiguration;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class ShellCardManagementAPIsClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private CustomerController customer;
    private RestrictionController restriction;
    private CardController card;
    private OAuthAuthorizationController oAuthAuthorization;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "APIMATIC 3.0";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * BasicAuthManager.
     */
    private BasicAuthManager basicAuthManager;

    /**
     * The instance of BasicAuthModel.
     */
    private BasicAuthModel basicAuthModel;

    /**
     * BearerTokenManager.
     */
    private BearerTokenManager bearerTokenManager;

    /**
     * The instance of BearerTokenModel.
     */
    private BearerTokenModel bearerTokenModel;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications = new HashMap<String, Authentication>();

    private ShellCardManagementAPIsClient(Environment environment, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig, BasicAuthModel basicAuthModel,
            BearerTokenModel bearerTokenModel) {
        this.environment = environment;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;

        this.basicAuthModel = basicAuthModel;
        this.bearerTokenModel = bearerTokenModel;

        this.basicAuthManager = new BasicAuthManager(basicAuthModel);
        this.authentications.put("BasicAuth", basicAuthManager);

        this.bearerTokenManager = new BearerTokenManager(bearerTokenModel);
        this.authentications.put("BearerToken", bearerTokenManager);

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .compatibilityFactory(compatibilityFactory)
                .authentication(this.authentications)
                .userAgent(userAgent)
                .build();
        this.bearerTokenManager.applyGlobalConfiguration(globalConfig);

        customer = new CustomerController(globalConfig);
        restriction = new RestrictionController(globalConfig);
        card = new CardController(globalConfig);
        oAuthAuthorization = new OAuthAuthorizationController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of CustomerController.
     * @return customer
     */
    public CustomerController getCustomerController() {
        return customer;
    }

    /**
     * Get the instance of RestrictionController.
     * @return restriction
     */
    public RestrictionController getRestrictionController() {
        return restriction;
    }

    /**
     * Get the instance of CardController.
     * @return card
     */
    public CardController getCardController() {
        return card;
    }

    /**
     * Get the instance of OAuthAuthorizationController.
     * @return oAuthAuthorization
     */
    public OAuthAuthorizationController getOAuthAuthorizationController() {
        return oAuthAuthorization;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with BasicAuth.
     * @return basicAuthCredentials
     */
    public BasicAuthCredentials getBasicAuthCredentials() {
        return basicAuthManager;
    }

    /**
     * The auth credential model for BasicAuth.
     * @return the instance of BasicAuthModel
     */
    public BasicAuthModel getBasicAuthModel() {
        return basicAuthModel;
    }
    /**
     * The credentials to use with BearerToken.
     * @return bearerTokenCredentials
     */
    public BearerTokenCredentials getBearerTokenCredentials() {
        return bearerTokenManager;
    }

    /**
     * The auth credential model for BearerToken.
     * @return the instance of BearerTokenModel
     */
    public BearerTokenModel getBearerTokenModel() {
        return bearerTokenModel;
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.SHELL);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.SIT)) {
            if (server.equals(Server.OAUTH_SERVER)) {
                return "https://api-test.shell.com";
            }
            if (server.equals(Server.SHELL)) {
                return "https://api-test.shell.com/test";
            }
        }
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.OAUTH_SERVER)) {
                return "https://api.shell.com";
            }
            if (server.equals(Server.SHELL)) {
                return "https://api.shell.com";
            }
        }
        return "https://api-test.shell.com/test";
    }

    /**
     * Converts this ShellCardManagementAPIsClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ShellCardManagementAPIsClient [" + "environment=" + environment
                + ", httpClientConfig=" + httpClientConfig + ", authentications=" + authentications
                + "]";
    }

    /**
     * Builds a new {@link ShellCardManagementAPIsClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link ShellCardManagementAPIsClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.httpClient = getHttpClient();
        builder.basicAuthCredentials(getBasicAuthModel()
                .toBuilder().build());
        builder.bearerTokenCredentials(getBearerTokenModel()
                .toBuilder().build());
        builder.httpClientConfig(() -> ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link ShellCardManagementAPIsClient}.
     */
    public static class Builder {

        private Environment environment = Environment.SIT;
        private HttpClient httpClient;
        private BasicAuthModel basicAuthModel = new BasicAuthModel.Builder("", "").build();
        private BearerTokenModel bearerTokenModel = new BearerTokenModel.Builder("", "").build();
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Credentials setter for BasicAuthCredentials.
         * @param basicAuthModel The instance of BasicAuthModel.
         * @return The current instance of builder.
         */
        public Builder basicAuthCredentials(BasicAuthModel basicAuthModel) {
            this.basicAuthModel = basicAuthModel;
            return this;
        }

        /**
         * Credentials setter for BearerTokenCredentials.
         * @param bearerTokenModel The instance of BearerTokenModel.
         * @return The current instance of builder.
         */
        public Builder bearerTokenCredentials(BearerTokenModel bearerTokenModel) {
            this.bearerTokenModel = bearerTokenModel;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Private Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param supplier Supplier for the builder of httpClientConfiguration.
         * @return Builder
         */
        private Builder httpClientConfig(Supplier<HttpClientConfiguration.Builder> supplier) {
            httpClientConfigBuilder = supplier.get();
            return this;
        }

        /**
         * Builds a new ShellCardManagementAPIsClient object using the set fields.
         * @return ShellCardManagementAPIsClient
         */
        public ShellCardManagementAPIsClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new ShellCardManagementAPIsClient(environment, httpClient, httpClientConfig,
                    basicAuthModel, bearerTokenModel);
        }
    }
}
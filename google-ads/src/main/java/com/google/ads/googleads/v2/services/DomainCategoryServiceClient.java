/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v2.services;

import com.google.ads.googleads.v2.resources.DomainCategory;
import com.google.ads.googleads.v2.services.stub.DomainCategoryServiceStub;
import com.google.ads.googleads.v2.services.stub.DomainCategoryServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch domain categories.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (DomainCategoryServiceClient domainCategoryServiceClient = DomainCategoryServiceClient.create()) {
 *   String formattedResourceName = DomainCategoryServiceClient.formatDomainCategoryName("[CUSTOMER]", "[DOMAIN_CATEGORY]");
 *   DomainCategory response = domainCategoryServiceClient.getDomainCategory(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the domainCategoryServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of DomainCategoryServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * DomainCategoryServiceSettings domainCategoryServiceSettings =
 *     DomainCategoryServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DomainCategoryServiceClient domainCategoryServiceClient =
 *     DomainCategoryServiceClient.create(domainCategoryServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * DomainCategoryServiceSettings domainCategoryServiceSettings =
 *     DomainCategoryServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * DomainCategoryServiceClient domainCategoryServiceClient =
 *     DomainCategoryServiceClient.create(domainCategoryServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class DomainCategoryServiceClient implements BackgroundResource {
  private final DomainCategoryServiceSettings settings;
  private final DomainCategoryServiceStub stub;

  private static final PathTemplate DOMAIN_CATEGORY_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/domainCategories/{domain_category}");

  /**
   * Formats a string containing the fully-qualified path to represent a domain_category resource.
   *
   * @deprecated Use the {@link DomainCategoryName} class instead.
   */
  @Deprecated
  public static final String formatDomainCategoryName(String customer, String domainCategory) {
    return DOMAIN_CATEGORY_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "domain_category", domainCategory);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a domain_category
   * resource.
   *
   * @deprecated Use the {@link DomainCategoryName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromDomainCategoryName(String domainCategoryName) {
    return DOMAIN_CATEGORY_PATH_TEMPLATE.parse(domainCategoryName).get("customer");
  }

  /**
   * Parses the domain_category from the given fully-qualified path which represents a
   * domain_category resource.
   *
   * @deprecated Use the {@link DomainCategoryName} class instead.
   */
  @Deprecated
  public static final String parseDomainCategoryFromDomainCategoryName(String domainCategoryName) {
    return DOMAIN_CATEGORY_PATH_TEMPLATE.parse(domainCategoryName).get("domain_category");
  }

  /** Constructs an instance of DomainCategoryServiceClient with default settings. */
  public static final DomainCategoryServiceClient create() throws IOException {
    return create(DomainCategoryServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of DomainCategoryServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final DomainCategoryServiceClient create(DomainCategoryServiceSettings settings)
      throws IOException {
    return new DomainCategoryServiceClient(settings);
  }

  /**
   * Constructs an instance of DomainCategoryServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use DomainCategoryServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final DomainCategoryServiceClient create(DomainCategoryServiceStub stub) {
    return new DomainCategoryServiceClient(stub);
  }

  /**
   * Constructs an instance of DomainCategoryServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected DomainCategoryServiceClient(DomainCategoryServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((DomainCategoryServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected DomainCategoryServiceClient(DomainCategoryServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final DomainCategoryServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public DomainCategoryServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested domain category.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DomainCategoryServiceClient domainCategoryServiceClient = DomainCategoryServiceClient.create()) {
   *   String formattedResourceName = DomainCategoryServiceClient.formatDomainCategoryName("[CUSTOMER]", "[DOMAIN_CATEGORY]");
   *   DomainCategory response = domainCategoryServiceClient.getDomainCategory(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Resource name of the domain category to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DomainCategory getDomainCategory(String resourceName) {
    DOMAIN_CATEGORY_PATH_TEMPLATE.validate(resourceName, "getDomainCategory");
    GetDomainCategoryRequest request =
        GetDomainCategoryRequest.newBuilder().setResourceName(resourceName).build();
    return getDomainCategory(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested domain category.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DomainCategoryServiceClient domainCategoryServiceClient = DomainCategoryServiceClient.create()) {
   *   String formattedResourceName = DomainCategoryServiceClient.formatDomainCategoryName("[CUSTOMER]", "[DOMAIN_CATEGORY]");
   *   GetDomainCategoryRequest request = GetDomainCategoryRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   DomainCategory response = domainCategoryServiceClient.getDomainCategory(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DomainCategory getDomainCategory(GetDomainCategoryRequest request) {
    return getDomainCategoryCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested domain category.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DomainCategoryServiceClient domainCategoryServiceClient = DomainCategoryServiceClient.create()) {
   *   String formattedResourceName = DomainCategoryServiceClient.formatDomainCategoryName("[CUSTOMER]", "[DOMAIN_CATEGORY]");
   *   GetDomainCategoryRequest request = GetDomainCategoryRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;DomainCategory&gt; future = domainCategoryServiceClient.getDomainCategoryCallable().futureCall(request);
   *   // Do something
   *   DomainCategory response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetDomainCategoryRequest, DomainCategory> getDomainCategoryCallable() {
    return stub.getDomainCategoryCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}

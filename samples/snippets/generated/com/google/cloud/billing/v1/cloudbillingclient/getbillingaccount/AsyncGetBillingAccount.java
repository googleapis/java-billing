/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.billing.v1.samples;

// [START billing_v1_generated_cloudbillingclient_getbillingaccount_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.billing.v1.BillingAccount;
import com.google.cloud.billing.v1.BillingAccountName;
import com.google.cloud.billing.v1.CloudBillingClient;
import com.google.cloud.billing.v1.GetBillingAccountRequest;

public class AsyncGetBillingAccount {

  public static void main(String[] args) throws Exception {
    asyncGetBillingAccount();
  }

  public static void asyncGetBillingAccount() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudBillingClient cloudBillingClient = CloudBillingClient.create()) {
      GetBillingAccountRequest request =
          GetBillingAccountRequest.newBuilder()
              .setName(BillingAccountName.of("[BILLING_ACCOUNT]").toString())
              .build();
      ApiFuture<BillingAccount> future =
          cloudBillingClient.getBillingAccountCallable().futureCall(request);
      // Do something.
      BillingAccount response = future.get();
    }
  }
}
// [END billing_v1_generated_cloudbillingclient_getbillingaccount_async]

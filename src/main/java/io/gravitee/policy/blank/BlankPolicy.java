/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.policy.blank;

import io.gravitee.gateway.api.ExecutionContext;
import io.gravitee.gateway.api.Request;
import io.gravitee.gateway.api.Response;
import io.gravitee.gateway.api.stream.ReadWriteStream;
import io.gravitee.policy.api.PolicyChain;
import io.gravitee.policy.api.annotations.OnRequest;
import io.gravitee.policy.api.annotations.OnRequestContent;
import io.gravitee.policy.api.annotations.OnResponse;
import io.gravitee.policy.api.annotations.OnResponseContent;
import io.gravitee.policy.blank.configuration.BlankPolicyConfiguration;

/**
 * @author Azize ELAMRANI (azize.elamrani at graviteesource.com)
 * @author GraviteeSource Team
 */
public class BlankPolicy {

    private final BlankPolicyConfiguration blankPolicyConfiguration;

    public BlankPolicy(final BlankPolicyConfiguration blankPolicyConfiguration) {
        this.blankPolicyConfiguration = blankPolicyConfiguration;
    }

    @OnRequest
    public void onRequest(final Request request, final Response response, final PolicyChain policyChain) {
        policyChain.doNext(request, response);
    }

    @OnResponse
    public void onResponse(final Request request, final Response response, final PolicyChain policyChain) {
        policyChain.doNext(request, response);
    }

    @OnResponseContent
    public ReadWriteStream onResponseContent(final Response response, final ExecutionContext executionContext) {
        return null;
    }

    @OnRequestContent
    public ReadWriteStream onRequestContent(final Request request, final ExecutionContext executionContext) {
        return null;
    }
}

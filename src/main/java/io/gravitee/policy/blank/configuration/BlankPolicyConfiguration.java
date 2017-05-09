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
package io.gravitee.policy.blank.configuration;

import io.gravitee.policy.api.PolicyConfiguration;

import java.util.List;

/**
 * @author Azize ELAMRANI (azize.elamrani at graviteesource.com)
 * @author GraviteeSource Team
 */
public class BlankPolicyConfiguration implements PolicyConfiguration {

    private String blankText;

    private List<String> blankArray;

    private BlankEnum blankEnum;

    public String getBlankText() {
        return blankText;
    }

    public void setBlankText(String blankText) {
        this.blankText = blankText;
    }

    public List<String> getBlankArray() {
        return blankArray;
    }

    public void setBlankArray(List<String> blankArray) {
        this.blankArray = blankArray;
    }

    public BlankEnum getBlankEnum() {
        return blankEnum;
    }

    public void setBlankEnum(BlankEnum blankEnum) {
        this.blankEnum = blankEnum;
    }
}

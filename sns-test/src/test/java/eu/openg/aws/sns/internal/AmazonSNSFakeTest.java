/*
 * Copyright 2015 OpenG (Atvira Karta, LLC)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.openg.aws.sns.internal;

import com.amazonaws.services.sns.AmazonSNS;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AmazonSNSFakeTest extends AbstractSNSFakeTest {

    @Test
    public void fakeHasAllAmazonSNSMethods() {
        assertThat(new AmazonSNSFake("12345")).isInstanceOf(AmazonSNS.class);
    }
}

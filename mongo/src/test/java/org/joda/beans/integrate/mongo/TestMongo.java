/*
 *  Copyright 2001-present Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.integrate.mongo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test Mongo integration.
 */
public class TestMongo {

    @Test
    public void test_bean() {
        Company company = new Company("Joda");
        BeanMongoDBObject wrapper = new BeanMongoDBObject(company);
        assertFalse(wrapper.containsField("name"));
        assertTrue(wrapper.containsField("companyName"));
        assertEquals("Joda", wrapper.get("companyName"));
    }

}

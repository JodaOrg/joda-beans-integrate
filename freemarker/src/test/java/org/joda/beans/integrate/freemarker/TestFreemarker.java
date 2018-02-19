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
package org.joda.beans.integrate.freemarker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import freemarker.template.SimpleScalar;
import freemarker.template.TemplateModelException;

/**
 * Test Freemarker integration.
 */
public class TestFreemarker {

    @Test
    public void test_bean() throws TemplateModelException {
        Company company = new Company("Joda");
        FreemarkerObjectWrapper wrapper = new FreemarkerObjectWrapper();
        assertEquals(FreemarkerTemplateModel.class, wrapper.wrap(company).getClass());
    }

    @Test
    public void test_nonBean() throws TemplateModelException {
        String str = "Hello";
        FreemarkerObjectWrapper wrapper = new FreemarkerObjectWrapper();
        assertEquals(SimpleScalar.class, wrapper.wrap(str).getClass());
    }

}

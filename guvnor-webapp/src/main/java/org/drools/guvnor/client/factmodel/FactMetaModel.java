/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.guvnor.client.factmodel;

import java.util.ArrayList;
import java.util.List;

import org.drools.ide.common.client.modeldriven.brl.PortableObject;

/**
 * Represents the GUI data for a fact model definition.
 */
public class FactMetaModel
    implements
    PortableObject {

    private static final long   serialVersionUID = 510L;

    public String               name;

    public List<FieldMetaModel> fields           = new ArrayList<FieldMetaModel>();
    public List<AnnotationMetaModel> annotations = new ArrayList<AnnotationMetaModel>();

    public FactMetaModel() {
    }

    public FactMetaModel(String name) {
        this.name = name;
    }

    public FactMetaModel(String name,
                         List<FieldMetaModel> fields) {
        this.name = name;
        this.fields = fields;
    }

}

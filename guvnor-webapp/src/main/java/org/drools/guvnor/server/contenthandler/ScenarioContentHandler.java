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

package org.drools.guvnor.server.contenthandler;

import org.drools.guvnor.client.rpc.RuleAsset;
import org.drools.ide.common.client.modeldriven.testing.Scenario;
import org.drools.ide.common.server.util.ScenarioXMLPersistence;
import org.drools.repository.AssetItem;
import org.drools.repository.PackageItem;

import com.google.gwt.user.client.rpc.SerializationException;


public class ScenarioContentHandler extends PlainTextContentHandler {

    @Override
    public void retrieveAssetContent(RuleAsset asset, PackageItem pkg,
            AssetItem item) throws SerializationException {
        Scenario sc = ScenarioXMLPersistence.getInstance().unmarshal(item.getContent());
        asset.content = sc;

    }

    @Override
    public void storeAssetContent(RuleAsset asset, AssetItem repoAsset)
            throws SerializationException {
        Scenario sc = (Scenario) asset.content;
        repoAsset.updateContent(ScenarioXMLPersistence.getInstance().marshal(sc));
    }

}

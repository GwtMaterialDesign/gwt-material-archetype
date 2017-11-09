/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
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
 * #L%
 */
package ${package}.client.application;

import javax.inject.Inject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.pwa.PwaManager;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
    interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @Inject
    ApplicationView(
            Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        #if( ${pwa-enabled} == "y" || ${pwa-enabled} == "Y")

        PwaManager.getInstance()
                .setServiceWorker("service-worker.js")
                .setWebManifest("manifest.json")
                .setThemeColor("#2196f3").load();

        #end

    }

    #if( ${pwa-enabled} == "y" || ${pwa-enabled} == "Y")

    @Override
    protected void onAttach() {
        super.onAttach();

        Document.get().getElementById("splashscreen").removeFromParent();
    }

    #end

}

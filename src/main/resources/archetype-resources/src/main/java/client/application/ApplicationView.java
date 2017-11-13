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

import ${package}.client.pwa.AppServiceWorkerManager;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.pwa.PwaManager;
import gwt.material.design.client.ui.*;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
    interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @UiField
    MaterialContainer container;

    @UiField
    MaterialButton btnAdd;

     #if( ${pwa-enabled} == "y" || ${pwa-enabled} == "Y")

    @UiField
    MaterialCard offlineCard;

    #end

    @UiField
    MaterialPanel onlinePanel;

    @UiField
    MaterialNavBar navBar;

    @Inject
    ApplicationView(
            Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

         #if( ${pwa-enabled} == "y" || ${pwa-enabled} == "Y")

        AppServiceWorkerManager serviceWorkerManager = new AppServiceWorkerManager("service-worker.js");
        serviceWorkerManager.addConnectionStatusUpdateHandler(event -> {
            btnAdd.setEnabled(event.isOnline());
            onlinePanel.setVisible(event.isOnline());
            offlineCard.setVisible(!event.isOnline());

            if (event.isOnline()) {
                navBar.setBackgroundColor(Color.INDIGO);
            } else {
                navBar.setBackgroundColor(Color.GREY);
            }
        });

        PwaManager.getInstance()
                .setServiceWorker(serviceWorkerManager)
                .setWebManifest("manifest.json")
                .setThemeColor("#2196f3")
                .load();

         #end
    }


    @Override
    protected void onAttach() {
        super.onAttach();

        Document.get().getElementById("splashscreen").removeFromParent();
    }

    @UiHandler("btnAdd")
    void onAdd(ClickEvent e) {
        MaterialToast.fireToast("I love GaMD");
    }
}

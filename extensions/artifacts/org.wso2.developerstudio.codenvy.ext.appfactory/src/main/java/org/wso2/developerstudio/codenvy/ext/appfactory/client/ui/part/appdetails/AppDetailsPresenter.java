/*
* Copyright (c) 2014-2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.wso2.developerstudio.codenvy.ext.appfactory.client.ui.part.appdetails;

import org.eclipse.che.ide.api.parts.base.BasePresenter;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

public class AppDetailsPresenter extends BasePresenter implements AppDetailsView.ActionDelegate {

    private AppDetailsView appDetailsView;
    private String title;

    @Inject
    public AppDetailsPresenter(AppDetailsView appDetailsView, @Assisted String title) {
        this.appDetailsView = appDetailsView;
        this.appDetailsView.setDelegate(this);
        this.appDetailsView.setTitle(title);
        this.title = title;
    }

    @Override
    public void onButtonClicked() {
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public ImageResource getTitleImage() {
        return null;
    }

    @Override
    public String getTitleToolTip() {
        return "Tooltip";
    }

    @Override
    public void go(AcceptsOneWidget container) {
        container.setWidget(appDetailsView);
    }

}

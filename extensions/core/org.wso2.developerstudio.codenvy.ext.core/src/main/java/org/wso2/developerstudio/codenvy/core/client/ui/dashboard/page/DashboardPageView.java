/*
* Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.developerstudio.codenvy.core.client.ui.dashboard.page;


import com.google.inject.ImplementedBy;
import org.eclipse.che.ide.api.mvp.View;
import org.wso2.developerstudio.codenvy.core.client.ui.dashboard.DashboardItem;

import java.util.List;
import java.util.Map;

@ImplementedBy(DashboardPageViewImpl.class)
public interface DashboardPageView extends View<DashboardPageView.ActionDelegate> {

    interface ActionDelegate{}

    void generateDashboard( Map<String, List<DashboardItem>> itemList);
}
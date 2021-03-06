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
package org.wso2.developerstudio.codenvy.ext.appfactory.client.factory;

import org.wso2.developerstudio.codenvy.ext.appfactory.client.ui.part.appdetails.AppDetailsPresenter;
import org.wso2.developerstudio.codenvy.ext.appfactory.client.ui.part.applist.AppListPresenter;
import org.wso2.developerstudio.codenvy.ext.appfactory.client.ui.part.console.ConsolePresenter;

import javax.validation.constraints.NotNull;

/**
 * A factory class that is used to create App Factory perspective related
 * UI views using GinFactoryModuleBuilder GWT class
 */
public interface AppFactoryPartsFactory {

    /**
     * Factory method for creating Application List View
     *
     * @param title Part Title
     * @return App List View
     */
    AppListPresenter createAppListPart(@NotNull String title);

    /**
     * Factory method for creating Application Details View
     *
     * @param title Part Title
     * @return App Details View
     */
    AppDetailsPresenter createAppDetailsPart(@NotNull String title);

    /**
     * Factory method for creating Console View
     *
     * @param title Console Title
     * @return Console View
     */
    ConsolePresenter createConsolePart(@NotNull String title);

}

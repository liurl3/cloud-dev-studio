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
package org.wso2.developerstudio.codenvy.launcher.java;

import org.embedded.browser.SampleWindow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChromiumLauncher implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(ChromiumLauncher.class);

    private final String url;

    public ChromiumLauncher(String url) {
        this.url = url;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(25000);
        } catch (InterruptedException e) {
            logger.error("Chromium launcher error", e);
        }
        SampleWindow.single_browser(url);

    }
}

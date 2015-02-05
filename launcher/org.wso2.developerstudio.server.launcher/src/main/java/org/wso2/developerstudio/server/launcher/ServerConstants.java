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
package org.wso2.developerstudio.server.launcher;

import static java.io.File.separator;

public interface ServerConstants {

	String RELATIVE_WEB_ROOT = separator + "webapps";
	String STUDIO_ROOT_ENV_VAR_NAME = "WSO2_DEVELOPER_STUDIO_PATH";
	String WEB_APPS_DIR = "webapps";
	String WEB_XML_FILE = "web.xml";
	String PID_SYS_PROPERTY = "app.pid";
	String IDE_CONTEXT_PATH = "/ws";
	String LOCAL_HOST = "http://localhost:";
	String SERVER_PORT_SYS_PROPERTY = "server.port";
	String BIN_FOLDER = "bin";
	String PID_FILE = "pid";
	String PORT_FILE = "PORT";

	String PORT_FILE_REL_URL = separator + BIN_FOLDER + separator + PORT_FILE;
	String PID_FILE_REL_PATH = separator + BIN_FOLDER + separator + PID_FILE;

	int DEFAULT_SLEEP_TIME = 500;
}
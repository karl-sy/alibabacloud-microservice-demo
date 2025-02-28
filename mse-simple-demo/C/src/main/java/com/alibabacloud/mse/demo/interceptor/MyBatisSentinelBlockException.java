/*
 * Copyright 1999-2019 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibabacloud.mse.demo.interceptor;

import org.apache.ibatis.exceptions.PersistenceException;

/**
 * @author Eric Zhao
 */
public class MyBatisSentinelBlockException extends PersistenceException {

    public MyBatisSentinelBlockException() {
        super();
    }

    public MyBatisSentinelBlockException(String message) {
        super(message);
    }

    public MyBatisSentinelBlockException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyBatisSentinelBlockException(Throwable cause) {
        super(cause);
    }
}

/*
 * Copyright 2002-2016 the original author or authors.
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

package com.zuoxiaolong.niubi.job.example.spring.bean;

import com.zuoxiaolong.niubi.job.core.helper.LoggerHelper;
import org.springframework.stereotype.Service;

/**
 * @author Xiaolong Zuo
 * @since 16/1/18 22:33
 */
@Service
public class OneService {

    public void someServiceMethod1() {
        LoggerHelper.info("[job1] invoke [serviceMethod1] successfully......");
    }

    public void someServiceMethod2() {
        LoggerHelper.info("[job2] invoke [serviceMethod2] successfully......");
    }

}

/*
 *
 *
 * Copyright 2016 Symphony Communication Services, LLC
 *
 * Licensed to Symphony Communication Services, LLC under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package com.symphony.configurations.greenhouse;

/**
 * Created by ryan.dsouza on 7/19/16.
 *
 * Defines specifics needed to configure the Greenhouse Client
 */

public class GreenhouseConfigurationProvider implements IGreenhouseConfigurationProvider {

  @Override
  public String getApiToken() {
    return "fd93d82614a48fb7334c0abc9e866671:";
  }
}

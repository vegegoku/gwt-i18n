/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.i18n.rebind;

import org.gwtproject.i18n.rebind.AbstractResource.ResourceList;
import org.gwtproject.i18n.rebind.ResourceFactory.ClassLocale;

import java.util.HashMap;
import java.util.Map;

/**
 * Stores cached state for the LocalizableGenerator.
 */
public class ResourceFactoryContext {
  private final Map<ClassLocale, ResourceList> resourceListCache = new HashMap<ClassLocale, ResourceList>();
  
  public ResourceList getResourceList(ClassLocale key) {
    return resourceListCache.get(key);
  }

  public void putResourceList(ClassLocale key, ResourceList resources) {
   resourceListCache.put(key, resources);
  }
}
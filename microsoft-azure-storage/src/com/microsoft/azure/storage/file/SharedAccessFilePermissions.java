/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.azure.storage.file;

/**
 * Specifies the set of possible permissions for a shared access policy.
 */
public enum SharedAccessFilePermissions {
    /**
     * Specifies Read access granted.
     */
    READ,

    /**
     * Specifies Write access granted.
     */
    WRITE,

    /**
     * Specifies Delete access granted for files.
     */
    DELETE,

    /**
     * Specifies List access granted.
     */
    LIST;
}
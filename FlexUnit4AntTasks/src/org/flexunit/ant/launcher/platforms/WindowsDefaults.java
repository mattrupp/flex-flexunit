/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flexunit.ant.launcher.platforms;

import java.io.File;

public class WindowsDefaults implements PlatformDefaults
{

   public String getAdlCommand()
   {
      return "adl.exe";
   }

   public File getFlashPlayerGlobalTrustDirectory()
   {
      return new File(System.getenv("SYSTEMROOT") + "\\system32\\Macromed\\Flash\\FlashPlayerTrust\\");
   }

   public File getFlashPlayerUserTrustDirectory()
   {
      File file = null;
      
      String appData = System.getenv("APPDATA");
      if(appData != null && !appData.equals(""))
      {
         file = new File(appData + "\\Macromedia\\Flash Player\\#Security\\FlashPlayerTrust\\");
      }
      
      return file;
   }

   public String getOpenCommand()
   {
      return "rundll32";
   }

   public String[] getOpenSystemArguments()
   {
      return new String[]{"url.dll,FileProtocolHandler"};
   }

}

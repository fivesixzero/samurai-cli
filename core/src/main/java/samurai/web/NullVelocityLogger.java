/*
 * Copyright 2003-2012 Yusuke Yamamoto
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
package samurai.web;

import org.apache.velocity.runtime.RuntimeServices;
import org.apache.velocity.runtime.log.LogChute;

public class NullVelocityLogger implements LogChute {
    public NullVelocityLogger() {
    }

    public void init(RuntimeServices runtimeServices) throws Exception {
    }

    public void logVelocityMessage(int _int, String string) {
    System.out.println(string);
    }

	@Override
	public boolean isLevelEnabled(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void log(int arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(int arg0, String arg1, Throwable arg2) {
		// TODO Auto-generated method stub
		
	}

}

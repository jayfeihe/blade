/**
 * Copyright (c) 2015, biezhi 王爵 (biezhi.me@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package blade.kit.timw;

/**
 * 计数器
 * <p>
 * </p>
 *
 * @author	<a href="mailto:biezhi.me@gmail.com" target="_blank">biezhi</a>
 * @since	1.0
 */
class TimwCounter {

    private long time;

    public TimwCounter() {
        start();
    }

    /**
     * @return	开始计时并返回当前时间
     */
    public long start() {
    	time = System.currentTimeMillis();
        return time;
    }

    /**
     * @return	重新计时并返回当前时间
     */
    public long durationRestart() {
        long now = System.currentTimeMillis();
        long d = now - time;
        time = now;
        return d;
    }

    /**
     * @return	返回计时花费的时间
     */
    public long duration() {
        return System.currentTimeMillis() - time;
    }

}
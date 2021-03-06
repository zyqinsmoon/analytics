//========================================================================
//$Id: ThreadPool.java,v 1.1 2009/01/14 09:05:15 zhangyx Exp $
//Copyright 2004-2005 Mort Bay Consulting Pty. Ltd.
//------------------------------------------------------------------------
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at 
//http://www.apache.org/licenses/LICENSE-2.0
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
//========================================================================

package org.mortbay.thread;

import org.mortbay.component.LifeCycle;

/* ------------------------------------------------------------ */
/** ThreadPool.
 * @author gregw
 *
 */
public interface ThreadPool
{
    /* ------------------------------------------------------------ */
    public abstract boolean dispatch(Runnable job);

    /* ------------------------------------------------------------ */
    /**
     * Blocks until the thread pool is {@link LifeCycle#stop stopped}.
     */
    public void join() throws InterruptedException;

    /* ------------------------------------------------------------ */
    /**
     * @return The total number of threads currently in the pool
     */
    public int getThreads();

    /* ------------------------------------------------------------ */
    /**
     * @return The number of idle threads in the pool
     */
    public int getIdleThreads();
    
    /* ------------------------------------------------------------ */
    /**
     * @return True if the pool is low on threads
     */
    public boolean isLowOnThreads();
}

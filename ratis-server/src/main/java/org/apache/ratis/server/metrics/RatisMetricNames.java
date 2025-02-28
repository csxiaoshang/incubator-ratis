/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ratis.server.metrics;

public final class RatisMetricNames {

  private RatisMetricNames() {
  }

  public static final String LEADER_ELECTION_COUNT_METRIC = "leader_election_count";
  public static final String LEADER_ELECTION_TIMEOUT_COUNT_METRIC = "leader_election_timeout_count";
  public static final String LEADER_ELECTION_LATENCY = "leader_election_latency";
  public static final String LAST_LEADER_ELAPSED_TIME = "last_leader_elapsed_time";

  public static final String FOLLOWER_LAST_HEARTBEAT_ELAPSED_TIME_METRIC = "follower_%s_last_heartbeat_elapsed_time";

}

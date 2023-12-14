/*
 * Copyright 2022 Apollo Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.ctrip.framework.apollo.transport.grpc.v1.config;

import com.ctrip.framework.apollo.transport.api.v1.config.ApolloTransportEndpoint;
import io.grpc.ManagedChannel;
import java.util.Collection;

public interface ApolloGrpcChannelManager {

  /**
   * Evict inactive gRPC channels
   *
   * @param activeEndpoints active endpoints
   */
  void evict(Collection<ApolloTransportEndpoint> activeEndpoints);

  /**
   * Get a gRPC channel for the given endpoint
   *
   * @param endpoint the endpoint
   * @return a gRPC channel
   */
  ManagedChannel getChannel(ApolloTransportEndpoint endpoint);
}

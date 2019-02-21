/*
 * Copyright 2018 Dynatrace LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dynatrace.oneagent.sdk.impl.proxy;

import com.dynatrace.oneagent.sdk.api.OutgoingMessageTracer;

public class OutgoingMessageTracerProxy extends TraceableProxy implements OutgoingMessageTracer {

	OutgoingMessageTracerProxy(SDK2AgentInternalApiProxy apiProxy, Object outgoingMessageTracer) {
		super(apiProxy, outgoingMessageTracer);
	}

	@Override
	public String getDynatraceStringTag() {
		return apiProxy.outgoingTaggable_getDynatraceStringTag(agentsNodeObject);
	}

	@Override
	public byte[] getDynatraceByteTag() {
		return apiProxy.outgoingTaggable_getDynatraceByteTag(agentsNodeObject);
	}

	@Override
	public void setVendorMessageId(String vendorMessageId) {
		apiProxy.messageTracer_setVendorMessageId(agentsNodeObject, vendorMessageId);
	}

	@Override
	public void setCorrelationId(String correlationId) {
		apiProxy.messageTracer_setCorrelationId(agentsNodeObject, correlationId);
	}

}

/*
 * Copyright 2023 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.example.rest;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("mat")
public class MemoryAnalyzerTool {

	private static final String CLASS_NAME = MemoryAnalyzerTool.class.getCanonicalName();
	private static final Logger LOG = Logger.getLogger(CLASS_NAME);

	@Path("isLikelyJavaOrNativeOOM")
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public int isLikelyJavaOrNativeOOM(String javacore) throws Throwable {

		if (LOG.isLoggable(Level.FINER))
			LOG.entering(CLASS_NAME, "isLikelyJavaOrNativeOOM");

		// 0: unknown
		// 1: Java OOM
		// 2: Native OOM
		int result = 0;

		if (LOG.isLoggable(Level.FINER))
			LOG.exiting(CLASS_NAME, "isLikelyJavaOrNativeOOM", result);

		return result;
	}

	@Path("isLikelyIBMOr3rdParty")
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	public int isLikelyIBMOr3rdParty(String leakSuspectsReport) throws Throwable {

		if (LOG.isLoggable(Level.FINER))
			LOG.entering(CLASS_NAME, "isLikelyIBMOr3rdParty");

		// 0: unknown
		// 1: IBM
		// 2: 3rd party
		int result = 0;

		if (LOG.isLoggable(Level.FINER))
			LOG.exiting(CLASS_NAME, "isLikelyIBMOr3rdParty", result);

		return result;
	}
}

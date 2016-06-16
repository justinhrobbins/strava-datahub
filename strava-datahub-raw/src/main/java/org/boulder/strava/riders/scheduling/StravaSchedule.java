/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package org.boulder.strava.riders.scheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

public class StravaSchedule
{
	private static final Logger logger = LoggerFactory.getLogger(StravaSchedule.class);

	@Scheduled(cron="${strava.datahub.schedule}")
	public void runSchedule()
	{
		logger.info("Running Strava Schedule");
	}
}

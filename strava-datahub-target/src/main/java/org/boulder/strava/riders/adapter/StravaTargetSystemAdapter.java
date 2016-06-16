package org.boulder.strava.riders.adapter;
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

import com.hybris.datahub.adapter.AdapterService;
import com.hybris.datahub.api.publication.PublicationException;
import com.hybris.datahub.runtime.domain.TargetSystemPublication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StravaTargetSystemAdapter implements AdapterService
{
	private static final Logger logger = LoggerFactory.getLogger(StravaTargetSystemAdapter.class);

	@Override
	public String getTargetSystemType()
	{
		return "StravaTargetSystemAdapter";
	}

	@Override
	public void publish(final TargetSystemPublication targetSystemPublication, final String s) throws PublicationException
	{
		logger.info("Publishing!");
	}
}

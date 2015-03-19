/*
 * Copyright (C) 2012 Zach Melamed
 * 
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
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
 */

package com.tectonica.jonix.onix3;

import com.tectonica.jonix.DU;
import com.tectonica.jonix.codelist.Proximitys;
import com.tectonica.jonix.codelist.RecordSourceTypes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

public class OnOrderDetail
{
	public static final String refname = "OnOrderDetail";
	public static final String shortname = "onorderdetail";

	public String datestamp; // dt.DateOrDateTime
	public RecordSourceTypes sourcetype;
	public String sourcename;

	public OnOrder onOrder; // Required
	public Proximity proximity; // Optional
	public ExpectedDate expectedDate; // Required

	public static OnOrderDetail fromDoc(org.w3c.dom.Element element)
	{
		final OnOrderDetail x = new OnOrderDetail();

		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = RecordSourceTypes.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(OnOrder.refname) || name.equals(OnOrder.shortname))
					x.onOrder = OnOrder.fromDoc(element);
				else if (name.equals(Proximity.refname) || name.equals(Proximity.shortname))
					x.proximity = Proximity.fromDoc(element);
				else if (name.equals(ExpectedDate.refname) || name.equals(ExpectedDate.shortname))
					x.expectedDate = ExpectedDate.fromDoc(element);
			}
		});

		return x;
	}

	public Integer getOnOrderValue()
	{
		return (onOrder == null) ? null : onOrder.value;
	}

	public Proximitys getProximityValue()
	{
		return (proximity == null) ? null : proximity.value;
	}

	public String getExpectedDateValue()
	{
		return (expectedDate == null) ? null : expectedDate.value;
	}
}

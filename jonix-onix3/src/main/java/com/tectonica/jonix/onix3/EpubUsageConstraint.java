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

import java.io.Serializable;
import java.util.List;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.UsageStatuss;
import com.tectonica.jonix.codelist.UsageTypes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

@SuppressWarnings("serial")
public class EpubUsageConstraint implements OnixSuperComposite, Serializable
{
	public static final String refname = "EpubUsageConstraint";
	public static final String shortname = "epubusageconstraint";

	/**
	 * (type: dt.DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	/**
	 * (this field is required)
	 */
	public EpubUsageType epubUsageType;

	/**
	 * (this field is required)
	 */
	public EpubUsageStatus epubUsageStatus;

	/**
	 * (this list may be empty)
	 */
	public List<EpubUsageLimit> epubUsageLimits;

	public EpubUsageConstraint()
	{}

	public EpubUsageConstraint(org.w3c.dom.Element element)
	{
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byValue(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(EpubUsageType.refname) || name.equals(EpubUsageType.shortname))
					epubUsageType = new EpubUsageType(element);
				else if (name.equals(EpubUsageStatus.refname) || name.equals(EpubUsageStatus.shortname))
					epubUsageStatus = new EpubUsageStatus(element);
				else if (name.equals(EpubUsageLimit.refname) || name.equals(EpubUsageLimit.shortname))
					epubUsageLimits = JPU.addToList(epubUsageLimits, new EpubUsageLimit(element));
			}
		});
	}

	public UsageTypes getEpubUsageTypeValue()
	{
		return (epubUsageType == null) ? null : epubUsageType.value;
	}

	public UsageStatuss getEpubUsageStatusValue()
	{
		return (epubUsageStatus == null) ? null : epubUsageStatus.value;
	}
}
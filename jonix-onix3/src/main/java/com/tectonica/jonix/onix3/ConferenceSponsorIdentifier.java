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
import com.tectonica.jonix.codelist.NameCodeTypes;
import com.tectonica.jonix.codelist.RecordSourceTypeCodes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

public class ConferenceSponsorIdentifier
{
	public static final String refname = "ConferenceSponsorIdentifier";
	public static final String shortname = "conferencesponsoridentifier";

	public String datestamp; // dt.DateOrDateTime
	public RecordSourceTypeCodes sourcetype;
	public String sourcename;

	public ConferenceSponsorIDType conferenceSponsorIDType; // Required
	public IDTypeName idTypeName; // Optional
	public IDValue idValue; // Required

	public static ConferenceSponsorIdentifier fromDoc(org.w3c.dom.Element element)
	{
		final ConferenceSponsorIdentifier x = new ConferenceSponsorIdentifier();

		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = RecordSourceTypeCodes.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(ConferenceSponsorIDType.refname) || name.equals(ConferenceSponsorIDType.shortname))
					x.conferenceSponsorIDType = ConferenceSponsorIDType.fromDoc(element);
				else if (name.equals(IDTypeName.refname) || name.equals(IDTypeName.shortname))
					x.idTypeName = IDTypeName.fromDoc(element);
				else if (name.equals(IDValue.refname) || name.equals(IDValue.shortname))
					x.idValue = IDValue.fromDoc(element);
			}
		});

		return x;
	}

	public NameCodeTypes getConferenceSponsorIDTypeValue()
	{
		return (conferenceSponsorIDType == null) ? null : conferenceSponsorIDType.value;
	}

	public String getIDTypeNameValue()
	{
		return (idTypeName == null) ? null : idTypeName.value;
	}

	public String getIDValueValue()
	{
		return (idValue == null) ? null : idValue.value;
	}
}
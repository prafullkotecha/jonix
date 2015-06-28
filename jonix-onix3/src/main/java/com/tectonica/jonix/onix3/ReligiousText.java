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
import java.util.ArrayList;
import java.util.List;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.ReligiousTextFeatureTypes;
import com.tectonica.jonix.struct.JonixReligiousTextFeature;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

@SuppressWarnings("serial")
public class ReligiousText implements OnixSuperComposite, Serializable
{
	public static final String refname = "ReligiousText";
	public static final String shortname = "religioustext";

	/**
	 * (type: dt.DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	/**
	 * (this field is optional)
	 */
	public Bible bible;

	/**
	 * (this field is required)
	 */
	public ReligiousTextIdentifier religiousTextIdentifier;

	/**
	 * (this list is required to contain at least one item)
	 */
	public List<ReligiousTextFeature> religiousTextFeatures;

	public ReligiousText()
	{}

	public ReligiousText(org.w3c.dom.Element element)
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
				if (name.equals(Bible.refname) || name.equals(Bible.shortname))
					bible = new Bible(element);
				else if (name.equals(ReligiousTextIdentifier.refname) || name.equals(ReligiousTextIdentifier.shortname))
					religiousTextIdentifier = new ReligiousTextIdentifier(element);
				else if (name.equals(ReligiousTextFeature.refname) || name.equals(ReligiousTextFeature.shortname))
					religiousTextFeatures = JPU.addToList(religiousTextFeatures, new ReligiousTextFeature(element));
			}
		});
	}

	public String getReligiousTextIdentifierValue()
	{
		return (religiousTextIdentifier == null) ? null : religiousTextIdentifier.value;
	}

	public JonixReligiousTextFeature findReligiousTextFeature(ReligiousTextFeatureTypes religiousTextFeatureType)
	{
		if (religiousTextFeatures != null)
		{
			for (ReligiousTextFeature x : religiousTextFeatures)
			{
				if (x.getReligiousTextFeatureTypeValue() == religiousTextFeatureType)
					return x.asJonixReligiousTextFeature();
			}
		}
		return null;
	}

	public List<JonixReligiousTextFeature> findReligiousTextFeatures(
			java.util.Set<ReligiousTextFeatureTypes> religiousTextFeatureTypes)
	{
		if (religiousTextFeatures != null)
		{
			List<JonixReligiousTextFeature> matches = new ArrayList<>();
			for (ReligiousTextFeature x : religiousTextFeatures)
			{
				if (religiousTextFeatureTypes == null
						|| religiousTextFeatureTypes.contains(x.getReligiousTextFeatureTypeValue()))
					matches.add(x.asJonixReligiousTextFeature());
			}
			return matches;
		}
		return null;
	}
}
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
import com.tectonica.jonix.OnixComposite.OnixDataComposite;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.ResourceVersionFeatureTypes;
import com.tectonica.jonix.struct.JonixResourceVersionFeature;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Resource version feature composite</h1>
 * <p>
 * A repeatable group of data elements which together describe a feature of a supporting resource which is specific to a
 * version in which the resource is offered. Formally optional, but it is unlikely that a supporting resource version
 * could be adequately described without specifying some of its features.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;ResourceVersionFeature&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;resourceversionfeature&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;n</td>
 * </tr>
 * </table>
 */
public class ResourceVersionFeature implements OnixDataComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "ResourceVersionFeature";
	public static final String shortname = "resourceversionfeature";

	// ///////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * (type: dt.DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	// ///////////////////////////////////////////////////////////////////////////////
	// MEMBERS
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * (this field is required)
	 */
	public ResourceVersionFeatureType resourceVersionFeatureType;

	/**
	 * (this field is optional)
	 */
	public FeatureValue featureValue;

	/**
	 * (this list may be empty)
	 */
	public List<FeatureNote> featureNotes;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public ResourceVersionFeature()
	{}

	public ResourceVersionFeature(org.w3c.dom.Element element)
	{
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(ResourceVersionFeatureType.refname)
						|| name.equals(ResourceVersionFeatureType.shortname))
					resourceVersionFeatureType = new ResourceVersionFeatureType(element);
				else if (name.equals(FeatureValue.refname) || name.equals(FeatureValue.shortname))
					featureValue = new FeatureValue(element);
				else if (name.equals(FeatureNote.refname) || name.equals(FeatureNote.shortname))
					featureNotes = JPU.addToList(featureNotes, new FeatureNote(element));
			}
		});
	}

	public ResourceVersionFeatureTypes getResourceVersionFeatureTypeValue()
	{
		return (resourceVersionFeatureType == null) ? null : resourceVersionFeatureType.value;
	}

	/**
	 * Raw Format: Dependent on the feature specified in &lt;ResourceVersionFeatureType&gt;; the feature value may or
	 * may not be taken from a code list
	 */
	public String getFeatureValueValue()
	{
		return (featureValue == null) ? null : featureValue.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 300 characters. XHTML is enabled in this element - see
	 * Using XHTML, HTML or XML with ONIX text fields
	 */
	public List<String> getFeatureNoteValues()
	{
		if (featureNotes != null)
		{
			List<String> list = new ArrayList<>();
			for (FeatureNote i : featureNotes)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public JonixResourceVersionFeature asJonixResourceVersionFeature()
	{
		JonixResourceVersionFeature x = new JonixResourceVersionFeature();
		x.resourceVersionFeatureType = getResourceVersionFeatureTypeValue();
		x.featureValue = getFeatureValueValue();
		x.featureNotes = getFeatureNoteValues();
		return x;
	}
}

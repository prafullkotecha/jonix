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
import com.tectonica.jonix.codelist.ProductIdentifierTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.SalesRightsTypes;
import com.tectonica.jonix.struct.JonixProductIdentifier;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

@SuppressWarnings("serial")
public class SalesRights implements OnixSuperComposite, Serializable
{
	public static final String refname = "SalesRights";
	public static final String shortname = "salesrights";

	/**
	 * (type: dt.DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	/**
	 * (this field is required)
	 */
	public SalesRightsType salesRightsType;

	/**
	 * (this field is required)
	 */
	public Territory territory;

	/**
	 * (this list may be empty)
	 */
	public List<SalesRestriction> salesRestrictions;

	/**
	 * (this list may be empty)
	 */
	public List<ProductIdentifier> productIdentifiers;

	/**
	 * (this field is optional)
	 */
	public PublisherName publisherName;

	public SalesRights()
	{}

	public SalesRights(org.w3c.dom.Element element)
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
				if (name.equals(SalesRightsType.refname) || name.equals(SalesRightsType.shortname))
					salesRightsType = new SalesRightsType(element);
				else if (name.equals(Territory.refname) || name.equals(Territory.shortname))
					territory = new Territory(element);
				else if (name.equals(SalesRestriction.refname) || name.equals(SalesRestriction.shortname))
					salesRestrictions = JPU.addToList(salesRestrictions, new SalesRestriction(element));
				else if (name.equals(ProductIdentifier.refname) || name.equals(ProductIdentifier.shortname))
					productIdentifiers = JPU.addToList(productIdentifiers, new ProductIdentifier(element));
				else if (name.equals(PublisherName.refname) || name.equals(PublisherName.shortname))
					publisherName = new PublisherName(element);
			}
		});
	}

	public SalesRightsTypes getSalesRightsTypeValue()
	{
		return (salesRightsType == null) ? null : salesRightsType.value;
	}

	public String getPublisherNameValue()
	{
		return (publisherName == null) ? null : publisherName.value;
	}

	public JonixProductIdentifier findProductIdentifier(ProductIdentifierTypes productIDType)
	{
		if (productIdentifiers != null)
		{
			for (ProductIdentifier x : productIdentifiers)
			{
				if (x.getProductIDTypeValue() == productIDType)
					return x.asJonixProductIdentifier();
			}
		}
		return null;
	}

	public List<JonixProductIdentifier> findProductIdentifiers(java.util.Set<ProductIdentifierTypes> productIDTypes)
	{
		if (productIdentifiers != null)
		{
			List<JonixProductIdentifier> matches = new ArrayList<>();
			for (ProductIdentifier x : productIdentifiers)
			{
				if (productIDTypes == null || productIDTypes.contains(x.getProductIDTypeValue()))
					matches.add(x.asJonixProductIdentifier());
			}
			return matches;
		}
		return null;
	}
}
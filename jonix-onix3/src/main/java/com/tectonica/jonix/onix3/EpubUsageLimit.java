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

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixDataComposite;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.UnitOfUsages;
import com.tectonica.jonix.struct.JonixEpubUsageLimit;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Usage limit composite (digital products)</h1>
 * <p>
 * An optional and repeatable group of data elements which together specify a quantitative limit on a particular type of
 * usage of a digital product.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;EpubUsageLimit&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;epubusagelimit&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;n</td>
 * </tr>
 * </table>
 */
public class EpubUsageLimit implements OnixDataComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "EpubUsageLimit";
	public static final String shortname = "epubusagelimit";

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
	public Quantity quantity;

	/**
	 * (this field is required)
	 */
	public EpubUsageUnit epubUsageUnit;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public EpubUsageLimit()
	{}

	public EpubUsageLimit(org.w3c.dom.Element element)
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
				if (name.equals(Quantity.refname) || name.equals(Quantity.shortname))
					quantity = new Quantity(element);
				else if (name.equals(EpubUsageUnit.refname) || name.equals(EpubUsageUnit.shortname))
					epubUsageUnit = new EpubUsageUnit(element);
			}
		});
	}

	/**
	 * Raw Format: Variable-length decimal number, here necessarily an integer
	 */
	public Double getQuantityValue()
	{
		return (quantity == null) ? null : quantity.value;
	}

	public UnitOfUsages getEpubUsageUnitValue()
	{
		return (epubUsageUnit == null) ? null : epubUsageUnit.value;
	}

	public JonixEpubUsageLimit asJonixEpubUsageLimit()
	{
		JonixEpubUsageLimit x = new JonixEpubUsageLimit();
		x.quantity = getQuantityValue();
		x.epubUsageUnit = getEpubUsageUnitValue();
		return x;
	}
}

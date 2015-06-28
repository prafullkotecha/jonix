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
import com.tectonica.jonix.codelist.StockQuantityCodeTypes;
import com.tectonica.jonix.struct.JonixStockQuantityCoded;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

@SuppressWarnings("serial")
public class StockQuantityCoded implements OnixDataComposite, Serializable
{
	public static final String refname = "StockQuantityCoded";
	public static final String shortname = "stockquantitycoded";

	/**
	 * (type: dt.DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	/**
	 * (this field is required)
	 */
	public StockQuantityCodeType stockQuantityCodeType;

	/**
	 * (this field is optional)
	 */
	public StockQuantityCodeTypeName stockQuantityCodeTypeName;

	/**
	 * (this field is required)
	 */
	public StockQuantityCode stockQuantityCode;

	public StockQuantityCoded()
	{}

	public StockQuantityCoded(org.w3c.dom.Element element)
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
				if (name.equals(StockQuantityCodeType.refname) || name.equals(StockQuantityCodeType.shortname))
					stockQuantityCodeType = new StockQuantityCodeType(element);
				else if (name.equals(StockQuantityCodeTypeName.refname)
						|| name.equals(StockQuantityCodeTypeName.shortname))
					stockQuantityCodeTypeName = new StockQuantityCodeTypeName(element);
				else if (name.equals(StockQuantityCode.refname) || name.equals(StockQuantityCode.shortname))
					stockQuantityCode = new StockQuantityCode(element);
			}
		});
	}

	public StockQuantityCodeTypes getStockQuantityCodeTypeValue()
	{
		return (stockQuantityCodeType == null) ? null : stockQuantityCodeType.value;
	}

	public String getStockQuantityCodeTypeNameValue()
	{
		return (stockQuantityCodeTypeName == null) ? null : stockQuantityCodeTypeName.value;
	}

	public String getStockQuantityCodeValue()
	{
		return (stockQuantityCode == null) ? null : stockQuantityCode.value;
	}

	public JonixStockQuantityCoded asJonixStockQuantityCoded()
	{
		JonixStockQuantityCoded x = new JonixStockQuantityCoded();
		x.stockQuantityCodeType = getStockQuantityCodeTypeValue();
		x.stockQuantityCode = getStockQuantityCodeValue();
		x.stockQuantityCodeTypeName = getStockQuantityCodeTypeNameValue();
		return x;
	}
}

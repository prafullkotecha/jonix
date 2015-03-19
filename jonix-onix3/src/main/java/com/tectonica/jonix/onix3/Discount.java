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
import com.tectonica.jonix.codelist.DiscountTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

public class Discount
{
	public static final String refname = "Discount";
	public static final String shortname = "discount";

	public String datestamp; // dt.DateOrDateTime
	public RecordSourceTypes sourcetype;
	public String sourcename;

	public DiscountType discountType; // Optional
	public Quantity quantity; // Optional
	public ToQuantity toQuantity; // Optional
	public DiscountPercent discountPercent; // Required
	public DiscountAmount discountAmount; // Optional

	public static Discount fromDoc(org.w3c.dom.Element element)
	{
		final Discount x = new Discount();

		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = RecordSourceTypes.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(DiscountType.refname) || name.equals(DiscountType.shortname))
					x.discountType = DiscountType.fromDoc(element);
				else if (name.equals(Quantity.refname) || name.equals(Quantity.shortname))
					x.quantity = Quantity.fromDoc(element);
				else if (name.equals(ToQuantity.refname) || name.equals(ToQuantity.shortname))
					x.toQuantity = ToQuantity.fromDoc(element);
				else if (name.equals(DiscountPercent.refname) || name.equals(DiscountPercent.shortname))
					x.discountPercent = DiscountPercent.fromDoc(element);
				else if (name.equals(DiscountAmount.refname) || name.equals(DiscountAmount.shortname))
					x.discountAmount = DiscountAmount.fromDoc(element);
			}
		});

		return x;
	}

	public DiscountTypes getDiscountTypeValue()
	{
		return (discountType == null) ? null : discountType.value;
	}

	public Double getQuantityValue()
	{
		return (quantity == null) ? null : quantity.value;
	}

	public Double getToQuantityValue()
	{
		return (toQuantity == null) ? null : toQuantity.value;
	}

	public Double getDiscountPercentValue()
	{
		return (discountPercent == null) ? null : discountPercent.value;
	}

	public Double getDiscountAmountValue()
	{
		return (discountAmount == null) ? null : discountAmount.value;
	}
}

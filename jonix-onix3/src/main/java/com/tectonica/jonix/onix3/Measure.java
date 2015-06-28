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
import com.tectonica.jonix.codelist.MeasureTypes;
import com.tectonica.jonix.codelist.MeasureUnits;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.struct.JonixMeasure;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

@SuppressWarnings("serial")
public class Measure implements OnixDataComposite, Serializable
{
	public static final String refname = "Measure";
	public static final String shortname = "measure";

	/**
	 * (type: dt.DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	/**
	 * (this field is required)
	 */
	public MeasureType measureType;

	/**
	 * (this field is required)
	 */
	public Measurement measurement;

	/**
	 * (this field is required)
	 */
	public MeasureUnitCode measureUnitCode;

	public Measure()
	{}

	public Measure(org.w3c.dom.Element element)
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
				if (name.equals(MeasureType.refname) || name.equals(MeasureType.shortname))
					measureType = new MeasureType(element);
				else if (name.equals(Measurement.refname) || name.equals(Measurement.shortname))
					measurement = new Measurement(element);
				else if (name.equals(MeasureUnitCode.refname) || name.equals(MeasureUnitCode.shortname))
					measureUnitCode = new MeasureUnitCode(element);
			}
		});
	}

	public MeasureTypes getMeasureTypeValue()
	{
		return (measureType == null) ? null : measureType.value;
	}

	public Double getMeasurementValue()
	{
		return (measurement == null) ? null : measurement.value;
	}

	public MeasureUnits getMeasureUnitCodeValue()
	{
		return (measureUnitCode == null) ? null : measureUnitCode.value;
	}

	public JonixMeasure asJonixMeasure()
	{
		JonixMeasure x = new JonixMeasure();
		x.measureType = getMeasureTypeValue();
		x.measureUnitCode = getMeasureUnitCodeValue();
		x.measurement = getMeasurementValue();
		return x;
	}
}
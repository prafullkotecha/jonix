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

package com.tectonica.jonix.codelist;

import java.util.HashMap;
import java.util.Map;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

/**
 * Measure unit code
 */
public enum MeasureUnits
{
	/**
	 * Millimeters are the preferred metric unit of length.
	 */
	Centimeters("cm"), //

	Grams("gr"), //

	Inches_US("in"), //

	/**
	 * Grams are the preferred metric unit of weight.
	 */
	Kilograms("kg"), //

	Pounds_US("lb"), //

	Millimeters("mm"), //

	Ounces_US("oz"), //

	Pixels("px");

	public final String value;

	private MeasureUnits(String value)
	{
		this.value = value;
	}

	private static Map<String, MeasureUnits> map;

	private static Map<String, MeasureUnits> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (MeasureUnits e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static MeasureUnits byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
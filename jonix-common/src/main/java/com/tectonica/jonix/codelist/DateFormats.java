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

import com.tectonica.jonix.OnixCodelist;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * marker interface to assist in IDE navigation to code-list 55 (Date format)
 */
interface CodeList55
{}

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 55</b>
 * <p>
 * Description: Date format
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">About ONIX Codelists</a>
 * @see <a
 *      href="http://www.editeur.org/files/ONIX%20for%20books%20-%20code%20lists/ONIX_BookProduct_Codelists_Issue_32.html#codelist55">ONIX
 *      Codelist 55 in Reference Guide</a>
 */
public enum DateFormats implements OnixCodelist, CodeList55
{
	/**
	 * Year month day (default)
	 */
	YYYYMMDD("00", "YYYYMMDD"), //

	/**
	 * Year and month
	 */
	YYYYMM("01", "YYYYMM"), //

	/**
	 * Year and week number
	 */
	YYYYWW("02", "YYYYWW"), //

	/**
	 * Year and quarter (Q = 1, 2, 3, 4, with 1 = Jan to Mar)
	 */
	YYYYQ("03", "YYYYQ"), //

	/**
	 * Year and season (S = 1, 2, 3, 4, with 1 = 'Spring')
	 */
	YYYYS("04", "YYYYS"), //

	/**
	 * Year
	 */
	YYYY("05", "YYYY"), //

	/**
	 * Spread of exact dates
	 */
	YYYYMMDDYYYYMMDD("06", "YYYYMMDDYYYYMMDD"), //

	/**
	 * Spread of months
	 */
	YYYYMMYYYYMM("07", "YYYYMMYYYYMM"), //

	/**
	 * Spread of week numbers
	 */
	YYYYWWYYYYWW("08", "YYYYWWYYYYWW"), //

	/**
	 * Spread of quarters
	 */
	YYYYQYYYYQ("09", "YYYYQYYYYQ"), //

	/**
	 * Spread of seasons
	 */
	YYYYSYYYYS("10", "YYYYSYYYYS"), //

	/**
	 * Spread of years
	 */
	YYYYYYYY("11", "YYYYYYYY"), //

	/**
	 * For complex, approximate or uncertain dates
	 */
	Text_string("12", "Text string"), //

	/**
	 * Exact time. Use ONLY when exact times with hour/minute precision are relevant. By default, time is local.
	 * Alternatively, the time may be suffixed with an optional 'Z' for UTC times, or with '+' or '-' and an hhmm
	 * timezone offset from UTC. Times without a timezone are 'rolling' local times, times qualified with a timezone
	 * (using Z, + or -) specify a particular instant in time
	 */
	YYYYMMDDThhmm("13", "YYYYMMDDThhmm"), //

	/**
	 * Exact time. Use ONLY when exact times with second precision are relevant. By default, time is local.
	 * Alternatively, the time may be suffixed with an optional 'Z' for UTC times, or with '+' or '-' and an hhmm
	 * timezone offset from UTC. Times without a timezone are 'rolling' local times, times qualified with a timezone
	 * (using Z, + or -) specify a particular instant in time
	 */
	YYYYMMDDThhmmss("14", "YYYYMMDDThhmmss"), //

	/**
	 * Year month day (Hijri calendar)
	 */
	YYYYMMDD_H("20", "YYYYMMDD (H)"), //

	/**
	 * Year and month (Hijri calendar)
	 */
	YYYYMM_H("21", "YYYYMM (H)"), //

	/**
	 * Year (Hijri calendar)
	 */
	YYYY_H("25", "YYYY (H)"), //

	/**
	 * For complex, approximate or uncertain dates (Hijri calendar), text would usually be in Arabic script
	 */
	Text_string_H("32", "Text string (H)");

	public final String code;
	public final String description;

	private DateFormats(String code, String description)
	{
		this.code = code;
		this.description = description;
	}

	@Override
	public String getCode()
	{
		return code;
	}

	@Override
	public String getDescription()
	{
		return description;
	}

	private static volatile Map<String, DateFormats> map;

	private static Map<String, DateFormats> map()
	{
		Map<String, DateFormats> result = map;
		if (result == null)
		{
			synchronized (DateFormats.class)
			{
				result = map;
				if (result == null)
				{
					result = new HashMap<>();
					for (DateFormats e : values())
						result.put(e.code, e);
					map = result;
				}
			}
		}
		return result;
	}

	public static DateFormats byCode(String code)
	{
		if (code == null || code.isEmpty())
			return null;
		return map().get(code);
	}
}

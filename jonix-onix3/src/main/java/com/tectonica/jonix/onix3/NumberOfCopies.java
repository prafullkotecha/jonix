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
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.RecordSourceTypes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Number of copies (product part)</h1>
 * <p>
 * When product parts are listed as a specified number of copies of a single item, usually identified by a
 * &lt;ProductIdentifier&gt;, &lt;NumberOfCopies&gt; must be used to specify the quantity, even if the number is ‘1’. It
 * must be used when a multiple-item product or pack contains (a) a quantity of a single item; or (b) one of each of
 * several different items (as in a multi-volume set); or (c) one or more of each of several different items (as in a
 * dumpbin carrying copies of two different books, or a classroom pack containing a teacher’s text and twenty student
 * texts). Consequently the element is mandatory, and non-repeating, in an occurrence of the &lt;ProductPart&gt;
 * composite if &lt;NumberOfItemsOfThisForm&gt; is not present. It is normally accompanied by a
 * &lt;ProductIdentifier&gt;; but in exceptional circumstances, if the sender’s system is unable to provide an
 * identifier at this level, it may be sent with product form coding and without an ID.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Variable-length integer, maximum four digits</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;NumberOfCopies&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;x323&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;1</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td>&lt;x323&gt;24&lt;/x323&gt; (24 copies of a single item in eg a classroom pack of textbooks)</td>
 * </tr>
 * </table>
 */
public class NumberOfCopies implements OnixElement, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "NumberOfCopies";
	public static final String shortname = "x323";

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
	// VALUE MEMBER
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * Raw Format: Variable-length integer, maximum four digits
	 * <p>
	 * (type: dt.StrictPositiveInteger)
	 */
	public Integer value;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public NumberOfCopies()
	{}

	public NumberOfCopies(org.w3c.dom.Element element)
	{
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		value = JPU.getContentAsInteger(element);
	}
}

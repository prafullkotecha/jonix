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

package com.tectonica.jonix.onix2;

import java.io.Serializable;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Identifier type name</h1>
 * <p>
 * A name which identifies a proprietary identifier type when, and only when, the code in the &lt;AddresseeIDType&gt;
 * element indicates a proprietary scheme. Optional and non-repeating.
 * </p>
 * <p class="new214">
 * The text is not limited to ASCII characters.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Variable-length ASCII text, suggested maximum 50 characters</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;IDTypeName&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;b233&gt;</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td>&#160;</td>
 * </tr>
 * </table>
 */
public class IDTypeName implements OnixElement, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "IDTypeName";
	public static final String shortname = "b233";

	// ///////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	// ///////////////////////////////////////////////////////////////////////////////

	public TextFormats textformat;

	public TextCaseFlags textcase;

	public LanguageCodes language;

	public TransliterationSchemes transliteration;

	/**
	 * (type: DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	// ///////////////////////////////////////////////////////////////////////////////
	// VALUE MEMBER
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * Raw Format: Variable-length ASCII text, suggested maximum 50 characters
	 * <p>
	 * (type: NonEmptyString)
	 */
	public String value;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public IDTypeName()
	{}

	public IDTypeName(org.w3c.dom.Element element)
	{
		textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
		textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
		language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
		transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		value = JPU.getContentAsString(element);
	}
}

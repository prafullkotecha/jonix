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
 * <h1>Publication date</h1>
 * <p>
 * The date of first publication of this product in the home market of the publisher named in PR.19 (that is, under the
 * current ISBN or other identifier, as distinct from the date of first publication of the work, which may be given in
 * &lt;YearFirstPublished&gt; on the next page). In advance information, this will be an expected date, which should be
 * replaced by the actual date of publication when known. The date should be given as precisely as possible, but in
 * early notifications a month and year are sufficient; and for backlist titles the year of publication is sufficient.
 * </p>
 * <p>
 * Note that in advance information this date must not be interpreted as the date when the product will first be
 * available in a territory other than the publisher’s home market. See the &lt;SupplyDetail&gt; and
 * &lt;MarketRepresentation&gt; composites, Groups PR.24 and PR.25, for other market-specific detail.
 * </p>
 * <p>
 * Optional and non-repeating.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Four, six or eight numeric digits (YYYY, YYYYMM, or YYYYMMDD).</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;PublicationDate&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;b003&gt;</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td>&lt;b003&gt;20010315&lt;/b003&gt;</td>
 * </tr>
 * </table>
 */
public class PublicationDate implements OnixElement, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "PublicationDate";
	public static final String shortname = "b003";

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
	 * Raw Format: Four, six or eight numeric digits (YYYY, YYYYMM, or YYYYMMDD).
	 * <p>
	 * (type: NonEmptyString)
	 */
	public String value;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public PublicationDate()
	{}

	public PublicationDate(org.w3c.dom.Element element)
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

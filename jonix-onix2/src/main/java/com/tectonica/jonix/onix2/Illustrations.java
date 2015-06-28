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
import com.tectonica.jonix.OnixComposite.OnixDataComposite;
import com.tectonica.jonix.codelist.IllustrationAndOtherContentTypes;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.struct.JonixIllustrations;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

@SuppressWarnings("serial")
public class Illustrations implements OnixDataComposite, Serializable
{
	public static final String refname = "Illustrations";
	public static final String shortname = "illustrations";

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

	/**
	 * (this field is required)
	 */
	public IllustrationType illustrationType;

	/**
	 * (this field is optional)
	 */
	public IllustrationTypeDescription illustrationTypeDescription;

	/**
	 * (this field is optional)
	 */
	public Number number;

	public Illustrations()
	{}

	public Illustrations(org.w3c.dom.Element element)
	{
		textformat = TextFormats.byValue(JPU.getAttribute(element, "textformat"));
		textcase = TextCaseFlags.byValue(JPU.getAttribute(element, "textcase"));
		language = LanguageCodes.byValue(JPU.getAttribute(element, "language"));
		transliteration = TransliterationSchemes.byValue(JPU.getAttribute(element, "transliteration"));
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byValue(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(IllustrationType.refname) || name.equals(IllustrationType.shortname))
					illustrationType = new IllustrationType(element);
				else if (name.equals(IllustrationTypeDescription.refname)
						|| name.equals(IllustrationTypeDescription.shortname))
					illustrationTypeDescription = new IllustrationTypeDescription(element);
				else if (name.equals(Number.refname) || name.equals(Number.shortname))
					number = new Number(element);
			}
		});
	}

	public IllustrationAndOtherContentTypes getIllustrationTypeValue()
	{
		return (illustrationType == null) ? null : illustrationType.value;
	}

	public String getIllustrationTypeDescriptionValue()
	{
		return (illustrationTypeDescription == null) ? null : illustrationTypeDescription.value;
	}

	public String getNumberValue()
	{
		return (number == null) ? null : number.value;
	}

	public JonixIllustrations asJonixIllustrations()
	{
		JonixIllustrations x = new JonixIllustrations();
		x.illustrationType = getIllustrationTypeValue();
		x.illustrationTypeDescription = getIllustrationTypeDescriptionValue();
		x.number = getNumberValue();
		return x;
	}
}
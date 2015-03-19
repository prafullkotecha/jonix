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

import com.tectonica.jonix.DU;
import com.tectonica.jonix.codelist.LanguageCodeIso6392Bs;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.SubjectSchemeIdentifiers;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

public class Subject
{
	public static final String refname = "Subject";
	public static final String shortname = "subject";

	public TextFormats textformat;
	public TextCaseFlags textcase;
	public LanguageCodeIso6392Bs language;
	public TransliterationSchemes transliteration;
	public String datestamp; // DateOrDateTime
	public RecordSourceTypes sourcetype;
	public String sourcename;

	public SubjectSchemeIdentifier subjectSchemeIdentifier; // Required
	public SubjectSchemeName subjectSchemeName; // Optional
	public SubjectSchemeVersion subjectSchemeVersion; // Optional
	public SubjectCode subjectCode; // Required
	public SubjectHeadingText subjectHeadingText; // Optional

	public static Subject fromDoc(org.w3c.dom.Element element)
	{
		final Subject x = new Subject();

		x.textformat = TextFormats.byValue(DU.getAttribute(element, "textformat"));
		x.textcase = TextCaseFlags.byValue(DU.getAttribute(element, "textcase"));
		x.language = LanguageCodeIso6392Bs.byValue(DU.getAttribute(element, "language"));
		x.transliteration = TransliterationSchemes.byValue(DU.getAttribute(element, "transliteration"));
		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = RecordSourceTypes.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(SubjectSchemeIdentifier.refname) || name.equals(SubjectSchemeIdentifier.shortname))
					x.subjectSchemeIdentifier = SubjectSchemeIdentifier.fromDoc(element);
				else if (name.equals(SubjectSchemeName.refname) || name.equals(SubjectSchemeName.shortname))
					x.subjectSchemeName = SubjectSchemeName.fromDoc(element);
				else if (name.equals(SubjectSchemeVersion.refname) || name.equals(SubjectSchemeVersion.shortname))
					x.subjectSchemeVersion = SubjectSchemeVersion.fromDoc(element);
				else if (name.equals(SubjectCode.refname) || name.equals(SubjectCode.shortname))
					x.subjectCode = SubjectCode.fromDoc(element);
				else if (name.equals(SubjectHeadingText.refname) || name.equals(SubjectHeadingText.shortname))
					x.subjectHeadingText = SubjectHeadingText.fromDoc(element);
			}
		});

		return x;
	}

	public SubjectSchemeIdentifiers getSubjectSchemeIdentifierValue()
	{
		return (subjectSchemeIdentifier == null) ? null : subjectSchemeIdentifier.value;
	}

	public String getSubjectSchemeNameValue()
	{
		return (subjectSchemeName == null) ? null : subjectSchemeName.value;
	}

	public String getSubjectSchemeVersionValue()
	{
		return (subjectSchemeVersion == null) ? null : subjectSchemeVersion.value;
	}

	public String getSubjectCodeValue()
	{
		return (subjectCode == null) ? null : subjectCode.value;
	}

	public String getSubjectHeadingTextValue()
	{
		return (subjectHeadingText == null) ? null : subjectHeadingText.value;
	}
}

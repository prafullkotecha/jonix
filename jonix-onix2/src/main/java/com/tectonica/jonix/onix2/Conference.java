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

import java.util.List;

import com.tectonica.jonix.DU;
import com.tectonica.jonix.codelist.LanguageCodeIso6392Bs;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

public class Conference
{
	public static final String refname = "Conference";
	public static final String shortname = "conference";

	public TextFormats textformat;
	public TextCaseFlags textcase;
	public LanguageCodeIso6392Bs language;
	public TransliterationSchemes transliteration;
	public String datestamp; // DateOrDateTime
	public RecordSourceTypes sourcetype;
	public String sourcename;

	public ConferenceRole conferenceRole; // Optional
	public ConferenceName conferenceName; // Required
	public ConferenceAcronym conferenceAcronym; // Optional
	public ConferenceNumber conferenceNumber; // Optional
	public ConferenceTheme conferenceTheme; // Optional
	public ConferenceDate conferenceDate; // Optional
	public ConferencePlace conferencePlace; // Optional
	public List<ConferenceSponsor> conferenceSponsors; // ZeroOrMore
	public List<Website> websites; // ZeroOrMore

	public static Conference fromDoc(org.w3c.dom.Element element)
	{
		final Conference x = new Conference();

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
				if (name.equals(ConferenceRole.refname) || name.equals(ConferenceRole.shortname))
					x.conferenceRole = ConferenceRole.fromDoc(element);
				else if (name.equals(ConferenceName.refname) || name.equals(ConferenceName.shortname))
					x.conferenceName = ConferenceName.fromDoc(element);
				else if (name.equals(ConferenceAcronym.refname) || name.equals(ConferenceAcronym.shortname))
					x.conferenceAcronym = ConferenceAcronym.fromDoc(element);
				else if (name.equals(ConferenceNumber.refname) || name.equals(ConferenceNumber.shortname))
					x.conferenceNumber = ConferenceNumber.fromDoc(element);
				else if (name.equals(ConferenceTheme.refname) || name.equals(ConferenceTheme.shortname))
					x.conferenceTheme = ConferenceTheme.fromDoc(element);
				else if (name.equals(ConferenceDate.refname) || name.equals(ConferenceDate.shortname))
					x.conferenceDate = ConferenceDate.fromDoc(element);
				else if (name.equals(ConferencePlace.refname) || name.equals(ConferencePlace.shortname))
					x.conferencePlace = ConferencePlace.fromDoc(element);
				else if (name.equals(ConferenceSponsor.refname) || name.equals(ConferenceSponsor.shortname))
					x.conferenceSponsors = DU.addToList(x.conferenceSponsors, ConferenceSponsor.fromDoc(element));
				else if (name.equals(Website.refname) || name.equals(Website.shortname))
					x.websites = DU.addToList(x.websites, Website.fromDoc(element));
			}
		});

		return x;
	}

	public String getConferenceRoleValue()
	{
		return (conferenceRole == null) ? null : conferenceRole.value;
	}

	public String getConferenceNameValue()
	{
		return (conferenceName == null) ? null : conferenceName.value;
	}

	public String getConferenceAcronymValue()
	{
		return (conferenceAcronym == null) ? null : conferenceAcronym.value;
	}

	public String getConferenceNumberValue()
	{
		return (conferenceNumber == null) ? null : conferenceNumber.value;
	}

	public String getConferenceThemeValue()
	{
		return (conferenceTheme == null) ? null : conferenceTheme.value;
	}

	public String getConferenceDateValue()
	{
		return (conferenceDate == null) ? null : conferenceDate.value;
	}

	public String getConferencePlaceValue()
	{
		return (conferencePlace == null) ? null : conferencePlace.value;
	}
}

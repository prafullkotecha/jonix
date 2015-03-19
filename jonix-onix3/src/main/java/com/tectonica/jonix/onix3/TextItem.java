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

import java.util.List;

import com.tectonica.jonix.DU;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextItemTypes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

public class TextItem
{
	public static final String refname = "TextItem";
	public static final String shortname = "textitem";

	public String datestamp; // dt.DateOrDateTime
	public RecordSourceTypes sourcetype;
	public String sourcename;

	public TextItemType textItemType; // Required
	public List<TextItemIdentifier> textItemIdentifiers; // ZeroOrMore
	public List<PageRun> pageRuns; // ZeroOrMore
	public NumberOfPages numberOfPages; // Optional

	public static TextItem fromDoc(org.w3c.dom.Element element)
	{
		final TextItem x = new TextItem();

		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = RecordSourceTypes.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(TextItemType.refname) || name.equals(TextItemType.shortname))
					x.textItemType = TextItemType.fromDoc(element);
				else if (name.equals(TextItemIdentifier.refname) || name.equals(TextItemIdentifier.shortname))
					x.textItemIdentifiers = DU.addToList(x.textItemIdentifiers, TextItemIdentifier.fromDoc(element));
				else if (name.equals(PageRun.refname) || name.equals(PageRun.shortname))
					x.pageRuns = DU.addToList(x.pageRuns, PageRun.fromDoc(element));
				else if (name.equals(NumberOfPages.refname) || name.equals(NumberOfPages.shortname))
					x.numberOfPages = NumberOfPages.fromDoc(element);
			}
		});

		return x;
	}

	public TextItemTypes getTextItemTypeValue()
	{
		return (textItemType == null) ? null : textItemType.value;
	}

	public Integer getNumberOfPagesValue()
	{
		return (numberOfPages == null) ? null : numberOfPages.value;
	}
}

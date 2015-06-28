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
import java.util.ArrayList;
import java.util.List;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.ProductIdentifierTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TitleTypes;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.struct.JonixProductIdentifier;
import com.tectonica.jonix.struct.JonixTitle;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

@SuppressWarnings("serial")
public class Set implements OnixSuperComposite, Serializable
{
	public static final String refname = "Set";
	public static final String shortname = "set";

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
	 * (this field is optional)
	 */
	public ISBNOfSet isbnOfSet;

	/**
	 * (this field is optional)
	 */
	public EAN13OfSet ean13OfSet;

	/**
	 * (this list may be empty)
	 */
	public List<ProductIdentifier> productIdentifiers;

	/**
	 * (this field is required)
	 */
	public TitleOfSet titleOfSet;

	/**
	 * (this list may be empty)
	 */
	public List<Title> titles;

	/**
	 * (this field is optional)
	 */
	public SetPartNumber setPartNumber;

	/**
	 * (this field is optional)
	 */
	public SetPartTitle setPartTitle;

	/**
	 * (this field is optional)
	 */
	public ItemNumberWithinSet itemNumberWithinSet;

	/**
	 * (this field is optional)
	 */
	public LevelSequenceNumber levelSequenceNumber;

	/**
	 * (this field is optional)
	 */
	public SetItemTitle setItemTitle;

	public Set()
	{}

	public Set(org.w3c.dom.Element element)
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
				if (name.equals(ISBNOfSet.refname) || name.equals(ISBNOfSet.shortname))
					isbnOfSet = new ISBNOfSet(element);
				else if (name.equals(EAN13OfSet.refname) || name.equals(EAN13OfSet.shortname))
					ean13OfSet = new EAN13OfSet(element);
				else if (name.equals(ProductIdentifier.refname) || name.equals(ProductIdentifier.shortname))
					productIdentifiers = JPU.addToList(productIdentifiers, new ProductIdentifier(element));
				else if (name.equals(TitleOfSet.refname) || name.equals(TitleOfSet.shortname))
					titleOfSet = new TitleOfSet(element);
				else if (name.equals(Title.refname) || name.equals(Title.shortname))
					titles = JPU.addToList(titles, new Title(element));
				else if (name.equals(SetPartNumber.refname) || name.equals(SetPartNumber.shortname))
					setPartNumber = new SetPartNumber(element);
				else if (name.equals(SetPartTitle.refname) || name.equals(SetPartTitle.shortname))
					setPartTitle = new SetPartTitle(element);
				else if (name.equals(ItemNumberWithinSet.refname) || name.equals(ItemNumberWithinSet.shortname))
					itemNumberWithinSet = new ItemNumberWithinSet(element);
				else if (name.equals(LevelSequenceNumber.refname) || name.equals(LevelSequenceNumber.shortname))
					levelSequenceNumber = new LevelSequenceNumber(element);
				else if (name.equals(SetItemTitle.refname) || name.equals(SetItemTitle.shortname))
					setItemTitle = new SetItemTitle(element);
			}
		});
	}

	public String getISBNOfSetValue()
	{
		return (isbnOfSet == null) ? null : isbnOfSet.value;
	}

	public String getEAN13OfSetValue()
	{
		return (ean13OfSet == null) ? null : ean13OfSet.value;
	}

	public String getTitleOfSetValue()
	{
		return (titleOfSet == null) ? null : titleOfSet.value;
	}

	public String getSetPartNumberValue()
	{
		return (setPartNumber == null) ? null : setPartNumber.value;
	}

	public String getSetPartTitleValue()
	{
		return (setPartTitle == null) ? null : setPartTitle.value;
	}

	public String getItemNumberWithinSetValue()
	{
		return (itemNumberWithinSet == null) ? null : itemNumberWithinSet.value;
	}

	public String getLevelSequenceNumberValue()
	{
		return (levelSequenceNumber == null) ? null : levelSequenceNumber.value;
	}

	public String getSetItemTitleValue()
	{
		return (setItemTitle == null) ? null : setItemTitle.value;
	}

	public JonixProductIdentifier findProductIdentifier(ProductIdentifierTypes productIDType)
	{
		if (productIdentifiers != null)
		{
			for (ProductIdentifier x : productIdentifiers)
			{
				if (x.getProductIDTypeValue() == productIDType)
					return x.asJonixProductIdentifier();
			}
		}
		return null;
	}

	public List<JonixProductIdentifier> findProductIdentifiers(java.util.Set<ProductIdentifierTypes> productIDTypes)
	{
		if (productIdentifiers != null)
		{
			List<JonixProductIdentifier> matches = new ArrayList<>();
			for (ProductIdentifier x : productIdentifiers)
			{
				if (productIDTypes == null || productIDTypes.contains(x.getProductIDTypeValue()))
					matches.add(x.asJonixProductIdentifier());
			}
			return matches;
		}
		return null;
	}

	public JonixTitle findTitle(TitleTypes titleType)
	{
		if (titles != null)
		{
			for (Title x : titles)
			{
				if (x.getTitleTypeValue() == titleType)
					return x.asJonixTitle();
			}
		}
		return null;
	}

	public List<JonixTitle> findTitles(java.util.Set<TitleTypes> titleTypes)
	{
		if (titles != null)
		{
			List<JonixTitle> matches = new ArrayList<>();
			for (Title x : titles)
			{
				if (titleTypes == null || titleTypes.contains(x.getTitleTypeValue()))
					matches.add(x.asJonixTitle());
			}
			return matches;
		}
		return null;
	}
}
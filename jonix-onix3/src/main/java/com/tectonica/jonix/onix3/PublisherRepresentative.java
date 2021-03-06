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
import java.util.ArrayList;
import java.util.List;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.codelist.AgentRoles;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.SupplierIdentifierTypes;
import com.tectonica.jonix.struct.JonixAgentIdentifier;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Publisher representative composite</h1>
 * <p>
 * A repeatable group of data elements which together identify a publisher representative in a specified market.
 * Optional, and repeated only if the publisher has two or more representatives.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;PublisherRepresentative&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;publisherrepresentative&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;n</td>
 * </tr>
 * </table>
 */
public class PublisherRepresentative implements OnixSuperComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "PublisherRepresentative";
	public static final String shortname = "publisherrepresentative";

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
	// MEMBERS
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * (this field is required)
	 */
	public AgentRole agentRole;

	/**
	 * (this list is required to contain at least one item)
	 */
	public List<AgentIdentifier> agentIdentifiers;

	/**
	 * (this field is optional)
	 */
	public AgentName agentName;

	/**
	 * (this list may be empty)
	 */
	public List<TelephoneNumber> telephoneNumbers;

	/**
	 * (this list may be empty)
	 */
	public List<FaxNumber> faxNumbers;

	/**
	 * (this list may be empty)
	 */
	public List<EmailAddress> emailAddresss;

	/**
	 * (this list may be empty)
	 */
	public List<Website> websites;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public PublisherRepresentative()
	{}

	public PublisherRepresentative(org.w3c.dom.Element element)
	{
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(AgentRole.refname) || name.equals(AgentRole.shortname))
					agentRole = new AgentRole(element);
				else if (name.equals(AgentIdentifier.refname) || name.equals(AgentIdentifier.shortname))
					agentIdentifiers = JPU.addToList(agentIdentifiers, new AgentIdentifier(element));
				else if (name.equals(AgentName.refname) || name.equals(AgentName.shortname))
					agentName = new AgentName(element);
				else if (name.equals(TelephoneNumber.refname) || name.equals(TelephoneNumber.shortname))
					telephoneNumbers = JPU.addToList(telephoneNumbers, new TelephoneNumber(element));
				else if (name.equals(FaxNumber.refname) || name.equals(FaxNumber.shortname))
					faxNumbers = JPU.addToList(faxNumbers, new FaxNumber(element));
				else if (name.equals(EmailAddress.refname) || name.equals(EmailAddress.shortname))
					emailAddresss = JPU.addToList(emailAddresss, new EmailAddress(element));
				else if (name.equals(Website.refname) || name.equals(Website.shortname))
					websites = JPU.addToList(websites, new Website(element));
			}
		});
	}

	public AgentRoles getAgentRoleValue()
	{
		return (agentRole == null) ? null : agentRole.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 100 characters
	 */
	public String getAgentNameValue()
	{
		return (agentName == null) ? null : agentName.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 20 characters
	 */
	public List<String> getTelephoneNumberValues()
	{
		if (telephoneNumbers != null)
		{
			List<String> list = new ArrayList<>();
			for (TelephoneNumber i : telephoneNumbers)
				list.add(i.value);
			return list;
		}
		return null;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 20 characters
	 */
	public List<String> getFaxNumberValues()
	{
		if (faxNumbers != null)
		{
			List<String> list = new ArrayList<>();
			for (FaxNumber i : faxNumbers)
				list.add(i.value);
			return list;
		}
		return null;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 100 characters
	 */
	public List<String> getEmailAddressValues()
	{
		if (emailAddresss != null)
		{
			List<String> list = new ArrayList<>();
			for (EmailAddress i : emailAddresss)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public JonixAgentIdentifier findAgentIdentifier(SupplierIdentifierTypes agentIDType)
	{
		if (agentIdentifiers != null)
		{
			for (AgentIdentifier x : agentIdentifiers)
			{
				if (x.getAgentIDTypeValue() == agentIDType)
					return x.asJonixAgentIdentifier();
			}
		}
		return null;
	}

	public List<JonixAgentIdentifier> findAgentIdentifiers(java.util.Set<SupplierIdentifierTypes> agentIDTypes)
	{
		if (agentIdentifiers != null)
		{
			List<JonixAgentIdentifier> matches = new ArrayList<>();
			for (AgentIdentifier x : agentIdentifiers)
			{
				if (agentIDTypes == null || agentIDTypes.contains(x.getAgentIDTypeValue()))
					matches.add(x.asJonixAgentIdentifier());
			}
			return matches;
		}
		return null;
	}
}

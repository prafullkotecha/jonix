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

package com.tectonica.jonix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.namespace.QName;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.w3c.dom.Element;

import com.tectonica.jonix.basic.BasicProduct2;
import com.tectonica.jonix.onix2.Product;
import com.tectonica.xmlchunk.XmlChunker;

public class TestBasicProduct
{
	@Before
	public void setUp() throws Exception
	{}

	@After
	public void tearDown() throws Exception
	{}

	@Test
	@Ignore
	public void test() throws FileNotFoundException
	{
//		final String path = "../onix_samples/SB_Ref.xml";
		final String path = "../onix_samples/SB_short.xml";
//		final String path = "../onix_samples/CR.xml";
//		final String path = "../onix_samples/MY.xml";

		final File file = new File(path);
		if (!file.exists())
			throw new RuntimeException("couldn't found " + file.getAbsolutePath());

		XmlChunker.parse(new FileInputStream(file), 2, new XmlChunker.Listener()
		{
			@Override
			public void onTarget(Element element)
			{
				final String nodeName = element.getNodeName();
				if (nodeName.equals(Product.refname) || nodeName.equals(Product.shortname))
				{
					final Product product = new Product(element);
					BasicProduct2 bp = new BasicProduct2(product);
					System.out.println(bp.getLabel());
				}
			}

			@Override
			public void onPreTargetStart(int depth, StartElement element)
			{
				final Attribute release = element.getAttributeByName(new QName("release"));
				boolean isOnix2 = (release == null || release.getValue().startsWith("2"));
				if (!isOnix2)
					throw new RuntimeException("this test is suitable for Onix2 only at this time");
			}
		});

		System.err.println("** DONE");
	}
}
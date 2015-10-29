/*
 * Copyright (c) 2008 Objet Direct
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.wicketstuff.wiquery.ui.effects;

import java.util.List;

import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.wicketstuff.wiquery.core.resources.JavaScriptHeaderItems;

/**
 * $Id: SlideEffectJavaScriptResourceReference.java 1143 2011-07-29 11:51:49Z
 * hielke.hoeve@gmail.com $
 * <p>
 * References the JavaScript resource to import the Slide jQuery UI effect.
 * </p>
 * 
 * @author Julien Roche
 * @since 1.0
 */
public final class SlideEffectJavaScriptResourceReference extends JavaScriptResourceReference
{
	// Constants
	/** Constant of serialization */
	private static final long serialVersionUID = 2062678871572539729L;

	/**
	 * Singleton instance.
	 */
	private static final SlideEffectJavaScriptResourceReference INSTANCE =
		new SlideEffectJavaScriptResourceReference();

	/**
	 * Default constructor
	 */
	private SlideEffectJavaScriptResourceReference()
	{
		super(CoreEffectJavaScriptResourceReference.class, "jquery.ui.effect-slide.js");
	}

	/**
	 * Returns the {@link SlideEffectJavaScriptResourceReference} instance.
	 */
	public static SlideEffectJavaScriptResourceReference get()
	{
		return INSTANCE;
	}

	@Override
	public List<HeaderItem> getDependencies()
	{
		return JavaScriptHeaderItems.forReferences(CoreEffectJavaScriptResourceReference.get());
	}
}
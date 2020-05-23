/*
 * The MIT License (MIT)
 *
 *  Copyright (c) 2020 Elior "Mallowigi" Boukhobza
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

package com.mallowigi.icons.associations;

import com.intellij.util.xmlb.annotations.Property;
import com.mallowigi.models.FileInfo;
import org.jetbrains.annotations.NonNls;

import java.io.Serializable;

/**
 * Represent an association of a name with an icon
 */
public abstract class Association implements Serializable {
  @NonNls
  @Property
  private String name;
  @Property
  private String icon;

  Association(final String name, final String icon) {
    this.name = name;
    this.icon = icon;
  }

  public abstract boolean matches(FileInfo file);

  public abstract String getMatcher();

  public abstract void setMatcher(final String value);

  public final String getName() {
    return name;
  }

  public final void setName(final String name) {
    this.name = name;
  }

  public final String getIcon() {
    return icon;
  }

  public final void setIcon(final String icon) {
    this.icon = icon;
  }

  @SuppressWarnings("CallToSimpleGetterFromWithinClass")
  public void apply(final Association other) {
    name = other.getName();
    icon = other.getIcon();
  }

  public boolean isEmpty() {
    return name.isEmpty() || icon.isEmpty();
  }
}

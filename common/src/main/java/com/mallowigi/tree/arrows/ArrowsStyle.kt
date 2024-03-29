/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015-2023 Elior "Mallowigi" Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
package com.mallowigi.tree.arrows

import org.jetbrains.annotations.NonNls
import javax.swing.Icon

/** Interface for arrow styles. */
interface ArrowsStyle {
  /** Expanded icon. */
  val expandIcon: Icon

  /** Expanded icon path. */
  val expandIconPath: String

  /** Collapsed icon. */
  val collapseIcon: Icon

  /** Collapsed icon path. */
  val collapseIconPath: String

  /** Selected item expanded icon. */
  val selectedExpandIcon: Icon

  /** Selected item expanded icon path. */
  val selectedExpandIconPath: String

  /** Selected item collapsed icon. */
  val selectedCollapseIcon: Icon

  /** Selected item collapsed icon path. */
  val selectedCollapseIconPath: String

  /** Bottom collapse icon. */
  val bottomCollapseIcon: Icon

  /** Bottom collapse icon path. */
  val bottomCollapseIconPath: String

  /** Selected bottom collapse icon. */
  val selectedBottomCollapseIcon: Icon

  /** Selected bottom collapse icon path. */
  val selectedBottomCollapseIconPath: String

  /** Path id. */
  val pathId: @NonNls String
}

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

import com.intellij.icons.AllIcons
import com.intellij.util.ui.EmptyIcon
import javax.swing.Icon

/** No arrows style. */
class NoneArrowsStyle : ArrowsStyle {
  private val emptyIcon = EmptyIcon.create(AllIcons.General.ArrowUp)
  override val expandIcon: Icon
    get() = emptyIcon
  override val expandIconPath: String
    get() = ""

  override val collapseIcon: Icon
    get() = emptyIcon
  override val collapseIconPath: String
    get() = ""

  override val selectedExpandIcon: Icon
    get() = emptyIcon
  override val selectedExpandIconPath: String
    get() = ""

  override val selectedCollapseIcon: Icon
    get() = emptyIcon
  override val selectedCollapseIconPath: String
    get() = ""

  override val bottomCollapseIcon: Icon
    get() = emptyIcon
  override val bottomCollapseIconPath: String
    get() = ""

  override val selectedBottomCollapseIcon: Icon
    get() = emptyIcon
  override val selectedBottomCollapseIconPath: String
    get() = ""

  override val pathId: String
    get() = ""
}

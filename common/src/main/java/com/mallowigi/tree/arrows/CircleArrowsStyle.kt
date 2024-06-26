/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015-2024 Elior "Mallowigi" Boukhobza
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
 */

package com.mallowigi.tree.arrows

import icons.AtomIcons
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

private const val CIRCLE_COLLAPSE: String = "/icons/mac/circle/down.svg"
private const val CIRCLE_EXPAND: String = "/icons/mac/circle/right.svg"
private const val CIRCLE_COLLAPSE_SELECTED: String = "/icons/mac/circle/down_selected.svg"
private const val CIRCLE_EXPAND_SELECTED: String = "/icons/mac/circle/right_selected.svg"
private const val CIRCLE_UNFOLD: String = "/icons/mac/circle/up.svg"
private const val CIRCLE_UNFOLD_SELECTED: String = "/icons/mac/circle/up_selected.svg"

private var CircleDown: Icon = AtomIcons.load(CIRCLE_COLLAPSE)
private var CircleRight: Icon = AtomIcons.load(CIRCLE_EXPAND)
private var CircleDownSelected: Icon = AtomIcons.load(CIRCLE_COLLAPSE_SELECTED)
private var CircleRightSelected: Icon = AtomIcons.load(CIRCLE_EXPAND_SELECTED)
private var CircleUp: Icon = AtomIcons.load(CIRCLE_UNFOLD)
private var CircleUpSelected: Icon = AtomIcons.load(CIRCLE_UNFOLD_SELECTED)

/** Arrows Arrow style. */
class CircleArrowsStyle : ArrowsStyle {
  override val expandIcon: Icon
    get() = CircleRight
  override val expandIconPath: String
    get() = CIRCLE_EXPAND

  override val collapseIcon: Icon
    get() = CircleDown
  override val collapseIconPath: String
    get() = CIRCLE_COLLAPSE

  override val selectedExpandIcon: Icon
    get() = CircleRightSelected
  override val selectedExpandIconPath: String
    get() = CIRCLE_EXPAND_SELECTED

  override val selectedCollapseIcon: Icon
    get() = CircleDownSelected
  override val selectedCollapseIconPath: String
    get() = CIRCLE_COLLAPSE_SELECTED

  override val bottomCollapseIcon: Icon
    get() = CircleUp
  override val bottomCollapseIconPath: String
    get() = CIRCLE_UNFOLD

  override val selectedBottomCollapseIcon: Icon
    get() = CircleUpSelected
  override val selectedBottomCollapseIconPath: String
    get() = CIRCLE_UNFOLD_SELECTED

  override val pathId: @NonNls String
    get() = "circle"
}

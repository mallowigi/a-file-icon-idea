/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015-2021 Elior "Mallowigi" Boukhobza
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
 *
 */
package com.mallowigi.actions.arrows

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.impl.ActionToolbarImpl
import com.mallowigi.actions.IconToggleAction
import com.mallowigi.config.AtomFileIconsConfig.Companion.instance
import com.mallowigi.tree.arrows.ArrowsStyles

/**
 * Abstract base class for arrows action
 */
abstract class MTAbstractArrowsAction : IconToggleAction() {
  /**
   * The [ArrowsStyles]
   */
  protected abstract val arrowsStyle: ArrowsStyles

  /**
   * Whether this menu is selected
   */
  override fun isSelected(e: AnActionEvent): Boolean = CONFIG.arrowsStyle === arrowsStyle

  /**
   * On selection, update all toolbars
   */
  override fun setSelected(e: AnActionEvent, state: Boolean) {
    CONFIG.arrowsStyle = this.arrowsStyle
    ActionToolbarImpl.updateAllToolbarsImmediately()

    CONFIG.fireChanged()
    super.setSelected(e, state)
  }

  companion object {
    private val CONFIG = instance
  }
}

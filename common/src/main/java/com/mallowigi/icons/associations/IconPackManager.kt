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

package com.mallowigi.icons.associations

import com.intellij.openapi.components.Service
import com.intellij.openapi.components.service
import com.mallowigi.config.AtomSettingsConfig

/** Icon pack manager. */
@Service(Service.Level.APP)
class IconPackManager {
  /** Whether the icon pack is enabled. */
  fun hasIconPack(iconPack: IconPack?): Boolean {
    return when (iconPack) {
      IconPack.DEFAULT -> return true
      IconPack.ANGULAR -> AtomSettingsConfig.instance.isUseAngularIcons
      IconPack.ANGULAR2 -> AtomSettingsConfig.instance.isUseAngular2Icons
      IconPack.NEST -> AtomSettingsConfig.instance.isUseNestIcons
      IconPack.REDUX -> AtomSettingsConfig.instance.isUseReduxIcons
      IconPack.NEXTJS -> AtomSettingsConfig.instance.isUseNextIcons
      IconPack.NGRX -> AtomSettingsConfig.instance.isUseNgRxIcons
      IconPack.RAILS -> AtomSettingsConfig.instance.isUseRailsIcons
      IconPack.RECOIL -> AtomSettingsConfig.instance.isUseRecoilIcons
      IconPack.TESTS -> AtomSettingsConfig.instance.isUseTestsIcons
      else -> return true
    }
  }

  companion object {
    /** Get the instance of the service. */
    val instance: IconPackManager by lazy { service() }
  }
}

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
package com.mallowigi.icons.associations

import com.intellij.util.xmlb.annotations.Property
import com.mallowigi.models.FileInfo
import java.io.Serializable

/**
 * Association
 *
 * @property name the name of the association
 * @property icon the icon
 * @property enabled whether the association is used
 * @property priority association priority. Lowest priorities are used last.
 */
abstract class Association internal constructor(
  @field:Property var name: String,
  @field:Property var icon: String,
  var enabled: Boolean = true,
  @field:Property var priority: Int,
) : Serializable {

  /**
   * How the association will be matched against (regex, type)
   */
  abstract var matcher: String

  /**
   * Verifies that the association is not empty
   */
  open val isEmpty: Boolean
    get() = name.isEmpty() || icon.isEmpty() || priority > 0

  /**
   * Check whether the file matches the association
   *
   * @param file file information
   * @return true if matches
   */
  abstract fun matches(file: FileInfo): Boolean

  /**
   * Apply changes to the association
   *
   * @param other the other assoc to apply from
   */
  open fun apply(other: Association) {
    name = other.name
    icon = other.icon
    enabled = other.enabled
    priority = other.priority
  }

  override fun toString(): String = "$name $matcher ($priority)"

  companion object {
    private const val serialVersionUID: Long = -1L
  }
}

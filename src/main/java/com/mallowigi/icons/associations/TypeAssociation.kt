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
import org.jetbrains.annotations.NonNls

/**
 * Type association
 *
 * @property type the type representation (Images, Database...)
 * @constructor
 *
 * @param name
 * @param icon
 * @param enabled
 * @param priority
 */
class TypeAssociation internal constructor(
  name: String = "",
  icon: String = "",
  enabled: Boolean = true,
  priority: Int = 100,
  @field:Property @field:NonNls var type: String,
) : Association(name, icon, enabled, priority) {

  /**
   * The matcher is the mime type
   */
  override var matcher: String
    get() = type
    set(matcher) {
      type = matcher
    }

  /**
   * Checks that the [Association] has all the required information
   */
  override val isEmpty: Boolean
    get() = super.isEmpty || type.isEmpty()

  /**
   * Matches againt the mime type
   *
   * @param file
   * @return true if it matches
   */
  override fun matches(file: FileInfo): Boolean = file.fileType == type

}

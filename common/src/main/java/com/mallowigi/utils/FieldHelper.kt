/**
 * ****************************************************************************
 * The MIT License (MIT)
 *
 * Copyright (c) 2015-2022 Elior "Mallowigi" Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR
 * ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * ****************************************************************************
 */
package com.mallowigi.utils

/** Helper for making fields final. */
//object FieldHelper {
//  private var MODIFIERS: VarHandle? = null
//
//  init {
//    try {
//      val lookup = MethodHandles.privateLookupIn(Field::class.java, MethodHandles.lookup())
//      MODIFIERS = lookup.findVarHandle(Field::class.java, "modifiers", Int::class.javaPrimitiveType)
//    } catch (ex: IllegalAccessException) {
//      throw RuntimeException(ex)
//    } catch (ex: NoSuchFieldException) {
//      throw RuntimeException(ex)
//    }
//  }
//
//  /** Make non final. */
//  fun makeNonFinal(field: Field) {
//    val mods = field.modifiers
//    if (Modifier.isFinal(mods)) {
//      (MODIFIERS ?: return).set(field, mods and Modifier.FINAL.inv())
//    }
//  }
//
//  /** Make final. */
//  fun makeFinal(field: Field) {
//    val mods = field.modifiers
//    if (!Modifier.isFinal(mods)) {
//      (MODIFIERS ?: return).set(field, mods and Modifier.FINAL)
//    }
//  }
//}
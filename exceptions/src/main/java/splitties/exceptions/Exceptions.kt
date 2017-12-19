/*
 * Copyright (c) 2017. Louis Cognault Ayeva Derman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package splitties.exceptions

import android.content.Intent

fun unexpectedValue(value: Any?): Nothing = throw IllegalStateException("Unexpected value: $value")

fun illegal(errorMessage: String? = null): Nothing = throw IllegalStateException(errorMessage)
fun illegalArg(errorMessage: String? = null): Nothing = throw IllegalArgumentException(errorMessage)

fun unsupported(errorMessage: String? = null): Nothing = throw UnsupportedOperationException(errorMessage)

fun unsupportedAction(intent: Intent): Nothing = unsupported("Unsupported action: ${intent.action}")
/*
 * Copyright (c) 2022 DuckDuckGo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duckduckgo.mobile.android.ui.view

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.duckduckgo.mobile.android.R
import com.duckduckgo.mobile.android.databinding.ViewSectionDividerBinding
import com.duckduckgo.mobile.android.ui.viewbinding.viewBinding

class SectionDivider @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = R.style.SectionDivider
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {
    init {
        viewBinding<ViewSectionDividerBinding>()
    }
}

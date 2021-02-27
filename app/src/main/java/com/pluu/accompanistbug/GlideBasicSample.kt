package com.pluu.accompanistbug

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.activity.compose.setContent
import androidx.compose.runtime.remember
import androidx.compose.ui.viewinterop.AndroidView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit

class GlideBasicSample : FragmentActivity() {
    private val containerViewId by lazy {
        View.generateViewId()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            // Not working, first vsync
            AccompanistSampleTheme {
                val contentView = remember {
                    FrameLayout(this).apply {
                        id = containerViewId
                        replaceMainContainer(SampleFragment.newInstance())
                    }
                }

                AndroidView({ contentView })
            }

            // Working
//            Sample()
        }
    }

    private fun replaceMainContainer(fragment: Fragment) {
        supportFragmentManager.commit {
            replace(containerViewId, fragment)
        }
    }
}

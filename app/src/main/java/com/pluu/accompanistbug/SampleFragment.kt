package com.pluu.accompanistbug

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

class SampleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = createContent {
        Sample()
    }

    companion object {
        fun newInstance() = SampleFragment()
    }
}

fun Fragment.createContent(
    content: @Composable () -> Unit
) = ComposeView(requireContext()).apply {
    layoutParams = LayoutParams(MATCH_PARENT, MATCH_PARENT)
    setContent(content)
}
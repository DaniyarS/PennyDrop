package dev.dslam.pennydrop.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.dslam.pennydrop.databinding.FragmentPickPlayersBinding
import dev.dslam.pennydrop.viewmodels.PickPlayersViewModel

class PickPlayersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val pickPlayersViewModel = PickPlayersViewModel()

        val binding = FragmentPickPlayersBinding.inflate(
            inflater,
            container,
            false)
        return binding.root
    }
}

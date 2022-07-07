package com.csanad.bettertimes.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.csanad.bettertimes.databinding.FragmentRemindersBinding

class RemindersFragment : Fragment() {
    lateinit var viewModel: RemindersViewModel
    private lateinit var _binding:FragmentRemindersBinding
    val binding:FragmentRemindersBinding get() {
        return _binding
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentRemindersBinding.inflate(inflater)
        viewModel=ViewModelProviders.of(this).get(RemindersViewModel::class.java)
        binding.remindersList.adapter=viewModel.adapter
        return binding.root
    }
}
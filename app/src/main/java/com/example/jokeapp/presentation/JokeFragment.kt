package com.example.jokeapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.jokeapp.databinding.JokeFragmentBinding

class JokeFragment: Fragment() {

    private lateinit var viewModel: JokeViewModel

    private var _binding: JokeFragmentBinding? = null
    private val binding: JokeFragmentBinding
        get() = _binding ?: throw RuntimeException("JokeFragmentBinding is null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[JokeViewModel::class.java]
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = JokeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGenerateJoke.setOnClickListener {
            binding.tvJoke.text = "text"

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
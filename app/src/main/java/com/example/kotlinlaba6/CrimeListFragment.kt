package com.example.kotlinlaba6

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

private const val TAG = "CrimeListFragment"
class CrimeListFragment : Fragment() {

    //private val crimeListViewModel: CrimeListViewModel by lazy {ViewModelProviders.of(this).get(CrimeListViewModel::class.java)}
    private lateinit var crimeListViewModel: CrimeListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        crimeListViewModel = ViewModelProvider(this).get(CrimeListViewModel::class.java)

        Log.d(TAG, "Total crimes: ${crimeListViewModel.crimes.size}")
    }

    companion object {
        fun newInstance(): CrimeListFragment {
            return CrimeListFragment()
        }
    }
}

package presentation.viewModel

import androidx.lifecycle.ViewModel
import data.repository.MyRepository

class MyViewModel(
    private val myRepository: MyRepository
) : ViewModel() {

    fun getHelloWorldString(): String {
        return myRepository.helloWorld()
    }
}
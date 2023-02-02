package com.example.giniappsandroidcodetask.domain.entities

class NumberStatesHolder(private val numbers: Numbers) {

    fun getNumberStates(): List<NumberState> {
        val result = mutableListOf<NumberState>()
        val lastIndex = numbers.content.lastIndex
        val content = numbers.content
        val addedIndexes = mutableSetOf<Int>()

        for (firstIndex in 0 until lastIndex) {
            for (secondIndex in (firstIndex + 1)..lastIndex) {
                if ((content[firstIndex].value + content[secondIndex].value) == 0) {
                    addedIndexes.add(firstIndex)
                    addedIndexes.add(secondIndex)
                }
            }
        }

        content.forEachIndexed { index, number ->
            val isSpecial = index in addedIndexes
            result.add(NumberState(number = number.value, isSpecial = isSpecial))
        }

        return result.sortedBy { it.number }
    }
}
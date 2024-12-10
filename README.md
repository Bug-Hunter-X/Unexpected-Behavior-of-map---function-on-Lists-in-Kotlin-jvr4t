This repository demonstrates an unexpected behavior of the `map()` function in Kotlin when applied to lists. The `map()` function in Kotlin, unlike some other languages, returns a *new* list containing the transformed elements, rather than modifying the original list in-place. This can lead to errors if one expects the original list to be altered. 

The `bug.kt` file showcases the unexpected behavior, while `bugSolution.kt` provides a solution demonstrating how to achieve the desired in-place modification (though it is generally not recommended, prefer immutability).
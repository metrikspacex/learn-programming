cmake_minimum_required(VERSION 3.0.0)
project(learn-programming VERSION 0.1.0 LANGUAGES C)

include(CTest)
enable_testing()

add_subdirectory("src/c/course")
add_subdirectory("src/c/hackerrank")
add_subdirectory("src/c/leetcode")

set(CPACK_PROJECT_NAME ${PROJECT_NAME})
set(CPACK_PROJECT_VERSION ${PROJECT_VERSION})
include(CPack)

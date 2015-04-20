#LevelDBOnAndroid

This is the sample for using LevelDB on android

The first this project needs to know java, java ndk, android, jni

Because LevelDB is implemented by C++ Language, android needs Jni 
to call LevelDB function.

This project code referenced the:
https://github.com/google/leveldb
https://github.com/googolmo/Leveldb-Android

Before using LevelDB, it needs to write leveldbjni.cc to call LevelDB.
Then ndk-build to compiler leveldbjni.so.
Then write the java to load leveldbjni.so and 
call the funtion in leveldbjni.cc to call LevelDB.

before ndk-build, this project needs to check liveldbjni.cc whether the file path is correct.

This project structure likes:

Mainactivity -> LevelDB.java -> leveldbjni.cc -> LevelDB
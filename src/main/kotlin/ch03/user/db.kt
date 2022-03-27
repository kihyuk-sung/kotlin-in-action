package ch03.user

fun saveUser(user: User) {
    user.validateBeforeSave()
    // save user into database
}

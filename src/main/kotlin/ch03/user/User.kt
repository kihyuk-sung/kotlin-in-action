package ch03.user

class User(
    val id: Int,
    val name: String,
    val address: String,
)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${this.id}: empty $fieldName"
            )
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

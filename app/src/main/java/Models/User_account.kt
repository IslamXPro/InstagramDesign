package Models

class User_account {
    var image:Int? = null
    var name:String? = null

    constructor(image: Int?, name: String?) {
        this.image = image
        this.name = name
    }

    constructor(image: Int?) {
        this.image = image
    }

}
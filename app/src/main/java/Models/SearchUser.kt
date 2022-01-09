package Models

class SearchUser {
    var image:Int? = null
    var name:String? = null
    var smname:String? = null

    constructor(image: Int?, name: String?, smname: String?) {
        this.image = image
        this.name = name
        this.smname = smname
    }
}
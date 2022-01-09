package Models

class MainUser {
    var thisImage:Int? = null
    var thisName:String? = null
    var thisPlace:String? = null
    var thisMainImage:Int? = null
    var thisImage1:Int? = null

    constructor(
        thisImage: Int?,
        thisName: String?,
        thisPlace: String?,
        thisMainImage: Int?,
        thisImage1: Int?,
    ) {
        this.thisImage = thisImage
        this.thisName = thisName
        this.thisPlace = thisPlace
        this.thisMainImage = thisMainImage
        this.thisImage1 = thisImage1
    }
}
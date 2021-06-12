package com.jamshidbek.programminglanguages

class Model{
    var name:String = ""
    var image:String = ""
    var desc:String = ""

    constructor(title: String, image: String, desc:String) {
        this.name = title
        this.image = image
        this.desc = desc
    }

    constructor()
}
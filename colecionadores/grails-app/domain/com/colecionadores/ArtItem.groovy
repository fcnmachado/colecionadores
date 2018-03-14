package com.colecionadores

import colecionadores.Image
import colecionadores.Material

class ArtItem implements Serializable {

    String name
    String itemId
    String author
    Integer year
    Date dateCreated = new Date()


    static belongsTo = [User]

    static hasMany = [materials: Material, images: Image]

    static constraints = {
        name nullable: false
        itemId unique: true
    }
}

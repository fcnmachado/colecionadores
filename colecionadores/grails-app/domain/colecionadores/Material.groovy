package colecionadores

class Material implements Serializable{

    String name

    static constraints = {
        name nullable: false, unique: true
    }
}

package colecionadores

class Image implements Serializable{

    String name
    String url
    boolean main = false

    static constraints = {
        url nullable: false
    }
}

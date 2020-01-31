class myGlobals implements Serializable {

    Map configuration = [:]

    void setValue(String property, value) {
        configuration[property] = value
    }

    def getValue(String property) {
        return configuration.get(property)
    }
}
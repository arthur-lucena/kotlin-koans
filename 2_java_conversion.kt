fun toJSON(collection: Collection<Int>): String {
    var sb = StringBuilder()
    sb.append("[")
    var it = collection.iterator()
    
    while (it.hasNext()) {
        el = it.next()
        sb.append(el)
        
        if (it.hasNext()) {
            sb.append(", ")
        }
    }
    
    sb.append("]")
    return sb.toString()
}

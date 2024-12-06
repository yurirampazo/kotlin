fun main() {
  val str : String? = null

  if (!str.isNullOrEmpty()) {
    str.lowercase()
    str.length
  }

  str?.let {
    it.length
    it.lowercase()
  }

}
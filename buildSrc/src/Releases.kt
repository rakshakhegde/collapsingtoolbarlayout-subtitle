const val RELEASE_USER = "hendraanggrian"
const val RELEASE_ARTIFACT = "collapsingtoolbarlayout-subtitle"
val RELEASE_GROUP = "com.$RELEASE_USER.${RELEASE_ARTIFACT.substringBefore('-')}"
const val RELEASE_DESC = "Standard CollapsingToolbarLayout with subtitle support"
const val RELEASE_WEBSITE = "https://github.com/$RELEASE_USER/$RELEASE_ARTIFACT"

val bintrayUserEnv = System.getenv("BINTRAY_USER")
val bintrayKeyEnv = System.getenv("BINTRAY_KEY")
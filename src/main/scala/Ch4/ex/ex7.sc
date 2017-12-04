import scala.collection.JavaConverters.propertiesAsScalaMap

val props = propertiesAsScalaMap(java.lang.System.getProperties)

val maxLen = props.keys.map(_.length).max

for( (k,v) <- props ) printf("%-" + maxLen + "s | %s\n", k, v)
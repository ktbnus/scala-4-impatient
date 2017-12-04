val gadgets = Map("IPhone" -> 100, "Android" -> 90, "Mp3" ->50)

val discount = for((k,v) <- gadgets) yield (k, v*0.9)
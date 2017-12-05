package Ch6

abstract class UndoableAction (val description : String ){
  def undo() : Unit
  def redo() : Unit
}

object DoNothingAction extends UndoableAction("Do Nothing") {
  override def redo(): Unit = {}

  override def undo(): Unit = {}
}

object MainAction extends App {
  val actions = Map("Open" -> DoNothingAction, "Save" -> DoNothingAction)
}

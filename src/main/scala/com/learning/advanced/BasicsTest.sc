import java.io.FileInputStream
import java.util.Properties

object ScalaApplyMethod_04 extends App{
  private val prop = new Properties()
  prop.load(new FileInputStream("src\\main\\scala\\com\\nielsen\\basics\\config.properties"))
  def apply(s:String) = prop.getProperty(s)
}


ScalaApplyMethod_04("dbuser")
ScalaApplyMethod_04("database")
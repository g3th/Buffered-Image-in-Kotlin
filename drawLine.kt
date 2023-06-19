import javax.imageio.ImageIO
import java.io.File
import java.awt.Color
import java.awt.image.BufferedImage  

fun drawLines(w: Int, h: Int): BufferedImage {
    // Add your code here
    val image = BufferedImage(w, h, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()
    graphics.color = Color.RED
    graphics.drawLine(0, 0, 200, 200)
    graphics.color = Color.GREEN    
    graphics.drawLine(200, 0, 0, 200)
    return image
}

fun main(){
	val dir = System.getProperty("user.home")
    val writeImageToFile = File("${dir}/myimage.png")
    ImageIO.write(drawLines(200,200), "png", writeImageToFile)
}

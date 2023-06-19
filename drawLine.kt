import javax.imageio.ImageIO
import java.io.File
import java.awt.Color
import java.awt.image.BufferedImage  

fun drawLines(w: Int, h: Int): BufferedImage {
    val image = BufferedImage(w, h, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()
    graphics.color = Color.RED
    graphics.drawLine(0, 0, 200, 200)
    graphics.color = Color.GREEN    
    graphics.drawLine(200, 0, 0, 200)
    return image
}

fun drawPolygon(w: Int, h: Int): BufferedImage{
    val image = BufferedImage(w, h, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()
    graphics.color = Color.YELLOW
    graphics.drawPolygon(intArrayOf(50, 100, 200, 250, 200, 100), intArrayOf(150, 250, 250, 150, 50, 50), 6)
    return image
}

fun main(){
    val dir = System.getProperty("user.home")
    val writeImageToFile = File("${dir}/myimage.png")
    ImageIO.write(drawPolygon(300,300), "png", writeImageToFile)
}

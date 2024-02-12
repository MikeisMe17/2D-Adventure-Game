package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Orb extends SuperObject
{
    public OBJ_Orb()
    {
        name = "Orb";
        try
        {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/orb.png"));
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

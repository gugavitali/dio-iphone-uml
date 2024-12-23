import com.apple.model.classes.Iphone;
import com.apple.model.classes.IphoneAbstrato;

public class Main {

    public static void main(String[] args) {

        IphoneAbstrato i16 = new Iphone("16.0.1", "Vermelho");

        i16.heyBixbi();
        i16.tocarMusica();


    }
}

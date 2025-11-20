package pixel.academy.antrenor.common;

import org.springframework.stereotype.Component;

@Component
public class AntrenorBasket implements Antrenor{
    @Override
    public String efectueazaAntrenament() {
        return "Incepem antrenamentul de basket";
    }

    @Override
    public String tipAntrenament() {
        return "Aruncarea mingii la cos";
    }
}

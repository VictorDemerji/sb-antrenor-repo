package pixel.academy.antrenor.common;

import org.springframework.stereotype.Component;

@Component
public class AntrenorFotbal implements Antrenor{
    @Override
    public String efectueazaAntrenament() {
        return "Incepem antrenamentul de fotbal";
    }

    @Override
    public String tipAntrenament() {
        return "Posesia mingii";
    }
}

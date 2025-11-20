package pixel.academy.antrenor.common;

import org.springframework.stereotype.Component;

@Component
public class AntrenorVolei implements Antrenor{
    @Override
    public String efectueazaAntrenament() {
        return "Incepem antrenamentul de volei";
    }

    @Override
    public String tipAntrenament() {
        return "Servirea peste plasa";
    }
}

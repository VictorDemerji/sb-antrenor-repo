package pixel.academy.antrenor.common;

import org.springframework.stereotype.Component;

@Component
public class AntrenotInot implements Antrenor{
    @Override
    public String efectueazaAntrenament() {
        return "Incepem antenamentul de inot";
    }

    @Override
    public String tipAntrenament() {
        return "Inotarea a 50 de bazine";
    }
}

package pixel.academy.antrenor.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pixel.academy.antrenor.common.Antrenor;
import pixel.academy.antrenor.common.AntrenorFotbal;

@RestController
public class DemoController {

    private Antrenor myAntrenor;

    @Autowired
    public DemoController(@Qualifier("antrenorFotbal")Antrenor theAntrenor) {
        myAntrenor = theAntrenor;
    }

    @GetMapping("/antrenament")
    public String efectueazaAntrenament() {
        return myAntrenor.efectueazaAntrenament();
    }

    @GetMapping("/tipantrenament")
    public String tipAntrenament() {
        return myAntrenor.tipAntrenament();
    }
}

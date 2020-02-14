package br.com.ferrosul.api.banco.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiBancoController {

@RequestMapping (
        value = "/ex/foos",
        method = RequestMethod.GET
)
@ResponseBody
public String getFoosBySimplePath() {
    return "Get some Foos";
}

}

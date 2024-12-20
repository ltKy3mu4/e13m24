package ru.mpei.l20.chainOfResp;

import java.util.List;

public class Validator {

    private List<IValidator> validators = List.of(
            new NullStringValidator(),
            new SpecialSymbolsValidator()
    );

    public boolean validate(String s){
        for (IValidator validator : validators) {
            boolean check = validator.check(s);
            if (! check){
                return false;
            }
        }
        return true;
    }

}

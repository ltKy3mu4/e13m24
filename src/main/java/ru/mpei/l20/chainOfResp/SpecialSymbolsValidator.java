package ru.mpei.l20.chainOfResp;

public class SpecialSymbolsValidator implements IValidator{
    @Override
    public boolean check(String s) {
        if (s.split("!-!").length < 2){
            return false;
        } else {
            return true;
        }
    }
}

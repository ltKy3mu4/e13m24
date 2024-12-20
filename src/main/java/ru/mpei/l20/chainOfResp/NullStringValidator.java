package ru.mpei.l20.chainOfResp;

public class NullStringValidator implements IValidator{
    @Override
    public boolean check(String s) {
        return s != null && !s.isEmpty();
    }
}

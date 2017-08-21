package model;

import java.util.ArrayList;

public enum DispositivoEnum {
    DESKTOP, NOTEBOOK, TABLET, SMARTPHONE;
    
    public static ArrayList<DispositivoEnum> getDispositivoEnumList() {
        ArrayList<DispositivoEnum> dispositivoEnumList = new ArrayList<DispositivoEnum>();
        dispositivoEnumList.add(DispositivoEnum.DESKTOP);
        dispositivoEnumList.add(DispositivoEnum.NOTEBOOK);
        dispositivoEnumList.add(DispositivoEnum.TABLET);
        dispositivoEnumList.add(DispositivoEnum.SMARTPHONE);
        return dispositivoEnumList;
    }
}
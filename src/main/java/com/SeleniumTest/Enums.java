package com.SeleniumTest;

public enum Enums {
    DASHBOARD("Dashboard"),
    SOLICITUDEXCLUSIONES("Solicitudexclusiones"),
    PORTAFOLIOS("Portafolios"),
    PROYECTOS("Proyectos"),
    AREA("Área"),
    PERFIL("Perfil"),
    USUARIO("Usuario"),
    LENGUAJE("Lenguaje"),
    REGLA("Regla");

    private final String value;

    Enums(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

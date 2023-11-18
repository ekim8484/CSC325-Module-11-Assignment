// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
interface Plug {
    void fit();
}

class AmericanPlug implements Plug {
    @Override
    public void fit() {
        System.out.println("Fitting American plug.");
    }
}

interface Socket {
    void charge();
}

class EuropeanSocket implements Socket {
    @Override
    public void charge() {
        System.out.println("Charging with European socket.");
    }
}

class Adapter implements Plug {
    private AmericanPlug APlug;

    public Adapter(AmericanPlug APlug) {
        this.APlug = APlug;
    }

    @Override
    public void fit() {
        System.out.println("Fitting American plug with European adapter.");
        APlug.fit();
    }
}
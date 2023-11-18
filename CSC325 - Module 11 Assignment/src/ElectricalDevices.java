public class ElectricalDevices {
    public static void main(String[] args) {
        // Create AmericanPlug and EuropeanSocket objects
        AmericanPlug APlug = new AmericanPlug();
        EuropeanSocket ESocket = new EuropeanSocket();

        // Fit APlug into the ESocket
        APlug.fit();
        ESocket.charge();

        // Use adapter to make APlug compatible with the ESocket
        Adapter adapter = new Adapter(APlug);
        adapter.fit();
        ESocket.charge();
    }
}

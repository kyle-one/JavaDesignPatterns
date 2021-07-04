    package designpatterns.abstractfactory2;

    public interface AbstractFactory {
        public AbstractTV createTV();
        public AbstractFridge createFridge();
        public AbstractAircon createAircon();
    }

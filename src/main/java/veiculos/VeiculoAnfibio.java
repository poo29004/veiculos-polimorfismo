package veiculos;

public interface VeiculoAnfibio extends VeiculoTerrestre, VeiculoMarinho {

    boolean recolherRodas();

    boolean abrirRodas();

}
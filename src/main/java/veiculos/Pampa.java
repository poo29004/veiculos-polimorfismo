package veiculos;

public class Pampa extends Veiculo implements TracaoIntegral {

    private boolean cacambaFechada;
    private boolean tracaoIntegral;

    public Pampa(String n) {
        super(n);
        cacambaFechada = true;
        tracaoIntegral = false;
    }

    @Override
    public boolean ativarDesativarTracao() {
        tracaoIntegral = !tracaoIntegral;
        System.out.println("Tração integral da pampa: " + nome + " está : "+ tracaoIntegral);
        return tracaoIntegral;
    }

    @Override
    public void frear(int i) {
        System.out.println("Pampa "+ nome +" freando com intensidade " + i);
    }

    @Override
    public void acelerar(int i) {
        System.out.println("Pampa "+ nome+" acelerando com intensidade " + i);
    }

    public boolean abrirCacamba(){
        if (cacambaFechada){
            System.out.println("Abrindo caçamba da pampa "+ nome);
            cacambaFechada = false;
            return  true;
        }
        System.out.println("Caçamba já estava aberta da pampa "+ nome);
        return false;
    }


}
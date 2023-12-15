package EX02_preFACTORY_METHOD;

public class Veiculo {
        protected String marca;
        protected String modelo;
        private int anoFabrico;
        private int potencia;
        private int cilindrada;
        protected TipodeCombustivel tipodeCombustivel;
        private double consumo;


        public Veiculo(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipodeCombustivel tipodeCombustivel, double consumo) {
            this.marca = marca;
            this.modelo = modelo;
            this.anoFabrico = anoFabrico;
            this.potencia = potencia;
            this.cilindrada = cilindrada;
            this.tipodeCombustivel = tipodeCombustivel;
            this.consumo = consumo;
        }

        public TipodeCombustivel getTipodeCombustivel() {
            return tipodeCombustivel;
        }

        public double getConsumo() {
            return consumo;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void ligar() {
            if (2023-this.anoFabrico > 30){
                if (this.tipodeCombustivel == TipodeCombustivel.DIESEL) {
                    System.out.println("“Deita um pouco de fumo… Custa a pegar… O carro está ligado!”\nVrum-vrum-vrum");
                }else{
                    System.out.println("“Custa a pegar… O carro está ligado!”\nVrum-vrum-vrum”");
                }
            }

            if (2023-this.anoFabrico <= 30){
                if (this.potencia < 250) {
                    System.out.println("“O carro está ligado!”\nVruummmmmmm”");
                }else{
                    System.out.println("“O carro está ligado!VRUUMMMMMM");
                }
            }
        }

        public Veiculo corrida(Veiculo veiculoAdversario) {
            if (this.potencia > veiculoAdversario.potencia) {
                return this;}
            if (this.potencia < veiculoAdversario.potencia) {
                return veiculoAdversario;
            }else{
                if (this.cilindrada > veiculoAdversario.cilindrada){
                    return this;}
                if (this.cilindrada < veiculoAdversario.cilindrada){
                    return veiculoAdversario;
                }else{
                    if (this.anoFabrico > veiculoAdversario.anoFabrico){
                        return this;}
                    if (this.anoFabrico < veiculoAdversario.anoFabrico){
                        return veiculoAdversario;}
                    else{
                        return null;
                    }
                }
            }
        }

        public double combustivelConsumido(double distancia){

            //100km ----- this.litros
            //distancia (parametro)------ return x litros
            //x = (453x6) / 100 litros

            double litrosConsumidos;
            litrosConsumidos = (distancia*this.consumo)/100;
            return litrosConsumidos;
        }

        public void exibirDetalhes(){
            System.out.println(this.marca);
            System.out.println(this.modelo);
            System.out.println("Ano: "+this.anoFabrico);
            System.out.println("Potencia: "+ this.potencia+ " cv.");
            System.out.println("Cilindrada: "+this.cilindrada+" cc.");
        }

}

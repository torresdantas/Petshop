public class MaquinaBanho{
    private int agua;
    private int shampoo;
    private Pet pet;
    private boolean mClear;

    public MaquinaBanho(){
        this.agua = 30;
        this.shampoo = 10;
        this.mClear = true;
    }

    public boolean temPet(){
        return pet != null;
    }

    public void adicionarPet(Pet pet){
        if(!this.mClear){
            System.out.println("A maquina está suja!");
            return;
        }
        if(temPet()){
            System.out.println("A maquina está ocupada!");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getNome() + " foi colocado na maquina!");
    }

    public void darBanho(){
        if(this.pet == null){
            System.out.println("Maquina vazia!");
            return;
        }
        if(this.agua < 30 || shampoo < 10){
            System.out.println("Água ou shampoo insuficientes!");
            return;
        }
        this.agua -= 10;
        this.shampoo -= 2;
        pet.setLimpo(true);
        System.out.println("O pet " + pet.getNome() + " está limpo!");
    }
    public void removerPet(){
        if(this.pet == null){
            System.out.println("A maquina está vazia!");
            return;
        }
        this.mClear = pet.isLimpo();
        if(!mClear){
            System.out.println("O pet saiu sujo, a maquina precisa ser limpa!");
        }
        this.pet = null;
    }
    public void limparMaquina(){
        if(agua < 30 || shampoo < 10){
            System.out.println("Água ou shampoo insuficientes!");
            return;
        }
        this.agua -= 3;
        this.shampoo -= 1;
        this.mClear = true;
        System.out.println("A limpeza da maquina foi feita!");
    }

    public void addAgua(){
        if(this.agua >= 30){
            System.out.println("Água: cheio");
            return;
        }
        agua += 2;
        System.out.println("Água abastecida. Nível atual: " + agua + " litros.");
    }
    public void addShampoo(){
        if(this.shampoo >= 10){
            System.out.println("Shampoo: cheio");
            return;
        }
        shampoo += 2;
        System.out.println("Shampoo abastecida. Nível atual: " + shampoo + " litros.");
    }
    public int getAgua(){
        return agua;
    }
    public int getShampoo(){
        return shampoo;
    }
}
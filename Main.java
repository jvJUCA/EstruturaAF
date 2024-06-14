public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Árvore em ordem crescente: ");
        tree.inorder();
        System.out.println();

        // Realizando pesquisa eficiente na árvore
        int keyToSearch = 40;
        if (tree.search(keyToSearch)) {
            System.out.println("Chave " + keyToSearch + " encontrada na árvore.");
        } else {
            System.out.println("Chave " + keyToSearch + " não encontrada na árvore.");
        }
    }
    
}


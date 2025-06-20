public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        int[] values = {10, 5, 15, 3, 7, 12, 18};
        for (int val : values) tree.insert(val);

        System.out.println("In-ordem:");
        tree.printInOrder();

        System.out.println("Pré-ordem:");
        tree.printPreOrder();

        System.out.println("Pós-ordem:");
        tree.printPostOrder();

        System.out.println("Nível da árvore: " + tree.level());

        int testNode = 5;
        System.out.println("Grau do nó " + testNode + ": " + tree.degree(testNode));

        int searchValue = 12;
        System.out.println("Pesquisa de " + searchValue + ": " + (tree.search(searchValue) ? "encontrado" : "não encontrado"));

        System.out.println("É estritamente binária? " + tree.isStrictlyBinary());
        System.out.println("É completa? " + tree.isCompleteBinary());
        System.out.println("É cheia? " + tree.isFullBinary());

        System.out.println("\nRemovendo nó 10...");
        tree.remove(10);
        System.out.println("Nova in-ordem:");
        tree.printInOrder();
    }
}

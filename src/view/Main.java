package view;

import javax.swing.JOptionPane;
import controller.*;

public class Main {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a posição " + i + ": "));
        }

        System.out.print("Vetor antes da ordenação: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();

        Metodos ordenacao = new Metodos();
        ordenacao.mergeSort(vetor, 0, vetor.length - 1);

        System.out.print("Vetor ordenado: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
/**
 * Calculadora de Resistores
 * Creado por: Donayi Azucena Moncayo García
 * Proyecto educativo para la materia Instrumentación y Control
 * Profesora: María del Rosario Rocha Bernabé
 * Escuela Superior de Cómputo
 * Año: 2025
 */

package com.mycompany.calculadoraresistores;

import javax.swing.SwingUtilities;

public class CalculadoraResistores {

    public static void main(String[] args) {
        // Asegurar que la GUI se ejecute en el hilo de eventos de Swing
        SwingUtilities.invokeLater(() -> {
            ProgramaResistivos ventana = new ProgramaResistivos(); // Crear instancia del JFrame
            ventana.setVisible(true); // Mostrar la ventana
        });
    }
}

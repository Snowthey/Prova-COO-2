import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

public class Grafico {
    static void plotarGrafico(int[] numDiscos, long[] numOperacoes) {
        XYSeries series = new XYSeries("Complexidade da Torre de Hanoi");
        for (int i = 0; i < numDiscos.length; i++) {
            series.add(numDiscos[i], numOperacoes[i]);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Complexidade da Torre de Hanoi",
                "Número de discos",
                "Número de operações",
                dataset
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));

        JFrame frame = new JFrame("Gráfico da Complexidade");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}

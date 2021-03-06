/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestChart;
import javax.swing.JFrame;


import org.jfree.chart.ChartFactory;


import org.jfree.chart.ChartPanel;


import org.jfree.chart.JFreeChart;


import org.jfree.chart.plot.PlotOrientation;


import org.jfree.data.category.DefaultCategoryDataset;




/**


 *


 * @author TUNGDUONG


 */


public class LineChartMain {


    


    private static DefaultCategoryDataset createDataset() {


        DefaultCategoryDataset dataset = new DefaultCategoryDataset();


        dataset.addValue(5.37, "GDP", "2010");


        dataset.addValue(6.78, "GDP", "2011");


        dataset.addValue(5.89, "GDP", "2012");


        dataset.addValue(5.03, "GDP", "2013");


        dataset.addValue(8.92, "GDP", "2014");


        dataset.addValue(3.66, "GDP", "2015");


        dataset.addValue(7.74, "GDP", "2016");


        return dataset;


    }


    


    public static JFreeChart createLineChart() {


        JFreeChart lineChart = ChartFactory.createLineChart(


                "Biểu đồ tăng tưởng kinh tế của Việt Nam".toUpperCase(),


                "Năm", "GDP (%)", createDataset(),


                PlotOrientation.VERTICAL, false, false, false);


        return lineChart;


    }


    


    public static void main(String[] args) {


        ChartPanel chartPanel = new ChartPanel(createLineChart());


        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));


        JFrame frame = new JFrame();


        frame.add(chartPanel);


        frame.setSize(560, 367);


        frame.setLocationRelativeTo(null);


        frame.setResizable(false);


        frame.setVisible(true);


    }


    


}

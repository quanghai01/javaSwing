/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestChart;

import BanHang.BanHang;
import BanHang.ListBanHang;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class BarChart {
    ListBanHang listBh=new ListBanHang();
    public static JFreeChart createChart(){
        JFreeChart barChart=ChartFactory.createBarChart(
                "BIỂU ĐỒ DOANH THU HÃNG ĐIỆN THOẠI", "Hãng", "Số Lượng",
                createDataset(), PlotOrientation.VERTICAL,true, true, true);
        return barChart;
    }

    public static CategoryDataset createDataset() {
        ListBanHang listBh=new ListBanHang();
        final DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        for(BanHang bh:listBh.getAllBanHang()){
            dataset.addValue(bh.getSoluong(), "Số Lượng", bh.getTen());
            
        }
        return dataset;
    }
    public static void main(String[] args) {
        ChartPanel chartPanel = new ChartPanel(createChart());
        chartPanel.setPreferredSize(new java.awt.Dimension(400,400));
        JFrame frame =new JFrame();
        frame.add(chartPanel);
        frame.setTitle("Biểu đồ thống kê");
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}

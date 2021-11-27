
package TestChart;

import BanHang.BanHang;
import BanHang.ListBanHang;
import DienThoaiModel.DienThoai;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class TestPieChart {


    public static PieDataset createDataset() {
        ListBanHang listBh=new ListBanHang();
        long sam=0,xiao=0,real=0,app=0,vs=0;
        for(BanHang bh:listBh.getAllBanHang()){
            if(bh.getTen().equals("SamSung"))
                sam+=bh.getThu();
            if(bh.getTen().equals("Apple"))
                app+=bh.getThu();
            if(bh.getTen().equals("Realme"))
                real+=bh.getThu();
            if(bh.getTen().equals("Xiaome"))
                xiao+=bh.getThu();
            if(bh.getTen().equals("Vsmart"))
                vs+=bh.getThu();
        }
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("SamSung", sam);
        dataset.setValue("Apple", app);
        dataset.setValue("Realme", real);
        dataset.setValue("Xiaome", xiao);
        dataset.setValue("Vsmart", vs);
        return dataset;
    }

    public static void main(String[] args) {
        
        
        ChartPanel chartPanel = new ChartPanel(createPieChart());
        JFrame frame = new JFrame();
        frame.add(chartPanel);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static JFreeChart createPieChart() {
        JFreeChart chart = ChartFactory.createPieChart(
                "Biểu đồ thống kê doanh thu", createDataset(), true, true, true);
        return chart;
    
    }

}

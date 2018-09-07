
package ACO;
import static ACO.Vms.vl;
import static ACO.Vms.vm1;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.DatacenterCharacteristics;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.Storage;
import org.cloudbus.cloudsim.VmAllocationPolicySimple;
import org.cloudbus.cloudsim.VmSchedulerSpaceShared;
import org.cloudbus.cloudsim.core.CloudSim;
//import static org.cloudbus.cloudsim.examples.Data.h;
//import static org.cloudbus.cloudsim.examples.Data.k;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple;

/**
 *
 * @author user
 */
public class DataCenter_Brokers extends javax.swing.JFrame {

    /** Creates new form Data */
    public static Datacenter[] dataCenter;
    public static int nofDatacenter,nofBrokers;
    String str;
    public static String dcName,bName;
    public static ArrayList details =new ArrayList();
  
    public static DatacenterBroker[] bId;
    public static ArrayList bid = new ArrayList();
    public static ArrayList did = new ArrayList();
    public static ArrayList hid = new ArrayList();
    public static Host h;
    public static List<Host> hostList = new ArrayList<Host>();
    public static ArrayList k=new ArrayList();
    public static ArrayList hl=new ArrayList();
   public static ArrayList  hla=new ArrayList();
   public static double time_zone; 
    public DataCenter_Brokers() 
    {
        initComponents();
        CloudSim.init(5, Calendar.getInstance(), false);
        seticon();
//        JOptionPane.showMessageDialog(this, "Started....");
    }
     public void seticon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/sim.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Cloud_Environment_Creation");
        setMinimumSize(new java.awt.Dimension(844, 500));
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("NSimSun", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cloud Environment Creation");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 10, 490, 31);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data_Center", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 270, 420, 280);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Broker_Creation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(460, 270, 430, 280);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel2.setToolTipText("Config");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Data Creation");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Broker Creation");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(290, 70, 340, 130);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/data-center-concept.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-100, 0, 440, 300);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/subscribe-icon.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(670, 70, 260, 220);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Broker Creation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(480, 220, 130, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Data Creation");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(300, 220, 120, 30);

        jButton3.setText("Proceed");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(800, 570, 73, 23);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(450, 220, 10, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try
{
        // TODO add your handling code here:
        str= JOptionPane.showInputDialog(this,"Enter Number Of Data Center Brokers");
        nofBrokers=Integer.parseInt(str);
        jTextField2.setText(nofBrokers+" ");
        DatacenterBroker broker;
        bId=new DatacenterBroker[nofBrokers];
        int brokerId;
        String brokerName;
        jTextArea2.append("DatacenterBroker"+"\tBroker Id\n\n");
        jTextArea2.append("===============================================\n\n");
        for(int i=0;i<nofBrokers;i++)
        {
            bName="Broker_"+i;            
            broker=createBroker();
            bId[i]=broker;
            brokerId=broker.getId();
            bid.add(brokerId);
            brokerName=broker.getName();
            jTextArea2.append(brokerName+"\t\t"+brokerId+" "+"\n\n");
//            System.out.println("id : "+brokerId+" name : "+brokerName);
        }
        JOptionPane.showMessageDialog(null,nofBrokers+ " created successfully");
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(this, "Please Enter Only number");
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try
    
{
        str= JOptionPane.showInputDialog(this,"Enter Number Of Data Centers");
        nofDatacenter=Integer.parseInt(str);
        
        jTextField1.setText(nofDatacenter+" ");
        dataCenter=new Datacenter[nofDatacenter];
        	
        
//        System.out.println("dcname"+"\t"+"No of machines"+"\t"+"host id"+" \t"+"no. pes"+"\t"+"ram\t"+"\t"+"bw\n\n");
        
        for(int i=0;i<nofDatacenter;i++)
        {
            
            dcName="Datacenter_"+i;
            dataCenter[i]=createDatacenter("Datacenter_"+i);                        
            did.add("Datacenter_"+i);
            
        }
        JOptionPane.showMessageDialog(null,nofDatacenter+" Data centers created");
        jTextArea1.append("DC_Name"+"\t"+"No_of_m"+"\t"+"Host id"+" \t"+"No. PEs"+"\t"+"RAM"+"\t"+"Band_W\n\n");
        jTextArea1.append("=======================================================================================\n\n");
        for(int i=0;i<details.size();i++)
        {
            
                hid.add(details.get(i).toString());
            
            jTextArea1.append(details.get(i).toString()+"\n");
        }
//        for(int m=0;m<k.size();m++)
//        {
//            System.out.println(k.get(m).toString()+"\n");
//        }
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(this, "Please Enter only Number");
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      Vms v=new Vms();
        v.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private static Datacenter createDatacenter(String name){
		
			
		List<Pe> peList = new ArrayList<Pe>();
                //NO. of pes
                Random r=new Random();
                int nMip,nPe;                
                int mips;
                do
                {
                    nPe=r.nextInt(5);
                }
                while(nPe<1);
                
                for(int i=0;i<nPe;i++)
                {
                    do
                    {
                        
                        nMip=r.nextInt(2000);
                    }
                    while(nMip<300);
                    mips=nMip;
                    peList.add(new Pe(i, new PeProvisionerSimple(mips)));
                }		
                //No. of machines
                int nMachines;
                do
                {
                    nMachines=r.nextInt(5);
                }
                   while(nMachines<2);
                int[] rams={4096,4096};
                int[] bws={25000,25000,250000,25000};
                int nRam,hostId,ram,bw,nBw;
                long storage;
                double hl1,allhl=0;
                for(int i=0;i<nMachines;i++)
                {
//                    nRam=r.nextInt(2);
//                    nBw=r.nextInt(4);                    
//                    hostId=i;
//                    ram=40960;
////                    ram = rams[nRam]; //host memory (MB)
//                    storage = 409600; //host storage
////                    bw = bws[nBw];
                      nRam=r.nextInt(rams.length);
                    nBw=r.nextInt(4);                    
                    hostId=i;
                    ram = rams[nRam]; 
                    storage = 1000000; 
                    bw = bws[nBw];
//                    bw=512;
                    details.add(dcName+"\t"+nMachines+"\t"+hostId+"\t"+nPe+"\t"+ram+"\t"+bw+"\n");
//                    System.out.println(dcName+"\t"+nMachines+"\t\t"+hostId+"\t\t"+nPe+"\t\t"+ram+"\t"+bw+"\n");
   
                    h=new Host(hostId,
    				new RamProvisionerSimple(ram),
    				new BwProvisionerSimple(bw),
    				storage,
    				peList,
    				new VmSchedulerSpaceShared(peList));
                    hostList.add(h);
                   System.out.println(h.getAvailableMips());
                           k.add(h.getId()+"\t"+h.getRam()+"\t"+h.getStorage()+"\t"+h.getBw()+"\t"+h.getNumberOfPes());
                            hl1=h.getBw()+h.getRam()+h.getAvailableMips();
                  allhl+=hl1;
                  hl.add(h.getId()+"\t"+allhl);
                  hla.add(h.getId());
                  
                    }	
		 
		String arch = "x86";      // system architecture
		String os = "Linux";          // operating system
		String vmm = "Xen";
	      double time_zone = 10.0;         // time zone this resource located
		double cost = 3.0;              // the cost of using processing in this resource
		double costPerMem = 0.05;		// the cost of using memory in this resource
		double costPerStorage = 0.1;	// the cost of using storage in this resource
		double costPerBw = 0.1;			// the cost of using bw in this resource
		LinkedList<Storage> storageList = new LinkedList<Storage>();	//we are not adding SAN devices by now

	       DatacenterCharacteristics characteristics = new DatacenterCharacteristics(
	                arch, os, vmm, hostList, time_zone, cost, costPerMem, costPerStorage, costPerBw);	
		Datacenter datacenter = null;
		try {
			datacenter = new Datacenter(name, characteristics, new VmAllocationPolicySimple(hostList), storageList, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
           
		return datacenter;
	}

        private static DatacenterBroker createBroker(){
                
	    	DatacenterBroker broker = null;
	        try 
                {
			broker = new DatacenterBroker(bName);
		} 
                catch (Exception e) 
                {
			e.printStackTrace();
			return null;
		}
	    	return broker;
	    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
          try
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        }
        catch(Exception e)
        {
            
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataCenter_Brokers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}


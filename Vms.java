package ACO;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.CloudletSchedulerTimeShared;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.UtilizationModel;
import org.cloudbus.cloudsim.UtilizationModelFull;
import org.cloudbus.cloudsim.Vm;

public class Vms extends javax.swing.JFrame {

    /**
     * Creates new form Vms
     */
//      */
    public static String str;
    int d;
    public int nofVm, nofCloudlets;
    public static ArrayList<Vm> vmlist = new ArrayList<Vm>();
    public static ArrayList cloudletList=new ArrayList();
    public static DatacenterBroker[] broker = DataCenter_Brokers.bId;
    public static ArrayList vDetails = new ArrayList();
    public int pesNumber = 1;
    public static  Vm vm1;
    public static ArrayList cloudlet_prty=new ArrayList();
    public static ArrayList cDetails = new ArrayList();
    public static ArrayList vmload=new ArrayList();
    public static ArrayList antpool=new ArrayList();
    public static ArrayList vid = new ArrayList();
    public static ArrayList cid = new ArrayList();
    public static ArrayList vmsLoad1 =new ArrayList();
    public static ArrayList vidl=new ArrayList();
    public static ArrayList vbwl=new ArrayList();
    public static ArrayList vraml=new ArrayList();
    public static ArrayList vmipl=new ArrayList();
    public static ArrayList vl=new ArrayList();
    public static ArrayList vd=new ArrayList();
    public static ArrayList vla=new ArrayList();
    public static ArrayList antpool1=new ArrayList();
    public static ArrayList kk1=new ArrayList();
    private int status;
    public static ArrayList kk=new ArrayList();  
    public static ArrayList clid=new ArrayList();
    public static ArrayList clln=new ArrayList();
    public static ArrayList clfs=new ArrayList();
    public static ArrayList clos=new ArrayList();
    public static ArrayList ft=new ArrayList();
    public static ArrayList at=new ArrayList();
    public static ArrayList wt=new ArrayList();
    public static ArrayList et=new ArrayList();
    public static ArrayList rd=new ArrayList();
    public static ArrayList cl=new ArrayList();
    public static ArrayList pre=new ArrayList();
    public static ArrayList prty=new ArrayList();
        public static ArrayList mip=new ArrayList();
        public static ArrayList bid=new ArrayList();
    public static long startTime; 
        public static long endtime;
    public Vms() 
    {
        initComponents();
        seticon();
    }
         public void seticon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/sim.png")));
    }

public int getCloudletStatus() 
        {
		return status;
	}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vmcreation = new javax.swing.JTextField();
        cloudlet = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Virutual_Machine_Cloudlets");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("NSimSun", 1, 30)); // NOI18N
        jLabel1.setText("   Virtual Machine & Cloudlet Creation");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 20, 650, 35);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Classification", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Cloudlet Creation");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Virtual Machine Creation");

        vmcreation.setEditable(false);
        vmcreation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        cloudlet.setEditable(false);
        cloudlet.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cloudlet, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vmcreation, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vmcreation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cloudlet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(290, 80, 344, 150);

        textarea1.setEditable(false);
        textarea1.setColumns(20);
        textarea1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textarea1.setRows(5);
        textarea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Virtual Machine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jScrollPane1.setViewportView(textarea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 300, 440, 240);

        textarea2.setEditable(false);
        textarea2.setColumns(20);
        textarea2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textarea2.setRows(5);
        textarea2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cloudlet", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jScrollPane2.setViewportView(textarea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(470, 300, 430, 240);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cloud-server1-400x230.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-50, -120, 350, 610);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1389439840_shopping-cart-insert.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(710, 130, 140, 210);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("VM Creation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(300, 260, 130, 30);

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(458, 282, 10, 270);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("Cloudlet Creation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(490, 260, 130, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(790, 560, 75, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 920, 610);

        setSize(new java.awt.Dimension(924, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int allload = 0;
        try {
            startTime = new Date().getTime();
            str = JOptionPane.showInputDialog(this, "Enter Number Of Virtual Machines");
            nofVm = Integer.parseInt(str);
            vmcreation.setText(nofVm + " ");
 Random r=new Random();
        Random r1=new Random();
        Random r2=new Random();
 ArrayList<Vm> vbList=new ArrayList<Vm>();
        int vmid,mips,ram,brokerId;
        long size,bw;
        long[] sizes={10000,15000,20000,250000};
        int[] rams={512,1024,2048,3072};
        int[] bws={1000,2000,1500,3000,5000};
        String vmm;
        Vm vm1;
        DatacenterBroker sBroker;
        int b;//=r.nextInt(broker.length);
        for(int i=0;i<nofVm;i++)
//        for(int i=0;i<nofVm;i++)
        {
         b=r.nextInt(broker.length);
            vmid = i;
            mips = r.nextInt(1000);
           
            size = sizes[r1.nextInt(4)]; //image size (MB)
            ram = rams[r2.nextInt(4)]; //vm memory (MB)
            bw = bws[r.nextInt(5)];
            pesNumber = 2; //number of cpus
            vmm = "Xen"; //VMM name          
            brokerId=broker[b].getId();
            vm1 = new Vm(vmid, brokerId, mips, pesNumber, ram, bw, size, vmm, new CloudletSchedulerTimeShared());
            vmlist.add(vm1);
           startTime= System.nanoTime();
////            System.out.println("**********************");
           kk.add(vmid);
           vmload.add(vm1.getId()+"\t"+vm1.getBw()+"\t"+vm1.getRam()+"\t"+vm1.getMips()+"\t"+vm1.getNumberOfPes());
                 mip.add(vm1.getMips());
                d=(int) (vm1.getBw()+vm1.getRam()+vm1.getMips());
               allload+=d;
                vl.add(vm1.getId()+"\t"+allload);
                antpool.add("ant_"+i);
                vla.add(vm1.getId());
//                
                antpool1.add("ant_"+i+"\t"+vm1.getId());
                
//     v
           
                       vDetails.add(vmid+"\t"+brokerId+"\t"+mips+"\t"+ram+"\t"+bw+"\n\n");

            System.out.println("**********************");
            vid.add(vmid);
//            vDetails.add(vmid+"\t"+brokerId+"\t"+mips+"\t"+ram+"\t"+bw+"\n\n");
            bid.add(brokerId);
            sBroker=broker[b];
            vbList.add(vm1);
            sBroker.submitVmList(vbList);
            vbList.clear();
           kk1.add(vm1.getMips());
            
        }
//        for(int e=0;e<vmlist.size();e++)
//        {
//            System.out.println(vmlist.get(e).toString()+"\n");
//        }
//       
//            JOptionPane.showMessageDialog(this, nofVm + " Virtual Machines Created Successfully");
//            textarea1.append("VM Id" + "\t" + "Broker Id" + "\t" + "Mips" + " \t" + "RAM" + "\t" + "BW\n\n");
//            textarea1.append("================================================================\n\n");
//            for (int i = 0; i < vDetails.size(); i++) 
//            {
//                textarea1.append(vDetails.get(i).toString() + "\n");
//            }

     
       
//        {
//            b=r.nextInt(broker.length);
//            vmid = i;
//            mips = r.nextInt(1000);
//           
//            size = sizes[r1.nextInt(4)]; //image size (MB)
//            ram = rams[r2.nextInt(4)]; //vm memory (MB)
//            bw = bws[r.nextInt(5)];
//            pesNumber = 2; //number of cpus
//            vmm = "Xen"; //VMM name          
//            brokerId=broker[b].getId();
//            vm1 = new Vm(vmid, brokerId, mips, pesNumber, ram, bw, size, vmm, new CloudletSchedulerTimeShared());
//            vmlist.add(vm1);
//            
//            vDetails.add(vmid+"\t"+brokerId+"\t"+mips+"\t"+ram+"\t"+bw+"\n\n");
//            sBroker=broker[b];
//            vbList.add(vm1);
//            sBroker.submitVmList(vbList);
//            vbList.clear();
//        }
        
        JOptionPane.showMessageDialog(null,nofVm+" Virtual Machines created successfully");
        textarea1.append("VM Id"+"\t"+"Broker Id"+"\t"+"Mips"+" \t"+"RAM"+"\t"+"BW\n\n");
        textarea1.append("================================================================\n\n");
        for(int i=0;i<vDetails.size();i++) {
            textarea1.append(vDetails.get(i).toString()+"\n");
        }
        JOptionPane.showMessageDialog(null," Virtual Machines submitted to respective Brokers successfully");
//            JOptionPane.showMessageDialog(this, " Virtual Machines submitted to respective Brokers successfully");
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try{
   endtime=new Date().getTime();
    
          Class.forName("com.mysql.jdbc.Driver").newInstance();
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/?","root","");
             String sql="CREATE DATABASE aco";
             String sql1="Drop database if exists aco";
             PreparedStatement s=con.prepareStatement(sql);
             PreparedStatement s1=con.prepareStatement(sql1);
             s1.executeUpdate();
             s.executeUpdate();
//             JOptionPane.showMessageDialog(this, "success");

      Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/aco?zeroDateTimeBehavior=convertToNull","root","");
      Statement stmt=con1.createStatement();
      
      stmt.executeUpdate("DROP TABLE IF EXISTS cloud_pre"); 
//      stmt.executeUpdate("DROP TABLE IF EXISTS vload"); 
      String create="create table cloud_pre(cloud_id varchar(50),weight int(50))";
      stmt.executeUpdate(create);
//      JOptionPane.showMessageDialog(this,"success");
             
        str = JOptionPane.showInputDialog(this, "Enter Number Of Cloudlets");
        nofCloudlets = Integer.parseInt(str);
        cloudlet.setText(nofCloudlets + " ");
//        String str1= JOptionPane.showInputDialog(this,"Enter Number Of Users");
//        int nofUsers=Integer.parseInt(str1);

        cloudletList = new ArrayList<Cloudlet>();
        Random r = new Random();
        Random r1 = new Random();
        Random r2 = new Random();
        Random r3 = new Random();
        int b;//=r.nextInt(broker.length);
        int brokerId;
        int l, f, o;

        ArrayList cList = new ArrayList();
        
        DatacenterBroker sBroker;
        int id;
        long length;
        long fileSize;
        long outputSize;
        for (int i = 0; i < nofCloudlets; i++) {
//            do {
                l = r1.nextInt(500);
//            } while (l < 30000);
//            do {
                f = r2.nextInt(500);
//            } while (l < 300);
//            do {
                pesNumber = r3.nextInt(4);
//            } while (pesNumber < 1);
            length = (long) l;
            fileSize = (long) f;
            outputSize = (long) f;
            b = r.nextInt(broker.length);
            id = i;
            brokerId = broker[b].getId();
            UtilizationModel utilizationModel = new UtilizationModelFull();
            Cloudlet cloudlet1 = new Cloudlet(id, length, pesNumber, fileSize, outputSize, utilizationModel, utilizationModel, utilizationModel);
            cloudlet1.setUserId(brokerId);
            cid.add(id);
            cDetails.add(id + "\t" + brokerId + "\t" + length + "\t" + fileSize + "\t" + outputSize + "\t\n\n");
//            System.out.println("id : " + id);
            
            pre.add(length+fileSize+outputSize);
            sBroker = broker[b];
            clid.add(id);
            clln.add(length);
            clfs.add(fileSize);
            clos.add(outputSize);
            
            cList.add(cloudlet1);
            cloudletList.add(cloudlet1);
            ft.add(cloudlet1.getFinishTime());
            at.add(cloudlet1.getActualCPUTime());
            wt.add(cloudlet1.getWaitingTime());
         
            rd.add(cloudlet1.getResourceId());
            cl.add(cloudlet1.getCloudletStatus());
            sBroker.submitCloudletList(cList);
            cList.clear();
            
               et.add(cloudlet1.getExecStartTime());
            
        }
//        System.out.println("hai");
        JOptionPane.showMessageDialog(null, nofCloudlets + " cloudlets created successfully");
        textarea2.append("Cloudlet Id" + "\t" + "Broker Id" + "\t" + "Length" + " \t" + "fileSize" + "\t" + "outputSize" + "\n\n");
        textarea2.append("====================================================================\n\n");
        
        for (int i = 0; i < cDetails.size(); i++) 
        {
            textarea2.append(cDetails.get(i).toString() + "\n");
            
            
        }
//        PreparedStatement sf=con1.prepareStatement("insert into cloud_pre(cloud_id,weight)values(?,?)");
        for(int n=0;n<pre.size();n++)
        {
            System.out.println("cloud_let"+cid.get(n)+"\t"+pre.get(n));
            stmt.executeUpdate("insert into cloud_pre values('"+"cloudlet_"+cid.get(n)+"','"+pre.get(n)+"')");
            prty.add(pre.get(n)+"\t"+"cloud_let"+cid.get(n));
//            
//            sf.setString(1,"cloud_let"+cid.get(n));
//            sf.setInt(2, (int) pre.get(n));
            
         
            
            
        }
        String df="drop table if exist cloud_pre1";  
//      String create1="create table cloud_pre1 as select * from cloud_pre order by weight desc";
//      SELECT @n := @n + 1 n,oid,sub_cat FROM sort_plms, (SELECT @n := 0) m ORDER BY oid, sub_cat
//      stmt.executeUpdate(df);
//      cloud_id varchar(50),weight int(50)
        String create1="create table cloud_pre1 as select cloud_id,weight,@n := @n + 1 n from cloud_pre,(SELECT @n := 0) m order by weight desc";
        stmt.executeUpdate(create1);
      
      
        
        
//        sf.executeUpdate();
//           JOptionPane.showMessageDialog(this, "success");
        Collections.sort(prty);
        for(Object temp: prty)
            
                {
		cloudlet_prty.add(temp);
		}
        

        
        JOptionPane.showMessageDialog(null, " Cloulets submitted to respective Brokers successfully");


        for (int i = 0; i < broker.length; i++) {
//            System.out.println(i + " 1: " + broker[i].getCloudletList().size());
        }
long lEndTime = new Date().getTime();
}
catch(Exception e)
{
    System.out.println(e);
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     Load_Table s=new Load_Table();
s.setVisible(true); 
    }//GEN-LAST:event_jButton4ActionPerformed

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
                new Vms().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cloudlet;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea textarea1;
    private javax.swing.JTextArea textarea2;
    private javax.swing.JTextField vmcreation;
    // End of variables declaration//GEN-END:variables
}

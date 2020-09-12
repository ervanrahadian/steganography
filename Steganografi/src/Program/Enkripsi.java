package Program;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Font;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.math.BigInteger;
import javax.imageio.IIOException;

public class Enkripsi extends javax.swing.JFrame {
    static String msg="";
    static String code = new String();
    static String bin = new String();
    static String bin1 = new String();
    static String code1 = new String();
    static String pass = new String();
    static String bin2 = new String();
    String str = "";
    File file, savefile;
    static int a =0, a1 =0;
    JFileChooser fc, fs;
    public Enkripsi() throws Exception{
        initComponents();
        fc = new JFileChooser();
        fs = new JFileChooser();
        //Setting fc untuk ke file yang ditentukan);
        fc.addChoosableFileFilter(new ImageFilter());
        fs.addChoosableFileFilter(new pngFilter());
        fc.setAcceptAllFileFilterUsed(false);
        fs.setAcceptAllFileFilterUsed(false);
        //Menambah icon untuk file yang sesuai
            fc.setFileView(new ImageFileView());
	    //Menambahkan preview pane/jendela
            fc.setAccessory(new ImagePreview(fc));           
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJudul = new javax.swing.JLabel();
        lblJudul2 = new javax.swing.JLabel();
        lblJudul24 = new javax.swing.JLabel();
        txtBrowse = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPesan = new javax.swing.JTextArea();
        txtPassword = new javax.swing.JPasswordField();
        btnBrowse = new javax.swing.JButton();
        btnEncode = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblCopyright = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnPilihan = new javax.swing.JMenu();
        mnEncode = new javax.swing.JMenuItem();
        mnDecode = new javax.swing.JMenuItem();
        mnKembali = new javax.swing.JMenuItem();
        mnBantuan = new javax.swing.JMenu();
        mnTeori = new javax.swing.JMenuItem();
        mnPenggunaan = new javax.swing.JMenuItem();
        mnTentang = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encode");
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(1280, 720));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJudul.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        lblJudul.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJudul.setText("Cover Image");
        lblJudul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, 50));

        lblJudul2.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        lblJudul2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJudul2.setText("Pesan Teks");
        lblJudul2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJudul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, 50));

        lblJudul24.setFont(new java.awt.Font("Unispace", 1, 24)); // NOI18N
        lblJudul24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJudul24.setText("Password");
        lblJudul24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJudul24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, 50));

        txtBrowse.setEditable(false);
        txtBrowse.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        getContentPane().add(txtBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 500, 50));

        txtPesan.setColumns(20);
        txtPesan.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        txtPesan.setRows(5);
        jScrollPane1.setViewportView(txtPesan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 1100, 300));

        txtPassword.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 350, 50));

        btnBrowse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBrowse.setText("BROWSE");
        btnBrowse.setFocusPainted(false);
        btnBrowse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        getContentPane().add(btnBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 150, 50));

        btnEncode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEncode.setForeground(new java.awt.Color(255, 0, 0));
        btnEncode.setText("ENCODE");
        btnEncode.setFocusPainted(false);
        btnEncode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEncode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncodeActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncode, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 150, 50));

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setText("RESET");
        btnReset.setFocusPainted(false);
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 150, 50));

        lblCopyright.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lblCopyright.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCopyright.setText("© 2020 - Ervan Rahadian Hakim -");
        getContentPane().add(lblCopyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 1260, 50));

        lblBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\msi\\Documents\\NetBeansProjects\\Steganografi\\Background3.jpg")); // NOI18N
        lblBackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBackground.setMaximumSize(new java.awt.Dimension(1280, 690));
        lblBackground.setMinimumSize(new java.awt.Dimension(1280, 690));
        lblBackground.setPreferredSize(new java.awt.Dimension(1280, 690));
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 690));

        jMenuBar1.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(50, 30));

        mnPilihan.setText("Pilihan");
        mnPilihan.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        mnPilihan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnPilihan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnPilihan.setPreferredSize(new java.awt.Dimension(80, 30));

        mnEncode.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        mnEncode.setText("Encode");
        mnEncode.setEnabled(false);
        mnEncode.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        mnPilihan.add(mnEncode);

        mnDecode.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        mnDecode.setText("Decode");
        mnDecode.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        mnDecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDecodeActionPerformed(evt);
            }
        });
        mnPilihan.add(mnDecode);

        mnKembali.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        mnKembali.setText("Kembali");
        mnKembali.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        mnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKembaliActionPerformed(evt);
            }
        });
        mnPilihan.add(mnKembali);

        jMenuBar1.add(mnPilihan);

        mnBantuan.setText("Bantuan");
        mnBantuan.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        mnBantuan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnBantuan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnBantuan.setPreferredSize(new java.awt.Dimension(80, 30));

        mnTeori.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        mnTeori.setText("Teori");
        mnTeori.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        mnTeori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTeoriActionPerformed(evt);
            }
        });
        mnBantuan.add(mnTeori);

        mnPenggunaan.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        mnPenggunaan.setText("Cara Penggunaan");
        mnPenggunaan.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        mnPenggunaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPenggunaanActionPerformed(evt);
            }
        });
        mnBantuan.add(mnPenggunaan);

        mnTentang.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        mnTentang.setText("Tentang");
        mnTentang.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        mnTentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTentangActionPerformed(evt);
            }
        });
        mnBantuan.add(mnTentang);

        jMenuBar1.add(mnBantuan);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        int returnVal = fc.showOpenDialog(Enkripsi.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
                String filename = "" + file;
                txtBrowse.setText(filename);
            }
}//GEN-LAST:event_btnBrowseActionPerformed

    private void btnEncodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncodeActionPerformed
        UIManager.put("OptionPane.messageFont", new Font("Nirmala UI", Font.PLAIN, 18));
        if (txtBrowse.getText().equals("")){           
            JOptionPane.showMessageDialog(null, "Pilih Cover Image terlebih dahulu !", "Pemberitahuan",
            JOptionPane.INFORMATION_MESSAGE);           
        }else{
            if(txtPesan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Pesan terlebih dahulu !", "Pemberitahuan",
            JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Password terlebih dahulu !", "Pemberitahuan",
            JOptionPane.INFORMATION_MESSAGE);
        }else{       
        int returnValue = fs.showSaveDialog(Enkripsi.this);
        if(returnValue == JFileChooser.APPROVE_OPTION)
        {
        savefile = fs.getSelectedFile();
        String saveFileName = "" +savefile;
        int saveFileLength = saveFileName.length();
        
        if(saveFileLength<4)
            saveFileName += ".png";
        if(saveFileName.charAt(saveFileLength-4)!='.'
                && saveFileName.charAt(saveFileLength-3)!='p'
                && saveFileName.charAt(saveFileLength-2)!='n'
                && saveFileName.charAt(saveFileLength-1)!='g')
            saveFileName += ".png";
        saveFileLength = saveFileName.length();
        
        msg = txtPesan.getText();
        pass = txtPassword.getText();
        code=crypt(new BigInteger("3078434453"),new BigInteger("5"),msg);
        code1=crypt(new BigInteger("3078434453"),new BigInteger("5"),pass);
        
        int k=code.length();
        bin1=binary_code(k,code);
        k = code1.length();
        bin2 = binary_code(k,code1);
        a=bin1.length()+ bin2.length();
        a1 = bin2.length();
        bin1 =bin1+ bin2;
                    try {
                        encode(a, file, saveFileName);
                    } catch (IOException ex1) {
                        Logger.getLogger(Enkripsi.class.getName()).log(Level.SEVERE, null, ex1);
                    }
        }
        else
            return;
            }
            }
            }
}//GEN-LAST:event_btnEncodeActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtPassword.setText("");
        txtBrowse.setText("");
        txtPesan.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void mnDecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDecodeActionPerformed
        try {
            new Dekripsi().setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnDecodeActionPerformed

    private void mnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKembaliActionPerformed
        try {
            new Main().setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnKembaliActionPerformed

    private void mnPenggunaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPenggunaanActionPerformed
        try  {
            new Penggunaan().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnPenggunaanActionPerformed

    private void mnTentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTentangActionPerformed
        try  {
            new Tentang().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnTentangActionPerformed

    private void mnTeoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTeoriActionPerformed
        try  {
            new Teori().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnTeoriActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Enkripsi().setVisible(true);                   
                } catch (Exception ex) {
                    Logger.getLogger(Enkripsi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnEncode;
    private javax.swing.JButton btnReset;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblJudul2;
    private javax.swing.JLabel lblJudul24;
    private javax.swing.JMenu mnBantuan;
    private javax.swing.JMenuItem mnDecode;
    private javax.swing.JMenuItem mnEncode;
    private javax.swing.JMenuItem mnKembali;
    private javax.swing.JMenuItem mnPenggunaan;
    private javax.swing.JMenu mnPilihan;
    private javax.swing.JMenuItem mnTentang;
    private javax.swing.JMenuItem mnTeori;
    private javax.swing.JTextField txtBrowse;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextArea txtPesan;
    // End of variables declaration//GEN-END:variables
public static String crypt(BigInteger n,BigInteger e, String msg1)
    {
     int fp=0,lp=32,j=0,i,c=0;
     BigInteger encod[]=new BigInteger[1000000];
     BigInteger encry[]=new BigInteger[1000000];
     String binary="";
     String coded=new String();
     String sixteen[]=new String[1000000];
     String str="";
     for(i=0;i<msg1.length();i++)
     {
     binary=Integer.toBinaryString(msg1.charAt(i));
     for(j=binary.length();j<8;j++)
         binary="0"+binary;
     str=str+binary;
     if(i%4==3)
     { sixteen[c++]=str.substring(fp,lp);
     fp=lp;lp=lp+32;}
     }
    if(i%4!=0)
     { sixteen[c++]=str.substring(fp,str.length());
       for(j=sixteen[c-1].length();j<32;j++)
           sixteen[c-1]="0"+sixteen[c-1];
    }
     for(i=0;i<c;i++)
        {
         encod[i]=new BigInteger(sixteen[i].toString(), 2);
         encry[i]=encod[i].modPow(e,n);        
         binary=Integer.toBinaryString(encry[i].intValue());
         for(j=binary.length();j<32;j++) binary="0"+binary;      
         for(j=0;j<32;j+=8)
        coded=coded+(char)Integer.parseInt(binary.substring(j,j+8),2);
        }     
        return(coded);
    }

    public static String binary_code(int k,String code)
    {
        String bin_code="";
        for(int i=0;i<k;i++)
        {
            bin=Integer.toBinaryString(code.charAt(i));
            for(int j=bin.length();j<8;j++)
                bin="0"+bin;
            bin_code=bin_code+bin;
        }
        return(bin_code);
    }

    @SuppressWarnings("empty-statement")
    public static void encode(int a, File f, String sf) throws IOException
    {
        BufferedImage image = null;
		try{			
		image=ImageIO.read(f);
		}catch(IIOException e){         
        }
		BufferedImage img=null;
        int w=image.getWidth();
        int h=image.getHeight();
		int pixels[]=new int[w*h];
		try{
		PixelGrabber pg=new PixelGrabber(image,0,0,w,h,pixels,0,w);
		pg.grabPixels();
        }catch(Exception es){        
        }
        int p=pixels[0];
        int r=0xff & (p>>16);
        int g=0xff & (p>>8);
        int b=0xff & (p);     
        b=(a)&0xffffff;
        pixels[0]=(255<<24)|b;        
        int nh=h;
        if(h%2==0)
            nh=h-1;
        int incre_w=coprime(w);
        int incre_h=coprime(nh);
        int k=incre_w;
        int l=incre_h;     
        p=pixels[l*w+k] ;
        r=0xff & (p>>16);
        g=0xff & (p>>8);
        b=(a1)&0xff;
        pixels[l*w+k]= (255<<24)|(r<<16)|(g<<8)|b;
        k=k+incre_w;
        l = l+ incre_h;
        for(int i=0;i<a;i++)
        {
            if(k>=w)
                k-=w;
            if(l>=nh)
                l-=nh;
            p=pixels[l*w+k];
            r=0xff&(p>>16);
            g=0xff&(p>>8);
            b=0xff&(p);
            if(bin1.charAt(i)=='1')
            {
                if(b%2==0)
                    b++;
                b=(b)&0xff;
                pixels[l*w+k]=(255<<24)|(r<<16)|(g<<8)|(b);
            }
            else
            {
                if(b%2!=0)
                    b++;
                b=(b)&0xff;
                pixels[l*w+k]=(255<<24)|(r<<16)|(g<<8)|(b);
            }           
            k=k+incre_w;
            l=l+incre_h;           
        }
        img=new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
		img.setRGB(0,0,w,h,pixels,0,w);       
        try{         
            File file=new File(sf);
            file.delete();
            ImageIO.write(img,"png",file);
        }catch(Exception e){}
       JOptionPane.showMessageDialog(null, "Proses Encode Berhasil !", "Pemberitahuan",
       JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static int coprime(int n)
    {
        int i;
        for(i=2;i<=n/2;i++)
            if(n%i!=0)
                break;
        return(i);
    }
}
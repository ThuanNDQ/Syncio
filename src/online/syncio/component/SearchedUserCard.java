package online.syncio.component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import online.syncio.model.User;
import online.syncio.utils.ImageHelper;

public class SearchedUserCard extends javax.swing.JPanel {

    private Image defaultImage = new javax.swing.ImageIcon(getClass()
            .getResource("/online/syncio/resources/images/icons/profile_28px.png")).getImage();

    public SearchedUserCard(User user) {
        initComponents();
        lblAvatar.setSize(60, 60);

        setPreferredSize(new Dimension(290, 90));
        setMaximumSize(new Dimension(290, 90));
        setMinimumSize(new Dimension(290, 90));

        ImageIcon resizeImg = ImageHelper.resizing(defaultImage, lblAvatar.getWidth(), lblAvatar.getHeight());
        lblAvatar.setIcon(ImageHelper.toRoundImage(resizeImg, 60));

        lblUsername.setText(user.getUsername().trim());
        lblFollowers.setText(user.getFollowers().size() + " followers");
    }
    
    
    
    public SearchedUserCard(User user, Color backgroundColor) {
        initComponents();
        lblAvatar.setSize(60, 60);

        setPreferredSize(new Dimension(290, 90));
        setMaximumSize(new Dimension(290, 90));
        setMinimumSize(new Dimension(290, 90));
        setBackground(backgroundColor);
        
        lblAvatar.setBackground(backgroundColor);

        ImageIcon resizeImg = ImageHelper.resizing(defaultImage, lblAvatar.getWidth(), lblAvatar.getHeight());
        lblAvatar.setIcon(ImageHelper.toRoundImage(resizeImg, 60));

        lblUsername.setText(user.getUsername().trim());
        lblFollowers.setText(user.getFollowers().size() + " followers");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAvatar = new online.syncio.component.MyLabel();
        lblUsername = new online.syncio.component.MyLabel();
        lblFollowers = new online.syncio.component.MyLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(290, 90));

        lblAvatar.setBackground(new java.awt.Color(255, 255, 255));
        lblAvatar.setPreferredSize(new java.awt.Dimension(60, 60));

        lblUsername.setText("adele");
        lblUsername.setFont(new java.awt.Font("SF Pro Display Medium", 0, 16)); // NOI18N

        lblFollowers.setForeground(new java.awt.Color(115, 115, 115));
        lblFollowers.setText("53.6M followers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFollowers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFollowers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private online.syncio.component.MyLabel lblAvatar;
    private online.syncio.component.MyLabel lblFollowers;
    private online.syncio.component.MyLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author mithileshhinge
 */
public class ListItemDownload {
    String filepath, filesize, filedate, username;
    
    public ListItemDownload(String filepath, String filesize, String filedate, String username){
        this.filepath = filepath;
        this.filesize = filesize;
        this.filedate = filedate;
        this.username = username;
    }
}

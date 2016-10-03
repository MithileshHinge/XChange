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
public class ListItemShared {
    public String filepath, filesize, filedate;
    int ii;
    
    public ListItemShared(String filepath, String filesize, String filedate){
        this.filepath = filepath;
        this.filesize = filesize;
        this.filedate = filedate;
    }
}

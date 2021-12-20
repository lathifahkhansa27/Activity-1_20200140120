/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity1.java.Activity.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Dell Inspiron
 */
@Controller
public class javacontroller {
    @RequestMapping("/DataKTP")
   //@ResponseBody
    
    public String getData(Model jnt){
        //String result = "khansa tunangan kim taehyung";
        //jnt.addAttribute("ekspedisi", result);
        
        //Biodata bio = new Biodata();
            ArrayList<List<String>> Biodata = new ArrayList<>();

        Biodata.add(0,Arrays.asList("001","23456","Jungkook","Busan"));
        Biodata.add(1,Arrays.asList("002","23457","Taehyung","Daaegu"));
        Biodata.add(2,Arrays.asList("003","23458","jin","Seoul"));
        Biodata.add(3,Arrays.asList("005","23450","Suga","Daaegu"));
        Biodata.add(4,Arrays.asList("006","23461","Namjoon","Seoul"));
        Biodata.add(5,Arrays.asList("007","23462","Jhope","Gangnam"));
        Biodata.add(6,Arrays.asList("008","23463","lisa","Bangkook"));
        Biodata.add(7,Arrays.asList("009","23464","Jennie","Seoul"));
        Biodata.add(8,Arrays.asList("010","23465","Jiso","Gangnam"));
        Biodata.add(9,Arrays.asList("011","23466","Rose","Australia"));
        Biodata.add(10,Arrays.asList("012","23467","Salwa","Kalimantan"));
        Biodata.add(11,Arrays.asList("013","23468","Riris","Banjarnegara"));
        Biodata.add(12,Arrays.asList("014","23469","Ranny","Yogyakarta"));
        Biodata.add(13,Arrays.asList("015","23470","Jack","Bali"));
        Biodata.add(14,Arrays.asList("016","23471","Firda","Sedayu"));
        Biodata.add(15,Arrays.asList("017","23472","Wendy","Swiss"));
        Biodata.add(16,Arrays.asList("018","23473","Seulgi","New York"));
        Biodata.add(17,Arrays.asList("019","23474","Irene","Broklyn"));
        Biodata.add(18,Arrays.asList("020","23475","Joy","Seoul"));



        
        jnt.addAttribute("table", Biodata);
        return "tableviewer";
    }
}

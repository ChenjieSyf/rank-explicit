package me.ele.rank.controller;

import me.ele.rankdetail.entity.RankEntity;


import me.ele.rankdetail.service.RankDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjie on 15/11/30.
 */

@Controller
public class ShopController {

    @Autowired
    private RankDetailService rankDetailServiceImpl;
    @RequestMapping("/rank-detail/index")
    public String index() {
        List<Integer> ids = new ArrayList<Integer>();
        List<RankEntity> rks = new ArrayList<RankEntity>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        rks = rankDetailServiceImpl.findbyId(ids);
        for(RankEntity rr:rks){

           System.out.println("++++++++++++++++++++++++++++++++++");
        }

        return "index";
    }
}

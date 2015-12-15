package me.ele.rank.iface.impl;

import me.ele.rankdetail.dao.RankDao;
import me.ele.rankdetail.entity.RankEntity;
import me.ele.rankdetail.service.RankDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjie on 15/12/1.
 */
@Service
public class RankDetailServiceImpl implements RankDetailService {

    @Autowired
    RankDao rankDao;

@Override
    public List<RankEntity> findbyId(List<Integer> ids) {
        List<RankEntity> rkds = new ArrayList<RankEntity>();
        for (Integer l : ids) {
            RankEntity r = new RankEntity();
            r = rankDao.findById(l);
            rkds.add(r);

        }
        return rkds;
    }
@Override
    public List<RankEntity> findByResId(List<Integer> ids) {
        List<RankEntity> rkds = new ArrayList<RankEntity>();
        /*for (Long l : ids) {
            RankEntity r = new RankEntity();
            r = rankDao.findAll();
            rkds.add(r);

        }*/

        rkds = rankDao.findAll();
        return rkds;
    }
}

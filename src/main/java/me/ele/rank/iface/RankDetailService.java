package me.ele.rank.iface;

import me.ele.rankdetail.entity.RankEntity;

import java.util.List;

/**
 * Created by chenjie on 15/12/1.
 */

public interface RankDetailService {

    public List<RankEntity> findbyId(List<Integer> ids);

    public  List<RankEntity> findByResId(List<Integer> restaurant_id);
}

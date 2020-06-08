package com.easybuy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.easybuy.dao.NewsDao;
import com.easybuy.entity.News;
import com.easybuy.service.NewsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * (News)表服务实现类
 *
 * @author makejava
 * @since 2020-06-06 12:19:42
 */
@Transactional
@Service("newsService")
public class NewsServiceImpl extends ServiceImpl<NewsDao, News> implements NewsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public News queryById(Integer id) {
        return getBaseMapper().queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<News> queryAllByLimit(int offset, int limit) {
        return getBaseMapper().queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param news 实例对象
     * @return 实例对象
     */
    @Override
    public Boolean insert(News news) {
        return getBaseMapper().insert(news)>0;
    }

    /**
     * 修改数据
     *
     * @param news 实例对象
     * @return 实例对象
     */
    @Override
    public Boolean update(News news) {
        return getBaseMapper().update(news)>0;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public Boolean deleteById(Integer id) {
        return getBaseMapper().deleteById(id) > 0;
    }
}

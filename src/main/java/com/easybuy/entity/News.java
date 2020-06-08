package com.easybuy.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (News)实体类
 *
 * @author makejava
 * @since 2020-06-06 12:19:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class News extends Model<News> implements Serializable {
    private static final long serialVersionUID = -53482617054548057L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 创建时间
     */
    private String createtime;
}

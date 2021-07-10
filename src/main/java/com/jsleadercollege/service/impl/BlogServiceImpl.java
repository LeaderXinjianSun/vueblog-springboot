package com.jsleadercollege.service.impl;

import com.jsleadercollege.entity.Blog;
import com.jsleadercollege.mapper.BlogMapper;
import com.jsleadercollege.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2021-07-07
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}

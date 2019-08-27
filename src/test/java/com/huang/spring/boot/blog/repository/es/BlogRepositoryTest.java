package com.huang.spring.boot.blog.repository.es;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.huang.spring.boot.blog.Application;
import com.huang.spring.boot.blog.repository.BlogRepository;

/**
 * BlogRepository 测试类.
 * @author	黄远志
 * @date	2019年8月26日
 * @Blog	https://www.huangyuanzhi.top
 * @GitHub	https://github.com/huangyuanzhi1997
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class BlogRepositoryTest {
	
	@Autowired
    private EsBlogRepository esBlogRepository;
	
	@Autowired
    private BlogRepository blogRepository;
	
	
	@Before
	public void initData() {
		// 清空所有
//		esBlogRepository.deleteAll();
		
//		esBlogRepository.save(new EsBlog("1","08-27 使用 GFM Eclipse 插件时，不在项目里面生成 HTML 文件",
//				"GFM 是 GitHub Flavored Markdown Viewer 的简称，是一款对 GitHub 友好的 Markdown 编辑器 。"));  
	}
 
}

package com.mtli.lms.librarymanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mtli.lms.librarymanager.mapper.BookMapper;
import com.mtli.lms.librarymanager.model.Book;
import com.mtli.lms.librarymanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void add(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public void update(Book book) {
        bookMapper.updateBook(book);
    }

    /**
     * 通过分类号分页查询图书
     * @param pageNum
     * @param b_catalog
     * @return
     */
    @Override
    public List<Book> searchBookByConditionList(int pageNum ,Integer b_catalog) {
        Book book = new Book();
        book.setB_catalog(b_catalog);
        //设置起始点
        PageHelper.startPage(pageNum,5);
        //获取结果集
        List<Book> bookList = bookMapper.selectBookByConditions(book);
        //传入要分页的结果对象
        PageInfo<Book> bookPageInfo = new PageInfo<>(bookList);
        //得到分页中的Question条目对象
        List<Book> pageList = bookPageInfo.getList();
        return pageList;
    }

    /**
     * 查询所有图书
     * @return
     */
    @Override
    public List<Book> selectAllBook() {
        return bookMapper.selectAllBook();
    }

    /**
     * 通过分类号查询其图书数量
     * @param b_catalog
     * @return
     */
    @Override
    public int searchBookCountByCatalog(Integer b_catalog) {
        return bookMapper.searchBookCount(b_catalog);
    }

    /**
     * 根据图书id查询图书
     * @param b_id
     * @return
     */
    @Override
    public Book searchBookByBId(Integer b_id) {
        return bookMapper.searchBookByBId(b_id);
    }

    /**
     * 查询当前最后一个图书的编号
     * @return
     */
    @Override
    public List<Book> searchBookLastCode() {
        return bookMapper.searchBookCode();
    }

    /**
     * 根据条件查询图书数量
     * @param book
     * @return
     */
    @Override
    public int searchBookCountByConditions(Book book) {
        return bookMapper.selectBookCountByConditions(book);
    }

    /**
     * 上传图书图片
     * @param file
     * @param b_id
     * @return
     * @throws Exception
     */
    @Override
    public int addPhoto( MultipartFile file,Integer b_id) throws Exception{
        String filePath="E:/JavaTest/librarymanager/src/main/resources/static/images/";
        //判断文件夹是否存在，不存在则创建
        File file1 = new File(filePath);
        if(!file1.exists()){
            file1.mkdirs();
        }

        String originalFileName = file.getOriginalFilename();//获取原始图片的扩展名
        String originalFileName1 = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);//获取文件的后缀名
        String newFileName = b_id+"."+originalFileName1;
        String newFileName1 ="/images/"+newFileName;
        String newFilePath = filePath+newFileName;//新文件路径

        file.transferTo(new File(newFilePath));//写入
        //将路径写入数据库
        Book book = new Book();
        book.setB_id(b_id);
        book.setB_cover(newFileName1);
        int res = bookMapper.updateBook(book);
        if(res>0){
            return 1;
        }
        return 0;
    }
}


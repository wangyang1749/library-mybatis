package com.tes;

import com.syyb.common.util.DateUtil;
import com.syyb.seat.pojo.TBook;
import com.syyb.seat.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TesBook {

    @Autowired
    BookService bookService;

    @Test
    public void selBySeatNumberAndExpire(){
        TBook tBook = bookService.selBySeatNumberAndExpire(15, 1);
        System.out.println(DateUtil.format(tBook.getStratTime()));
    }
    @Test
    public void add(){
        bookService.downSeat(103,12927286);
    }

    @Test
    public void selByPage(){
        bookService.selByPage(5,1);
    }

}

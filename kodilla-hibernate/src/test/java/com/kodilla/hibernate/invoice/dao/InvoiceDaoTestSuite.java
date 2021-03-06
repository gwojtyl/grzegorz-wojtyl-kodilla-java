package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("wood");
        productDao.save(product);
        int productId = product.getId();

        Item item1 = new Item(product, new BigDecimal(3), 100, new BigDecimal(300));
        Item item2 = new Item(product, new BigDecimal(10), 50, new BigDecimal(500));
        Item item3 = new Item(product, new BigDecimal(20), 10, new BigDecimal(200));

        Invoice invoice = new Invoice("2345SDF");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertNotEquals(0, productId);
        Assert.assertNotEquals(0, item1.getId());
        Assert.assertNotEquals(0, item2.getId());
        Assert.assertNotEquals(0, item3.getId());

        //CleanUp
        invoiceDao.deleteById(invoiceId);
        productDao.deleteById(productId);
    }
}

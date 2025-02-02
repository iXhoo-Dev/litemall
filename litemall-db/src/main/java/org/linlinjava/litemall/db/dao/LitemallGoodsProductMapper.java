package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallGoodsProduct;
import org.linlinjava.litemall.db.domain.LitemallGoodsProductExample;

public interface LitemallGoodsProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    long countByExample(LitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    int insert(LitemallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    int insertSelective(LitemallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    LitemallGoodsProduct selectOneByExample(LitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    LitemallGoodsProduct selectOneByExampleSelective(@Param("example") LitemallGoodsProductExample example, @Param("selective") LitemallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    List<LitemallGoodsProduct> selectByExampleSelective(@Param("example") LitemallGoodsProductExample example, @Param("selective") LitemallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    List<LitemallGoodsProduct> selectByExample(LitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    LitemallGoodsProduct selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    LitemallGoodsProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    LitemallGoodsProduct selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallGoodsProduct record, @Param("example") LitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallGoodsProduct record, @Param("example") LitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_product
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
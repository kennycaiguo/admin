package cn.xmzheng.admin.module.dao.entity.basedata;

import javax.persistence.Entity;

import cn.xmzheng.admin.module.dao.entity.share.SortableIdName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "merchandise")
@Data
@EqualsAndHashCode(callSuper = true)
public class MerchandiseEntity extends SortableIdName {

}

var pageSize = 20;

var studentStore = Ext.create('goods.store.GoodsStore');
Ext.define('goods.view.GoodsGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.goodsGrid',
	title : '物品列表',
	store : goodsStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "序号",
		width : 120,
		sortable : true,
		dataIndex : 'g_id'
	}, {
		text : "名称",
		width : 80,
		sortable : true,
		dataIndex : 'g_name'
	}, {
		text : "描述",
		width : 80,
		sortable : true,
		dataIndex : 'g_describe'
	}, {
		text : "数量",
		width : 80,
		sortable : true,
		dataIndex : 'g_number'
	}, {
		text : "添加时间",
		width : 150,
		dataIndex : 'dateCreated',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	}, {
		text : "修改时间",
		width : 150,
		dataIndex : 'dateModified',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : goodsStore,
		displayInfo : true,
		firstTest : '首页',
		lastText : '尾页',
		nextText : '下页',
		prevText : '前页',
		beforePageText : '第',
		afterPageText : '页，共{0}页',
		displayMsg : '记录数：第{0}条 - 第{1}条，共 {2}条',
		emptyMsg : "没有记录"
	})
});

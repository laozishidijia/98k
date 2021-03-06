var pageSize = 20;

var goodsStore = Ext.create('goods.store.goodsStore');

goodsStore.load({
	callback : function(records, operation, successful) {
		if (successful) {
			console.log('department name:', records[0]);
		} else {
			console.log('the server reported an error');
		}
	}
});


Ext.define('goods.view.goodsGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.goodsGrid',
	title : '物品列表',
	store : goodsStore,
	columns : [{
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "物品描述",
		width : 120,
		sortable : true,
		dataIndex : 'Itemsdescribe',
		field : {
			xtype : 'textfield'
		}
	}, {
		text : "编号",
		width : 80,
		sortable : true,
		dataIndex : 'itemsid',
		field : {
			xtype : 'textfield'
		}
	}, {
		text : "名称",
		width : 50,
		sortable : true,
		dataIndex : 'itemsname',
	}, {
		text : "数量",
		width : 50,
		sortable : true,
		dataIndex : 'itemsnumber'
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
	}],
viewConfig : {
columnsText : '列',
sortAscText : '升序',
sortDescText : '降序'
},
tbar : {
xtype : 'toolbar',
frame : true,
border : false,
padding : 2,
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
}
});
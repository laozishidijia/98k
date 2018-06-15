var pageSize = 20;

var secondgoodsStore = Ext.create('secondgoods.store.SecondGoodsStore');
secondgoodsStore.load({
	callback : function(records, operation, successful) {
		if (successful) {
			console.log('department name:', records[0]);
		} else {
			console.log('the server reported an error');
		}
	}
});

Ext.define('secondgoods.view.SecondGoodsGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.secondgoodsGrid',
	title : '二手商品列表',
	store : secondgoodsStore,
	columns : [
		{
			text : 'ID',
			width : 50,
			sortable : true,
			dataIndex : 'id'
		}, {
		text : '二手商品的名称',
		width : 150,
		sortable : true,
		dataIndex : 'sname'
	}, {
		text : "二手商品的编号",
		width : 150,
		sortable : true,
		dataIndex : 'snumber'
	}, {
		text : "二手商品的描述",
		width : 150,
		sortable : true,
		dataIndex : 'sdescrible',
	}, {
		text : "二手商品的价格",
		width : 150,
		sortable : true,
		dataIndex : 'sprice',
	}, {
		text : "二手商品的使用时间",
		width : 150,
		sortable : true,
		dataIndex : 'Stime'
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

	
bbar : new Ext.PagingToolbar({
			pageSize : pageSize,// 每页显示的记录值
			store : secondgoodsStore,
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
var pageSize = 20;

var learnStore = Ext.create('learn.store.learnStore');
learnStore.load({
	callback : function(records, operation, successful) {
		if (successful) {
			console.log('department name:', records[0]);
		} else {
			console.log('the server reported an error');
		}
	}
});
Ext.define('learn.view.learnGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.learnGrid',
	title : '学生列表',
	store : learnStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "资料名",
		width : 120,
		sortable : true,
		dataIndex : 's_name'
	}, {
		text : "发布时间",
		width : 80,
		sortable : true,
		dataIndex : 's_time'
	}, {
		text : "资料内容",
		width : 80,
		sortable : true,
		dataIndex : 's_neirong'
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : learnStore,
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

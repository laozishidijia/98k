var pageSize = 20;

var studentStore = Ext.create('student.store.StudentStore');
Ext.define('student.view.StudentGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.studentGrid',
	title : '学生列表',
	store : studentStore,
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
		store : studentStore,
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

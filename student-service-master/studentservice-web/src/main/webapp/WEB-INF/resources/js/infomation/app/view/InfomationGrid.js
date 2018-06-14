/**
 * 
 */
var pageSize = 20;

var studentStore = Ext.create('infomation.store.InfomationStore');
Ext.define('infomation.view.InfomationGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.infomationGrid',
	title : '反馈信息列表',
	store : studentStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "用户编号",
		width : 120,
		sortable : true,
		dataIndex : 'info_id'
	}, {
		text : "用户姓名",
		width : 80,
		sortable : true,
		dataIndex : 'info_name'
	}, {
		text : "反馈时间",
		width : 80,
		sortable : true,
		dataIndex : 'info_time'
	}, {
		text : " 反馈信息",
		width : 80,
		sortable : true,
		dataIndex : 'info_message'
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

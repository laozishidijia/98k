var pageSize = 20;

var courseStore = Ext.create('course.store.CourseStore');
courseStore.load({
			callback : function(records, operation, successful) {
				if (successful) {
					console.log('department name:', records[0]);
				} else {
					console.log('the server reported an error');
				}
			}
		});
Ext.define('course.view.CourseGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.courseGrid',
	title : '班级课程表',
	store : courseStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "专业",
		width : 80,
		sortable : true,
		dataIndex : 'speciality'
	}, {
		text : "班级",
		width : 120,
		sortable : true,
		dataIndex : 'clazz'
	}, {
		text : "星期一",
		width : 80,
		sortable : true,
		dataIndex : 'monday'
	}, {
		text : "星期二",
		width : 80,
		sortable : true,
		dataIndex : 'tuesday'
	},  {
		text : "星期三",
		width : 80,
		sortable : true,
		dataIndex : 'wednesday'
	},  {
		text : "星期四",
		width : 80,
		sortable : true,
		dataIndex : 'thursday'
	},  {
		text : "星期五",
		width : 80,
		sortable : true,
		dataIndex : 'friday'
	},  {
		text : "星期六",
		width : 80,
		sortable : true,
		dataIndex : 'saturday'
	},  {
		text : "星期日",
		width : 80,
		sortable : true,
		dataIndex : 'sunday'
	},  {
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
		store : courseStore,
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

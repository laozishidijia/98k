Ext.define('infomation.model.InfomationModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.infomationModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'info_id',
		type : 'string',
		sortable : true
	}, {
		name : 'info_name',
		type : 'string',
		sortable : true
	},{
		name:'info_time',
		type:'string',
		sortable:true
	},{
		name : 'info_message',
		type : 'string',
		sortable : true
	}, {
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	} ]
});
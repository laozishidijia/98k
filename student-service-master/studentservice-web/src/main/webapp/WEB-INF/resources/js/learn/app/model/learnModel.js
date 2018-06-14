Ext.define('learn.model.StudentModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.learnModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 's_name',
		type : 'string',
		sortable : true
	}, {
		name : 's_time',
		type : 'string',
		sortable : true
	}, {
		name : 's_neirong',
		type : 'string',
		sortable : true
	} ]
});
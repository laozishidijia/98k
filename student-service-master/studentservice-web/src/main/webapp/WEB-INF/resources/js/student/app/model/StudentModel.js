Ext.define('student.model.StudentModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.studentModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 's_id',
		type : 'string',
		sortable : true
	}, {
		name : 's_name',
		type : 'string',
		sortable : true
	}, {
		name : 's_dept',
		type : 'string',
		sortable : true
	}, {
		name : 's_class',
		type : 'string',
		sortable : true
	},{
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
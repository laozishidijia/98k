Ext.define('course.model.CourseModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.courseModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'monday',
		type : 'string',
		sortable : true
	}, {
		name : 'tuesday',
		type : 'string',
		sortable : true
	}, {
		name : 'wednesday',
		type : 'string',
		sortable : true
	}, {
		name : 'thursday',
		type : 'string',
		sortable : true
	}, {
		name : 'friday',
		type : 'string',
		sortable : true
	}, {
		name : 'saturday',
		type : 'string',
		sortable : true
	}, {
		name : 'sunday',
		type : 'string',
		sortable : true
	},{
		name:'speciality',
		type:'string',
		sortable:true
	},{
		name : 'clazz',
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
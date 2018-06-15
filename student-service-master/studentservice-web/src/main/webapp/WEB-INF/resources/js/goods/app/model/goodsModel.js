Ext.define('goods.model.goodsModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.goodsModel',
	fields : [{name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'Itemsdescribe',
		type : 'string',
		sortable : true
	}, {
		name : 'itemsid',
		type : 'string',
		sortable : true
	}, {
		name : 'itemsname',
		type : 'string',
		sortable : true
	}, {
		name : 'itemsnumber',
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
	}]
	});
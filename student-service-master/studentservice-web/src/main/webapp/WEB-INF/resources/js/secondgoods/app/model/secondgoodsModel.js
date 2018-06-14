Ext.define('secondgoods.model.SecondGoodsModel',{
    extend : 'Ext.data.Model',
	alias : 'widget.secondgoodsModel',
	fields : [{name : 'Sname',
		type : 'String',
		sortable : true
	}, {
		name : 'Snumber',
		type : 'long',
		sortable : true
	}, {
		name : 'Sprice',
		type : 'float',
		sortable : true
	}, {
		name : 'Stime',
		type : 'float',
		sortable : true
	}, {
		name : 'Sdescrible',
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
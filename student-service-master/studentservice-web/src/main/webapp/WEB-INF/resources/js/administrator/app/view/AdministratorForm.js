Ext.define('administrator.view.AdministratorForm',{
	extend : 'Ext.grid.Panel',
	alias:'widget.administratorList',
	title:'All administrators',
	initComponent:function(){
	this.store={
		fields:['name','email'],
		data:[
			{name:'Ed',email:'ed@sencha.com'},
			{name:'Ed',email:'ed@sencha.com'}
		]
	};
	
	this.columns=[
		{header:'Name',dataIndex:'name',flex:1},
		{header:'Email',dataIndex:'email',flex:1}
	];
		
	this.callParent(arguments);
	}
});
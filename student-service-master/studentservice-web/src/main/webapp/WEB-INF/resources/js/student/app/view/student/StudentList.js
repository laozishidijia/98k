Ext.define('student.view.student.StudentList' ,{
    extend: 'Ext.grid.Panel',
    alias: 'widget.StudentList',
    title: 'All Students',
    store:'studentStore',
    
    initComponent: function() {
       
        this.columns = [
            {header: 'Departement',  dataIndex: 'sdept',  flex: 1},
            {header:'ID_num',dataIndex:'sid',flex:1},
            {header: 'Name', dataIndex: 'sname', flex: 1}
        ];
        this.callParent(arguments);
    }
});
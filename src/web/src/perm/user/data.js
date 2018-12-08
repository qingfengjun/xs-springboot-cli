export default{
	init:function(){ 
		return{
			tableData3: [],
			dialogAddFormVisible: false,
			dialogEditFormVisible:false,
			form: {
			  account: '',
			  name: '',
			  face: '',
			  mail: '',
			  password: ''
			},
			editform:{},
			formLabelWidth: '120px'
		  }
	}
}
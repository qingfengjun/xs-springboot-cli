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
				password: '',
				userRoles:[]
			},
			imageUrl: '',
			editform:{},
			formLabelWidth: '120px',
			roleDatas:[],
			filters:{name:""}
		  }
	}
}
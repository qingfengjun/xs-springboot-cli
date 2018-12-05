
import Home from './Home' 
import classes from './class/classes' 
import student from './student/student' 
import tree from './tree' 

let router = [
   {
      path: '/',
      name: '学校',
      component: Home,
      redirect: '/classes',
	  iconCls: 'fa fa-id-card-o',
	  children: [
    		{ path: '/classes', component: classes, name: '班级管理' },
    		{ path: '/student', component: student, name: '学生管理' }
      ] 
    }
]; 
export default router;

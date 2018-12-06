import  axios from './config';

//-----------------------------------学生列表---------------------------------------------
export const getStudentList = params => { return axios.get(`/api/student/list`, { params: params })};

//-----------------------------------删除学生---------------------------------------------
export const removeStudentById = params => { return axios.get(`/api/student/deleteStu`, { params: params })};


//-----------------------------------新增学生---------------------------------------------
export const addStudent = params => { return axios.post(`/api/student/addStudent`,  params)};
import  axios from './config';
 export const getUser = params => { return axios.post(`/api/user/list`,  params)};
 export const addUser = params => { return axios.post(`/api/user/add`,  params)};
 export const editUser = params => { return axios.post(`/api/user/edit`,  params)};
 export const deleteUser = params => { return axios.post(`/api/user/delete`,  params)};

 export const getRole = params => { return axios.post(`/api/role/list`,  params)};
 export const addRole = params => { return axios.post(`/api/role/add`,  params)};
 export const editRole = params => { return axios.post(`/api/role/edit`,  params)};
 export const deleteRole = params => { return axios.post(`/api/role/delete`,  params)};
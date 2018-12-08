import  axios from './config';
 export const getUser = params => { return axios.post(`/api/user/list`,  params)};
 export const addUser = params => { return axios.post(`/api/user/add`,  params)};
 export const editUser = params => { return axios.post(`/api/user/edit`,  params)};
 export const deleteUser = params => { return axios.post(`/api/user/delete`,  params)};
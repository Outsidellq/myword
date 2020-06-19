<template>
	
	<vue-drawer-layout ref="drawerLayout" :drawer-width="500">
	          <div class="drawer" slot="drawer" style="height: 100%;">
	       <div class="text">
			  <p class="h5">你好：张三</p>
			  <ul class="list-unstyled mt-5">
				  <li class="m-3">
					 <svg class="bi bi-calendar2-check" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
					   <path fill-rule="evenodd" d="M10.854 8.146a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 0 1 .708-.708L7.5 10.793l2.646-2.647a.5.5 0 0 1 .708 0z"/>
					   <path fill-rule="evenodd" d="M14 2H2a1 1 0 0 0-1 1v11a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V3a1 1 0 0 0-1-1zM2 1a2 2 0 0 0-2 2v11a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V3a2 2 0 0 0-2-2H2z"/>
					   <path fill-rule="evenodd" d="M3.5 0a.5.5 0 0 1 .5.5V1a.5.5 0 0 1-1 0V.5a.5.5 0 0 1 .5-.5zm9 0a.5.5 0 0 1 .5.5V1a.5.5 0 0 1-1 0V.5a.5.5 0 0 1 .5-.5z"/>
					   <path d="M2.5 4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5H3a.5.5 0 0 1-.5-.5V4z"/>
					 </svg>
					  修改密码</li>
				   <li class="m-3">
					   <svg class="bi bi-x-square-fill" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
					     <path fill-rule="evenodd" d="M2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2zm9.854 4.854a.5.5 0 0 0-.708-.708L8 7.293 4.854 4.146a.5.5 0 1 0-.708.708L7.293 8l-3.147 3.146a.5.5 0 0 0 .708.708L8 8.707l3.146 3.147a.5.5 0 0 0 .708-.708L8.707 8l3.147-3.146z"/>
					   </svg>
					   退出登录</li>
			  </ul>
		   </div>
	          </div>
	          <div slot="content">
	          <div class="container-fluid">
	          	<div class="row bg-info" style="font-size: 21px;color: white;height: 50px;padding-top: 10px;">
	          		<div class="col-1">
	          			<svg class="bi bi-justify" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
	          				<path fill-rule="evenodd" d="M2 12.5a.5.5 0 0 1 .5-.5h11a.5.5 0 0 1 0 1h-11a.5.5 0 0 1-.5-.5zm0-3a.5.5 0 0 1 .5-.5h11a.5.5 0 0 1 0 1h-11a.5.5 0 0 1-.5-.5zm0-3a.5.5 0 0 1 .5-.5h11a.5.5 0 0 1 0 1h-11a.5.5 0 0 1-.5-.5zm0-3a.5.5 0 0 1 .5-.5h11a.5.5 0 0 1 0 1h-11a.5.5 0 0 1-.5-.5z" />
	          			</svg>
	          		</div>
	          		<div class="col-8 text-center">
	          			<div>单词列表</div>
	          		</div>
	          		<div class="col-3 text-right">添加</div>
	          	</div>
	          	<div class="row justify-content-center">
	          		<div class="col mt-3 border">
	          			<div class="float-left">
	          				<p><strong>about</strong><small>[about]</small></p>
	          				<p>关于大约，在周围</p>
	          			</div>
	          			<div class="float-right mt-2">
	          				<button type="button" class="btn btn-outline-success">修改</button>
	          				<button type="button" class="btn btn-outline-danger">删除</button>
	          			</div>
	          		</div>
	          	</div>
	          	<div class="row justify-content-center">
	          		<div class="col mt-3 border">
	          			<div class="float-left">
	          				<p><strong>about</strong><small>[about]</small></p>
	          				<p>关于大约，在周围</p>
	          			</div>
	          			<div class="float-right mt-2">
	          				<button type="button" class="btn btn-outline-success">修改</button>
	          				<button type="button" class="btn btn-outline-danger">删除</button>
	          			</div>
	          		</div>
	          	</div>
	          </div>
	          </div>
	</vue-drawer-layout>
	
</template>

<script>
	import Vue from 'vue'
	import DrawerLayout from 'vue-drawer-layout'
	Vue.use(DrawerLayout)
	export default {

	}
</script>

<style>
	
	.text{
		width:60%;
		height: 100%;
		background-color: #FFFFFF;
		box-shadow: 3px 3px 6px 6px #888888;
		font-family: "微软雅黑";
	}
</style>

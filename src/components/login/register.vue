<template>
	<div id="login">
		<div class="bg-info d1">
		<div id="d2" class="bg-white"><span class="h2 m-1">用户注册</span></div>
		</div>
		<div class="row justify-content-center mt-3">
			<div class="col-10">
			<form>
				<div class="form-group">
					<div class="input-group">
					     <span class="input-group-text bg-white"  id="basic-addon1">
							<svg class="bi bi-phone" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
								  <path fill-rule="evenodd" d="M11 1H5a1 1 0 0 0-1 1v12a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1zM5 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H5z"/>
								  <path fill-rule="evenodd" d="M8 14a1 1 0 1 0 0-2 1 1 0 0 0 0 2z"/>
								</svg></span>
					  <input type="text" class="form-control" placeholder="用户名" v-model="name">
					</div>
				</div>
				
				<div class="form-group">
					<div class="input-group">
					    <span class="input-group-text bg-white"  id="basic-addon1">
						<svg class="bi bi-bag-check" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
					  <path fill-rule="evenodd" d="M14 5H2v9a1 1 0 0 0 1 1h10a1 1 0 0 0 1-1V5zM1 4v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4H1z"/>
					  <path d="M8 1.5A2.5 2.5 0 0 0 5.5 4h-1a3.5 3.5 0 1 1 7 0h-1A2.5 2.5 0 0 0 8 1.5z"/>
					  <path fill-rule="evenodd" d="M10.854 7.646a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 1 1 .708-.708L7.5 10.293l2.646-2.647a.5.5 0 0 1 .708 0z"/>
					</svg>
					</span>
					  <input type="password" class="form-control" placeholder="密码" v-model="pwd">
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
					    <span class="input-group-text bg-white"  id="basic-addon1">
						<svg class="bi bi-check2-square" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
						  <path fill-rule="evenodd" d="M15.354 2.646a.5.5 0 0 1 0 .708l-7 7a.5.5 0 0 1-.708 0l-3-3a.5.5 0 1 1 .708-.708L8 9.293l6.646-6.647a.5.5 0 0 1 .708 0z"/>
						  <path fill-rule="evenodd" d="M1.5 13A1.5 1.5 0 0 0 3 14.5h10a1.5 1.5 0 0 0 1.5-1.5V8a.5.5 0 0 0-1 0v5a.5.5 0 0 1-.5.5H3a.5.5 0 0 1-.5-.5V3a.5.5 0 0 1 .5-.5h8a.5.5 0 0 0 0-1H3A1.5 1.5 0 0 0 1.5 3v10z"/>
						</svg>
					</span>
					  <input type="password" class="form-control" placeholder="确认密码" v-model="ispwd">
					</div>
				</div>
				<button type="button" @click="register()" class="btn btn-outline-info btn-lg btn-block">注册</button>
			</form>
			</div>
			</div>
			<div class="row justify-content-center">
				<a href="/login" class="text-decoration-none text-primary">赶快去登录吧</a>
			</div>
	</div>
</template>

<script>
	export default {
		data: function() {
			return {
				name:"",
				pwd: "",
				ispwd:""
			}
		},
		methods: {
			register() {
				if(this.name==""||this.pwd==""||this.ispwd==""){
					alert("信息不能为空！请输入信息")
				}else if(this.pwd!=this.ispwd){
					alert("两次密码不一致！")
				}else{
					var params=new URLSearchParams()
					params.append('uname', this.name)
					params.append('upwd', this.pwd)
					var that=this;
					this.$https.post("/api/tbuser/selectByName",params).then(function(result){
						console.log(this)
						if(result.data.stateCode!=200){
							alert("用户名已经存在！")
						}else{
						that.$https.post("/api/tbuser/addUser",params).then(function(result){
							if(result.data>0){
								alert("注册成功！")
							}else{
								alert("注册失败！")
							}
						}) 
						}
					})
				}
				
			}
		}
	}
</script>

<style>
	.d1{
		height: 300px;
	padding-top:120px;
	}
	#d2{
		height: 100px;
		text-align: center;
		width: 230px;
		border-radius: 12px;
		line-height: 80px;
		font-size: 24px;
		margin:0px auto;
	}
</style>

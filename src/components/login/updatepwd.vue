<template>
	<div id="login">
		<div class="bg-info d1">
		<div id="d2" class="bg-white"><span class="h2 m-1">修改密码</span></div>
		</div>
		<div class="row justify-content-center mt-3">
			<div class="col-10">
			<form>
				<div class="form-group">
					<div class="input-group">
					    <span class="input-group-text bg-white"  id="basic-addon1">
						<svg class="bi bi-bag-check" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
					  <path fill-rule="evenodd" d="M14 5H2v9a1 1 0 0 0 1 1h10a1 1 0 0 0 1-1V5zM1 4v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4H1z"/>
					  <path d="M8 1.5A2.5 2.5 0 0 0 5.5 4h-1a3.5 3.5 0 1 1 7 0h-1A2.5 2.5 0 0 0 8 1.5z"/>
					  <path fill-rule="evenodd" d="M10.854 7.646a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 1 1 .708-.708L7.5 10.293l2.646-2.647a.5.5 0 0 1 .708 0z"/>
					</svg>
					</span>
					  <input type="password" class="form-control" placeholder="旧密码" v-model="pwd">
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
					  <input type="password" class="form-control" placeholder="新密码" v-model="newpwd">
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
				<button type="button" @click="changepwd()" class="btn btn-outline-info btn-lg btn-block">注册</button>
			</form>
			</div>
			</div>
			<div class="row justify-content-center">
				<a href="#" @click="back()" class="text-decoration-none text-primary">返回</a>
			</div>
	</div>
</template>

<script>
	export default{
		name:"updatepwd",
		data:function(){
			return{
				pwd:"",
				newpwd:"",
				ispwd:""
			}
			},
			methods:{
				changepwd(){
					var params=new URLSearchParams()
					if(this.pwd==""||this.newpwd==""||this.ispwd==""){
						alert("信息不能为空")
					}else if(this.newpwd!=this.ispwd){
						alert("两次密码不一致！")
					}else if(this.pwd!=this.$route.params.oldpwd){
						alert("旧密码错误！")
					}else{
						params.append("upwd",this.newpwd)
						params.append("uid",this.$route.params.uid)
						var that=this;
						this.$https.post("/api/tbuser/update",params).then(function(result){
							if(result.data>0){
								alert("更新成功！");
							sessionStorage.removeItem("loginuser");
							sessionStorage.removeItem("loginuid");
							sessionStorage.removeItem("loginupwd");
							that.$router.push("/login")
							}else{
								alert("修改失败！")
							}
						})
					}
				},
				back(){
					this.$router.go(-1)
				}
			}
	}
</script>

<style>
</style>

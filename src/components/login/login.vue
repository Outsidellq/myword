<template>
	<div id="login">
		<div class="bg-info d1">
			<div id="d2" class="bg-white">
				<span class="h2 m-1">单词本</span>
				<p>English Word Book</p>
				</div>
		</div>
		<div class="row justify-content-center mt-3">
			<div class="col-10">
				<form>
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-text bg-white" id="basic-addon1">
								<svg class="bi bi-phone" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
									<path fill-rule="evenodd" d="M11 1H5a1 1 0 0 0-1 1v12a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1zM5 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H5z" />
									<path fill-rule="evenodd" d="M8 14a1 1 0 1 0 0-2 1 1 0 0 0 0 2z" />
								</svg></span>
							<input type="text" class="form-control" placeholder="用户名" v-model="name">
						</div>
					</div>
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-text bg-white" id="basic-addon1">
								<svg class="bi bi-bag-check" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
									<path fill-rule="evenodd" d="M14 5H2v9a1 1 0 0 0 1 1h10a1 1 0 0 0 1-1V5zM1 4v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4H1z" />
									<path d="M8 1.5A2.5 2.5 0 0 0 5.5 4h-1a3.5 3.5 0 1 1 7 0h-1A2.5 2.5 0 0 0 8 1.5z" />
									<path fill-rule="evenodd" d="M10.854 7.646a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 1 1 .708-.708L7.5 10.293l2.646-2.647a.5.5 0 0 1 .708 0z" />
								</svg>
							</span>
							<input type="password" class="form-control" placeholder="密码" v-model="pwd">
						</div>
					</div>
					<button type="button" @click="login()" class="btn btn-outline-info btn-lg btn-block">登录</button>
				</form>
			</div>
		</div>
		<div class="row justify-content-center">
			<a href="/register" class="text-decoration-none text-info">去注册</a>
		</div>
	</div>
</template>

<script>
	export default {
		data: function() {
			return {
				name: "",
				pwd: ""
			}
		},
		methods: {
			login: function() {
				if(this.name==""||this.pwd==""){
					alert("用户名和密码不能为空！")
				}else{
					var that = this;
					var params = new URLSearchParams()
					 params.append('uname', this.name)
					 params.append('upwd', this.pwd)
					this.$https.post("/api/tbuser/login", params).then(function(result) {
						if (result.data.stateCode == 200) {
							sessionStorage.setItem("loginuser", result.data.data.uname)
							sessionStorage.setItem("loginuid", result.data.data.uid)
							sessionStorage.setItem("loginupwd", result.data.data.upwd)
							that.$router.push("/main")
						} else {
							alert("登录失败，请重新登录！")
						}
					});
				}
			
			}
		}
	}
</script>

<style>
	.d1 {
		height: 300px;
		padding-top: 120px;
	}

	#d2 {
		height: 100px;
		text-align: center;
		width: 230px;
		border-radius: 12px;
		line-height: 80px;
		font-size: 24px;
		margin: 0px auto;
	}
</style>

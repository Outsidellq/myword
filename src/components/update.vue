<template>
	<div class="container-fluid">
		<div class="row bg-info" style="font-size: 21px;color: white;height: 50px;padding-top: 10px;">
			<div class="col-1">
				<router-link to="/main" >
					<svg class="bi bi-chevron-left text-white"  width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
					  <path fill-rule="evenodd" d="M11.354 1.646a.5.5 0 0 1 0 .708L5.707 8l5.647 5.646a.5.5 0 0 1-.708.708l-6-6a.5.5 0 0 1 0-.708l6-6a.5.5 0 0 1 .708 0z"/>
					</svg>
				</router-link>
			</div>
			<div class="col-10 text-center">
				<div>就这改错</div>
			</div>
		</div>
		<p class="h5 mt-2">一:需要改的单词为</p>
		<hr/>
		<div class="row justify-content-center mt-3">
			<ul class="list-unstyled">
				<li>单词：{{this.$route.params.word.word}}</li>
				<li>发音：{{this.$route.params.word.pronounce}}</li>
				<li>含义：{{this.$route.params.word.des}}</li>
			</ul>
			</div>
		<p class="h5 mt-2">二:请修改的内容为</p>
			<hr/>
		<div class="row justify-content-center mt-3">
			<div class="col-12">
			<form>
			  <div class="form-group">
			    <label for="word">单词</label>
			    <input type="text" class="form-control" v-model="w" placeholder="请输入一个单词" id="word">
			  </div>
			  <div class="form-group">
			    <label for="pro">音标</label>
			    <input type="text" class="form-control" v-model="p" placeholder="请输入单词的音标" id="pro">
			  </div>
			  <div class="form-group">
			    <label for="main">含义</label>
			    <input type="text" class="form-control"  v-model="d" placeholder="请输入单词的含义" id="main">
			  </div>
			 <button type="button" class="btn mt-5 btn-outline-info btn-lg btn-block" @click="update">修改</button>
			</form>
			</div>
		</div>
	</div>
</template>

<script>
	export default {
		name:"Update",
		data:function(){
			return{
				id:"",
				w:"",
				p:"",
				d:"",
			}
		},methods:{
			update(){
				if(this.w==""){
					this.w=this.$route.params.word.word;
				}
				if(this.p==""){
					this.p=this.$route.params.word.pronounce;
				}
				if(this.d==""){
					this.d=this.$route.params.word.des;
				}
				var that = this;
				var params = new URLSearchParams()
				 params.append('wid', this.$route.params.word.wid)
				 params.append('word', this.w)
				 params.append('pronounce', this.p)
				 params.append('des', this.d)
				this.$https.post("/api/tbword/update",params).then(function(res){
					if(res.data>0){
						alert("更新成功")
					}else{
						alert("更新失败！")
						}
				})
			}
		},
	}
</script>

<style>
</style>

<template>
	<div class="container-fluid">
		<div class="row bg-info" style="font-size: 21px;color: white;height: 50px;padding-top: 10px;">
			<div class="col-1">
				<router-link to="/login" >
					<svg class="bi bi-chevron-left text-white"  width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
					  <path fill-rule="evenodd" d="M11.354 1.646a.5.5 0 0 1 0 .708L5.707 8l5.647 5.646a.5.5 0 0 1-.708.708l-6-6a.5.5 0 0 1 0-.708l6-6a.5.5 0 0 1 .708 0z"/>
					</svg>
				</router-link>
			</div>
			<div class="col-10 text-center">
				<div>录入新单词</div>
			</div>
		</div>
		<div class="row justify-content-center mt-3">
			<div class="col-12">
			<form>
			  <div class="form-group">
			    <label for="word">单词</label>
			    <input type="text" class="form-control" placeholder="请输入一个单词" id="word">
			  </div>
			  <div class="form-group">
			    <label for="pro">音标</label>
			    <input type="text" class="form-control" placeholder="请输入单词的音标" id="pro">
			  </div>
			  <div class="form-group">
			    <label for="main">含义</label>
			    <input type="text" class="form-control" placeholder="请输入单词的含义" id="main">
			  </div>
			 <button type="button" class="btn mt-5 btn-outline-info btn-lg btn-block">添加单词</button>
			</form>
			</div>
		</div>
	</div>
</template>

<script>
	export default {

	}
</script>

<style>
</style>

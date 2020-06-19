<template>
	<div class="container-fluid">
		<div class="row bg-info" style="font-size: 21px;color: white;height: 50px;padding-top: 10px;">
			<div class="col-1">
			<svg class="bi bi-chevron-left" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
			  <path fill-rule="evenodd" d="M11.354 1.646a.5.5 0 0 1 0 .708L5.707 8l5.647 5.646a.5.5 0 0 1-.708.708l-6-6a.5.5 0 0 1 0-.708l6-6a.5.5 0 0 1 .708 0z"/>
			</svg>
			</div>
			<div class="col-10 text-center">
				<div>单词列表</div>
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
</template>

<script>
	export default {

	}
</script>

<style>
</style>

<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<meta charset="utf-8">
		<title>列表页面</title>
		<style>
			body{
				text-align:center;
			}
			p{
				font-size:24px;
				background-color:#ccc;
				text-align:center;
			}
			tr{
				width:400px;
				height:70px;
			}
			td{
				width:100px;
			}
		</style>
	</head>
	<body>
		<center>
			<table border="1" cellspacing="0" cellpadding="0">
			<caption><h2>用户列表</h2></caption>
				<tr>
					<th width="200px;">操作</th>
					<th>房间ID</th>
					<th>房间号</th>
					<th>成人数</th>
					<th>儿童数</th>
					<th>价格</th>
				</tr>
			<#list roomlist as item>
				<tr align="center">  
					<td>
						<a href="/rooms/findById?id=${item.id}">查看</a>
						<a href="">修改</a>
						<a href="">删除</a>
					</td>  
					<td>
						${item.id}
					</td>  
					<td>
						${item.roomNumber}
					</td>  
					<td>
						${item.adultsCapacity}
					</td>  
					<td>
						${item.childrenCapacity}
					</td> 
					<td>
						${item.price}
					</td> 
			    	 
			    </tr> 
			</#list>
			</table>
		</center>
	</body>
</html>

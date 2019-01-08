<html lang="zh-CN">
	<head>
		<meta charset="utf-8">
		<title>新增页面</title>
	</head>
	<body>
		<center>
			<h2>新增用户</h2>
			<form action="/rooms/create" method="post">
				房间号 ：<input type="text" name="roomNumber" value=""/><br/>
				成人数 ：<input type="text" name="adultsCapacity" value=""/><br/>
				儿童数 ：<input type="text" name="childrenCapacity" value=""/><br/>
				价&nbsp&nbsp格&nbsp&nbsp：<input type="text" name="price" value=""/><br/><br/>
				<input type="submit" value="新增"/>
			</form>
		</center>
	</body>

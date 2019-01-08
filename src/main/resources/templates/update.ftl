<html lang="zh-CN">
	<head>
		<meta charset="utf-8">
		<title>修改页面</title>
	</head>
	<body>
		<center>
			<h2>修改用户</h2>
			<form action="/rooms/update" method="post">
				<input type="hidden" name="id" value="${id}"/>
				房间号 ：<input type="text" name="roomNumber" value="${roomNumber}"/><br/>
				成人数 ：<input type="text" name="adultsCapacity" value="${adultsCapacity}"/><br/>
				儿童数 ：<input type="text" name="childrenCapacity" value="${childrenCapacity}"/><br/>
				价&nbsp&nbsp格&nbsp&nbsp：<input type="text" name="price" value="${price}"/><br/><br/>
				<input type="submit" value="修改"/>
			</form>
		</center>
	</body>

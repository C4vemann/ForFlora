class FlorasTree{

	class FlorasNode{

		Integer data;
		FlorasNode left = null;
		FlorasNode right = null;

		FlorasNode(Integer x){
			data = x;
			System.out.println("Floras Node Created");
		}


	}

	FlorasNode root = null;

	FlorasTree(Integer[] i){
		for(Integer id : i){
			if(root == null){
				root = new FlorasNode(id);
			} else{
				addChildNode(root, id);
			}
		}
	}

	public void addChildNode(FlorasNode current, int x){
		if(x < current.data){
			if(current.left != null){
				addChildNode(current.left, x);
			}else{
				current.left = new FlorasNode(x);
				return;
			}
		} else{
			if(current.right != null){
				addChildNode(current.right, x);
			}else{
				current.right = new FlorasNode(x);
				return;
			}
		}

	}

	public FlorasNode find(FlorasNode fn, Integer x){
		FlorasNode pointer = fn;
		if(x < pointer.data){
			return find(pointer.left, x);
		} else if(x > pointer.data){
			return find(pointer.right, x);
		} else{
			System.out.println(pointer.data);
			return pointer;
		}
	}

	public String print(FlorasNode current){
		String temp = current.data.toString();
		String temp2 = "null";
		String temp3 = "null";
		if(current.left != null){
			temp2 = print(current.left);
		}
		if(current.right != null){
			temp3 = print(current.right);
		}

		temp = temp + "\n" + temp2 + "\t" + temp3 + "\n";

		return temp;
	}

}
function Location(_item) {
	this.items = _item;
}

Location.prototype.find	= function(id) {
	if(typeof(this.items[id]) == "undefined")
		return false;
	return this.items[id];
}

Location.prototype.fillOption	= function(el , loc_id , selected_id) {
	var json	= this.find(loc_id);
	if (json) {
		var index	= 1;
		var selected_index	= 0;
		$.each(json , function(k , v) {
			var option	= '<option value="'+k+'">'+v+'</option>';
			el.append(option);
			
			if (k == selected_id) {
				selected_index	= index;
			}
			
			index++;
		})
		//el.attr('selectedIndex' , selected_index); 
	}
	el.val("");
}


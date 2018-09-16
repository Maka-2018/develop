package com.demo.dao;

import java.util.List;

import com.demo.data.FigurData;
import com.demo.vo.FigurVO;

public interface FigurDao {
	
	public List<FigurVO> getAllDataInformation(FigurData data);
}

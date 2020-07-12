package com.springbootstarter.api.output;

import com.springbootstarter.dto.NewDTO;

import java.util.ArrayList;
import java.util.List;

public class NewOutput {
    private int page;
    private int totalPage;
    private List<NewDTO> listResult = new ArrayList<>();

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<NewDTO> getListResult() {
        return listResult;
    }

    public void setListResult(List<NewDTO> listResult) {
        this.listResult = listResult;
    }
}

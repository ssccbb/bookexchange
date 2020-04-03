package com.sung.bookexchange.mvp.contract;

import com.sung.bookexchange.mvp.presenter.IndexPresenter;
import com.sung.bookexchange.mvp.interfaces.IPIndex;
import com.sung.bookexchange.mvp.interfaces.IVIndex;

/**
 * Create by sung at 2019/1/19
 *
 * @Description:
 */
public class IndexContract extends BaseContract {
    private IVIndex view;
    private IPIndex presenter;

    public IndexContract(IVIndex view) {
        this.view =  view;
        presenter = new IndexPresenter(view.getContext());
    }

}

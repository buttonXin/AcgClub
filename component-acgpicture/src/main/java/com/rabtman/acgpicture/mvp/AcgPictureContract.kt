package com.rabtman.acgpicture.mvp

import com.rabtman.acgpicture.mvp.model.entity.AnimatePictureItem
import com.rabtman.acgpicture.mvp.model.entity.AnimatePicturePage
import com.rabtman.common.base.mvp.IModel
import com.rabtman.common.base.mvp.IView
import io.reactivex.Flowable

/**
 * @author Rabtman
 * acg图片模块所有契约类
 */

interface AnimatePictureContract {

    interface View : IView {
        fun showAnimatePictures(animatePictureItems: List<AnimatePictureItem>?)

        fun showMoreAnimatePictures(animatePictureItems: List<AnimatePictureItem>?, canLoadMore: Boolean)

        fun onLoadMoreFail()
    }

    interface Model : IModel {
        fun getAnimatePictures(pageIndex: Int): Flowable<AnimatePicturePage>
    }
}



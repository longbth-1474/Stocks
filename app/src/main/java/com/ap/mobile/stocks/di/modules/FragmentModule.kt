package com.ap.mobile.stocks.di.modules

import com.ap.mobile.stocks.ui.main.MarketViewFragment
import com.ap.mobile.stocks.ui.main.WatchlistFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author Abhishek Prajapati
 * @version 1.0.0
 * @since 1/2/18.
 *
 * this class will inject all the fragments in our app
 */

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeWatchlistFragment(): WatchlistFragment

    @ContributesAndroidInjector
    abstract fun contributeMarketViewFragment(): MarketViewFragment

}
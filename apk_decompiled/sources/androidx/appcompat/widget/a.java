package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class a implements View.OnClickListener {
    public final /* synthetic */ SearchView a;

    public a(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.s;
        if (view == searchView.w) {
            searchView.p(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.O;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.y) {
            searchView.f();
            return;
        }
        if (view == searchView.x) {
            searchView.j();
            return;
        }
        if (view != searchView.z) {
            if (view == searchAutoComplete) {
                c.a(searchAutoComplete);
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.c0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.e(searchView.L, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.K);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}

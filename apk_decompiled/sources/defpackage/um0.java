package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class um0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ SearchView a;

    public um0(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.g(i);
    }
}

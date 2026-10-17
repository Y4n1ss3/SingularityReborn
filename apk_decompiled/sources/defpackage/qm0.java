package defpackage;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class qm0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SearchView e;

    public /* synthetic */ qm0(SearchView searchView, int i) {
        this.d = i;
        this.e = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        SearchView searchView = this.e;
        switch (i) {
            case 0:
                searchView.l();
                break;
            default:
                xo xoVar = searchView.R;
                if (xoVar instanceof os0) {
                    xoVar.b(null);
                    break;
                }
                break;
        }
    }
}

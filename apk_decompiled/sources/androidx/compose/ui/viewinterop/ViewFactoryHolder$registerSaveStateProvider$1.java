package androidx.compose.ui.viewinterop;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import defpackage.f30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ViewFactoryHolder$registerSaveStateProvider$1 extends f30 implements iy {
    final /* synthetic */ ViewFactoryHolder<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$registerSaveStateProvider$1(ViewFactoryHolder<T> viewFactoryHolder) {
        super(0);
        this.this$0 = viewFactoryHolder;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        View view;
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        view = ((ViewFactoryHolder) this.this$0).typedView;
        view.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}

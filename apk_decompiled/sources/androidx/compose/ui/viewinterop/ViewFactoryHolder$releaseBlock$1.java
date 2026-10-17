package androidx.compose.ui.viewinterop;

import android.view.View;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ViewFactoryHolder$releaseBlock$1 extends f30 implements iy {
    final /* synthetic */ ViewFactoryHolder<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$releaseBlock$1(ViewFactoryHolder<T> viewFactoryHolder) {
        super(0);
        this.this$0 = viewFactoryHolder;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m7868invoke() {
        View view;
        view = ((ViewFactoryHolder) this.this$0).typedView;
        this.this$0.getReleaseBlock().invoke(view);
        this.this$0.unregisterSaveStateProvider();
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m7868invoke();
        return w01.a;
    }
}

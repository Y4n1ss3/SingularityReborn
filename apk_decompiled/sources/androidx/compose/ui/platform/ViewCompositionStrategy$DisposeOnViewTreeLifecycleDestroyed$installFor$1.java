package androidx.compose.ui.platform;

import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1 extends f30 implements iy {
    final /* synthetic */ ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 $listener;
    final /* synthetic */ AbstractComposeView $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1(AbstractComposeView abstractComposeView, ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6804invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6804invoke();
        return w01.a;
    }
}

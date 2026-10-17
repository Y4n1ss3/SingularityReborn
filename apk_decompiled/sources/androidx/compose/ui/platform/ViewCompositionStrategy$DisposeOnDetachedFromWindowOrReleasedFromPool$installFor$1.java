package androidx.compose.ui.platform;

import com.lumi.singularity.R;
import defpackage.f30;
import defpackage.iy;
import defpackage.tf0;
import defpackage.uf0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1 extends f30 implements iy {
    final /* synthetic */ ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 $listener;
    final /* synthetic */ tf0 $poolingContainerListener;
    final /* synthetic */ AbstractComposeView $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(AbstractComposeView abstractComposeView, ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1, tf0 tf0Var) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1;
        this.$poolingContainerListener = tf0Var;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6803invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        AbstractComposeView abstractComposeView = this.$view;
        tf0 tf0Var = this.$poolingContainerListener;
        abstractComposeView.getClass();
        tf0Var.getClass();
        uf0 uf0Var = (uf0) abstractComposeView.getTag(R.id.pooling_container_listener_holder_tag);
        if (uf0Var == null) {
            uf0Var = new uf0();
            abstractComposeView.setTag(R.id.pooling_container_listener_holder_tag, uf0Var);
        }
        uf0Var.a.remove(tf0Var);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6803invoke();
        return w01.a;
    }
}

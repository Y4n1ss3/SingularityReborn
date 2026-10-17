package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import com.lumi.singularity.R;
import defpackage.br;
import defpackage.hm0;
import defpackage.iy;
import defpackage.ji0;
import defpackage.lu0;
import defpackage.o;
import defpackage.q10;
import defpackage.s40;
import defpackage.uf0;
import defpackage.v11;
import defpackage.wt;
import defpackage.y40;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface ViewCompositionStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ViewCompositionStrategy getDefault() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnDetachedFromWindow INSTANCE = new DisposeOnDetachedFromWindow();

        private DisposeOnDetachedFromWindow() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public iy installFor(final AbstractComposeView abstractComposeView) {
            ?? r1 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    AbstractComposeView.this.disposeComposition();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r1);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(abstractComposeView, r1);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public iy installFor(final AbstractComposeView abstractComposeView) {
            ?? r3 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    AbstractComposeView abstractComposeView2 = AbstractComposeView.this;
                    abstractComposeView2.getClass();
                    ViewParent parent = abstractComposeView2.getParent();
                    for (Object obj : parent == null ? wt.a : new br(new hm0(parent, 3), v11.d, 2)) {
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                return;
                            }
                        }
                    }
                    AbstractComposeView.this.disposeComposition();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r3);
            lu0 lu0Var = new lu0(4);
            uf0 uf0Var = (uf0) abstractComposeView.getTag(R.id.pooling_container_listener_holder_tag);
            if (uf0Var == null) {
                uf0Var = new uf0();
                abstractComposeView.setTag(R.id.pooling_container_listener_holder_tag, uf0Var);
            }
            uf0Var.a.add(lu0Var);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(abstractComposeView, r3, lu0Var);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public iy installFor(final AbstractComposeView abstractComposeView) {
            iy installForLifecycle;
            if (!abstractComposeView.isAttachedToWindow()) {
                final ji0 ji0Var = new ji0();
                ?? r0 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        iy installForLifecycle2;
                        y40 o = q10.o(AbstractComposeView.this);
                        AbstractComposeView abstractComposeView2 = AbstractComposeView.this;
                        if (o != null) {
                            ji0 ji0Var2 = ji0Var;
                            installForLifecycle2 = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView2, o.getLifecycle());
                            ji0Var2.d = installForLifecycle2;
                            AbstractComposeView.this.removeOnAttachStateChangeListener(this);
                            return;
                        }
                        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("View tree for " + abstractComposeView2 + " has no ViewTreeLifecycleOwner");
                        o.j();
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                    }
                };
                abstractComposeView.addOnAttachStateChangeListener(r0);
                ji0Var.d = new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1(abstractComposeView, r0);
                return new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2(ji0Var);
            }
            y40 o = q10.o(abstractComposeView);
            if (o != null) {
                installForLifecycle = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, o.getLifecycle());
                return installForLifecycle;
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
            o.j();
            return null;
        }
    }

    iy installFor(AbstractComposeView abstractComposeView);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 8;
        private final s40 lifecycle;

        public DisposeOnLifecycleDestroyed(y40 y40Var) {
            this(y40Var.getLifecycle());
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public iy installFor(AbstractComposeView abstractComposeView) {
            iy installForLifecycle;
            installForLifecycle = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, this.lifecycle);
            return installForLifecycle;
        }

        public DisposeOnLifecycleDestroyed(s40 s40Var) {
            this.lifecycle = s40Var;
        }
    }
}

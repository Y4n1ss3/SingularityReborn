package androidx.compose.ui.platform;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionServiceKey;
import androidx.compose.runtime.CompositionServices;
import androidx.compose.ui.R;
import defpackage.my;
import defpackage.q40;
import defpackage.s40;
import defpackage.w40;
import defpackage.y40;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class WrappedComposition implements Composition, w40, CompositionServices {
    private s40 addedToLifecycle;
    private boolean disposed;
    private my lastContent = ComposableSingletons$Wrapper_androidKt.INSTANCE.m6725getLambda$1759434350$ui();
    private final Composition original;
    private final AndroidComposeView owner;

    public WrappedComposition(AndroidComposeView androidComposeView, Composition composition) {
        this.owner = androidComposeView;
        this.original = composition;
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(R.id.wrapped_composition_tag, null);
            s40 s40Var = this.addedToLifecycle;
            if (s40Var != null) {
                s40Var.b(this);
            }
            this.addedToLifecycle = null;
        }
        this.original.dispose();
    }

    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(CompositionServiceKey<T> compositionServiceKey) {
        Composition composition = this.original;
        CompositionServices compositionServices = composition instanceof CompositionServices ? (CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    public final Composition getOriginal() {
        return this.original;
    }

    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.original.isDisposed();
    }

    @Override // defpackage.w40
    public void onStateChanged(y40 y40Var, q40 q40Var) {
        if (q40Var == q40.ON_DESTROY) {
            dispose();
        } else {
            if (q40Var != q40.ON_CREATE || this.disposed) {
                return;
            }
            setContent(this.lastContent);
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(my myVar) {
        this.owner.setOnReadyForComposition(new WrappedComposition$setContent$1(this, myVar));
    }
}

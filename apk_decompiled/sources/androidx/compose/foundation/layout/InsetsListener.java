package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import defpackage.a31;
import defpackage.fd0;
import defpackage.p31;
import defpackage.q21;
import defpackage.r21;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class InsetsListener extends r21 implements Runnable, fd0, View.OnAttachStateChangeListener {
    private final WindowInsetsHolder composeInsets;
    private boolean prepared;
    private boolean runningAnimation;
    private p31 savedInsets;

    public InsetsListener(WindowInsetsHolder windowInsetsHolder) {
        super(!windowInsetsHolder.getConsumes() ? 1 : 0);
        this.composeInsets = windowInsetsHolder;
    }

    public final WindowInsetsHolder getComposeInsets() {
        return this.composeInsets;
    }

    public final boolean getPrepared() {
        return this.prepared;
    }

    public final boolean getRunningAnimation() {
        return this.runningAnimation;
    }

    public final p31 getSavedInsets() {
        return this.savedInsets;
    }

    @Override // defpackage.fd0
    public p31 onApplyWindowInsets(View view, p31 p31Var) {
        this.savedInsets = p31Var;
        this.composeInsets.updateImeAnimationTarget(p31Var);
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            this.composeInsets.updateImeAnimationSource(p31Var);
            WindowInsetsHolder.update$default(this.composeInsets, p31Var, 0, 2, null);
        }
        return this.composeInsets.getConsumes() ? p31.b : p31Var;
    }

    @Override // defpackage.r21
    public void onEnd(a31 a31Var) {
        this.prepared = false;
        this.runningAnimation = false;
        p31 p31Var = this.savedInsets;
        if (a31Var.a.b() > 0 && p31Var != null) {
            this.composeInsets.updateImeAnimationSource(p31Var);
            this.composeInsets.updateImeAnimationTarget(p31Var);
            WindowInsetsHolder.update$default(this.composeInsets, p31Var, 0, 2, null);
        }
        this.savedInsets = null;
        super.onEnd(a31Var);
    }

    @Override // defpackage.r21
    public void onPrepare(a31 a31Var) {
        this.prepared = true;
        this.runningAnimation = true;
        super.onPrepare(a31Var);
    }

    @Override // defpackage.r21
    public p31 onProgress(p31 p31Var, List<a31> list) {
        WindowInsetsHolder.update$default(this.composeInsets, p31Var, 0, 2, null);
        return this.composeInsets.getConsumes() ? p31.b : p31Var;
    }

    @Override // defpackage.r21
    public q21 onStart(a31 a31Var, q21 q21Var) {
        this.prepared = false;
        return q21Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            p31 p31Var = this.savedInsets;
            if (p31Var != null) {
                this.composeInsets.updateImeAnimationSource(p31Var);
                WindowInsetsHolder.update$default(this.composeInsets, p31Var, 0, 2, null);
                this.savedInsets = null;
            }
        }
    }

    public final void setPrepared(boolean z) {
        this.prepared = z;
    }

    public final void setRunningAnimation(boolean z) {
        this.runningAnimation = z;
    }

    public final void setSavedInsets(p31 p31Var) {
        this.savedInsets = p31Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}

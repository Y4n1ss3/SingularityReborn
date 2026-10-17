package androidx.compose.material3;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ iy $onKeyboardVisibilityChange;
    final /* synthetic */ View $view;
    private boolean isListeningToGlobalLayout;

    public ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(View view, iy iyVar) {
        this.$view = view;
        this.$onKeyboardVisibilityChange = iyVar;
        view.addOnAttachStateChangeListener(this);
        registerOnGlobalLayoutListener();
    }

    private final void registerOnGlobalLayoutListener() {
        if (this.isListeningToGlobalLayout || !this.$view.isAttachedToWindow()) {
            return;
        }
        this.$view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.isListeningToGlobalLayout = true;
    }

    private final void unregisterOnGlobalLayoutListener() {
        if (this.isListeningToGlobalLayout) {
            this.$view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.isListeningToGlobalLayout = false;
        }
    }

    public final void dispose() {
        unregisterOnGlobalLayoutListener();
        this.$view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.$onKeyboardVisibilityChange.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        registerOnGlobalLayoutListener();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        unregisterOnGlobalLayoutListener();
    }
}

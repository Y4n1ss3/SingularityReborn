package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.R;
import androidx.compose.ui.node.Owner;
import defpackage.a21;
import defpackage.dq;
import defpackage.hl0;
import defpackage.iy;
import defpackage.j;
import defpackage.o;
import defpackage.p01;
import defpackage.q10;
import defpackage.y40;
import defpackage.y80;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<CompositionContext> cachedViewTreeCompositionContext;
    private ComposeViewContext composeViewContext;
    private Composition composition;
    private boolean creatingComposition;
    private iy disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private CompositionContext parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.Companion.getDefault().installFor(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachedToWindow() {
        View findViewTreeComposeViewRoot;
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.composeViewContext == null) {
                AndroidComposeView androidComposeView = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) childAt;
                    }
                }
                if (androidComposeView != null) {
                    ComposeViewContext composeViewContext = androidComposeView.getComposeViewContext();
                    findViewTreeComposeViewRoot = ComposeView_androidKt.findViewTreeComposeViewRoot(this);
                    androidComposeView.setComposeViewContext(updateAutoCreatedComposeViewContext(findViewTreeComposeViewRoot, composeViewContext));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                ensureCompositionCreated();
            }
        }
    }

    private final CompositionContext cacheIfAlive(CompositionContext compositionContext) {
        CompositionContext compositionContext2 = isAlive(compositionContext) ? compositionContext : null;
        if (compositionContext2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(compositionContext2);
        }
        return compositionContext;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    ComposeViewContext composeViewContext = this.composeViewContext;
                    if (composeViewContext == null) {
                        composeViewContext = resolveComposeViewContext();
                    }
                    this.composition = Wrapper_androidKt.setContent(this, composeViewContext, ComposableLambdaKt.composableLambdaInstance(1003123809, true, new AbstractComposeView$ensureCompositionCreated$1$1(this)));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private final boolean isAlive(CompositionContext compositionContext) {
        return !(compositionContext instanceof Recomposer) || ((Recomposer.State) ((Recomposer) compositionContext).getCurrentState().getValue()).compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ComposeViewContext resolveComposeViewContext() {
        ComposeViewContext composeViewContext;
        View findViewTreeComposeViewRoot;
        ComposeViewContext composeViewContext2;
        a21 a21Var;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                composeViewContext = androidComposeView.getComposeViewContext();
                findViewTreeComposeViewRoot = ComposeView_androidKt.findViewTreeComposeViewRoot(this);
                composeViewContext2 = ComposeView_androidKt.getComposeViewContext(findViewTreeComposeViewRoot);
                if (composeViewContext2 == null) {
                    return updateAutoCreatedComposeViewContext(findViewTreeComposeViewRoot, composeViewContext2);
                }
                CompositionContext resolveParentCompositionContext = resolveParentCompositionContext();
                y40 o = q10.o(findViewTreeComposeViewRoot);
                if (o == null) {
                    o = composeViewContext != null ? composeViewContext.getLifecycleOwner$ui() : null;
                    if (o == null) {
                        o.f("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                        return null;
                    }
                }
                y40 y40Var = o;
                hl0 t = y80.t(findViewTreeComposeViewRoot);
                if (t == null) {
                    t = composeViewContext != null ? composeViewContext.getSavedStateRegistryOwner$ui() : null;
                    if (t == null) {
                        o.f("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                        return null;
                    }
                }
                hl0 hl0Var = t;
                a21 n = p01.n(findViewTreeComposeViewRoot);
                if (n == null) {
                    a21Var = composeViewContext != null ? composeViewContext.getViewModelStoreOwner$ui() : null;
                } else {
                    a21Var = n;
                }
                ComposeViewContext composeViewContext3 = new ComposeViewContext(findViewTreeComposeViewRoot, resolveParentCompositionContext, y40Var, hl0Var, a21Var);
                ComposeView_androidKt.setComposeViewContext(findViewTreeComposeViewRoot, composeViewContext3);
                return composeViewContext3;
            }
        }
        composeViewContext = null;
        findViewTreeComposeViewRoot = ComposeView_androidKt.findViewTreeComposeViewRoot(this);
        composeViewContext2 = ComposeView_androidKt.getComposeViewContext(findViewTreeComposeViewRoot);
        if (composeViewContext2 == null) {
        }
    }

    private final CompositionContext resolveParentCompositionContext() {
        CompositionContext compositionContext;
        CompositionContext compositionContext2 = this.parentContext;
        if (compositionContext2 == null) {
            CompositionContext findViewTreeCompositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(this);
            CompositionContext compositionContext3 = null;
            compositionContext2 = findViewTreeCompositionContext != null ? cacheIfAlive(findViewTreeCompositionContext) : null;
            if (compositionContext2 == null) {
                WeakReference<CompositionContext> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (compositionContext = weakReference.get()) != null && isAlive(compositionContext)) {
                    compositionContext3 = compositionContext;
                }
                return compositionContext3 == null ? cacheIfAlive(WindowRecomposer_androidKt.getWindowRecomposer(this)) : compositionContext3;
            }
        }
        return compositionContext2;
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.parentContext != compositionContext) {
            this.parentContext = compositionContext;
            if (compositionContext != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            Composition composition = this.composition;
            if (composition != null) {
                composition.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    private final ComposeViewContext updateAutoCreatedComposeViewContext(View view, ComposeViewContext composeViewContext) {
        CompositionContext resolveParentCompositionContext = resolveParentCompositionContext();
        y40 o = q10.o(view);
        a21 n = p01.n(view);
        hl0 t = y80.t(view);
        if (resolveParentCompositionContext == composeViewContext.getCompositionContext$ui() && o == composeViewContext.getLifecycleOwner$ui() && n == composeViewContext.getViewModelStoreOwner$ui() && t == composeViewContext.getSavedStateRegistryOwner$ui()) {
            return composeViewContext;
        }
        if (resolveParentCompositionContext.getEffectCoroutineContext() != composeViewContext.getCompositionContext$ui().getEffectCoroutineContext()) {
            disposeComposition();
        }
        if (o == null) {
            o = composeViewContext.getLifecycleOwner$ui();
        }
        y40 y40Var = o;
        if (t == null) {
            t = composeViewContext.getSavedStateRegistryOwner$ui();
        }
        ComposeViewContext copy = composeViewContext.copy(view, resolveParentCompositionContext, y40Var, t, n);
        ComposeView_androidKt.setComposeViewContext(view, copy);
        return copy;
    }

    public abstract void Content(Composer composer, int i);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void createComposition() {
        ComposeViewContext composeViewContext;
        View view$ui;
        if (this.parentContext == null && !isAttachedToWindow() && ((composeViewContext = this.composeViewContext) == null || composeViewContext == null || (view$ui = composeViewContext.getView$ui()) == null || !view$ui.isAttachedToWindow())) {
            o.f("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            ensureCompositionCreated();
        }
    }

    public final void disposeComposition() {
        View childAt = getChildAt(0);
        AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
        if (androidComposeView != null) {
            androidComposeView.removeConnectionToComposeViewContext();
        }
        Composition composition = this.composition;
        if (composition != null) {
            composition.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m6677getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        AutoClearFocusBehavior autoClearFocusBehavior = tag instanceof AutoClearFocusBehavior ? (AutoClearFocusBehavior) tag : null;
        return autoClearFocusBehavior != null ? autoClearFocusBehavior.m6717unboximpl() : AutoClearFocusBehavior.Companion.m6719getDefault4UtRPd4();
    }

    public final ComposeViewContext getComposeViewContext$ui() {
        return this.composeViewContext;
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (WindowRecomposer_androidKt.getContentChild(this).getParent() == null) {
            getHandler().postAtFrontOfQueue(new j(this, 0));
        } else {
            attachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        internalOnLayout$ui(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ensureCompositionCreated();
        internalOnMeasure$ui(i, i2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m6678setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, AutoClearFocusBehavior.m6711boximpl(i));
    }

    public final void setComposeViewContext$ui(ComposeViewContext composeViewContext) {
        if (this.composeViewContext != composeViewContext) {
            if (composeViewContext == null) {
                disposeComposition();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
                if (androidComposeView != null) {
                    if (androidComposeView.getCoroutineContext() != composeViewContext.getCompositionContext$ui().getEffectCoroutineContext()) {
                        disposeComposition();
                    }
                    androidComposeView.setComposeViewContext(composeViewContext);
                }
            }
            this.composeViewContext = composeViewContext;
        }
    }

    public final void setParentCompositionContext(CompositionContext compositionContext) {
        setParentContext(compositionContext);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        iy iyVar = this.disposeViewCompositionStrategy;
        if (iyVar != null) {
            iyVar.invoke();
        }
        this.disposeViewCompositionStrategy = viewCompositionStrategy.installFor(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        checkAddView();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        checkAddView();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i, layoutParams);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, dq dqVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public final void createComposition(ComposeViewContext composeViewContext) {
        if (composeViewContext.getView$ui().isAttachedToWindow()) {
            setComposeViewContext$ui(composeViewContext);
            ensureCompositionCreated();
        } else {
            o.f("createComposition requires the ComposeViewContext's view to be attached to a window.");
        }
    }
}

package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.ViewRootForInspector;
import defpackage.dq;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    public static final int $stable = 8;
    private final int compositeKeyHash;
    private final NestedScrollDispatcher dispatcher;
    private ky releaseBlock;
    private ky resetBlock;
    private SaveableStateRegistry.Entry savableRegistryEntry;
    private final String saveStateKey;
    private final SaveableStateRegistry saveStateRegistry;
    private final T typedView;
    private ky updateBlock;

    private ViewFactoryHolder(Context context, CompositionContext compositionContext, T t, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i, Owner owner) {
        super(context, compositionContext, i, nestedScrollDispatcher, t, owner);
        this.typedView = t;
        this.dispatcher = nestedScrollDispatcher;
        this.saveStateRegistry = saveableStateRegistry;
        this.compositeKeyHash = i;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        this.saveStateKey = valueOf;
        Object consumeRestored = saveableStateRegistry != null ? saveableStateRegistry.consumeRestored(valueOf) : null;
        SparseArray<Parcelable> sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : null;
        if (sparseArray != null) {
            t.restoreHierarchyState(sparseArray);
        }
        registerSaveStateProvider();
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
        this.resetBlock = AndroidView_androidKt.getNoOpUpdate();
        this.releaseBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    private final void registerSaveStateProvider() {
        SaveableStateRegistry saveableStateRegistry = this.saveStateRegistry;
        if (saveableStateRegistry != null) {
            setSavableRegistryEntry(saveableStateRegistry.registerProvider(this.saveStateKey, new ViewFactoryHolder$registerSaveStateProvider$1(this)));
        }
    }

    private final void setSavableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.savableRegistryEntry;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.savableRegistryEntry = entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterSaveStateProvider() {
        setSavableRegistryEntry(null);
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final ky getReleaseBlock() {
        return this.releaseBlock;
    }

    public final ky getResetBlock() {
        return this.resetBlock;
    }

    public final ky getUpdateBlock() {
        return this.updateBlock;
    }

    public final void setReleaseBlock(ky kyVar) {
        this.releaseBlock = kyVar;
        setRelease(new ViewFactoryHolder$releaseBlock$1(this));
    }

    public final void setResetBlock(ky kyVar) {
        this.resetBlock = kyVar;
        setReset(new ViewFactoryHolder$resetBlock$1(this));
    }

    public final void setUpdateBlock(ky kyVar) {
        this.updateBlock = kyVar;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public View getViewRoot() {
        return this;
    }

    public /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, View view, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i, Owner owner, int i2, dq dqVar) {
        this(context, (i2 & 2) != 0 ? null : compositionContext, view, (i2 & 8) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher, saveableStateRegistry, i, owner);
    }

    public /* synthetic */ ViewFactoryHolder(Context context, ky kyVar, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i, Owner owner, int i2, dq dqVar) {
        this(context, kyVar, (i2 & 4) != 0 ? null : compositionContext, saveableStateRegistry, i, owner);
    }

    public ViewFactoryHolder(Context context, ky kyVar, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i, Owner owner) {
        this(context, compositionContext, (View) kyVar.invoke(context), null, saveableStateRegistry, i, owner, 8, null);
    }
}

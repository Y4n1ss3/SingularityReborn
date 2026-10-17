package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.ComposeRuntimeFlags;
import androidx.compose.runtime.GapRememberObserverHolder;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.iy;
import defpackage.ky;
import defpackage.ql0;
import defpackage.rl0;
import defpackage.sl0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RememberEventDispatcher implements RememberManager {
    public static final int $stable = 8;
    private Set<RememberObserver> abandoning;
    private MutableVector<RememberObserverHolder> currentRememberingList;
    private rl0 ignoreLeavingSet;
    private final MutableVector<Object> leaving;
    private ArrayList<MutableVector<RememberObserverHolder>> nestedRemembersLists;
    private fb0 pausedPlaceholders;
    private gb0 releasing;
    private gb0 rememberSet;
    private final MutableVector<RememberObserverHolder> remembering;
    private final MutableVector<iy> sideEffects;
    private CompositionErrorContext traceContext;

    public RememberEventDispatcher() {
        MutableVector<RememberObserverHolder> mutableVector = new MutableVector<>(new RememberObserverHolder[16], 0);
        this.remembering = mutableVector;
        gb0 gb0Var = sl0.a;
        this.rememberSet = new gb0();
        this.currentRememberingList = mutableVector;
        this.leaving = new MutableVector<>(new Object[16], 0);
        this.sideEffects = new MutableVector<>(new iy[16], 0);
    }

    private final void dispatchRememberList(MutableVector<RememberObserverHolder> mutableVector) {
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        RememberObserverHolder[] rememberObserverHolderArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            RememberObserverHolder rememberObserverHolder = rememberObserverHolderArr[i];
            RememberObserver wrapped = rememberObserverHolder.getWrapped();
            set.remove(wrapped);
            try {
                wrapped.onRemembered();
            } catch (Throwable th) {
                CompositionErrorContext compositionErrorContext = this.traceContext;
                if (compositionErrorContext != null) {
                    compositionErrorContext.attachComposeStackTrace(th, rememberObserverHolder);
                }
                throw th;
            }
        }
    }

    private static final boolean forgetting$removeFrom(RememberObserverHolder rememberObserverHolder, MutableVector<RememberObserverHolder> mutableVector) {
        RememberObserverHolder[] rememberObserverHolderArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            RememberObserver wrapped = rememberObserverHolderArr[i].getWrapped();
            if (wrapped instanceof PausedCompositionRemembers) {
                MutableVector<RememberObserverHolder> pausedRemembers = ((PausedCompositionRemembers) wrapped).getPausedRemembers();
                if (pausedRemembers.remove(rememberObserverHolder) || forgetting$removeFrom(rememberObserverHolder, pausedRemembers)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void recordLeaving(Object obj) {
        this.leaving.add(obj);
    }

    private final <T> T withComposeStackTrace(Object obj, iy iyVar) {
        try {
            return (T) iyVar.invoke();
        } catch (Throwable th) {
            CompositionErrorContext compositionErrorContext = this.traceContext;
            if (compositionErrorContext != null) {
                compositionErrorContext.attachComposeStackTrace(th, obj);
            }
            throw th;
        }
    }

    public final void clear() {
        this.abandoning = null;
        this.traceContext = null;
        this.remembering.clear();
        this.rememberSet.f();
        this.currentRememberingList = this.remembering;
        this.leaving.clear();
        this.sideEffects.clear();
        this.releasing = null;
        this.pausedPlaceholders = null;
        this.nestedRemembersLists = null;
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
        recordLeaving(composeNodeLifecycleCallback);
    }

    public final void dispatchAbandons() {
        Set<RememberObserver> set = this.abandoning;
        if (set == null || set.isEmpty()) {
            return;
        }
        Object beginSection = Trace.INSTANCE.beginSection("Compose:abandons");
        try {
            Iterator<RememberObserver> it = set.iterator();
            while (it.hasNext()) {
                RememberObserver next = it.next();
                it.remove();
                next.onAbandoned();
            }
        } finally {
            Trace.INSTANCE.endSection(beginSection);
        }
    }

    public final void dispatchOnDeactivateIfNecessary(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
        if (this.leaving.remove(composeNodeLifecycleCallback)) {
            composeNodeLifecycleCallback.onDeactivate();
        }
    }

    public final void dispatchRememberObservers() {
        Object beginSection;
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        this.ignoreLeavingSet = null;
        if (this.leaving.getSize() != 0) {
            beginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
            try {
                gb0 gb0Var = this.releasing;
                int size = this.leaving.getSize();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = this.leaving.content[size];
                    try {
                        if (obj instanceof RememberObserverHolder) {
                            RememberObserver wrapped = ((RememberObserverHolder) obj).getWrapped();
                            set.remove(wrapped);
                            wrapped.onForgotten();
                        }
                        if (obj instanceof ComposeNodeLifecycleCallback) {
                            if (gb0Var == null || !gb0Var.a(obj)) {
                                ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                            } else {
                                ((ComposeNodeLifecycleCallback) obj).onRelease();
                            }
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.remembering.getSize() != 0) {
            Trace trace = Trace.INSTANCE;
            beginSection = trace.beginSection("Compose:onRemembered");
            try {
                dispatchRememberList(this.remembering);
                trace.endSection(beginSection);
            } finally {
                Trace.INSTANCE.endSection(beginSection);
            }
        }
    }

    public final void dispatchSideEffects() {
        if (this.sideEffects.getSize() != 0) {
            Object beginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
            try {
                MutableVector<iy> mutableVector = this.sideEffects;
                iy[] iyVarArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    iyVarArr[i].invoke();
                }
                this.sideEffects.clear();
                Trace.INSTANCE.endSection(beginSection);
            } catch (Throwable th) {
                Trace.INSTANCE.endSection(beginSection);
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void endResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        MutableVector<RememberObserverHolder> mutableVector;
        fb0 fb0Var = this.pausedPlaceholders;
        if (fb0Var == null || ((PausedCompositionRemembers) fb0Var.d(recomposeScopeImpl)) == null) {
            return;
        }
        ArrayList<MutableVector<RememberObserverHolder>> arrayList = this.nestedRemembersLists;
        if (arrayList != null && (mutableVector = (MutableVector) Stack.m3871popimpl(arrayList)) != null) {
            this.currentRememberingList = mutableVector;
        }
        fb0Var.j(recomposeScopeImpl);
    }

    public final rl0 extractRememberSet() {
        if (!this.rememberSet.c()) {
            return null;
        }
        gb0 gb0Var = this.rememberSet;
        gb0 gb0Var2 = sl0.a;
        this.rememberSet = new gb0();
        this.remembering.clear();
        return gb0Var;
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void forgetting(RememberObserverHolder rememberObserverHolder) {
        if (!this.rememberSet.a(rememberObserverHolder)) {
            rl0 rl0Var = this.ignoreLeavingSet;
            if (rl0Var == null || !rl0Var.a(rememberObserverHolder)) {
                recordLeaving(rememberObserverHolder);
                return;
            }
            return;
        }
        this.rememberSet.m(rememberObserverHolder);
        if (!this.currentRememberingList.remove(rememberObserverHolder) && !this.remembering.remove(rememberObserverHolder)) {
            forgetting$removeFrom(rememberObserverHolder, this.remembering);
        }
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        set.add(rememberObserverHolder.getWrapped());
    }

    public final void ignoreForgotten(rl0 rl0Var) {
        this.ignoreLeavingSet = rl0Var;
    }

    public final void prepare(Set<RememberObserver> set, CompositionErrorContext compositionErrorContext) {
        clear();
        this.abandoning = set;
        this.traceContext = compositionErrorContext;
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
        gb0 gb0Var = this.releasing;
        if (gb0Var == null) {
            gb0 gb0Var2 = sl0.a;
            gb0Var = new gb0();
            this.releasing = gb0Var;
        }
        gb0Var.l(composeNodeLifecycleCallback);
        recordLeaving(composeNodeLifecycleCallback);
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void rememberPausingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        PausedCompositionRemembers pausedCompositionRemembers = new PausedCompositionRemembers(set);
        fb0 fb0Var = this.pausedPlaceholders;
        if (fb0Var == null) {
            long[] jArr = ql0.a;
            fb0Var = new fb0();
            this.pausedPlaceholders = fb0Var;
        }
        fb0Var.l(recomposeScopeImpl, pausedCompositionRemembers);
        MutableVector<RememberObserverHolder> mutableVector = this.currentRememberingList;
        ComposeRuntimeFlags composeRuntimeFlags = ComposeRuntimeFlags.INSTANCE;
        mutableVector.add(new GapRememberObserverHolder(pausedCompositionRemembers, -1));
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void remembering(RememberObserverHolder rememberObserverHolder) {
        this.currentRememberingList.add(rememberObserverHolder);
        this.rememberSet.d(rememberObserverHolder);
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void sideEffect(iy iyVar) {
        this.sideEffects.add(iyVar);
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void startResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        fb0 fb0Var = this.pausedPlaceholders;
        PausedCompositionRemembers pausedCompositionRemembers = fb0Var != null ? (PausedCompositionRemembers) fb0Var.d(recomposeScopeImpl) : null;
        if (pausedCompositionRemembers != null) {
            ArrayList<MutableVector<RememberObserverHolder>> arrayList = this.nestedRemembersLists;
            if (arrayList == null) {
                arrayList = Stack.m3862constructorimpl$default(null, 1, null);
                this.nestedRemembersLists = arrayList;
            }
            Stack.m3872pushimpl(arrayList, this.currentRememberingList);
            this.currentRememberingList = pausedCompositionRemembers.getPausedRemembers();
        }
    }

    public final void use(Set<RememberObserver> set, CompositionErrorContext compositionErrorContext, ky kyVar) {
        try {
            prepare(set, compositionErrorContext);
            kyVar.invoke(this);
        } finally {
            clear();
        }
    }
}

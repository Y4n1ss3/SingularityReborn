package androidx.compose.runtime;

import androidx.compose.runtime.composer.RememberManager;
import defpackage.cd0;
import defpackage.pl0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class SlotStorage {
    public static final int $stable = 0;

    public abstract void clear(RememberManager rememberManager);

    public abstract void collectCalledByInformation();

    public abstract void collectSourceInformation();

    public abstract void deactivateAll(RememberManager rememberManager);

    public abstract void dispose();

    public abstract void disposeUnusedMovableContent(RememberManager rememberManager, MovableContentState movableContentState);

    public abstract pl0 extractNestedStates(Applier<?> applier, cd0 cd0Var);

    /* renamed from: getSlots */
    public abstract Iterable<Object> mo4029getSlots();

    public abstract boolean groupContainsAnchor(int i, Anchor anchor);

    public abstract boolean inGroup(Anchor anchor, Anchor anchor2);

    public abstract void invalidateAll();

    public abstract List<RecomposeScopeImpl> invalidateGroupsWithKey(int i);

    public abstract boolean isEmpty();

    public abstract boolean ownsRecomposeScope(RecomposeScopeImpl recomposeScopeImpl);

    public abstract String toDebugString();

    public abstract void verifyWellFormed();
}

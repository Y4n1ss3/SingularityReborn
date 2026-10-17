package androidx.compose.runtime;

import defpackage.iy;
import defpackage.my;
import defpackage.xe0;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ControlledComposition extends Composition {
    void abandonChanges();

    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(my myVar);

    <R> R delegateInvalidations(ControlledComposition controlledComposition, int i, iy iyVar);

    void disposeUnusedMovableContent(MovableContentState movableContentState);

    ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback shouldPauseCallback);

    boolean getHasPendingChanges();

    void insertMovableContent(List<xe0> list);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(Set<? extends Object> set);

    void prepareCompose(iy iyVar);

    boolean recompose();

    void recordModificationsOf(Set<? extends Object> set);

    void recordReadOf(Object obj);

    void recordWriteOf(Object obj);

    void verifyConsistent();
}

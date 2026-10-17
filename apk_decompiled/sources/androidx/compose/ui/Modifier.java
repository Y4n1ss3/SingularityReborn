package androidx.compose.ui;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import defpackage.b20;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.ts;
import defpackage.un;
import defpackage.z10;
import defpackage.zl;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface Modifier {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static Modifier then(Modifier modifier, Modifier modifier2) {
            return Modifier.super.then(modifier2);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Element extends Modifier {

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(Element element, ky kyVar) {
                return Element.super.all(kyVar);
            }

            @Deprecated
            public static boolean any(Element element, ky kyVar) {
                return Element.super.any(kyVar);
            }

            @Deprecated
            public static <R> R foldIn(Element element, R r, my myVar) {
                return (R) Element.super.foldIn(r, myVar);
            }

            @Deprecated
            public static <R> R foldOut(Element element, R r, my myVar) {
                return (R) Element.super.foldOut(r, myVar);
            }

            @Deprecated
            public static Modifier then(Element element, Modifier modifier) {
                return Element.super.then(modifier);
            }
        }

        @Override // androidx.compose.ui.Modifier
        default boolean all(ky kyVar) {
            return ((Boolean) kyVar.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default boolean any(ky kyVar) {
            return ((Boolean) kyVar.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldIn(R r, my myVar) {
            return (R) myVar.invoke(r, this);
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldOut(R r, my myVar) {
            return (R) myVar.invoke(this, r);
        }
    }

    boolean all(ky kyVar);

    boolean any(ky kyVar);

    <R> R foldIn(R r, my myVar);

    <R> R foldOut(R r, my myVar);

    default Modifier then(Modifier modifier) {
        return modifier == Companion ? this : new CombinedModifier(this, modifier);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.ui.Modifier
        public boolean all(ky kyVar) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(ky kyVar) {
            return false;
        }

        public String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier then(Modifier modifier) {
            return modifier;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R r, my myVar) {
            return r;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R r, my myVar) {
            return r;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* loaded from: classes2.dex */
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        private Node child;
        private NodeCoordinator coordinator;
        private iy detachedListener;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private ObserverNodeOwnerScope ownerScope;
        private Node parent;
        private un scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private Node node = this;
        private int aggregateChildKindSet = -1;

        public final int getAggregateChildKindSet$ui() {
            return this.aggregateChildKindSet;
        }

        public final Node getChild$ui() {
            return this.child;
        }

        public final NodeCoordinator getCoordinator$ui() {
            return this.coordinator;
        }

        public final un getCoroutineScope() {
            un unVar = this.scope;
            if (unVar != null) {
                return unVar;
            }
            zl a = p10.a(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(new b20((z10) DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(ts.l))));
            this.scope = a;
            return a;
        }

        public final iy getDetachedListener$ui() {
            return this.detachedListener;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui() {
            return this.kindSet;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public final Node getNode() {
            return this.node;
        }

        public final ObserverNodeOwnerScope getOwnerScope$ui() {
            return this.ownerScope;
        }

        public final Node getParent$ui() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        /* renamed from: isKind-H91voCI$ui, reason: not valid java name */
        public final boolean m4190isKindH91voCI$ui(int i) {
            return (getKindSet$ui() & i) != 0;
        }

        public void markAsAttached$ui() {
            if (this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.throwIllegalStateException("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void markAsDetached$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            un unVar = this.scope;
            if (unVar != null) {
                p10.h(unVar, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void reset$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("reset() called on an unattached node");
            }
            onReset();
        }

        public void runAttachLifecycle$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.throwIllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            iy iyVar = this.detachedListener;
            if (iyVar != null) {
                iyVar.invoke();
            }
            onDetach();
        }

        public final void setAggregateChildKindSet$ui(int i) {
            this.aggregateChildKindSet = i;
        }

        public void setAsDelegateTo$ui(Node node) {
            this.node = node;
        }

        public final void setChild$ui(Node node) {
            this.child = node;
        }

        public final void setDetachedListener$ui(iy iyVar) {
            this.detachedListener = iyVar;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        public final void setKindSet$ui(int i) {
            this.kindSet = i;
        }

        public final void setOwnerScope$ui(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void setParent$ui(Node node) {
            this.parent = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        public final void sideEffect(iy iyVar) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(iyVar);
        }

        public void updateCoordinator$ui(NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }
    }
}

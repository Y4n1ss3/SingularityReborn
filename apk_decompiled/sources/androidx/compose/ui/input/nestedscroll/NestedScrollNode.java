package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.Velocity;
import defpackage.hm;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {
    public static final int $stable = 8;
    private NestedScrollConnection connection;
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollDispatcher resolvedDispatcher;
    private final Object traverseKey;

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final un getNestedCoroutineScope() {
        NestedScrollNode parentNestedScrollNode$ui = getParentNestedScrollNode$ui();
        un nestedCoroutineScope = parentNestedScrollNode$ui != null ? parentNestedScrollNode$ui.getNestedCoroutineScope() : null;
        if (nestedCoroutineScope != null && p10.x(nestedCoroutineScope)) {
            return nestedCoroutineScope;
        }
        un scope$ui = this.resolvedDispatcher.getScope$ui();
        if (scope$ui != null) {
            return scope$ui;
        }
        o.f("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    private final NestedScrollConnection getParentConnection() {
        if (isAttached()) {
            return getParentNestedScrollNode$ui();
        }
        return null;
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getNestedScrollNode$ui() == this) {
            this.resolvedDispatcher.setNestedScrollNode$ui(null);
        }
    }

    private final void updateDispatcher(NestedScrollDispatcher nestedScrollDispatcher) {
        resetDispatcherFields();
        if (nestedScrollDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (nestedScrollDispatcher != this.resolvedDispatcher) {
            this.resolvedDispatcher = nestedScrollDispatcher;
        }
        if (isAttached()) {
            updateDispatcherFields();
        }
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setNestedScrollNode$ui(this);
        this.resolvedDispatcher.setLastKnownParentNode$ui(null);
        this.lastKnownParentNode = null;
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui(new NestedScrollNode$updateDispatcherFields$1(this));
        this.resolvedDispatcher.setScope$ui(getCoroutineScope());
    }

    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final NestedScrollNode getLastKnownParentNode$ui() {
        return this.lastKnownParentNode;
    }

    public final NestedScrollNode getParentNestedScrollNode$ui() {
        if (isAttached()) {
            return (NestedScrollNode) TraversableNodeKt.findNearestAncestor(this);
        }
        return null;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        TraversableNode findNearestAttachedAncestor;
        findNearestAttachedAncestor = NestedScrollNodeKt.findNearestAttachedAncestor(this);
        NestedScrollNode nestedScrollNode = (NestedScrollNode) findNearestAttachedAncestor;
        this.lastKnownParentNode = nestedScrollNode;
        this.resolvedDispatcher.setLastKnownParentNode$ui(nestedScrollNode);
        resetDispatcherFields();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo533onPostFlingRZ2iAVY(long j, long j2, hm hmVar) {
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        int i;
        long j3;
        long j4;
        long m7858unboximpl;
        NestedScrollConnection parentConnection;
        long m7860getZero9UxMQ8M;
        long j5;
        if (hmVar instanceof NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (NestedScrollNode$onPostFling$1) hmVar;
            int i2 = nestedScrollNode$onPostFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPostFling$1.label = i2 - Integer.MIN_VALUE;
                NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$12 = nestedScrollNode$onPostFling$1;
                Object obj = nestedScrollNode$onPostFling$12.result;
                i = nestedScrollNode$onPostFling$12.label;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    NestedScrollConnection nestedScrollConnection = this.connection;
                    nestedScrollNode$onPostFling$12.J$0 = j;
                    nestedScrollNode$onPostFling$12.J$1 = j2;
                    nestedScrollNode$onPostFling$12.label = 1;
                    obj = nestedScrollConnection.mo533onPostFlingRZ2iAVY(j, j2, nestedScrollNode$onPostFling$12);
                    if (obj != vnVar) {
                        j3 = j;
                        j4 = j2;
                    }
                    return vnVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j5 = nestedScrollNode$onPostFling$12.J$0;
                    p10.Q(obj);
                    m7860getZero9UxMQ8M = ((Velocity) obj).m7858unboximpl();
                    m7858unboximpl = j5;
                    return Velocity.m7840boximpl(Velocity.m7853plusAH228Gc(m7858unboximpl, m7860getZero9UxMQ8M));
                }
                j4 = nestedScrollNode$onPostFling$12.J$1;
                j3 = nestedScrollNode$onPostFling$12.J$0;
                p10.Q(obj);
                m7858unboximpl = ((Velocity) obj).m7858unboximpl();
                parentConnection = !isAttached() ? getParentConnection() : this.lastKnownParentNode;
                if (parentConnection != null) {
                    m7860getZero9UxMQ8M = Velocity.Companion.m7860getZero9UxMQ8M();
                    return Velocity.m7840boximpl(Velocity.m7853plusAH228Gc(m7858unboximpl, m7860getZero9UxMQ8M));
                }
                long m7853plusAH228Gc = Velocity.m7853plusAH228Gc(j3, m7858unboximpl);
                long m7852minusAH228Gc = Velocity.m7852minusAH228Gc(j4, m7858unboximpl);
                nestedScrollNode$onPostFling$12.J$0 = m7858unboximpl;
                nestedScrollNode$onPostFling$12.label = 2;
                obj = parentConnection.mo533onPostFlingRZ2iAVY(m7853plusAH228Gc, m7852minusAH228Gc, nestedScrollNode$onPostFling$12);
                if (obj != vnVar) {
                    j5 = m7858unboximpl;
                    m7860getZero9UxMQ8M = ((Velocity) obj).m7858unboximpl();
                    m7858unboximpl = j5;
                    return Velocity.m7840boximpl(Velocity.m7853plusAH228Gc(m7858unboximpl, m7860getZero9UxMQ8M));
                }
                return vnVar;
            }
        }
        nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, hmVar);
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$122 = nestedScrollNode$onPostFling$1;
        Object obj2 = nestedScrollNode$onPostFling$122.result;
        i = nestedScrollNode$onPostFling$122.label;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
        m7858unboximpl = ((Velocity) obj2).m7858unboximpl();
        if (!isAttached()) {
        }
        if (parentConnection != null) {
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo534onPostScrollDzOQY0M(long j, long j2, int i) {
        long mo534onPostScrollDzOQY0M = this.connection.mo534onPostScrollDzOQY0M(j, j2, i);
        NestedScrollConnection parentConnection = getParentConnection();
        return Offset.m4521plusMKHz9U(mo534onPostScrollDzOQY0M, parentConnection != null ? parentConnection.mo534onPostScrollDzOQY0M(Offset.m4521plusMKHz9U(j, mo534onPostScrollDzOQY0M), Offset.m4520minusMKHz9U(j2, mo534onPostScrollDzOQY0M), i) : Offset.Companion.m4532getZeroF1C5BW0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r10 == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo837onPreFlingQWom1Mo(long j, hm hmVar) {
        NestedScrollNode$onPreFling$1 nestedScrollNode$onPreFling$1;
        Object obj;
        int i;
        vn vnVar;
        long m7860getZero9UxMQ8M;
        long j2;
        if (hmVar instanceof NestedScrollNode$onPreFling$1) {
            nestedScrollNode$onPreFling$1 = (NestedScrollNode$onPreFling$1) hmVar;
            int i2 = nestedScrollNode$onPreFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPreFling$1.label = i2 - Integer.MIN_VALUE;
                obj = nestedScrollNode$onPreFling$1.result;
                i = nestedScrollNode$onPreFling$1.label;
                vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    NestedScrollConnection parentConnection = getParentConnection();
                    if (parentConnection == null) {
                        m7860getZero9UxMQ8M = Velocity.Companion.m7860getZero9UxMQ8M();
                        NestedScrollConnection nestedScrollConnection = this.connection;
                        long m7852minusAH228Gc = Velocity.m7852minusAH228Gc(j, m7860getZero9UxMQ8M);
                        nestedScrollNode$onPreFling$1.J$0 = m7860getZero9UxMQ8M;
                        nestedScrollNode$onPreFling$1.label = 2;
                        obj = nestedScrollConnection.mo837onPreFlingQWom1Mo(m7852minusAH228Gc, nestedScrollNode$onPreFling$1);
                        if (obj != vnVar) {
                            j2 = m7860getZero9UxMQ8M;
                            return Velocity.m7840boximpl(Velocity.m7853plusAH228Gc(j2, ((Velocity) obj).m7858unboximpl()));
                        }
                        return vnVar;
                    }
                    nestedScrollNode$onPreFling$1.J$0 = j;
                    nestedScrollNode$onPreFling$1.label = 1;
                    obj = parentConnection.mo837onPreFlingQWom1Mo(j, nestedScrollNode$onPreFling$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2 = nestedScrollNode$onPreFling$1.J$0;
                        p10.Q(obj);
                        return Velocity.m7840boximpl(Velocity.m7853plusAH228Gc(j2, ((Velocity) obj).m7858unboximpl()));
                    }
                    j = nestedScrollNode$onPreFling$1.J$0;
                    p10.Q(obj);
                }
                m7860getZero9UxMQ8M = ((Velocity) obj).m7858unboximpl();
                NestedScrollConnection nestedScrollConnection2 = this.connection;
                long m7852minusAH228Gc2 = Velocity.m7852minusAH228Gc(j, m7860getZero9UxMQ8M);
                nestedScrollNode$onPreFling$1.J$0 = m7860getZero9UxMQ8M;
                nestedScrollNode$onPreFling$1.label = 2;
                obj = nestedScrollConnection2.mo837onPreFlingQWom1Mo(m7852minusAH228Gc2, nestedScrollNode$onPreFling$1);
                if (obj != vnVar) {
                }
                return vnVar;
            }
        }
        nestedScrollNode$onPreFling$1 = new NestedScrollNode$onPreFling$1(this, hmVar);
        obj = nestedScrollNode$onPreFling$1.result;
        i = nestedScrollNode$onPreFling$1.label;
        vnVar = vn.d;
        if (i != 0) {
        }
        m7860getZero9UxMQ8M = ((Velocity) obj).m7858unboximpl();
        NestedScrollConnection nestedScrollConnection22 = this.connection;
        long m7852minusAH228Gc22 = Velocity.m7852minusAH228Gc(j, m7860getZero9UxMQ8M);
        nestedScrollNode$onPreFling$1.J$0 = m7860getZero9UxMQ8M;
        nestedScrollNode$onPreFling$1.label = 2;
        obj = nestedScrollConnection22.mo837onPreFlingQWom1Mo(m7852minusAH228Gc22, nestedScrollNode$onPreFling$1);
        if (obj != vnVar) {
        }
        return vnVar;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo838onPreScrollOzD1aCk(long j, int i) {
        NestedScrollConnection parentConnection = getParentConnection();
        long mo838onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo838onPreScrollOzD1aCk(j, i) : Offset.Companion.m4532getZeroF1C5BW0();
        return Offset.m4521plusMKHz9U(mo838onPreScrollOzD1aCk, this.connection.mo838onPreScrollOzD1aCk(Offset.m4520minusMKHz9U(j, mo838onPreScrollOzD1aCk), i));
    }

    public final void setConnection(NestedScrollConnection nestedScrollConnection) {
        this.connection = nestedScrollConnection;
    }

    public final void setLastKnownParentNode$ui(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void updateNode$ui(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        updateDispatcher(nestedScrollDispatcher);
    }

    private static /* synthetic */ void getNestedCoroutineScope$annotations() {
    }
}

package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import defpackage.hm;
import defpackage.iy;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    private iy calculateNestedScrollScope = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollNode nestedScrollNode;
    private un scope;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r0 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r0 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5950dispatchPostFlingRZ2iAVY(long j, long j2, hm hmVar) {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        int i;
        long m7860getZero9UxMQ8M;
        if (hmVar instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) hmVar;
            int i2 = nestedScrollDispatcher$dispatchPostFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.label = i2 - Integer.MIN_VALUE;
                NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$12 = nestedScrollDispatcher$dispatchPostFling$1;
                Object obj = nestedScrollDispatcher$dispatchPostFling$12.result;
                i = nestedScrollDispatcher$dispatchPostFling$12.label;
                if (i != 0) {
                    p10.Q(obj);
                    NestedScrollConnection parent$ui = getParent$ui();
                    vn vnVar = vn.d;
                    if (parent$ui == null) {
                        NestedScrollNode nestedScrollNode = this.lastKnownParentNode;
                        if (nestedScrollNode != null) {
                            nestedScrollDispatcher$dispatchPostFling$12.label = 1;
                            obj = nestedScrollNode.mo533onPostFlingRZ2iAVY(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                        } else {
                            m7860getZero9UxMQ8M = Velocity.Companion.m7860getZero9UxMQ8M();
                        }
                    } else {
                        NestedScrollConnection parent$ui2 = getParent$ui();
                        if (parent$ui2 != null) {
                            nestedScrollDispatcher$dispatchPostFling$12.label = 2;
                            obj = parent$ui2.mo533onPostFlingRZ2iAVY(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                        } else {
                            m7860getZero9UxMQ8M = Velocity.Companion.m7860getZero9UxMQ8M();
                        }
                    }
                } else if (i == 1) {
                    p10.Q(obj);
                    m7860getZero9UxMQ8M = ((Velocity) obj).m7858unboximpl();
                } else {
                    if (i != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    m7860getZero9UxMQ8M = ((Velocity) obj).m7858unboximpl();
                }
                return Velocity.m7840boximpl(m7860getZero9UxMQ8M);
            }
        }
        nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, hmVar);
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$122 = nestedScrollDispatcher$dispatchPostFling$1;
        Object obj2 = nestedScrollDispatcher$dispatchPostFling$122.result;
        i = nestedScrollDispatcher$dispatchPostFling$122.label;
        if (i != 0) {
        }
        return Velocity.m7840boximpl(m7860getZero9UxMQ8M);
    }

    /* renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m5951dispatchPostScrollDzOQY0M(long j, long j2, int i) {
        NestedScrollConnection parent$ui = getParent$ui();
        return parent$ui != null ? parent$ui.mo534onPostScrollDzOQY0M(j, j2, i) : Offset.Companion.m4532getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5952dispatchPreFlingQWom1Mo(long j, hm hmVar) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        int i;
        long m7860getZero9UxMQ8M;
        if (hmVar instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) hmVar;
            int i2 = nestedScrollDispatcher$dispatchPreFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nestedScrollDispatcher$dispatchPreFling$1.result;
                i = nestedScrollDispatcher$dispatchPreFling$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    NestedScrollConnection parent$ui = getParent$ui();
                    if (parent$ui == null) {
                        m7860getZero9UxMQ8M = Velocity.Companion.m7860getZero9UxMQ8M();
                        return Velocity.m7840boximpl(m7860getZero9UxMQ8M);
                    }
                    nestedScrollDispatcher$dispatchPreFling$1.label = 1;
                    obj = parent$ui.mo837onPreFlingQWom1Mo(j, nestedScrollDispatcher$dispatchPreFling$1);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                m7860getZero9UxMQ8M = ((Velocity) obj).m7858unboximpl();
                return Velocity.m7840boximpl(m7860getZero9UxMQ8M);
            }
        }
        nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, hmVar);
        Object obj2 = nestedScrollDispatcher$dispatchPreFling$1.result;
        i = nestedScrollDispatcher$dispatchPreFling$1.label;
        if (i != 0) {
        }
        m7860getZero9UxMQ8M = ((Velocity) obj2).m7858unboximpl();
        return Velocity.m7840boximpl(m7860getZero9UxMQ8M);
    }

    /* renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m5953dispatchPreScrollOzD1aCk(long j, int i) {
        NestedScrollConnection parent$ui = getParent$ui();
        return parent$ui != null ? parent$ui.mo838onPreScrollOzD1aCk(j, i) : Offset.Companion.m4532getZeroF1C5BW0();
    }

    public final iy getCalculateNestedScrollScope$ui() {
        return this.calculateNestedScrollScope;
    }

    public final un getCoroutineScope() {
        un unVar = (un) this.calculateNestedScrollScope.invoke();
        if (unVar != null) {
            return unVar;
        }
        o.f("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final NestedScrollNode getLastKnownParentNode$ui() {
        return this.lastKnownParentNode;
    }

    public final NestedScrollNode getNestedScrollNode$ui() {
        return this.nestedScrollNode;
    }

    public final NestedScrollConnection getParent$ui() {
        NestedScrollNode nestedScrollNode = this.nestedScrollNode;
        if (nestedScrollNode != null) {
            return nestedScrollNode.getParentNestedScrollNode$ui();
        }
        return null;
    }

    public final un getScope$ui() {
        return this.scope;
    }

    public final void setCalculateNestedScrollScope$ui(iy iyVar) {
        this.calculateNestedScrollScope = iyVar;
    }

    public final void setLastKnownParentNode$ui(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void setNestedScrollNode$ui(NestedScrollNode nestedScrollNode) {
        this.nestedScrollNode = nestedScrollNode;
    }

    public final void setScope$ui(un unVar) {
        this.scope = unVar;
    }
}

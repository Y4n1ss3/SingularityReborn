package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import defpackage.hm;
import defpackage.p10;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterAlwaysScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ EnterAlwaysScrollBehavior this$0;

    public EnterAlwaysScrollBehavior$nestedScrollConnection$1(EnterAlwaysScrollBehavior enterAlwaysScrollBehavior) {
        this.this$0 = enterAlwaysScrollBehavior;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r0 == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo533onPostFlingRZ2iAVY(long j, long j2, hm hmVar) {
        EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        Object obj;
        int i;
        Object obj2;
        long j3;
        if (hmVar instanceof EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) {
            enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = (EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) hmVar;
            int i2 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.label = i2 - Integer.MIN_VALUE;
                EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
                obj = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.result;
                i = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.label;
                obj2 = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    if (Velocity.m7850getYimpl(j2) > 0.0f && (this.this$0.getState().getHeightOffset() == 0.0f || this.this$0.getState().getHeightOffset() == this.this$0.getState().getHeightOffsetLimit())) {
                        this.this$0.getState().setContentOffset(0.0f);
                    }
                    enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.J$0 = j2;
                    enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.label = 1;
                    obj = super.mo533onPostFlingRZ2iAVY(j, j2, enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.J$0;
                        p10.Q(obj);
                        return Velocity.m7840boximpl(Velocity.m7853plusAH228Gc(j3, ((Velocity) obj).m7858unboximpl()));
                    }
                    j2 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.J$0;
                    p10.Q(obj);
                }
                long m7858unboximpl = ((Velocity) obj).m7858unboximpl();
                TopAppBarState state = this.this$0.getState();
                float m7850getYimpl = Velocity.m7850getYimpl(j2);
                DecayAnimationSpec<Float> flingAnimationSpec = this.this$0.getFlingAnimationSpec();
                AnimationSpec<Float> snapAnimationSpec = this.this$0.getSnapAnimationSpec();
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.J$0 = m7858unboximpl;
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.label = 2;
                obj = AppBarKt.settleAppBar(state, m7850getYimpl, flingAnimationSpec, snapAnimationSpec, enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12);
                if (obj != obj2) {
                    j3 = m7858unboximpl;
                    return Velocity.m7840boximpl(Velocity.m7853plusAH228Gc(j3, ((Velocity) obj).m7858unboximpl()));
                }
                return obj2;
            }
        }
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = new EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(this, hmVar);
        EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$122 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        obj = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$122.result;
        i = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$122.label;
        obj2 = vn.d;
        if (i != 0) {
        }
        long m7858unboximpl2 = ((Velocity) obj).m7858unboximpl();
        TopAppBarState state2 = this.this$0.getState();
        float m7850getYimpl2 = Velocity.m7850getYimpl(j2);
        DecayAnimationSpec<Float> flingAnimationSpec2 = this.this$0.getFlingAnimationSpec();
        AnimationSpec<Float> snapAnimationSpec2 = this.this$0.getSnapAnimationSpec();
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$122.J$0 = m7858unboximpl2;
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$122.label = 2;
        obj = AppBarKt.settleAppBar(state2, m7850getYimpl2, flingAnimationSpec2, snapAnimationSpec2, enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$122);
        if (obj != obj2) {
        }
        return obj2;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo534onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!((Boolean) this.this$0.getCanScroll().invoke()).booleanValue()) {
            return Offset.Companion.m4532getZeroF1C5BW0();
        }
        TopAppBarState state = this.this$0.getState();
        int i2 = (int) (j & 4294967295L);
        state.setContentOffset(Float.intBitsToFloat(i2) + state.getContentOffset());
        if (!this.this$0.getReverseLayout()) {
            TopAppBarState state2 = this.this$0.getState();
            state2.setHeightOffset(Float.intBitsToFloat(i2) + state2.getHeightOffset());
        }
        return Offset.Companion.m4532getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo838onPreScrollOzD1aCk(long j, int i) {
        if (!((Boolean) this.this$0.getCanScroll().invoke()).booleanValue()) {
            return Offset.Companion.m4532getZeroF1C5BW0();
        }
        float heightOffset = this.this$0.getState().getHeightOffset();
        TopAppBarState state = this.this$0.getState();
        state.setHeightOffset(Float.intBitsToFloat((int) (4294967295L & j)) + state.getHeightOffset());
        return (this.this$0.getReverseLayout() || heightOffset == this.this$0.getState().getHeightOffset()) ? Offset.Companion.m4532getZeroF1C5BW0() : Offset.m4510copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
    }
}

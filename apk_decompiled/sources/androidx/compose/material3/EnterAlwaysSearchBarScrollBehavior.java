package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.dq;
import defpackage.gi0;
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.ny;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterAlwaysSearchBarScrollBehavior implements SearchBarScrollBehavior {
    public static final Companion Companion = new Companion(null);
    private MutableFloatState _offset;
    private final iy canScroll;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final NestedScrollConnection nestedScrollConnection = new NestedScrollConnection() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$nestedScrollConnection$1
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        public Object mo533onPostFlingRZ2iAVY(long j, long j2, hm hmVar) {
            Object m1948settleSearchBarOhffZ5M;
            if (!((Boolean) EnterAlwaysSearchBarScrollBehavior.this.getCanScroll().invoke()).booleanValue()) {
                return Velocity.m7840boximpl(Velocity.Companion.m7860getZero9UxMQ8M());
            }
            m1948settleSearchBarOhffZ5M = EnterAlwaysSearchBarScrollBehavior.this.m1948settleSearchBarOhffZ5M(Velocity.m7850getYimpl(j2), hmVar);
            return m1948settleSearchBarOhffZ5M;
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public long mo534onPostScrollDzOQY0M(long j, long j2, int i) {
            if (!((Boolean) EnterAlwaysSearchBarScrollBehavior.this.getCanScroll().invoke()).booleanValue()) {
                return Offset.Companion.m4532getZeroF1C5BW0();
            }
            if (EnterAlwaysSearchBarScrollBehavior.this.getReverseLayout()) {
                int i2 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i2) > 0.0f) {
                    EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = EnterAlwaysSearchBarScrollBehavior.this;
                    enterAlwaysSearchBarScrollBehavior.setScrollOffset(Float.intBitsToFloat(i2) + enterAlwaysSearchBarScrollBehavior.getScrollOffset());
                    return Offset.m4510copydBAh8RU$default(j2, 0.0f, 0.0f, 2, null);
                }
            }
            if (!EnterAlwaysSearchBarScrollBehavior.this.getReverseLayout()) {
                EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior2 = EnterAlwaysSearchBarScrollBehavior.this;
                enterAlwaysSearchBarScrollBehavior2.setScrollOffset(Float.intBitsToFloat((int) (j & 4294967295L)) + enterAlwaysSearchBarScrollBehavior2.getScrollOffset());
            }
            return Offset.Companion.m4532getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public long mo838onPreScrollOzD1aCk(long j, int i) {
            if (!((Boolean) EnterAlwaysSearchBarScrollBehavior.this.getCanScroll().invoke()).booleanValue()) {
                return Offset.Companion.m4532getZeroF1C5BW0();
            }
            float scrollOffset = EnterAlwaysSearchBarScrollBehavior.this.getScrollOffset();
            EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = EnterAlwaysSearchBarScrollBehavior.this;
            enterAlwaysSearchBarScrollBehavior.setScrollOffset(Float.intBitsToFloat((int) (4294967295L & j)) + enterAlwaysSearchBarScrollBehavior.getScrollOffset());
            return (EnterAlwaysSearchBarScrollBehavior.this.getReverseLayout() || scrollOffset == EnterAlwaysSearchBarScrollBehavior.this.getScrollOffset()) ? Offset.Companion.m4532getZeroF1C5BW0() : Offset.m4510copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
        }
    };
    private final boolean reverseLayout;
    private final MutableFloatState scrollOffsetLimit$delegate;
    private final AnimationSpec<Float> snapAnimationSpec;

    public EnterAlwaysSearchBarScrollBehavior(float f, float f2, iy iyVar, boolean z, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec) {
        this.canScroll = iyVar;
        this.reverseLayout = z;
        this.snapAnimationSpec = animationSpec;
        this.flingAnimationSpec = decayAnimationSpec;
        this._offset = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.scrollOffsetLimit$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 searchBarScrollBehavior$lambda$0(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, float f) {
        enterAlwaysSearchBarScrollBehavior.setScrollOffset(enterAlwaysSearchBarScrollBehavior.getScrollOffset() + f);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult searchBarScrollBehavior$lambda$2(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(constraints.m7570unboximpl());
        final int P = y80.P(enterAlwaysSearchBarScrollBehavior.getScrollOffset());
        int height = mo6234measureBRTryo0.getHeight() + P;
        if (height < 0) {
            height = 0;
        }
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), height, null, new ky() { // from class: androidx.compose.material3.d0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 searchBarScrollBehavior$lambda$2$lambda$1;
                searchBarScrollBehavior$lambda$2$lambda$1 = EnterAlwaysSearchBarScrollBehavior.searchBarScrollBehavior$lambda$2$lambda$1(mo6234measureBRTryo0, P, (Placeable.PlacementScope) obj);
                return searchBarScrollBehavior$lambda$2$lambda$1;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 searchBarScrollBehavior$lambda$2$lambda$1(Placeable placeable, int i, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, i, 0.0f, (ky) null, 12, (Object) null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 searchBarScrollBehavior$lambda$3(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, IntSize intSize) {
        enterAlwaysSearchBarScrollBehavior.setScrollOffsetLimit(-((int) (intSize.m7786unboximpl() & 4294967295L)));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* renamed from: settleSearchBar-OhffZ5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1948settleSearchBarOhffZ5M(float f, hm hmVar) {
        EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1 enterAlwaysSearchBarScrollBehavior$settleSearchBar$1;
        int i;
        float scrollOffset;
        gi0 gi0Var;
        gi0 gi0Var2;
        AnimationState AnimationState$default;
        Float f2;
        AnimationSpec<Float> animationSpec;
        c0 c0Var;
        gi0 gi0Var3;
        if (hmVar instanceof EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1) {
            enterAlwaysSearchBarScrollBehavior$settleSearchBar$1 = (EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1) hmVar;
            int i2 = enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.label = i2 - Integer.MIN_VALUE;
                EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1 enterAlwaysSearchBarScrollBehavior$settleSearchBar$12 = enterAlwaysSearchBarScrollBehavior$settleSearchBar$1;
                Object obj = enterAlwaysSearchBarScrollBehavior$settleSearchBar$12.result;
                i = enterAlwaysSearchBarScrollBehavior$settleSearchBar$12.label;
                int i3 = 2;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    scrollOffset = getScrollOffsetLimit() == 0.0f ? 0.0f : getScrollOffset() / getScrollOffsetLimit();
                    if (scrollOffset < 0.01f || scrollOffset == 1.0f) {
                        return Velocity.m7840boximpl(Velocity.Companion.m7860getZero9UxMQ8M());
                    }
                    gi0Var = new gi0();
                    gi0Var.d = f;
                    if (Math.abs(f) > 1.0f) {
                        gi0 gi0Var4 = new gi0();
                        AnimationState AnimationState$default2 = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                        DecayAnimationSpec<Float> decayAnimationSpec = this.flingAnimationSpec;
                        e eVar = new e(gi0Var4, this, gi0Var, i3);
                        enterAlwaysSearchBarScrollBehavior$settleSearchBar$12.L$0 = gi0Var;
                        enterAlwaysSearchBarScrollBehavior$settleSearchBar$12.F$0 = scrollOffset;
                        enterAlwaysSearchBarScrollBehavior$settleSearchBar$12.label = 1;
                        if (SuspendAnimationKt.animateDecay$default(AnimationState$default2, decayAnimationSpec, false, eVar, enterAlwaysSearchBarScrollBehavior$settleSearchBar$12, 2, null) != vnVar) {
                            gi0Var2 = gi0Var;
                        }
                        return vnVar;
                    }
                    if (getScrollOffsetLimit() < getScrollOffset() && getScrollOffset() < 0.0f) {
                        AnimationState$default = AnimationStateKt.AnimationState$default(getScrollOffset(), 0.0f, 0L, 0L, false, 30, null);
                        f2 = new Float(scrollOffset >= 0.5f ? 0.0f : getScrollOffsetLimit());
                        animationSpec = this.snapAnimationSpec;
                        c0Var = new c0(this, 0);
                        enterAlwaysSearchBarScrollBehavior$settleSearchBar$12.L$0 = gi0Var;
                        enterAlwaysSearchBarScrollBehavior$settleSearchBar$12.label = 2;
                        if (SuspendAnimationKt.animateTo$default(AnimationState$default, f2, animationSpec, false, c0Var, enterAlwaysSearchBarScrollBehavior$settleSearchBar$12, 4, null) != vnVar) {
                            gi0Var3 = gi0Var;
                            gi0Var = gi0Var3;
                        }
                        return vnVar;
                    }
                    return Velocity.m7840boximpl(VelocityKt.Velocity(0.0f, gi0Var.d));
                }
                if (i != 1) {
                    if (i != 2) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gi0Var3 = (gi0) enterAlwaysSearchBarScrollBehavior$settleSearchBar$12.L$0;
                    p10.Q(obj);
                    gi0Var = gi0Var3;
                    return Velocity.m7840boximpl(VelocityKt.Velocity(0.0f, gi0Var.d));
                }
                scrollOffset = enterAlwaysSearchBarScrollBehavior$settleSearchBar$12.F$0;
                gi0Var2 = (gi0) enterAlwaysSearchBarScrollBehavior$settleSearchBar$12.L$0;
                p10.Q(obj);
                gi0Var = gi0Var2;
                if (getScrollOffsetLimit() < getScrollOffset()) {
                    AnimationState$default = AnimationStateKt.AnimationState$default(getScrollOffset(), 0.0f, 0L, 0L, false, 30, null);
                    f2 = new Float(scrollOffset >= 0.5f ? 0.0f : getScrollOffsetLimit());
                    animationSpec = this.snapAnimationSpec;
                    c0Var = new c0(this, 0);
                    enterAlwaysSearchBarScrollBehavior$settleSearchBar$12.L$0 = gi0Var;
                    enterAlwaysSearchBarScrollBehavior$settleSearchBar$12.label = 2;
                    if (SuspendAnimationKt.animateTo$default(AnimationState$default, f2, animationSpec, false, c0Var, enterAlwaysSearchBarScrollBehavior$settleSearchBar$12, 4, null) != vnVar) {
                    }
                    return vnVar;
                }
                return Velocity.m7840boximpl(VelocityKt.Velocity(0.0f, gi0Var.d));
            }
        }
        enterAlwaysSearchBarScrollBehavior$settleSearchBar$1 = new EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1(this, hmVar);
        EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1 enterAlwaysSearchBarScrollBehavior$settleSearchBar$122 = enterAlwaysSearchBarScrollBehavior$settleSearchBar$1;
        Object obj2 = enterAlwaysSearchBarScrollBehavior$settleSearchBar$122.result;
        i = enterAlwaysSearchBarScrollBehavior$settleSearchBar$122.label;
        int i32 = 2;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
        gi0Var = gi0Var2;
        if (getScrollOffsetLimit() < getScrollOffset()) {
        }
        return Velocity.m7840boximpl(VelocityKt.Velocity(0.0f, gi0Var.d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 settleSearchBar_OhffZ5M$lambda$4(gi0 gi0Var, EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, gi0 gi0Var2, AnimationScope animationScope) {
        float floatValue = ((Number) animationScope.getValue()).floatValue() - gi0Var.d;
        float scrollOffset = enterAlwaysSearchBarScrollBehavior.getScrollOffset();
        enterAlwaysSearchBarScrollBehavior.setScrollOffset(scrollOffset + floatValue);
        float abs = Math.abs(scrollOffset - enterAlwaysSearchBarScrollBehavior.getScrollOffset());
        gi0Var.d = ((Number) animationScope.getValue()).floatValue();
        gi0Var2.d = ((Number) animationScope.getVelocity()).floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            animationScope.cancelAnimation();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 settleSearchBar_OhffZ5M$lambda$5(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, AnimationScope animationScope) {
        enterAlwaysSearchBarScrollBehavior.setScrollOffset(((Number) animationScope.getValue()).floatValue());
        return w01.a;
    }

    public final iy getCanScroll() {
        return this.canScroll;
    }

    public final DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public float getScrollOffset() {
        return this._offset.getFloatValue();
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public float getScrollOffsetLimit() {
        return this.scrollOffsetLimit$delegate.getFloatValue();
    }

    public final AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public Modifier searchBarScrollBehavior(Modifier modifier) {
        return OnRemeasuredModifierKt.onSizeChanged(LayoutModifierKt.layout(ClipKt.clipToBounds(DraggableKt.draggable$default(modifier, DraggableKt.DraggableState(new c0(this, 1)), Orientation.Vertical, ((Boolean) this.canScroll.invoke()).booleanValue(), null, false, null, new EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2(this, null), false, 184, null)), new ny() { // from class: androidx.compose.material3.e0
            @Override // defpackage.ny
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                MeasureResult searchBarScrollBehavior$lambda$2;
                searchBarScrollBehavior$lambda$2 = EnterAlwaysSearchBarScrollBehavior.searchBarScrollBehavior$lambda$2(EnterAlwaysSearchBarScrollBehavior.this, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return searchBarScrollBehavior$lambda$2;
            }
        }), new c0(this, 2));
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public void setScrollOffset(float f) {
        this._offset.setFloatValue(y80.g(f, getScrollOffsetLimit(), 0.0f));
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public void setScrollOffsetLimit(float f) {
        this.scrollOffsetLimit$delegate.setFloatValue(f);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List Saver$lambda$0(SaverScope saverScope, EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior) {
            return y80.E(Float.valueOf(enterAlwaysSearchBarScrollBehavior.getScrollOffset()), Float.valueOf(enterAlwaysSearchBarScrollBehavior.getScrollOffsetLimit()), Boolean.valueOf(enterAlwaysSearchBarScrollBehavior.getReverseLayout()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EnterAlwaysSearchBarScrollBehavior Saver$lambda$1(iy iyVar, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, List list) {
            Object obj = list.get(0);
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            Object obj2 = list.get(1);
            obj2.getClass();
            float floatValue2 = ((Float) obj2).floatValue();
            Object obj3 = list.get(2);
            obj3.getClass();
            return new EnterAlwaysSearchBarScrollBehavior(floatValue, floatValue2, iyVar, ((Boolean) obj3).booleanValue(), animationSpec, decayAnimationSpec);
        }

        public final Saver<EnterAlwaysSearchBarScrollBehavior, ?> Saver(iy iyVar, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec) {
            return ListSaverKt.listSaver(new c(3), new defpackage.f1(iyVar, (Object) animationSpec, (Object) decayAnimationSpec, 10));
        }

        private Companion() {
        }
    }
}

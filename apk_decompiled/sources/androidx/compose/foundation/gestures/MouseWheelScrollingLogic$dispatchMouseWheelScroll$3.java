package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import defpackage.bq;
import defpackage.fi0;
import defpackage.gi0;
import defpackage.hm;
import defpackage.ji0;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", l = {297, 310, 334}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends us0 implements my {
    final /* synthetic */ ji0 $animationState;
    final /* synthetic */ float $speed;
    final /* synthetic */ ji0 $targetScrollDelta;
    final /* synthetic */ gi0 $targetValue;
    final /* synthetic */ ScrollingLogic $this_dispatchMouseWheelScroll;
    final /* synthetic */ float $threshold;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(gi0 gi0Var, ji0 ji0Var, ji0 ji0Var2, float f, MouseWheelScrollingLogic mouseWheelScrollingLogic, float f2, ScrollingLogic scrollingLogic, hm hmVar) {
        super(2, hmVar);
        this.$targetValue = gi0Var;
        this.$animationState = ji0Var;
        this.$targetScrollDelta = ji0Var2;
        this.$threshold = f;
        this.this$0 = mouseWheelScrollingLogic;
        this.$speed = f2;
        this.$this_dispatchMouseWheelScroll = scrollingLogic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(MouseWheelScrollingLogic mouseWheelScrollingLogic, ji0 ji0Var, gi0 gi0Var, ScrollingLogic scrollingLogic, fi0 fi0Var, float f) {
        zg zgVar;
        MouseWheelScrollingLogic.MouseWheelScrollDelta sumOrNull;
        boolean isLowScrollingDelta;
        zgVar = mouseWheelScrollingLogic.channel;
        sumOrNull = mouseWheelScrollingLogic.sumOrNull(zgVar);
        if (sumOrNull != null) {
            mouseWheelScrollingLogic.trackVelocity(sumOrNull);
            MouseWheelScrollingLogic.MouseWheelScrollDelta plus = ((MouseWheelScrollingLogic.MouseWheelScrollDelta) ji0Var.d).plus(sumOrNull);
            ji0Var.d = plus;
            float m551toSingleAxisDeltaFromAnglek4lQ0M = ComposeFoundationFlags.isMouseWheel1DAxisLockingEnabled ? scrollingLogic.m551toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m547reverseIfNeededMKHz9U(plus.m488getValueF1C5BW0())) : scrollingLogic.m549toFloatk4lQ0M(scrollingLogic.m547reverseIfNeededMKHz9U(plus.m488getValueF1C5BW0()));
            gi0Var.d = m551toSingleAxisDeltaFromAnglek4lQ0M;
            isLowScrollingDelta = MouseWheelScrollableKt.isLowScrollingDelta(m551toSingleAxisDeltaFromAnglek4lQ0M - f);
            fi0Var.d = !isLowScrollingDelta;
        }
        return sumOrNull != null;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, hmVar);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    @Override // defpackage.my
    public final Object invoke(NestedScrollScope nestedScrollScope, hm hmVar) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) create(nestedScrollScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x014f -> B:7:0x0150). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x015e -> B:8:0x0067). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NestedScrollScope nestedScrollScope;
        fi0 fi0Var;
        NestedScrollScope nestedScrollScope2;
        fi0 fi0Var2;
        int i;
        Object dispatchMouseWheelScroll$waitNextScrollDelta;
        fi0 fi0Var3;
        Object dispatchMouseWheelScroll$waitNextScrollDelta2;
        Object animateMouseWheelScroll;
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
        int i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.label;
        int i3 = 2;
        vn vnVar = vn.d;
        if (i2 == 0) {
            p10.Q(obj);
            NestedScrollScope nestedScrollScope3 = (NestedScrollScope) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            fi0 fi0Var4 = new fi0();
            fi0Var4.d = true;
            nestedScrollScope = nestedScrollScope3;
            fi0Var = fi0Var4;
        } else if (i2 == 1) {
            fi0 fi0Var5 = (fi0) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2;
            fi0 fi0Var6 = (fi0) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1;
            NestedScrollScope nestedScrollScope4 = (NestedScrollScope) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            p10.Q(obj);
            fi0Var5.d = ((Boolean) obj).booleanValue();
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
            fi0Var = fi0Var6;
            nestedScrollScope = nestedScrollScope4;
            i3 = 2;
        } else if (i2 == 2) {
            i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.I$0;
            fi0 fi0Var7 = (fi0) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1;
            NestedScrollScope nestedScrollScope5 = (NestedScrollScope) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            p10.Q(obj);
            fi0Var2 = fi0Var7;
            nestedScrollScope2 = nestedScrollScope5;
            if (fi0Var2.d) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = nestedScrollScope2;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1 = fi0Var2;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2 = fi0Var2;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.label = 3;
                dispatchMouseWheelScroll$waitNextScrollDelta = MouseWheelScrollingLogic.dispatchMouseWheelScroll$waitNextScrollDelta(mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.this$0, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetScrollDelta, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetValue, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$this_dispatchMouseWheelScroll, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$animationState, 50 - i, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3);
                if (dispatchMouseWheelScroll$waitNextScrollDelta != vnVar) {
                    fi0Var3 = fi0Var2;
                    fi0Var2.d = ((Boolean) dispatchMouseWheelScroll$waitNextScrollDelta).booleanValue();
                    fi0Var = fi0Var3;
                    nestedScrollScope = nestedScrollScope2;
                    i3 = 2;
                }
                return vnVar;
            }
            fi0Var = fi0Var2;
            nestedScrollScope = nestedScrollScope2;
        } else {
            if (i2 != 3) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fi0 fi0Var8 = (fi0) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2;
            fi0Var3 = (fi0) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1;
            NestedScrollScope nestedScrollScope6 = (NestedScrollScope) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            p10.Q(obj);
            fi0Var2 = fi0Var8;
            nestedScrollScope2 = nestedScrollScope6;
            dispatchMouseWheelScroll$waitNextScrollDelta = obj;
            fi0Var2.d = ((Boolean) dispatchMouseWheelScroll$waitNextScrollDelta).booleanValue();
            fi0Var = fi0Var3;
            nestedScrollScope = nestedScrollScope2;
            i3 = 2;
        }
        while (fi0Var.d) {
            fi0Var.d = false;
            float floatValue = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetValue.d - ((Number) ((AnimationState) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$animationState.d).getValue()).floatValue();
            if (((MouseWheelScrollingLogic.MouseWheelScrollDelta) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetScrollDelta.d).getShouldApplyImmediately() || Math.abs(floatValue) < mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$threshold) {
                fi0 fi0Var9 = fi0Var;
                NestedScrollScope nestedScrollScope7 = nestedScrollScope;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.this$0.dispatchMouseWheelScroll(nestedScrollScope7, floatValue);
                MouseWheelScrollingLogic mouseWheelScrollingLogic = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.this$0;
                ji0 ji0Var = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetScrollDelta;
                gi0 gi0Var = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetValue;
                ScrollingLogic scrollingLogic = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$this_dispatchMouseWheelScroll;
                ji0 ji0Var2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$animationState;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = nestedScrollScope7;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1 = fi0Var9;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2 = fi0Var9;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.label = 1;
                dispatchMouseWheelScroll$waitNextScrollDelta2 = MouseWheelScrollingLogic.dispatchMouseWheelScroll$waitNextScrollDelta(mouseWheelScrollingLogic, ji0Var, gi0Var, scrollingLogic, ji0Var2, 50L, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3);
                if (dispatchMouseWheelScroll$waitNextScrollDelta2 != vnVar) {
                    fi0Var9.d = ((Boolean) dispatchMouseWheelScroll$waitNextScrollDelta2).booleanValue();
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
                    fi0Var = fi0Var9;
                    nestedScrollScope = nestedScrollScope7;
                    i3 = 2;
                }
            } else {
                float signum = Math.signum(floatValue) * mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$threshold;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.this$0.dispatchMouseWheelScroll(nestedScrollScope, signum);
                ji0 ji0Var3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$animationState;
                AnimationState animationState = (AnimationState) ji0Var3.d;
                ji0Var3.d = AnimationStateKt.copy$default(animationState, ((Number) animationState.getValue()).floatValue() + signum, 0.0f, 0L, 0L, false, 30, (Object) null);
                int P = y80.P(Math.abs(mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetValue.d - ((Number) ((AnimationState) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$animationState.d).getValue()).floatValue()) / mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$speed);
                int i4 = P > 100 ? 100 : P;
                final MouseWheelScrollingLogic mouseWheelScrollingLogic2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.this$0;
                AnimationState animationState2 = (AnimationState) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$animationState.d;
                final gi0 gi0Var2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetValue;
                float f = gi0Var2.d;
                final ji0 ji0Var4 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetScrollDelta;
                final ScrollingLogic scrollingLogic2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$this_dispatchMouseWheelScroll;
                final fi0 fi0Var10 = fi0Var;
                ky kyVar = new ky() { // from class: androidx.compose.foundation.gestures.n
                    @Override // defpackage.ky
                    public final Object invoke(Object obj2) {
                        boolean invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = MouseWheelScrollingLogic$dispatchMouseWheelScroll$3.invokeSuspend$lambda$0(MouseWheelScrollingLogic.this, ji0Var4, gi0Var2, scrollingLogic2, fi0Var10, ((Float) obj2).floatValue());
                        return Boolean.valueOf(invokeSuspend$lambda$0);
                    }
                };
                fi0Var2 = fi0Var10;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = nestedScrollScope;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1 = fi0Var2;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2 = null;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.I$0 = i4;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.label = i3;
                animateMouseWheelScroll = mouseWheelScrollingLogic2.animateMouseWheelScroll(nestedScrollScope, animationState2, f, i4, kyVar, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3);
                nestedScrollScope2 = nestedScrollScope;
                if (animateMouseWheelScroll != vnVar) {
                    i = i4;
                    if (fi0Var2.d) {
                    }
                }
            }
            return vnVar;
        }
        return w01.a;
    }
}

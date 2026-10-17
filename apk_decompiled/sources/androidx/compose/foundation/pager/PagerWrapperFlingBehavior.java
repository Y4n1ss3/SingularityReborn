package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import defpackage.hm;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PagerWrapperFlingBehavior implements FlingBehavior {
    private final TargetedFlingBehavior originalFlingBehavior;
    private final PagerState pagerState;

    public PagerWrapperFlingBehavior(TargetedFlingBehavior targetedFlingBehavior, PagerState pagerState) {
        this.originalFlingBehavior = targetedFlingBehavior;
        this.pagerState = pagerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 performFling$lambda$0$0(PagerWrapperFlingBehavior pagerWrapperFlingBehavior, ScrollScope scrollScope, float f) {
        pagerWrapperFlingBehavior.pagerState.updateTargetPage(scrollScope, pagerWrapperFlingBehavior.pagerState.getCurrentPage() + y80.P(pagerWrapperFlingBehavior.pagerState.getPageSizeWithSpacing$foundation() != 0 ? f / pagerWrapperFlingBehavior.pagerState.getPageSizeWithSpacing$foundation() : 0.0f));
        return w01.a;
    }

    public final TargetedFlingBehavior getOriginalFlingBehavior() {
        return this.originalFlingBehavior;
    }

    public final PagerState getPagerState() {
        return this.pagerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object performFling(ScrollScope scrollScope, float f, hm hmVar) {
        PagerWrapperFlingBehavior$performFling$1 pagerWrapperFlingBehavior$performFling$1;
        int i;
        if (hmVar instanceof PagerWrapperFlingBehavior$performFling$1) {
            pagerWrapperFlingBehavior$performFling$1 = (PagerWrapperFlingBehavior$performFling$1) hmVar;
            int i2 = pagerWrapperFlingBehavior$performFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pagerWrapperFlingBehavior$performFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pagerWrapperFlingBehavior$performFling$1.result;
                i = pagerWrapperFlingBehavior$performFling$1.label;
                int i3 = 1;
                if (i != 0) {
                    p10.Q(obj);
                    TargetedFlingBehavior targetedFlingBehavior = this.originalFlingBehavior;
                    d dVar = new d(i3, this, scrollScope);
                    pagerWrapperFlingBehavior$performFling$1.label = 1;
                    obj = targetedFlingBehavior.performFling(scrollScope, f, dVar, pagerWrapperFlingBehavior$performFling$1);
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
                float floatValue = ((Number) obj).floatValue();
                if (this.pagerState.getCurrentPageOffsetFraction() != 0.0f && Math.abs(this.pagerState.getCurrentPageOffsetFraction()) < 0.001d) {
                    PagerState pagerState = this.pagerState;
                    PagerState.requestScrollToPage$default(pagerState, pagerState.getCurrentPage(), 0.0f, 2, null);
                } else {
                    new Float(this.pagerState.getCurrentPageOffsetFraction());
                }
                return new Float(floatValue);
            }
        }
        pagerWrapperFlingBehavior$performFling$1 = new PagerWrapperFlingBehavior$performFling$1(this, hmVar);
        Object obj2 = pagerWrapperFlingBehavior$performFling$1.result;
        i = pagerWrapperFlingBehavior$performFling$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        float floatValue2 = ((Number) obj2).floatValue();
        if (this.pagerState.getCurrentPageOffsetFraction() != 0.0f) {
            PagerState pagerState2 = this.pagerState;
            PagerState.requestScrollToPage$default(pagerState2, pagerState2.getCurrentPage(), 0.0f, 2, null);
            return new Float(floatValue2);
        }
        new Float(this.pagerState.getCurrentPageOffsetFraction());
        return new Float(floatValue2);
    }
}
